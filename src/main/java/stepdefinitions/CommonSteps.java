package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers{
	GenericWrappers wrapper = new GenericWrappers();
	
	@Given("Opening browser")
	public void opening_browser() {
		wrapper.invokeApp("chrome", "https://phptravels.org/login");
	}
}
