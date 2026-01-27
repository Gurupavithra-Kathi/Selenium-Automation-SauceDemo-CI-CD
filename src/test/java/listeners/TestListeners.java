package listeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utils.ScreenshotsUtils;
import base.BaseTest;
import io.qameta.allure.Allure;


public class TestListeners  implements ITestListener  {
	@Override
	public void onTestFailure(ITestResult result) {
	    WebDriver driver = ((BaseTest) result.getInstance()).getDriver();
	    ScreenshotsUtils ss = new ScreenshotsUtils(driver);
	    ss.getCurrentPageScreenshot();  // disk + Allure

	    // Optional extra attachment for safety
	    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Failure Screenshot", new ByteArrayInputStream(screenshot));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    Allure.step("Test Skipped: " + result.getName());
	}

}
