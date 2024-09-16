package pro.chef.testServices;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.chef.config.properties.ConfigProperties;

import static pro.chef.helpers.AllureRestAssuredFilter.withCustomTemplates;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class BaseApiService {


    public static String PLATFORM_ID = "platformId";
    public static String PLATFORM_VERSION = "platformVersion";

    @Autowired
    ConfigProperties config;

    public RequestSpecification setup() {
        return RestAssured
                .given()
                .filter(withCustomTemplates())
                .contentType(ContentType.JSON)
                .filters(getFilters());
    }

    private List<Filter> getFilters() {
        if (config.getLogging()) {
            return Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter());
        }
        return Collections.emptyList();
    }

}
