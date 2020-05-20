package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApiInBackGround {
	@Test(enabled=false)
	public void tc_InApiBackGround() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.runAppInBackground(10);
}
	
	@Test
	public void tc_StopwatchInBackGround() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.alarmclock.AlarmClock");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementById("com.android.deskclock:id/stopwatch").click();
		Thread.sleep(2000);
		driver.findElementById("com.android.deskclock:id/start_btn").click();
		//time before running in background
		String starttime = driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("start time is=="  +starttime);
		driver.runAppInBackground(10);
		//after background time
		String endtime = driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("end time is=="  +endtime);
		driver.findElementById("com.android.deskclock:id/pause_btn").click();
		//pause time
		String pausetime = driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("pause time is==" +pausetime);
		driver.findElementById("com.android.deskclock:id/reset_btn").click();
		//reset time
		String resettime = driver.findElementById("com.android.deskclock:id/time").getText();
		System.out.println("reset time is==" +resettime);
		Assert.assertNotEquals(starttime, endtime);
}

}
