package pages;

import wrappers.GenericWrappers;

public class ConfigurePage extends GenericWrappers{


	public ReviewCheckoutPage addToCartContinue() {
		clickByXpath("//button[@class='btn btn-primary btn-lg']");
		return new ReviewCheckoutPage();
	}
}
