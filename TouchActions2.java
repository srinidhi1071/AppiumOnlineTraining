package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchActions2 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
//		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
//		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		System.out.println(driver.isLocked());
		if (driver.isLocked()) {
			driver.unlockDevice();
			System.out.println("is device locked?" + driver.isLocked());
		} else {
			driver.lockDevice();
			System.out.println(" in else part is device locked?" + driver.isLocked());
		}
	}

}
