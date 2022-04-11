package com.mystore.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.w3c.dom.DOMConfiguration;

import com.mystore.utility.Log;
import com.mystore.utility.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
public static Properties prop;
//public static WebDriver driver;
public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
public static WebDriver getDriver() {
	return driver.get();
}
@BeforeSuite
public  void bs() {
	DOMConfigurator.configure("log4j2.xml");
	Log.info("this is before suit");
}

@BeforeTest
public  void loadconfig()  {
	
	try {
         prop = new Properties();
         FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/configuration/config.properties");
        prop.load(file);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	

}

public static void lauchBrowser() {
	
	String browsername =prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.set(new ChromeDriver());
	}else if(browsername.contains("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		driver.set(new FirefoxDriver());
		
	}
	getDriver().manage().window().maximize();
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	getDriver().get(prop.getProperty("url"));
}
@DataProvider(name="credential")
public  Object[][] loginData()
{
	Object [][] dataset = new Object[2][2];
	dataset[0][0]="you@gmail.com";
	dataset[0][1]="qwerty11";
	dataset[1][0]="admin";
	dataset[1][1]="admin123";
	return dataset;
	
}
}