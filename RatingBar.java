package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RatingBar 
{
	@Test(enabled = false)
	public void tc_Swipe() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement views=driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, views, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))");
		WebElement rate = driver.findElementByAndroidUIAutomator("text(\"Rating Bar\")");
		driver.tap(1, rate, 500);
		Thread.sleep(3000);
		WebElement star = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		Point loc = star.getLocation();
		int startx = loc.getX();
		int starty = loc.getY();
		int  endx = (int)(star.getSize().getWidth()*0.8);
		int endy = starty;
		
		driver.swipe(startx, starty, endx, endy, 1000);
		
		WebElement rating = driver.findElementById("io.appium.android.apis:id/rating");
		System.out.println("Rating-->"+rating.getText());
	}

	@Test
	public void tc_Tap() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement views=driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, views, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))");
		WebElement rate = driver.findElementByAndroidUIAutomator("text(\"Rating Bar\")");
		driver.tap(1, rate, 500);
		Thread.sleep(3000);
		WebElement star = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		Point loc = star.getLocation();
		int y = loc.getY();
		int x = (int)(int)(star.getSize().getWidth()*0.8);
		driver.tap(1, x, y, 1000);
		
		WebElement rating = driver.findElementById("io.appium.android.apis:id/rating");
		System.out.println("Rating-->"+rating.getText());
	}

}


