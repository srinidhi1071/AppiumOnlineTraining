package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestTouchScreen {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "sabha");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity", ".TouchScreenTestActivity");
		cap.setCapability("UDID", "13baa8650104");
		 URL url=new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(url,cap);
		 cap.setCapability("UDID", "13baa8650104");
			cap.setCapability("noReset", true);
			
			// WebElement view = driver.findElementByAccessibilityId("Views");
			 Dimension size = driver.manage().window().getSize();
			 int h=size.getHeight();
			 int w=size.getWidth();
			 int startx=(int)(w*0.80);
			 int starty=(int)(h*0.80);
			 int endx=(int)(w*0.20);
			 int endy=(int)(h*0.20);
			 
			// driver.tap(1,150,1777, 500);
			 driver.swipe(startx,starty, endx,endy,500);
		 
	}
}
