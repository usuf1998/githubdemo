package com.mystore.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.baseclass.baseClass;
import com.mystore.pageobjects.Hoomepage;
import com.mystore.pageobjects.Iindexpage;
import com.mystore.pageobjects.Lloginpage;
import com.mystore.utility.Log;
import com.mystore.utility.ScreenShot;



public class LoginPageTest extends baseClass {
	Log lg;
	Iindexpage idpage;
	Lloginpage lp;
	Hoomepage hp;
	ScreenShot sc = new ScreenShot();
	@BeforeMethod
	public void setup()
	{
		lauchBrowser();
	}
	@AfterMethod
	public void teardown(ITestResult result) throws Exception 
	{
		if(result.getStatus()==result.FAILURE) {
			sc.getScreenshot(getDriver(),result.getName());
		}
		
		getDriver().quit();
	}
	@Test
	public void verifyLogin() throws Throwable {
		 lg= new Log();
		 
		idpage=new Iindexpage();
		lg.info("click on sign in button");
		 lp =idpage.validatesignin();
		 lg.info("open login page");
		 lg.info("enter username and password");
		 lg.info("click login button");
		 hp= lp.validatelogin(prop.getProperty("username"),prop.getProperty("password") );
		 lg.info("get current url");
		String act= hp.getCurrentUrl();
		String exp = "http://automationpractice.com/index.php?controller=my-account";
		lg.info("compare actual and expected url");
		Assert.assertTrue(false);
		Assert.assertEquals(act, exp);
		lg.info("url matches sucessfully");
		System.out.println(act+" "+exp);
			}
}
