package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchApplication {
	
	@Test
	public void sendkeysBigBasket() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("noReset", true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		if(driver.isLocked()) {
		System.out.println("Is the phone unlocked before using unlockdevice method = "+driver.isLocked());	
		driver.unlockDevice();
		System.out.println("Is the phone unlocked after using unlockdevice method = "+driver.isLocked());
		}
		else {
			System.out.println("Is the phone locked = "+driver.isLocked());
			if(driver.isAppInstalled("io.appium.android.apis")) {
				System.out.println("Is the App Installed = "+driver.isAppInstalled("io.appium.android.apis"));
			driver.startActivity("io.appium.android.apis", "ApiDemos");
			}
			else {
				System.out.println("Is the App Installed = "+driver.isAppInstalled("io.appium.android.apis"));
				driver.installApp("C:\\Users\\SHYAM\\Desktop\\APK\\ApiDemos.apk");
				System.out.println("Is the App Installed = "+driver.isAppInstalled("io.appium.android.apis"));
				driver.startActivity("io.appium.android.apis", "ApiDemos");
			}
			Thread.sleep(3000);
			driver.launchApp();
			Thread.sleep(3000);	
			System.out.println("Is the phone unlocked before using lock device method = "+driver.isLocked());
			driver.lockDevice();
			System.out.println("Is the phone Locked after using lock device method = "+driver.isLocked());
			
		
		}
		
}
}
