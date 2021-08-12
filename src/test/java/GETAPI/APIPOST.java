package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
public class APIPOST {


    @Test
    public void postapilogin(){
        String body =" \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"";
        RestAssured.baseURI="https://reqres.in/api";

     Response res= given().header("Content-Type","application/json; charset=utf-8")
        .body(body)
        .when().post("/login")
        .then().extract().response();

String response = res.asString();
System.out.println(response);
System.out.println(res.getStatusCode());
    }
}
