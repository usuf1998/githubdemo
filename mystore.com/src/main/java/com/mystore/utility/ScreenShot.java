package com.mystore.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mystore.baseclass.baseClass;

public class ScreenShot extends baseClass {
	public void getScreenshot(WebDriver driver,String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("/Users/syedyousufali/eclipse-workspace/mystore.com/screenshots/"+filename+".png");
		FileUtils.copyFile(src, trg);
	}
	
}
