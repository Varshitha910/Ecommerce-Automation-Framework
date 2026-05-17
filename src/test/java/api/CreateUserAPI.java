package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateUserAPI {

    public static Response createUser() {

        String body =
                "{ \"name\": \"Munny\", \"job\": \"QA\" }";

        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .post("/posts");
    }
}