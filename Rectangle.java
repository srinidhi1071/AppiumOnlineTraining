package com.touchscreentest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Rectangle {

	@Test
	public void tc_SwipeGenric() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 9);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity", "TouchScreenTestActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1st left
		Dimension dim = driver.manage().window().getSize();
		int startx1 = (int)(dim.getWidth()*0.20);
		int starty1 = (int)(dim.getHeight()*0.20);
		int endx1 = startx1;
		//int endx = (dim.getWidth())/2;
		int endy1 = (int)(dim.getHeight()*0.80);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		Thread.sleep(1000);
		
		//2nd bottom
		int startx2=endx1;
		int starty2=endy1;
		int endx2= (int)(dim.getWidth()*0.80);
		int endy2=(int)(dim.getHeight()*0.80);
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		Thread.sleep(1000);
		
		//3rd right
		int startx3= endx2;
		int starty3= endy2;
		int endx3=(int)(dim.getWidth()*0.80);
		int endy3=(int)(dim.getHeight()*0.20);
		driver.swipe(startx3, starty3, endx3, endy3, 1000);
		Thread.sleep(1000);
		
		//4th top
		int startx4= endx3;
		int starty4= endy3;
		int endx4=startx1;
		int endy4=starty1;
		driver.swipe(startx4, starty4, endx4, endy4, 1000);
		
	}
}
