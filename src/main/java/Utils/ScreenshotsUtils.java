package Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Attachment;

public class ScreenshotsUtils {
	private WebDriver driver;

	 String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
             .format(new Date());
	 public ScreenshotsUtils(WebDriver driver) {
		 this.driver=driver;
	 }
	 @Attachment(value = "Screenshot on Failure", type = "image/png")
public  byte[] getCurrentPageScreenshot() {

	 TakesScreenshot ts=(TakesScreenshot) driver;
	    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\selenium\\sauce-demo-ui-automation\\src\\test\\resources\\Screenshots"  +timestamp + "_login_failed.png");
src.renameTo(target);
return screenshot;
}
}
