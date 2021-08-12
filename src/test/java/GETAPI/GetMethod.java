package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
public class GetMethod {
  @Test
  public void cetmethod(){
      RestAssured.baseURI = "https://dummy.restapiexample.com/api";

      Response res = given()
              .when().get("/v1/employees")
              .then().extract().response();
      String response = res.asString();
      System.out.println(response);
      System.out.println(res.getStatusCode());


  }


}
