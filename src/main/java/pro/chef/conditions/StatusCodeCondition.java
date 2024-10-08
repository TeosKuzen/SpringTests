package pro.chef.conditions;

import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;

// Класс проверок статус кодов
@RequiredArgsConstructor
public class StatusCodeCondition implements Condition {

    private final int statusCode;

    @Override
    public void check(Response response) {
        response.then().assertThat().statusCode(statusCode);
    }

    @Override
    public String toString() {
        return "Status code is " + statusCode;
    }
}
