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
public class OrderApiService extends BaseApiService {


    @Autowired
    ConfigProperties config;

    public AssertableResponse baseOrderRequest(PinCodeRequest pinCodeRequest) {
        Map<String,String> orderData = new HashMap<>();
        orderData.put("token", pinCodeRequest.token());
        orderData.put("phone", pinCodeRequest.phone());
        return new AssertableResponse(setup()
                .request()
                .header("Authorization", config.getBearerToken())
                .header(PLATFORM_ID, config.getPlatformId())
                .body(orderData)
                .when()
                .post(config.getBaseUrl() + "/api/v1/orders")
        );
    }

}
