package pro.chef.helpers;

import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

import java.io.ByteArrayOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

/**
 * Данный класс конфигурирует сеанс в k8s и применяет artisan-скрипты
 */

public class ArtisanScripts {

    private static String podFilter = "rcore-order-changes";
    private static String orderNumber = "2661668";
    private static String orderStatus = "9";
    private static String commandFlag = "--payed";

    public static void main(String[] args) {
        connectToK8s();
    }

    public static void connectToK8s() {
        String kubeConfigPath = "src/main/resources/k8s-config.yaml";

        try {
            Path kubeConfigAbsolutePath = Paths.get(kubeConfigPath).toAbsolutePath();
            String kubeConfigContent = new String(Files.readAllBytes(kubeConfigAbsolutePath));
            Config config = Config.fromKubeconfig(kubeConfigContent);

            try (KubernetesClient client = new KubernetesClientBuilder().withConfig(config).build()) {
                String namespace = "testing-rcore";
                PodList podList = client.pods().inNamespace(namespace).list();

                Optional<Pod> activePod = podList.getItems().stream()
                        .filter(pod -> pod.getMetadata().getName().contains(podFilter))
                        .filter(pod -> "Running".equals(pod.getStatus().getPhase()))
                        .findFirst();

                if (activePod.isPresent()) {
                    Pod pod = activePod.get();
                    String[] command = {"php", "artisan", "order:change-status", orderNumber, orderStatus, commandFlag};
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    ByteArrayOutputStream errorStream = new ByteArrayOutputStream();

                    try {
                        // Здесь добавьте любые задержки, если они нужны, например:
                        Thread.sleep(5000); // Задержка перед сбором данных

                        String commandString = Arrays.toString(command);
                        String output = outputStream.toString();
                        String error = errorStream.toString();

                        if (error.isEmpty()) {
                            System.out.println("Команда " + commandString + " успешно выполнена:");
                            System.out.println(output);
                        } else {
                            System.err.println("Ошибка при выполнении команды:");
                            System.err.println(error);
                        }

                        // Вывод последних 50ти строк логов пода
                        String log = client.pods().inNamespace(namespace).withName(pod.getMetadata().getName()).getLog();
                        String[] logLines = log.split("\n");
                        int numLines = Math.min(50, logLines.length);
                        System.out.println("Последние 20 строк логов пода: " + pod.getMetadata().getName());
                        for (int i = logLines.length - numLines; i < logLines.length; i++) {
                            System.out.println(logLines[i]);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Активный Pod не найден.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
