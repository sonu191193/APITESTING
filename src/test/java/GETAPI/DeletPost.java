package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class DeletPost {
   @Test
  public void dletpost(){
       RestAssured.baseURI ="https://dummy.restapiexample.com/api";
       Response res = given()
               .when().delete("/v1/delete/2")
               .then().extract().response();
       String response = res.asString();
       System.out.println(response);
       System.out.println(res.getStatusCode());



  }




}
