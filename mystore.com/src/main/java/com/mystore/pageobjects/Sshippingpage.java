package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Sshippingpage extends baseClass{
	
	@FindBy(id="cgv")WebElement terms;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")WebElement proceed;
	

	public Sshippingpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public void clickterms() throws Throwable {
		actionClass.click(getDriver(), terms);
	}
	public Ppaymentpage clickproceed() throws Throwable {
		actionClass.click(getDriver(), proceed);
		return new Ppaymentpage();
	}
	
}
