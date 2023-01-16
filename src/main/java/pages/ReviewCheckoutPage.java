package pages;

import wrappers.GenericWrappers;

public class ReviewCheckoutPage extends GenericWrappers {


	public CheckoutPage validateProductAdded() {
		getTextByXpath("//span[@class='item-title']");
		return new CheckoutPage();
	}
}
