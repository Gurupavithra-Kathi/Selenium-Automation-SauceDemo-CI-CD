package pagesPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage{
//POM=LOCATORS+ACTION METHODS
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	  private By username = By.id("user-name");
	    private By password = By.id("password");
	    private By loginbtn = By.id("login-button");
private By errorMsg=By.xpath("//button[@data-test='error']");
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	public void validLogin(String user_name,String pass_word,boolean shouldLoginSucceed) {
		 driver.findElement(username).sendKeys(user_name);
		    driver.findElement(password).sendKeys(pass_word);
		    driver.findElement(loginbtn).click();
		
	}
	public boolean isLoginErrorDisplayed() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        return wait.until(
	            ExpectedConditions.visibilityOfElementLocated(errorMsg)
	        ).isDisplayed();
	    } catch (TimeoutException e) {
	        return false; // error did not appear → login success
	    }
	}

}
