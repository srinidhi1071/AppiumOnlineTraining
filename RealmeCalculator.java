package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealmeCalculator {
	@Test
	public void openApp2() throws MalformedURLException {

	DesiredCapabilities cap=new DesiredCapabilities();		
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	//cap.setCapability("noReset", true);
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementById("com.google.android.calculator:id/digit_5").click();
	driver.findElementById("com.google.android.calculator:id/op_mul").click();
	driver.findElementById("com.google.android.calculator:id/digit_4").click();
	driver.findElementById("com.google.android.calculator:id/eq").click();
	

}
}
