package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppDemo {

	@Test
	public void tc_webAppOpenBrowser() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("browserName", "chrome");
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// cap.setCapability(MobileCapabilityType.FULL_RESET, true);

//		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.the511plus.MultiTouchTester");
//		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MultiTouchTester");


		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
}
