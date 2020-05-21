package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LockUnlockDevice {
	@Test
	public void tc_LockUnlock() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");

		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		cap.setCapability("noReset", true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (driver.isLocked()) {
			System.out.println("The device is locked----->" + driver.isLocked());
			driver.unlockDevice();
			System.out.println("The device is locked----->" + driver.isLocked());

		} else {
			System.out.println("The device is unlocked------->" + driver.isLocked());
			driver.lockDevice();
		}
	}

}
