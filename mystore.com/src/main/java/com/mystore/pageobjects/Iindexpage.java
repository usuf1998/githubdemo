package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Iindexpage extends baseClass {
	@FindBy(xpath="//img[@class='logo img-responsive']")WebElement logo;
	@FindBy(id="search_query_top")WebElement searchbox;
    @FindBy(name="submit_search")WebElement searchbutton;
	@FindBy(className="login")WebElement signinbutton;
	
	public Iindexpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public boolean validatelogo() throws Throwable {
		return actionClass.isDisplayed(getDriver(), logo);
	}
	public Lloginpage validatesignin() throws Throwable {
		actionClass.click(getDriver(),signinbutton );
		return new Lloginpage();
	}
	public Ssearchpage validatesearch(String productname) throws Throwable {
		actionClass.type(searchbox, productname);
		actionClass.click(getDriver(), searchbutton);
		return new Ssearchpage();
	}
	public String getMyStoreTitle() {
		String mystoretitle =getDriver().getTitle();
		return mystoretitle;
	}
}
