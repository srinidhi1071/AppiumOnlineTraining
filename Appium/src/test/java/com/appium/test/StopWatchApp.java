package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class StopWatchApp {

	@Test
	public void tc_AppTestInBackground() throws MalformedURLException, InterruptedException
	
	{
		
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Redmi");
	cap.setCapability("platformName", "android");
	cap.setCapability("platformVersion", 9);
	cap.setCapability("automationName", "appium");
	cap.setCapability("noReset", true);
	cap.setCapability("appPackage", "com.hybrid.stopwatch");
	cap.setCapability("appActivity", "MainActivity");
	cap.setCapability("noReset", true);
	cap.setCapability("uiautomator2ServerInstallTimeOut",4000);
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//tapping on start btn
	WebElement startbtn=driver.findElementById("com.hybrid.stopwatch:id/start_pause_button_sw");
	driver.tap(1,startbtn, 500);
	//getting text before app running in background
	String timetakenBeforeRunningApp=driver.findElementById("com.hybrid.stopwatch:id/txt_stopwatch_time").getText();
	//running application in background
	driver.runAppInBackground(10);
	//tapping on pause btn
	WebElement stopbtn=driver.findElementById("com.hybrid.stopwatch:id/start_pause_button_sw");
	driver.tap(1,stopbtn, 500);
	String timetakenAfterRunningAppInbackground=driver.findElementById("com.hybrid.stopwatch:id/txt_stopwatch_time").getText();
	
	System.out.println("time taken Before Running App ="+timetakenBeforeRunningApp);
	System.out.println("time taken After Running Inbackground ="+timetakenAfterRunningAppInbackground);
	//verification
	Assert.assertNotEquals(timetakenBeforeRunningApp,timetakenAfterRunningAppInbackground);
	 

	
	
	

}}

