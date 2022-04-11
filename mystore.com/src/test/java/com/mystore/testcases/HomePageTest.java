package com.mystore.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mystore.baseclass.baseClass;
import com.mystore.pageobjects.Hoomepage;
import com.mystore.pageobjects.Iindexpage;
import com.mystore.pageobjects.Lloginpage;
import com.mystore.utility.Log;

public class HomePageTest extends baseClass{
	Iindexpage idpage;
	Lloginpage lp;
	Hoomepage hp;
	
	
	@BeforeMethod
	public static  void setup() {
		lauchBrowser();
		
	}
	@AfterMethod
	public static void teardown() {
		getDriver().quit();
	}
	@Test
	public void verifyWishList() throws Throwable {
		idpage= new Iindexpage();
		lp = new Lloginpage();
		hp = new Hoomepage();
	
	
		
		lp =idpage.validatesignin();
		
		hp=lp.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		Log.info("weeeee");
		boolean result =hp.validatemywishlist();
		boolean res =hp.validateOrderHistory();
		Log.end("hello");
		Assert.assertTrue(res);
		System.out.println(res);
	}
	
}
