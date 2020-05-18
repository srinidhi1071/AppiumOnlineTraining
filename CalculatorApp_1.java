package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorApp_1
{
	@Test(enabled=false)
	public void tc_openapp1() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "Calculator");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);

}
	 
	@Test
	public void tc_openapp2() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungA8+");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Calculator");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);

}	

}

