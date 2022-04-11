package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Aaccountcreationpage extends baseClass{
	@FindBy(xpath="//*[@id=\"noSlide\"]/h1")WebElement accountcreation;
	
	public Aaccountcreationpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public boolean validateAccountCP() throws Throwable {
		return actionClass.isDisplayed(getDriver(), accountcreation);
	}
	

}
