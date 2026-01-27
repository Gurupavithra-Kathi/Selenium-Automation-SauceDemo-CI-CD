package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage{
	private WebDriver driver;
public ProductsPage(WebDriver driver){
	this.driver=driver;
}
private By backpackcartbtn=By.id("add-to-cart-sauce-labs-backpack");

public void addToCart(){
	WebElement cart=driver.findElement(backpackcartbtn);
	cart.click();
	System.out.println("Product added to cart ");
}

}
