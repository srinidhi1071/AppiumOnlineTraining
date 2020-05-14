package com.tyss.appiumproject.test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoNotification {
	@Test
	public void tc_notification() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainDrawerActivity");		
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement get = driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle");
       get.sendKeys("testdata");
        String actual = get.getText();
        System.out.println(actual);
        driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
        driver.openNotifications();
        Thread.sleep(4000);
        driver.findElementById("android:id/title").click();
        Thread.sleep(4000);       
        String expected = driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText").getText();
        System.out.println(expected);
        Thread.sleep(4000);
        Assert.assertEquals(actual, expected);
        
   
        
}
}
