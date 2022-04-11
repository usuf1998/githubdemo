package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Ppaymentpage extends baseClass{
	@FindBy(className="bankwire")WebElement paywithBank;
	
	public Ppaymentpage() {
		PageFactory.initElements(getDriver(), this);
	}
	

	public Oordersummary cliconbankpay() throws Throwable {
		actionClass.click(getDriver(), paywithBank);
		return new Oordersummary();
	}
}
