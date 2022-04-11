package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Oorderpage extends baseClass{
	@FindBy(className="price")WebElement unitprice;
	@FindBy(id="total_price")WebElement totalprice;
	@FindBy(xpath="//span[text()='Proceed to checkout']")WebElement proceedcheck;
	
	public Oorderpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public double getUnitPrice() {
		String up =unitprice.getText();
	String finalup=	up.replaceAll("[^a-zA-Z0-9]", "");
	double finalunitprice=Double.parseDouble(finalup);
	return finalunitprice/100;
		
	}
	public double getUtotalPrice() {
		String tp =totalprice.getText();
	String finaltp=	tp.replaceAll("[^a-zA-Z0-9]", "");
	double finaltotalprice=Double.parseDouble(finaltp);
	return finaltotalprice/100;

}
	public Lloginpage clickOnProceed() throws Throwable {
		actionClass.click(getDriver(), proceedcheck);
		return new Lloginpage();
	}
} 