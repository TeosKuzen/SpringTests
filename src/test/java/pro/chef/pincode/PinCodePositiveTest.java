package pro.chef.pincode;

import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import pro.chef.basic.BaseApiTest;
import pro.chef.config.properties.ConfigProperties;
import pro.chef.dao.configurators.DataSourceConfig;
import pro.chef.dao.configurators.SqlQueries;
import pro.chef.dao.service.OrdersService;
import pro.chef.model.request.pincode.PinCodeRequest;
import pro.chef.model.response.pincode.PinCodeResponse;
import pro.chef.steps.PinCodeSteps;
import pro.chef.testServices.PinCodeBaseApiService;
import java.util.UUID;
import static io.qameta.allure.Allure.step;

@Slf4j
@SpringBootTest
@ActiveProfiles("test") // выбор профиля application-test.yml...для других профилей будут созданы другие файлы
public class PinCodePositiveTest extends BaseApiTest {

    @Autowired
    PinCodeBaseApiService pinCodeApiService;
    @Autowired
    DataSourceConfig dataSourceConfig;
    @Autowired
    PinCodeSteps pinCodeSteps;
    @Autowired
    ConfigProperties config;
    @Autowired
    OrdersService ordersService;

    @DisplayName("Проверка базового запроса pin code")
    @Description("Базовая, с валидными параметрами")
    @Test //простейший тест для проверки
    void checkRequestPinCodeTest() {
        PinCodeRequest requestData =
                step("Запрос pin code", () ->
                        new PinCodeRequest(config.getToken(), config.getPhone()));

        PinCodeResponse response = pinCodeSteps.basePinCodeRequest(pinCodeApiService, requestData);
        pinCodeSteps.checkNewPinCodeResponse(response);
    }

    @DisplayName("Проверка БД через Repository")
    @Description("Первый запрос к Entity-Orders")
    @Test
    public void testTableExists() {
        ordersService.findAllById(UUID.fromString("c46c444f-b9a8-4e97-80eb-c95578d38b5b"));
        System.out.println(ordersService.findAllById(UUID.fromString("c46c444f-b9a8-4e97-80eb-c95578d38b5b")));
    }

    @DisplayName("Проверка отправки прямого SQL-запроса в БД")
    @Description("Отправляем SQL-запрос, прописанный в SqlQueries")
    @Test
    public void testSQLQuery() {
        dataSourceConfig.executeQuery(SqlQueries.SELECT_ORDER_BY_NUMBER.getQuery());
    }
}
