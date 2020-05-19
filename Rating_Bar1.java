package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Rating_Bar {
	@Test
	public void tc1_Rating_Bar() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement views = driver.findElementByAccessibilityId("Views");
		driver.tap(1, views, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))");
		WebElement ratingbarmenu = driver.findElementByAndroidUIAutomator("text(\"Rating Bar\")");
		driver.tap(1, ratingbarmenu, 500);
		WebElement barloc = driver.findElementById("io.appium.android.apis:id/ratingbar2");
	       Point loc = barloc.getLocation();
		int y=(int)(loc.getY());
		
		int x=(int) ((barloc.getSize().getWidth())*.70);
		
		driver.tap(1, x, y, 500);
		String actualtxt = driver.findElementById("io.appium.android.apis:id/rating").getText();
		Assert.assertEquals(actualtxt,"Rating: 3.5/5");
		System.out.println("Rating Bar  ="+actualtxt);
		
		
	}
}
