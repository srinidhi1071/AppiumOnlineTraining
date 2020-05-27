package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dialer {
@Test
public void dial() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.contacts.activities.TwelveKeyDialer");
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	driver.findElementByAccessibilityId("nine").click();
	driver.findElementByAccessibilityId("three").click();
	driver.findElementByAccessibilityId("six").click();
	driver.findElementByAccessibilityId("five").click();
	driver.findElementByAccessibilityId("four").click();
	driver.findElementByAccessibilityId("two").click();
	driver.findElementByAccessibilityId("eight").click();
	driver.findElementByAccessibilityId("six").click();
	driver.findElementByAccessibilityId("one").click();
	driver.findElementByAccessibilityId("six").click();
	Dimension dim = driver.manage().window().getSize();
	int x = (int) (dim.getWidth()*0.50);
	int y=(int) (dim.getHeight()*0.98);
	driver.tap(1, x, y, 100);
	
	
}
}
