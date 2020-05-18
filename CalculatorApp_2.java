package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorApp_2 
{ 
	@Test
	public void tc_openapp2() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungA8+");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Calculator");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal").click();
		Thread.sleep(3000);
		
}	
}
	
 

