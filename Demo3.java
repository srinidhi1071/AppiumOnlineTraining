package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo3 {
	
	@Test(description="Locators")
	public void test_Calculator() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus6T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oneplus.calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.oneplus.calculator:id/digit_8").click();
		driver.findElementById("com.oneplus.calculator:id/op_add").click();
		driver.findElementById("com.oneplus.calculator:id/digit_9").click();
		driver.findElementById("com.oneplus.calculator:id/eq").click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void tc_openApp() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus6T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oneplus.calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
	}

}
