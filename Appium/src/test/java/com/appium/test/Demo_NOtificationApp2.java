package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo_NOtificationApp2 {

	
	
	/**
	 * 
	 * @author jyotsana
	 *
	 */
	
	
	@Test

	public void tc_NotificationApptest2() throws MalformedURLException, InterruptedException{
	
	DesiredCapabilities cap =new DesiredCapabilities();
	cap.setCapability("deviceName", "Redmi");
	cap.setCapability("platformName", "android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("automationName", "appium");
	cap.setCapability("appPackage", "com.bhanu.notificationreminders");
	cap.setCapability("appActivity", "MainDrawerActivity");
	cap.setCapability("noReset", "true");
	cap.setCapability("uiautomator2ServerInstallTimeout",40000);
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("testdata2");
	/*click on notifybtn*/
	WebElement notifyMenu = driver.findElementById("com.bhanu.notificationreminders:id/btnNotify");
	driver.tap(1, notifyMenu , 500);
	Thread.sleep(3000);
    //driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").click(); 
	/*open Notification*/
	Thread.sleep(3000);
	driver.openNotifications();
	
	/*click on expand button*/
	Thread.sleep(3000);
	driver.findElementById("android:id/expand_button").click();
	
	/*click on read button*/
	Thread.sleep(3000);
	driver.findElementById("android:id/action0").click();
	Thread.sleep(3000);

	}
	
		
	
	
	

	
	
	
	



}

	
	
	
	
	

