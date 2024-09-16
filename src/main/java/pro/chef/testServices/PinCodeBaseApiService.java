package pro.chef.testServices;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.chef.assertions.AssertableResponse;
import pro.chef.config.properties.ConfigProperties;
import pro.chef.model.request.pincode.PinCodeRequest;

import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class PinCodeBaseApiService extends BaseApiService {

    String pinCodeEndpoint = "/api/v1/clients/request-pin";

    @Autowired
    ConfigProperties config;

    public AssertableResponse basePinCodeRequest(PinCodeRequest pinCodeRequest) {
        Map<String,String> verifyData = new HashMap<>();
        verifyData.put("token", pinCodeRequest.token());
        verifyData.put("phone", pinCodeRequest.phone());
        return new AssertableResponse(setup()
                .request()
                .header("Authorization", config.getBearerToken())
                .header(PLATFORM_ID, config.getPlatformId())
                .body(verifyData)
                .when()
                .post(config.getBaseUrl() + pinCodeEndpoint)
        );
    }
}
