package com.tyss.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApp1 {
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
		
	}	
	
	@Test
	public void tc_openapp1() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RedmiNote4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.miui.calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "cal.CalculatorActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
	}

}
