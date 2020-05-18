package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class NetworkConnectivity 
{
	@Test
	public void tc_networkConnect() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.openNotifications();
		Thread.sleep(3000);
		System.out.println("initial connection----<"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		Thread.sleep(3000);
		System.out.println("connection after change--->"+driver.getConnection());
		driver.setConnection(Connection.NONE);
		Thread.sleep(3000);
		System.out.println("connection after change--->"+driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);

}
}