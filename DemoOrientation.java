package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoOrientation {
	@Test
	public void tc_Orientation() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("The initial screen Orientation is  -->"+driver.getOrientation());
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println("The Orientation of screen after Rotation is  -->"+driver.getOrientation());
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("The Orientation of screen after Rotation is  -->"+driver.getOrientation());
		Thread.sleep(3000);
	}
}
