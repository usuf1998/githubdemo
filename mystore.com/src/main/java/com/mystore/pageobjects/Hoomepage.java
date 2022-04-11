package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Hoomepage extends baseClass{
	

	@FindBy(xpath ="//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")WebElement wishlist;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")WebElement orderhistory;
    
    public Hoomepage() {
    	PageFactory.initElements(getDriver(), this);
    }
    public boolean validatemywishlist() throws Throwable {
    	return actionClass.isDisplayed(getDriver(), wishlist);
    }
    public boolean validateOrderHistory() throws Throwable {
    	return actionClass.isDisplayed(getDriver(), orderhistory);
    }
    public String getCurrentUrl() {
		String homeurl =getDriver().getCurrentUrl();
		return homeurl;
	}
}
