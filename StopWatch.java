package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class StopWatch {
	
	@Test
	public void checkTimeBackground() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.alarmclock.AlarmClock");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement stopwatchTab = driver.findElementById("com.android.deskclock:id/stopwatch");
		driver.tap(1, stopwatchTab, 500);
		WebElement startBtn = driver.findElementById("com.android.deskclock:id/stopwatch_bottom");
		driver.tap(1, startBtn, 500);
		String timeBeforeRunningAppinBackground=driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("Time Before Running App in BAckground ="+timeBeforeRunningAppinBackground);
		driver.runAppInBackground(10);
		WebElement pauseBtn = driver.findElementById("com.android.deskclock:id/pause_btn");
		driver.tap(1, pauseBtn, 500);
		String timeAfterRunningAppinBackground=driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("Time After Running App in Background ="+timeAfterRunningAppinBackground);
		Assert.assertNotEquals(timeBeforeRunningAppinBackground, timeAfterRunningAppinBackground);
		
	}

}
