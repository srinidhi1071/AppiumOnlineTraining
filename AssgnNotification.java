package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AssgnNotification {
	@Test
	public void tc_notification() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainDrawerActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Find title text box and send title name
		WebElement text = driver.findElementByClassName("android.widget.EditText");
		text.sendKeys("hi hello ");
		//find notify button and tap on it
		WebElement notifyBTN = driver.findElementById("com.bhanu.notificationreminders:id/btnNotify");
		driver.tap(1, notifyBTN, 300);
		Thread.sleep(3000);
		//swipe the notifiaction Bar
		driver.openNotifications();
		
		//click on received notifiaction and TAP on Notification
		WebElement notifiicationReadBTN = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView\r\n" + 
				"");
		notifiicationReadBTN.click();
		Thread.sleep(3000);
//		WebElement remindlater = driver.findElementById("com.bhanu.notificationreminders:id/invite_friends_close");
//		driver.tap(1, remindlater, 1);
		//get the text present in title
		System.out.println(driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText").getText());
	
		
		
		//landscape
		driver.rotate(ScreenOrientation.LANDSCAPE);
	WebElement txtt = driver.findElementByClassName("android.widget.EditText");
	txtt.sendKeys(" " );
	txtt.sendKeys("bye ");
	WebElement notifiBTN = driver.findElementById("com.bhanu.notificationreminders:id/btnNotify");
	driver.tap(1, notifiBTN, 300);
	Thread.sleep(3000);
	driver.openNotifications();
	WebElement notifiicationreadBTN = driver.findElementById("android:id/title");
	notifiicationreadBTN.click();
	Thread.sleep(3000);
	System.out.println(driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText").getText());

	
		}
	

}
