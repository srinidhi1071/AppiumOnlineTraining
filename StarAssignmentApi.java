package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class StarAssignmentApi 
{
	@Test
	public void tc_StarTap() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
//		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement viewsMenu = driver.findElementByAccessibilityId("Views");
//		driver.tap(1, viewsMenu, 500);
		
		driver.tap(1, 121, 1851, 500);
		Thread.sleep(3000);
//		driver.swipe(279, 837, 409, 439, 1000);
//		Generic  Method
		Dimension dim = driver.manage().window().getSize();
		int startx = dim.getWidth()/2;
		int starty = (int)(dim.getHeight()*0.80);
		int endx = startx;
		int endy = (int)(dim.getHeight()*0.20);
		
		driver.swipe(startx, starty, endx, endy, 1000);
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Rating Bar").click();
		Thread.sleep(2000);
		driver.findElementById("io.appium.android.apis:id/ratingbar2").click();
		Thread.sleep(2000);
		String starText = driver.findElementById("io.appium.android.apis:id/rating").getText();
		System.out.println("getting the star content--->"+starText);
		
		
}

}
