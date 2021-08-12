package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class GetUser {
    @Test
    public void getuser() {

        RestAssured.baseURI = "https://reqres.in/api";

        Response res = given()
                .when().get("/users/2")
                .then().extract().response();
        System.out.println(res);
        int statucode = res.getStatusCode();
        System.out.println(statucode);
        String response = res.asString();
        System.out.println(response);

    }

    @Test
    public void getAlluser() {

        RestAssured.baseURI = "https://reqres.in/api";

        Response res = given().queryParam("page","2")
                .when().get("/users")
                .then().extract().response();
        System.out.println(res);
        int statucode = res.getStatusCode();
        System.out.println(statucode);
        String response = res.asString();
        System.out.println(response);


    }
}
