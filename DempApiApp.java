package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DempApiApp {

	
	@Test(enabled=false)
	public void tc_noResetDemo1() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8.1");
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", "true");
		cap.setCapability(MobileCapabilityType.APP, "G:\\ApiDemos.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		
	}
	
	
	@Test
	public void tc_fullResetDemo1() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8.1");
		cap.setCapability("automationName", "appium");
		cap.setCapability("fullReset", "true");
		cap.setCapability(MobileCapabilityType.APP, "G:\\ApiDemos.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		
	}
}
