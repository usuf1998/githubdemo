package com.mystore.utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class Log {
	public static Logger Log= LogManager.getLogger(Log.class.getName());
	@Test
	public static void main(String args[]) {
		try {
			Log.info("this is info");
			Log.error("this is error hai ji");
			Log.fatal("this is fatal");
			Log.warn("hello iam warn");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
	public static  void start(String msg) {
		Log.info("============"+msg+"===========");
	}
	public static void end(String msg) {
		Log.info("============"+msg+"===========");
	}
	public static void info(String msg) {
		Log.info("============"+msg+"===========");
	}

}
