package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class OpenNotification
{
	@Test
	public void tc_openNotification() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.bhanu.notificationreminders");
		cap.setCapability("appActivity", "MainDrawerActivity");
		cap.setCapability("noReset", true);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("testdata1");
		driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
		Thread.sleep(3000);
		driver.openNotifications();
		Thread.sleep(3000);
		driver.findElementById("android:id/right_icon").click();

}
}
