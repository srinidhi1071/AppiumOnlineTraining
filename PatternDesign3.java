package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class PatternDesign3
{
	@Test
	public void tc_DesignXYcord() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.mycompany.anton_mokshyn.touchscreentest");
		cap.setCapability("appActivity", "MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.tap(1, 530, 990, 500);
		Dimension dim = driver.manage().window().getSize();
		
		//Draw vertical line
		int startx1 = (int)(dim.getWidth()*0.20);
		int starty1 = (int)(dim.getHeight()*0.20);
		int endx1 = startx1;
		int endy1 = (int)(dim.getHeight()*0.80);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		Thread.sleep(2000);
		
		//Draw Horizontal line
		int startx2 = endx1;
		int starty2 = endy1;
		int endx2 =	(int)(dim.getWidth()*0.80);
		int endy2 =	starty2;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		
		Thread.sleep(2000);
		
		//Draw diagonal line
		int startx3 = startx2;
		int starty3 = starty2;
		int endx3 =	(int)(dim.getWidth()*0.80);
		int endy3 =	(int)(dim.getHeight()*0.20);
		driver.swipe(startx3, starty3, endx3, endy3, 1000);
		
	}
}
