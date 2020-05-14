package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoAddvalueInCal {
	
   @Test(description="Locators")
	public void tc_CalculatorTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.miui.calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "cal.CalculatorActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("android:id/button1").click();
        Thread.sleep(3000);
        driver.findElementById("com.miui.calculator:id/btn_6_s").click();
        driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
        driver.findElementById("com.miui.calculator:id/btn_4_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
		Thread.sleep(3000);
	}
	
	
	
}
