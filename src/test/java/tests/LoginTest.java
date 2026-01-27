package tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ScreenshotsUtils;
import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pagesPOM.LoginPage;

public class LoginTest extends BaseTest{
	
 @Test(priority=0,dataProvider="loginData",groups={"smoke"})
 @Description("login functionality through data drivern testing")
	@Severity(SeverityLevel.MINOR)
	public void testLogin(String username,String password,boolean shouldLoginSucceed) {
	 LoginPage login=new LoginPage(driver);
	login.validLogin(username,password,shouldLoginSucceed);
    if(shouldLoginSucceed) {
   
   	 Assert.assertFalse(
             login.isLoginErrorDisplayed(),
             "valid login passed"
         );
   }
    else {
    	ScreenshotsUtils ss=new ScreenshotsUtils(driver);
   	 Assert.assertTrue(
	            login.isLoginErrorDisplayed(),
	            "inValid login failed"
	        );
    }
   
}
 @DataProvider(name="loginData")
 public Object[][] getData(){
	 return new Object[][]{
		 {"standard_user","secret_sauce",true},{"problem_user","secret_sauce",true},{"performance_glitch_user","secret_sauce",true},{"failed_user","password",false}
	 };
 }
 
}