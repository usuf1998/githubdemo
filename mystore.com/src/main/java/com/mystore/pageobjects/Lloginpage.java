package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrivers.actionClass;
import com.mystore.baseclass.baseClass;

public class Lloginpage extends baseClass{
	@FindBy(id="email")WebElement enteremail;
	@FindBy(id="passwd")WebElement enterpass;
	@FindBy(id="SubmitLogin")WebElement signinbutn;
	@FindBy(id="email_create")WebElement newemail;
	@FindBy(id="SubmitCreate")WebElement newacuntbutton;
	
	public Lloginpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public Hoomepage validatelogin(String mail,String pass) throws Throwable {
		actionClass.type(enteremail, mail);
		actionClass.type(enterpass, pass);
		actionClass.click(getDriver(), signinbutn);
		return new Hoomepage();
	}
	public Aaddresspage validatelogin1(String mail,String pass) throws Throwable {
		actionClass.type(enteremail, mail);
		actionClass.type(enterpass, pass);
		actionClass.click(getDriver(), signinbutn);
		return new Aaddresspage();
	}
	public Aaccountcreationpage validateNewAcountCreate(String newmail) throws Throwable{
		actionClass.type(newemail, newmail);
		actionClass.click(getDriver(), newacuntbutton);
		return new Aaccountcreationpage();
	}
	
}
