package pro.chef.steps;

import io.qameta.allure.Step;
import org.springframework.stereotype.Component;
import pro.chef.conditions.Conditions;
import pro.chef.dao.entity.OrdersEntity;
//import pro.chef.dao.service.OrdersService;
import pro.chef.model.request.pincode.PinCodeRequest;
import pro.chef.model.response.pincode.PinCodeResponse;
import pro.chef.testServices.PinCodeBaseApiService;

import java.util.Optional;
import java.util.UUID;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Component
public class PinCodeSteps {

    @Step("Отправить базовый запрос на обновление кэша сторис")
    public PinCodeResponse basePinCodeRequest(PinCodeBaseApiService pinCodeApiService, PinCodeRequest pinCodeRequest) {
        return step("Выполнить запрос на обновление кэша сторис", () ->
                pinCodeApiService
                        .basePinCodeRequest(pinCodeRequest)
                        .shouldHave(Conditions.statusCode(200))
                        .asPojo(PinCodeResponse.class)
        );
    }

    @Step("Отправить базовый запрос на обновление кэша сторис")
    public void checkNewPinCodeResponse(PinCodeResponse response) {
        assertEquals("false", response.success());
        assertThat(response.locked()).isNull();
        assertThat(response.timeOut()).isNotNull();
        assertTrue(Integer.parseInt(response.timeOut()) > 0 && Integer.parseInt(response.timeOut()) < 61);
    }
}
