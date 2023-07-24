package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class demoSteps {
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.out.println("hello");
	    
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String string) {
		System.out.println("Hi");
	    
	}


}
