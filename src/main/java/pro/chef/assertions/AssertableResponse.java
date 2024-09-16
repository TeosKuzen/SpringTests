package pro.chef.assertions;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import pro.chef.conditions.Condition;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j

//Проверка свойств контракта при сериализация JSON в объекты Java
public class AssertableResponse {

    private Response response;

    public AssertableResponse shouldHave(Condition condition) {
        log.info("About to check condition {}", condition);
        condition.check(response);
        return this;
    }

    public<T> T asPojo(Class<T> tClass) {
        return response.as(tClass);
    }

    public Headers headers() {
        return response.getHeaders();
    }
}
