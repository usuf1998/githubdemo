package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Oordersummary extends baseClass{
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")WebElement confirmbutton;
	public Oordersummary() {
		PageFactory.initElements(getDriver(), this);
	}
	public Oorderconfirmationpage clickconfirm() throws Throwable {
		actionClass.click(getDriver(), confirmbutton);
		return new Oorderconfirmationpage();
	}

}
