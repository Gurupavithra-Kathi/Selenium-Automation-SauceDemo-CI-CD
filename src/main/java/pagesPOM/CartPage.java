package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	protected WebDriver driver;
private By bikelightremove=By.id("remove-sauce-labs-backpack");
private By carticon=By.xpath("//a[@class='shopping_cart_link']");
public CartPage(WebDriver driver){
	this.driver=driver;
}
public void removeBikeLightFromCart() {
	driver.findElement(carticon).click();
	driver.findElement(bikelightremove).click();
}
}
