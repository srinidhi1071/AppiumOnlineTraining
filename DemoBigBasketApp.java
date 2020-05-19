package com.tyss.appiumProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoBigBasketApp {
	@Test
	public void demobb() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		Thread.sleep(3000);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(2000);
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("MAngo");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		Thread.sleep(2000);
		String actual = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText();
		String[] b = actual.split(" ");
		int a=Integer.parseInt(b[0]);
		
		
		
		Assert.assertTrue(a>140); 
	
		
		

	}

}
