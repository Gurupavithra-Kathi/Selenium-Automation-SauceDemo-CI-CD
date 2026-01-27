package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pagesPOM.CartPage;
import pagesPOM.LoginPage;
import pagesPOM.ProductsPage;

public class CartPageTest extends BaseTest{
	@Description("Removing from cart")
	@Severity(SeverityLevel.BLOCKER)
	@Test(groups={"regression","smoke"})
	public void testCart() {
LoginPage login=new LoginPage(driver);
login.validLogin("standard_user","secret_sauce",true);
ProductsPage product=new ProductsPage(driver);
product.addToCart();
CartPage cart=new CartPage(driver);
cart.removeBikeLightFromCart();
}
}