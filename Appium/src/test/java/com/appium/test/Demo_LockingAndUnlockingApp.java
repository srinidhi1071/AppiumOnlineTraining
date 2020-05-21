package com.appium.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo_LockingAndUnlockingApp {
	
	@Test
	public void tc_LockAndUnlockfunction() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 9);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
        
		if (driver.isLocked()) {
			System.out.println(" is the phone locked ??????----->" + driver.isLocked());
			driver.unlockDevice();//unlock the device
			System.out.println("The device is locked----->" + driver.isLocked());

		} 
		
		else {
			System.out.println("is the phone locked???????........>" + driver.isLocked());
			driver.lockDevice();//lock the device

	
	
		}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	





