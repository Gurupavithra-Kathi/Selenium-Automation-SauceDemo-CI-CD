package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	// protected-why? to be accessible inside same package and child classes,not everywhere(public) ,should be accessible to child(pvt-not accessible)-need getters all the time
//Restricting access (not public),Exposing only what’s needed to child classes
	protected WebDriver driver;
@BeforeMethod(alwaysRun = true)
public void driverSetUp() {
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com");
}
@AfterMethod
public void tearDown() {
    driver.quit();
}

public WebDriver getDriver() {
    return driver;
}
}
