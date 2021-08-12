package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class AbcTest {
    @Test
  public void puttesting (){
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
      RestAssured.baseURI = "https://reqres.in/api";

Response res = given() .header("Content-Type","application/json; charset=utf-8")

        .body(body)
        .when().get("/users/2")
        .then().extract().response();
String Response = res.asString();
System.out.print(Response);
System.out.println(res.getStatusCode());





  }






}
