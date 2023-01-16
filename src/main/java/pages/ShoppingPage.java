package pages;

import wrappers.GenericWrappers;

public class ShoppingPage extends GenericWrappers{

	
	public ShoppingPage clickOnMobileTab() {
		clickByXpath("//a[contains(text(),'Mobile')]");
		return this;
	}
	public ConfigurePage chooseMobileApp() {
		clickByXpath("//a[@id='product1-order-button']");
		return new ConfigurePage();
	}
}
