package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo2 {
	
	@Test
	public void test_noReset() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		//cap.setCapability("noReset", true);
		cap.setCapability("fullReset", true);
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Prathika\\Downloads\\ApiDemos.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		Thread.sleep(3000);
	}

}
