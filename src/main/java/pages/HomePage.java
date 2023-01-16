package pages;

import wrappers.GenericWrappers;
//POM Rule #1 : Seperate pages class for all pages in a package - Done
//POM Rule #2 : All pages must extend same project specific wrapper
public class HomePage extends GenericWrappers {

	public HomePage clickOnServiceTab() throws InterruptedException {
		Thread.sleep(1000);
		clickByXpath("(//a[@data-toggle='dropdown'])[1]");
		return this;
	}
	public ShoppingPage clickOrderNewService() throws InterruptedException {
		Thread.sleep(1000);
		clickByXpath("//a[contains(text(),'Order New Services')]");
		return new ShoppingPage();
		
	}
}
