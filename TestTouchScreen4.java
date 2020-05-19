package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestTouchScreen4 {
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
			 int startx=(int)(w*0.20);
			 int starty=(int)(h*0.70);
			 int endx=(int)(w*0.70);
			 int endy=(int)(h*0.20);
			 
			 int startx1=(int)(0.2*w);
			 int starty1=(int)(h*0.8);
			 int endx1=(int)(w*0.80);
			 int endy1=(int)(h*0.8);
			 
			 int startx2=(int)(0.2*w);
			 int starty2=(int)(h*0.2);
			 int endx2=(int)(w*0.80);
			 int endy2=(int)(h*0.2);
			 
			 int startx3=(int)(0.1*w);
			 int starty3=(int)(h*0.7);
			 int endx3=(int)(w*0.10);
			 int endy3=(int)(h*0.3);
			 
			 int startx4=(int)(0.8*w);
			 int starty4=(int)(h*0.7);
			 int endx4=(int)(w*0.80);
			 int endy4=(int)(h*0.3);
			 
			 
			 
			// driver.tap(1,150,1777, 500);
			 driver.swipe(startx,starty, endx,endy,500);
			 driver.swipe(startx1,starty1, endx1,endy1,500);
			 driver.swipe(startx2,starty2, endx2,endy2,500);
			 driver.swipe(startx3,starty3, endx3,endy3,500);
			 driver.swipe(startx4,starty4, endx4,endy4,500);
		 
		 
	}

	
}
