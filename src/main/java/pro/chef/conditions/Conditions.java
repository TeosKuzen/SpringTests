package pro.chef.conditions;

import lombok.experimental.UtilityClass;
import org.hamcrest.Matcher;

//Класс для проверки условий в тестах
@UtilityClass
public class Conditions {

    public StatusCodeCondition statusCode(int code) {
        return new StatusCodeCondition(code);
    }

    public BodyFieldCondition bodyField(String jsonPath, Matcher matcher) {
        return new BodyFieldCondition(jsonPath, matcher);
    }

    public HeadersCondition checkHeader(String headerName, Matcher matcher) {
        return new HeadersCondition(headerName, matcher);
    }

}
