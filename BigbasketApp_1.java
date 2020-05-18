package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigbasketApp_1 
{
	@Test
	public void tc_noapp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "activity.SplashActivity");
		cap.setCapability("noReset", true);
	
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(2000);
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
}
}
  
