package pro.chef.testServices;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.chef.assertions.AssertableResponse;
import pro.chef.config.properties.ConfigProperties;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class SettingsBaseApiService extends BaseApiService {

    String settingsEndpoint = "/api/v1/settings";

    @Autowired
    ConfigProperties config;

    public AssertableResponse baseSettingsRequest() {
        return new AssertableResponse(setup()
                .request()
                .header("Authorization", config.getBearerToken())
                .header(PLATFORM_ID, config.getPlatformId())
                .header(PLATFORM_VERSION, config.getPlatformVersion())
                .when()
                .get(config.getBaseUrl() + settingsEndpoint)
        );
    }

}
