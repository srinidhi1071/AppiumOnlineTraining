package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dialer {
	@Test
    public void dialNumber() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activities.TwelveKeyDialer");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("five").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("three").click();
		driver.findElementByAccessibilityId("nine").click();
		driver.findElementByAccessibilityId("two").click();
		driver.findElementByAccessibilityId("Dial").click();	
		
}
}