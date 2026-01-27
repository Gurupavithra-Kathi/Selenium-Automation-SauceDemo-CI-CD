package pagesPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
	private WebDriver driver;
	
	public FilterPage(WebDriver driver){
		this.driver=driver;
	}

	private By Filter=By.className("product_sort_container");
	public By addToCartBtns=By.xpath("//button[@text='Add to cart']");
	public void sortFilter() {
		Select sel=new Select(driver.findElement(Filter));
		for(int i=0;i<4;i++) {
			sel.selectByIndex(i);
			List<WebElement> cartBtns=driver.findElements(addToCartBtns);
			for(int j=0;j<cartBtns.size();j++) {
				cartBtns.get(0).getAttribute("name");
			}
		}		
		
		
	}
}
