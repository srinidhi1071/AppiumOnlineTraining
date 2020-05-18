package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Orientation
{
	@Test
	public void search() throws MalformedURLException, InterruptedException
	{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Moto G4");
	cap.setCapability("platformName", "android");
	cap.setCapability("platformVersion", 7);
	cap.setCapability("automationName", "appium");
	cap.setCapability("noReset", true);
	cap.setCapability("appPackage", "com.android.chrome");
	cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	System.out.println("Initial orientaion of device--> "+driver.getOrientation());
	Thread.sleep(2000);
	driver.rotate(ScreenOrientation.LANDSCAPE);
	Thread.sleep(2000);
	System.out.println("Initial orientaion of device--> "+driver.getOrientation());
	Thread.sleep(2000);
	driver.rotate(ScreenOrientation.PORTRAIT);
	Thread.sleep(2000);
	System.out.println("Initial orientaion of device--> "+driver.getOrientation());
	}
}
