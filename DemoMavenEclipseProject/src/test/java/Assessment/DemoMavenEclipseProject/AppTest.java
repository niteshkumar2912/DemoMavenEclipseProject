package Assessment.DemoMavenEclipseProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class AppTest {
Response resp;
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	RestAssured.baseURI = "https://api.ratesapi.io";
	}
	@Test
	@When("posted with correct Information")
	public void posted_with_correct_information() {
		resp = RestAssured.get("/api/latest");
	}
	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		//assert.assertEquals(200, expected);
		int test = resp.getStatusCode();
		System.out.println("StatusCode ="+test);
		assertEquals(test, 200);
	}

}
