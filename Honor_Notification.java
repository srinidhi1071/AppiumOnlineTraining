package com.tyss.Appium.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Honor_Notification 
{
	@Test
    public void notificationtest() throws MalformedURLException
    {
    	DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Honor 10 Lite");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.bhanu.notificationreminders");
		cap.setCapability("appActivity", ".MainDrawerActivity");
		// cap.setCapability("UDID","VQG3Y19119002512");
		cap.setCapability("noReset","false");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("TestData3");
		driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
		driver.openNotifications();
		driver.findElementById("android:id/notification_header").click();
		
    }
}
