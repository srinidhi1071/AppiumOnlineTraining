package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Demo1 {
	
	@Test
	public void test1() throws MalformedURLException{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	}

}
