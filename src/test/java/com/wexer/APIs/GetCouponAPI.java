package com.wexer.APIs;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetCouponAPI {

	@BeforeTest()
	public void Intialise()

	{
		RestAssured.baseURI = "https://newmoove.api.wexer.com";
		RestAssured.basePath = "/api/v1";

	}

	@Test()
	public void GettingCode() {
	
		given().contentType("application/json").header("Authorization",
				"Basic NDgyNzg4MzExMTE1NjI1MTY4NzE0NjYyNDc2MTc2MTk1MjMyMTMwOjUzNjcwMDc3OTA4MjY5ODMwNjcxNTQ5NjM5ODc0MzQxNTI2Mzg4Mw== ")
				.when().get("/coupons").then().assertThat().statusCode(200).and().log().body();
	
	}
	@Test()
	public void PrintResponse()
	{
		given().contentType("application/json").header("Authorization",
				"Basic NDgyNzg4MzExMTE1NjI1MTY4NzE0NjYyNDc2MTc2MTk1MjMyMTMwOjUzNjcwMDc3OTA4MjY5ODMwNjcxNTQ5NjM5ODc0MzQxNTI2Mzg4Mw== ")
				.when().get("/coupons").then().log().all();
		
	}

}
