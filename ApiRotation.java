package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApiRotation 

{
	@Test
	public void tc_orientation() throws MalformedURLException, InterruptedException
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
		
		System.out.println("the initial screen orientation is--->"+driver.getOrientation());
		
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(3000);
		System.out.println("the orientation screen orientation is--->"+driver.getOrientation());
		
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(3000);
		System.out.println("the orientation screen orientation is--->"+driver.getOrientation());
	
	
}
}