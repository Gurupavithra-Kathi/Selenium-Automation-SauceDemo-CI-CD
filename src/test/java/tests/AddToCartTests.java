package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pagesPOM.LoginPage;
import pagesPOM.ProductsPage;

public class AddToCartTests extends BaseTest{

	@Description("AddToCart test case")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=1,groups= {"sanity"})
	public void addToCart() {
		 LoginPage login = new LoginPage(driver);
	        login.validLogin("standard_user", "secret_sauce",true);
		ProductsPage product=new ProductsPage(driver);
		product.addToCart();
		
	}
}
