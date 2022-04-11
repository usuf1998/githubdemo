package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.baseclass.baseClass;

public class Oorderconfirmationpage extends baseClass{
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/p/strong") WebElement msg;
	public Oorderconfirmationpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public String validatemsg() {
		String cm =msg.getText();
		return cm;
	}

}
