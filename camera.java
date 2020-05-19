package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class camera {
	
	@Test
	public void cam() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "VideoCamera");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.findElementByXPath("//android.widget.Button[@text='DENY']").click();
		
		//Take A pic in Primary CAM
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		//Take A pic in Secondary CAM
		WebElement Switch = driver.findElementByAccessibilityId("Front and rear camera switch");
		driver.tap(1, Switch, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
//		Goto Settings And Change Resolution from 4:3 -18:9.
		driver.tap(1, Switch, 500);
		Dimension dim = driver.manage().window().getSize();
		int  x = (int) (dim.getWidth()*0.90);
		int y =(int)(dim.getHeight()*0.01);
		driver.tap(1, x, y, 500);
		driver.findElementByXPath("(//android.widget.TextView[@text='Settings'])").click();
		Thread.sleep(1000);
		int startx=(int) (dim.getWidth()*0.5);
		int starty=(int) (dim.getHeight()*0.80);
		int endx=startx;
		int endy=(int) (dim.getHeight()*0.2);
		driver.swipe(startx, starty, endx, endy, 2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='18:9']").click();
		driver.findElementById("miui:id/up").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		//Take A Video
		driver.findElementByXPath("//	android.widget.TextView[@text='Video']").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(5000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		
		
		
	
	}}
