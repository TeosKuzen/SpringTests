package pro.chef.conditions;

import io.restassured.response.Response;

//Интерфейс с базовой проверкой ответов сервера
public interface Condition {

    void check(Response response);
}
