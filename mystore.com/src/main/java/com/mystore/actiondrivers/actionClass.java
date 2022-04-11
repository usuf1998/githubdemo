package com.mystore.actiondrivers;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.baseclass.baseClass;

public class actionClass extends baseClass{
	
	public static void click(WebDriver ldriver,WebElement ele) throws Throwable {
		Actions act = new Actions(ldriver);
		act.moveToElement(ele).click().build().perform();
	}
	public static boolean findelement(WebDriver ldriver,WebElement ele) throws Throwable{
		boolean flag = false;
		try {
		    ele.isDisplayed();
		    flag = true;
		}catch(Exception  e) {
			flag = false;
		}finally {
			if(flag) {
				System.out.println("sucessfully element found");
			}else {
				System.out.println("unable to locate element");
			}
		}
		return flag;
	}
	
	public static boolean isDisplayed(WebDriver ldriver,WebElement ele) throws Throwable{
		boolean flag = false;
		flag = findelement(ldriver, ele);
		
		if(flag) {
			flag =ele.isDisplayed();
		
			if(flag) {
				System.out.println("element is displayed");
			}else {
				System.out.println("element not displayed");
			}
		}else {
			System.out.println("not displayed");
		}
		return flag;
	}
	
 
	public static boolean isSelected(WebDriver ldriver,WebElement ele) throws Throwable{
		boolean flag = false;
		flag = findelement(ldriver,ele);
		if(flag) {
		flag =ele.isSelected();
		if(flag) {
			System.out.println("element is selected");
		}else {
			System.out.println("element is not selected");
		}
		}else {
			System.out.println("not selected");
		}
		return flag;
		
	}
	public static boolean isEnabled(WebDriver ldriver,WebElement ele) throws Throwable{
		boolean flag = false;
		flag = findelement(ldriver,ele);
		if(flag) {
		flag =ele.isEnabled();
		if(flag) {
			System.out.println("element is Enabled ");
		}else {
			System.out.println("element is not Enabled");
		}
		}else {
			System.out.println("not Enabled");
		}
		return flag;
		
	}
	public static boolean type(WebElement ele,String text) {
		boolean flag = false;
		try {
		     flag = ele.isDisplayed();
		     ele.clear();
		     ele.sendKeys(text);
		     flag = true;
		}catch (Exception e) {
			System.out.println("location not found");
			flag = false;
		}finally {
			if(flag) {
				System.out.println("successfully entered value");
			}else {
				System.out.println("unable to enter value");
			}
		} return flag;
		}
	public static boolean selectBySendKeys(WebElement ele, String value) throws Throwable{
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		}catch (Exception e) {
			return false;
		}finally {
			if(flag) {
				System.out.println("selected value from dropdown");
			}else {
				System.out.println(" not selected value from dropdown");
			}
		}	
	}
	public static boolean selectByValue(WebElement ele, String value) throws Throwable{
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByValue(value);
			flag = true;
			return true;
		}catch (Exception e) {
			return false;
		}finally {
			if(flag) {
				System.out.println("option is selected by value");
			}else {
				System.out.println("option is not selected");
			}
		}
	}
	public static boolean selectByVisibleText(WebElement ele, String visibletext) throws Throwable{
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);;
			flag = true;
			return true;
		}catch (Exception e) {
			return false;
		}finally {
			if(flag) {
				System.out.println("option is selected by visibletext");
			}else {
				System.out.println("option is not selected");
			}
		}
		
	}
	public static boolean selectByIndex(WebElement ele, int index) throws Throwable{
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);;
			flag = true;
			return true;
		}catch (Exception e) {
			return false;
		}finally {
			if(flag) {
				System.out.println("option is selected by index");
			}else {
				System.out.println("option is not selected");
			}
		}
		
	}
	public static boolean clickByJs(WebDriver ldriver,WebElement ele) {
		boolean flag = false;
		try {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", ele);
		flag = true;
		}catch(Exception e) {
			flag = false;
		}finally {
			if(flag) {
			System.out.println("element is clicked");
			}else {
				System.out.println("element is not clicked");
			}
		}
		return flag;
		}
}
