package org.appium.basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dialer {
	@Test
	public void tc_dialNumber() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("automationName", "appium");
		cap.setCapability("platformName", "andriod");
		cap.setCapability("platformVersion", "9");
		// cap.setCapability("fullReset", true);
		cap.setCapability("appPackage", "com.google.android.dialer");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.tap(1,driver.findElementByAccessibilityId("key pad"), 500);
		List<WebElement> number = driver.findElementsById("com.google.android.dialer:id/dialpad_key_number");
		TouchAction ta=new TouchAction(driver);
		
//		ta.press(number.get(8)).waitAction(1000).press(number.get(2)).press(number.get(6))
//		.press(number.get(1)).press(number.get(5)).press(number.get(0)).press(number.get(10))
//		.press(number.get(10)).press(number.get(0)).press(number.get(5)).release().perform();
		
		///2nd approch
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/nine"), 100);//9
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/three"), 100);//3
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/seven"), 100);//7
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/two"), 100);//2
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/six"), 100);//6
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/one"), 100);//1
		driver.findElementById("com.google.android.dialer:id/zero").click();//0
		driver.findElementById("com.google.android.dialer:id/zero").click();///0
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/one"), 100);//1
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/six"), 100);//6
		
		driver.tap(1, driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button"), 500);
	
	}

}
