package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;


public class Demo5 {
	
	@Test
	public void test_screenOrientation() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("The Initial Screen Orientation is "+driver.getOrientation());
		
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(3000);
		System.out.println("The Screen Orientation after rotation is "+driver.getOrientation());
		
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(3000);
		System.out.println("The Screen Orientation after rotation is "+driver.getOrientation());
	
	}

	@Test
	public void test_networkConnection() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		Thread.sleep(3000);
		System.out.println("The Initial Network Connection "+ driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		Thread.sleep(3000);
		System.out.println("The Network Connection after change "+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.NONE);
		Thread.sleep(3000);
		System.out.println("The Network Connection after change "+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.AIRPLANE_MODE);
	
	}
}
