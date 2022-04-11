package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Aaddtocartpage extends baseClass{
	@FindBy(id="quantity_wanted")
                  WebElement quantity;
	@FindBy(id="group_1")
    WebElement size;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")WebElement proceedtocheck;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addtocartbutnn;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")WebElement validateaddtocartmsg;

	
	
	public Aaddtocartpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public Oorderpage validateProceedcheckout() throws Throwable {
		actionClass.click(getDriver(), addtocartbutnn);
		return new Oorderpage();
	}
	public void selectQuantity(String quan) throws Throwable  {
		actionClass.type(quantity,quan );
	}
	public void selectSize(String siz) throws Throwable {
		actionClass.selectByVisibleText(size, siz);
	}
	public boolean validateAddtoCart() throws Throwable {
		return actionClass.isDisplayed(getDriver(),validateaddtocartmsg);
	}
	public Oorderpage clickOnProceed() {
		actionClass.clickByJs(getDriver(),proceedtocheck);
		return new Oorderpage();
	}
	
}
