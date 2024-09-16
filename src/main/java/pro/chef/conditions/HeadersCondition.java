package pro.chef.conditions;

import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;

// Класс проверки headers
@AllArgsConstructor
@NoArgsConstructor
public class HeadersCondition implements Condition {

    private String headerName;
    private Matcher matcher;

    public HeadersCondition(String headerName) {
        this.headerName = headerName;
    }

    @Override
    public void check(Response response) {
        response.then().assertThat().header(headerName, matcher);
    }

    @Override
    public String toString() {
        return "Header [" + headerName + "] " + matcher;
    }
}
