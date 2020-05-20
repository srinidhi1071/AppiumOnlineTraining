package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class StopWatch {
	@Test
	public void Stopwatchbackground() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.alarmclock.AlarmClock");
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.findElementByXPath("//android.widget.Button[@text='No thanks']").click();
		driver.findElementById("com.android.deskclock:id/stopwatch").click();
		WebElement time = driver.findElementById("com.android.deskclock:id/time");
		// time before running in background
		String before = time.getText();
		System.out.println("before");
		System.out.println(before);
		driver.findElementById("com.android.deskclock:id/start_btn").click();
		driver.runAppInBackground(10);
		// time after the app displays
		String after = time.getText();
		System.out.println("after");
		System.out.println(after);
		driver.findElementById("com.android.deskclock:id/pause_btn").click();
		// time teken to click on pause button
		System.out.println("after pause");
		System.out.println(time.getText());
		driver.findElementById("com.android.deskclock:id/reset_btn").click();
		// time teken to click on reset button
		System.out.println("after reset");
		System.out.println(time.getText());
		Assert.assertNotEquals(before, after);

	}

}
