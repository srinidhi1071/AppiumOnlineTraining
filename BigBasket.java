package com.tyss.Appium.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {

	@Test
	public void searchTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Honor 10 Lite");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability("noReset", "true");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		Thread.sleep(2000);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(2000);
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		Thread.sleep(4000);
		
	    String items_count1 = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText().substring(0,3);
	    int items_count = Integer.parseInt(items_count1);
	    Assert.assertTrue(items_count>140);
	    
	 
	 
		
		
	}

}
