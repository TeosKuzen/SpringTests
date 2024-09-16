package pro.chef.dao.configurators;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Value("${ssh.host}")
    private String sshHost;

    @Value("${ssh.port}")
    private int sshPort;

    @Value("${ssh.user}")
    private String sshUser;

    @Value("${ssh.privateKey}")
    private String sshPrivateKey;

    @Value("${ssh.passphrase}")
    private String sshPassphrase;

    @Value("${ssh.dbHost}")
    private String dbHost;

    @Value("${ssh.dbPort}")
    private int dbPort;

    @Value("${ssh.localPort}")
    private int localPort;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    private Session session;

    @PostConstruct
    public void setUpSshTunnel() throws Exception {
        JSch jsch = new JSch();
        jsch.addIdentity(sshPrivateKey, sshPassphrase);
        session = jsch.getSession(sshUser, sshHost, sshPort);
        session.setConfig("StrictHostKeyChecking", "no");
        session.connect();
        session.setPortForwardingL(localPort, dbHost, dbPort);
    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DriverManagerDataSource dataSource) {
        return new JdbcTemplate(dataSource); // Используем инжекцию DriverManagerDataSource
    }

    public void executeQuery(String query) {
        System.out.println("Executing SQL: " + query);
        JdbcTemplate jdbcTemplate = jdbcTemplate(dataSource());
        List<Map<String, Object>> results = jdbcTemplate.queryForList(query);

        System.out.println("Query Results:");
        for (Map<String, Object> row : results) {
            System.out.println(row);
        }
    }

    @PreDestroy
    public void tearDown() {
        if (session != null && session.isConnected()) {
            session.disconnect();
        }
    }
}
