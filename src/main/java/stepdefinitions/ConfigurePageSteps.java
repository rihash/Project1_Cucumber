package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ConfigurePage;
import wrappers.GenericWrappers;

public class ConfigurePageSteps extends GenericWrappers{
	ConfigurePage configure = new ConfigurePage();
	
	@Then("Add to cart and continue")
	public void add_to_cart_and_continue() {
		configure.addToCartContinue();

	}

}
