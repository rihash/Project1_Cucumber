package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import wrappers.GenericWrappers;

public class CheckoutPageSteps extends GenericWrappers{
	CheckoutPage checkout = new CheckoutPage();
	
	@Then("Click checkout")
	public void click_checkout() {
		checkout.clickCheckout();
	}
	@And("Click complete order")
	public void click_complete_order() throws InterruptedException {
		checkout.clickCompleteOrder();
	}

	@And("Close browser")
	public void close_browser() {
		driver.close();

	}


}
