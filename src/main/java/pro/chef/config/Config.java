package pro.chef.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pro.chef.config.properties.ConfigProperties;

@Configuration
@EnableConfigurationProperties(ConfigProperties.class)
@RequiredArgsConstructor
public class Config {

    private final ConfigProperties CONFIG_PROPERTIES;
}
