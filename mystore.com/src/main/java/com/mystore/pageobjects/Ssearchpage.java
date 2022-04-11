package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Ssearchpage extends baseClass{
	@FindBy(className="product-name") WebElement itemclick;
	
	public Ssearchpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public boolean isproductAvailable() throws Throwable {
		return actionClass.isDisplayed(getDriver(), itemclick);
	}
	public Aaddtocartpage validateaclick() throws Throwable {
		actionClass.click(getDriver(), itemclick);
		return new Aaddtocartpage();
	}
	
}
