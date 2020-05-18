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

public class TouchScreenTest_1 {
	
	@Test
	public void squarePattern() throws MalformedURLException, InterruptedException {
		
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
		int endx=startx;
		int endy=(int) (dim.getHeight()*0.8);
		driver.swipe(startx, starty, endx, endy, 1000);
		Thread.sleep(3000);
		int startx1=startx;
		int starty1=endy;
		int endx1=(int) (dim.getWidth()*0.8);
		int endy1=endy;
		driver.swipe(startx1, starty1, endx1, endy, 1000);
		Thread.sleep(3000);
		int startx2=endx1;
		int starty2=endy1;
		int endx2=startx2;
		int endy2=starty;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		Thread.sleep(3000);
		int startx3=endx2;
		int starty3=endy2;
		int endx3=startx;
		int endy3=endy2;
		driver.swipe(startx3, starty3, endx3, endy3, 1000);
		Thread.sleep(3000);
		
	}

}
