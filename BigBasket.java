package com.tyss.appiumproject.test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {


	@Test(enabled=false)
	public void tc_BigBasketTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(3000);
	    driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("mango");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER); 
		Thread.sleep(3000);
	}
	
	
	@Test
	public void tc_BigBasketTest1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(3000);
	    driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("mango");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER); 
		Thread.sleep(3000);
		String items = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText();
		System.out.println(items);
		String[] itemNumber = items.split(" ");		
		int itemnum = Integer.parseInt(itemNumber[0]);
		System.out.println(itemnum);
		Assert.assertTrue(itemnum>40, "searchitem are less than 140");
		
		
		
	}
	

}
