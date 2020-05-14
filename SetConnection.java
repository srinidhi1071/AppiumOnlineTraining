package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SetConnection {
	@Test
	public void changeNetworkConnection() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.openNotifications();
		Thread.sleep(3000);
		System.out.println("Initial Network connection is="+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		Thread.sleep(3000);
		System.out.println("Network connection after change="+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.NONE);
		Thread.sleep(3000);
		System.out.println("Network connection after change="+driver.getConnection());
		
		
		
	}

}
