package com.cumulus.rest.restapi;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

public class TestNGRest {
  @Test
  public void makeSureThatAWSApiISAccessible() {
	  given().when().get("https://ry86ovrj4a.execute-api.us-east-1.amazonaws.com/test/").then().statusCode(200);
  }
}
