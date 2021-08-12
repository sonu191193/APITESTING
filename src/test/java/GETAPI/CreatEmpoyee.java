package GETAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
public class CreatEmpoyee {
  @Test
   public void createmployee(){
         String body = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
      RestAssured.baseURI= "https://dummy.restapiexample.com/api/v1";
      Response res= given().header("Content-Type","application/json")

              .body(body)
              .when().post("/create")
              .then().extract().response();
             String response = res.asString();
     System.out.println(response);
     System.out.println(res.getStatusCode());
   }



}
