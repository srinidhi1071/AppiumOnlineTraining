package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenTest4 {
	@Test
	public void patttern2() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		 AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		WebElement screen = driver.findElementById("jp.rallwell.siriuth.touchscreentest:id/surfaceView");
		Point dim = screen.getLocation();
	
		 int startx1=(int) (screen.getSize().getWidth()*0.20);
		 int starty1=(int)(screen.getSize().getHeight()*0.20);
		 int endx1= (int) (screen.getSize().getWidth()*0.80);
		 int endy1=(int)(screen.getSize().getHeight()*0.80);
		 driver.swipe(startx1, starty1, endx1, endy1, 3000);
		 int startx2=startx1;
			int starty2= endy1;
			int endx2=(int) (screen.getSize().getWidth()*0.80);
			int endy2= (int)(screen.getSize().getHeight()*0.20);
			driver.swipe(startx2, starty2, endx2, endy2, 3000);
		 
		 
		 

	}
	

}
