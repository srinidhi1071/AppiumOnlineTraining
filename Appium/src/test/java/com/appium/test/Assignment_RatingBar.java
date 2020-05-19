package com.appium.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Assignment_RatingBar {
	
	
	
	
	@Test
	public void tc_ratingBar() throws MalformedURLException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 9);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on view
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//scrolling function
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))");
		WebElement seekBarMenu = driver.findElementByAndroidUIAutomator("text(\"Rating Bar\")");
		driver.tap(1, seekBarMenu, 500);
		WebElement starbar = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		Point loc = starbar.getLocation();
		int startx=loc.getX();
		int starty=loc.getY();
		int endx= (int)(starbar.getSize().getWidth()*0.70);
		int endy=startx;
		driver.swipe(startx, starty, endx, endy, 1000);
		WebElement rating = driver.findElementById("io.appium.android.apis:id/small_ratingbar");
		String data = rating.getText();
		System.out.println(data);

	}}
















