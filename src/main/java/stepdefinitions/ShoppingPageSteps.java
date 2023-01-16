package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ShoppingPage;
import wrappers.GenericWrappers;

public class ShoppingPageSteps extends GenericWrappers{
	ShoppingPage shopping = new ShoppingPage();
	
	@And("Click Mobile Category")
	public void click_Mobile_Category() {
		shopping.clickOnMobileTab();
	}

	@And("Select Mobile Application")
	public void select_Mobile_Application() {
		shopping.chooseMobileApp();
	}

}
