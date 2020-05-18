package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenTest_4 {
	
	@Test
	public void pattern_X() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		Dimension dim = driver.manage().window().getSize();
		int startx=(int) (dim.getWidth()*0.2);
		int starty=startx;
		int endx=(int) (dim.getWidth()*0.8);
		int endy=(int) (dim.getHeight()*0.8);
		driver.swipe(startx, starty, endx, endy, 1000);
		Thread.sleep(3000);
		int startx1=startx;
		int starty1=(int) (dim.getHeight()*0.8);
		int endx1=(int) (dim.getWidth()*0.8);
		int endy1=(int) (dim.getHeight()*0.2);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		Thread.sleep(3000);
		
	}

}
