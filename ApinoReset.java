package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApinoReset  
{
	@Test
	public void tc_noResetapp() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		//cap.setCapability("noReset", true);
		//cap.setCapability("fullReset", true);
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Den\\Desktop\\APK\\ApiDemos.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		driver.openNotifications();

}

}
