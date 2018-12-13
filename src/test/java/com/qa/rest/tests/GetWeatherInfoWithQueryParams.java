package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetWeatherInfoWithQueryParams {

	@Test
	public void getWeatherInfoWithOneQueryParam() {

		given().
			params("q", "Pune,India","mode","xml","APPID","7d83849836be7a41c2230265afdac551").
		when().
			get("http://api.openweathermap.org/data/2.5/weather").
		then().
			body("current.city.country", equalTo("IN"));
	}

}
