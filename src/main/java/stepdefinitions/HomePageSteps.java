package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import wrappers.GenericWrappers;

public class HomePageSteps extends GenericWrappers {
	HomePage homepage = new HomePage();
	
	@Then("Click service tab")
	public void click_service_tab() throws InterruptedException {
		homepage.clickOnServiceTab();
	}

	@And("Click Order New Service")
	public void click_Order_New_Service() throws InterruptedException {
		homepage.clickOrderNewService();
	}
}
