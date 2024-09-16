package pro.chef.conditions;

import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;

//Класс проверок API-свойств
@AllArgsConstructor
@NoArgsConstructor
public class BodyFieldCondition implements Condition {

    private String jsonPath;
    private Matcher matcher;

    public BodyFieldCondition(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    @Override
    public void check(Response response) {
        response.then().assertThat().body(jsonPath, matcher);
    }

    @Override
    public String toString() {
        return "Body field [" + jsonPath + "] " + matcher;
    }
}
