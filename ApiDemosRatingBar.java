package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosRatingBar {
	
	@Test
	public void addRating() throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, views, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))");
		WebElement ratingbar = driver.findElementByAndroidUIAutomator("text(\"Rating Bar\")");
		driver.tap(1,ratingbar, 500);
		Thread.sleep(3000);
		WebElement ratingtab = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		driver.tap(1, 504, 484, 500);
		Thread.sleep(2000);
		String ratingvalue = driver.findElementById("io.appium.android.apis:id/rating").getText();
		System.out.println(ratingvalue);
		
	}

}
