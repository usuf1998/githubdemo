package com.mystore.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.baseclass.baseClass;
import com.mystore.pageobjects.Iindexpage;
import com.mystore.pageobjects.Ssearchpage;
import com.mystore.utility.Log;




public class IndexPage extends baseClass {
	Iindexpage idpage;
	Ssearchpage sc;
	
	
	@BeforeMethod
	public void setup()
	{
		lauchBrowser();
	}
	@AfterMethod
	public void teardown() 
	{
		getDriver().quit();
	}
	
										
	@Test
	public void validLogo() throws Throwable {
		Log.info("starting inde");
		idpage=new Iindexpage();
		Log.info("validate logo");
		boolean result =idpage.validatelogo();
		
		Assert.assertTrue(result);
		Log.info("validate logo sucess");
		System.out.println("this is second commit");
		
		
	}
	@Test
	public void getTitle() {
		idpage=new Iindexpage();
		String act =idpage.getMyStoreTitle();
		
		Assert.assertEquals(act,"My Store");
		System.out.println(act);
	}
	
	
	
}


