package pro.chef.steps;

import io.qameta.allure.Step;
import pro.chef.conditions.Conditions;
import pro.chef.model.response.pincode.PinCodeResponse;
import pro.chef.testServices.SettingsBaseApiService;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsSteps {

    @Step("")
    public PinCodeResponse baseSettingsRequest(SettingsBaseApiService settingsApiService) {
        return step("Выполнить запрос на обновление кэша сторис", () ->
                settingsApiService
                        .baseSettingsRequest()
                        .shouldHave(Conditions.statusCode(200))
                        .asPojo(PinCodeResponse.class)
        );
    }

    @Step("Отправить базовый запрос на обновление кэша сторис")
    public void checkSettingsResponse(PinCodeResponse response) {
        assertEquals("false", response.success());
        assertThat(response.locked()).isNull();
        assertThat(response.timeOut()).isNotNull();
        assertTrue(Integer.parseInt(response.timeOut()) > 0 && Integer.parseInt(response.timeOut()) < 61);
    }

}
