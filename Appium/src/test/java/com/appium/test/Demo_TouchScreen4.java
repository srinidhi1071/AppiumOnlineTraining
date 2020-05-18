package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo_TouchScreen4 {
	/**
	 * 
	 * @author jyotsana
	 *
	 */
	
	
	
	@Test 
	public void tc_TouchscreenApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"jp.rallwell.siriuth.touchscreentest" );
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("noReset", true);
		
		cap.setCapability("uiautomator2ServerInstallTimeOut",4000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		WebElement testpoint = driver.findElementById("jp.rallwell.siriuth.touchscreentest:id/surfaceView");
		driver.tap(1, testpoint, 500);
		
		Thread.sleep(3000);
		Dimension dim = driver.manage().window().getSize();
		
		//for first cross line
		int startx1=(int)(dim.getWidth()*0.10);
		int endx1=(int)(dim.getWidth()*0.90);
		int starty1=(int) (dim.getHeight()*0.90);
		int endy1=(int) (dim.getHeight()*0.10);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		// for second cross line
		int startx2=(int)(dim.getWidth()*0.10);
		int endx2=(int)(dim.getWidth()*0.90);
		int starty2=(int) (dim.getHeight()*0.10);
		int endy2=(int) (dim.getHeight()*0.90);
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
	}}
		

	