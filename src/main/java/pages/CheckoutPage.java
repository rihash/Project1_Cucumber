package pages;

import org.openqa.selenium.WebElement;
import wrappers.GenericWrappers;

public class CheckoutPage extends GenericWrappers{

	public CheckoutPage clickCheckout() {
		clickByXpath("//a[contains(text(),'Checkout')]");
		return this;
	}
	public CheckoutPage clickCompleteOrder() throws InterruptedException {
		WebElement element = getElementByXpath("//button[@id='btnCompleteOrder']");
		scrollToElement(element);
		Thread.sleep(2000);
		clickByXpath("//button[@id='btnCompleteOrder']");
		Thread.sleep(2000);
		//clickById("btnCompleteOrder");
		return this;
	}
}
