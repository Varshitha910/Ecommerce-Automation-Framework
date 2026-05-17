package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserAPI {

    public static Response getUsers() {

        return RestAssured
                .given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users");
    }
}