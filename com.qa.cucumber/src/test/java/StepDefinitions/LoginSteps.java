package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on Login page")
	public void verifyLoginPage() {
		System.out.println("User should be in Login page");
	}

	@When("User enters username and password")
	public void enterValidCredentials() {
		System.out.println("User enter valid username and password");
	}

	@And("click on submit button")
	public void clickSubmit() {
		System.out.println("User clicks on submit button");
	}

	@Then("Verify whether Login page is appeared or not")
	public void verifyHomePage() {
		System.out.println("User verify the Home page");
	}
}
