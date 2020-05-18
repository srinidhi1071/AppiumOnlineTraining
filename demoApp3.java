package com.tyss.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class demoApp3 {
	 @Test
		public void tc_openapp() throws Exception {
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("deviceName", "RedmiNote4");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "7");
			cap.setCapability("automationName", "appium");
			
			cap.setCapability("appPackage", "com.miui.calculator");
			cap.setCapability("appActivity", "cal.CalculatorActivity");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("com.miui.calculator:id/btn_8_s").click();
			driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
			driver.findElementById("com.miui.calculator:id/btn_9_s").click();
			driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
			Thread.sleep(3000);
			System.out.println("success dudeee");
			
		}

}
