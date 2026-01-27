package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pagesPOM.FilterPage;
import pagesPOM.LoginPage;

public class SortFilter extends BaseTest {

	@Test(groups={"smoke"})
	@Description("Testing filters in product page")
	@Severity(SeverityLevel.NORMAL)
	public void TestFilter() {
		LoginPage login=new LoginPage(driver);
		login.validLogin("standard_user","secret_sauce",true);
		FilterPage filter=new FilterPage(driver);
		WebElement Filter=driver.findElement(By.className("product_sort_container"));
		Select sel=new Select(Filter);
		
			sel.selectByIndex(1);
			List<WebElement> cartBtns=driver.findElements(filter.addToCartBtns);
			for(int j=0;j<cartBtns.size();j++) {
				cartBtns.get(j).getAttribute("name");
				System.out.println(cartBtns.get(j).getAttribute("name"));
			}
		
	}
	}

