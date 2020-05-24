package com.tyss.Appium.tests;

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
	public void stopwatch_unBackgrondTest() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Honor 10 Lite");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "AlarmsMainActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.tap(1,driver.findElementById("androidhwext:id/topIcon"),500);
		driver.tap(1,driver.findElementById("com.android.deskclock:id/stopwatch_start_tv_btn\r\n"),500);
		
		Thread.sleep(5000);
		driver.runAppInBackground(10);
		WebElement timer = driver.findElementById("com.android.deskclock:id/stopwatch_ring_view\r\n");
		String timervalue = timer.getAttribute("content-desc");
		int value = Integer.parseInt(timervalue);
		Assert.assertTrue(value>10);
		
		
		
	}

}
