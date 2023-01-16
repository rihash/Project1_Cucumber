package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ReviewCheckoutPage;
import wrappers.GenericWrappers;

public class ReviewCheckoutSteps extends GenericWrappers{
	ReviewCheckoutPage review = new ReviewCheckoutPage();
	
	@And("Validate product is added")
	public void validate_product_is_added() {
		review.validateProductAdded();
	}
}
