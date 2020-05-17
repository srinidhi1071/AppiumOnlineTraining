package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notification_Prog {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J6");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8");
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.openNotifications();
		Thread.sleep(3000);
		System.out.println("Initial connection "+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		Thread.sleep(3000);
		System.out.println("connection after change "+driver.getConnection());
		driver.setConnection(Connection.NONE);
		Thread.sleep(3000);
		System.out.println("connection after change "+driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);
	}

}
