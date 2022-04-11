package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Aaddresspage extends baseClass{
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")WebElement proceedToChckout;

	public Aaddresspage() {
		PageFactory.initElements(getDriver(), this);
	}
	public Sshippingpage clickoncheckout() throws Throwable {
		actionClass.click(getDriver(), proceedToChckout);
		return new Sshippingpage();
	}
}
