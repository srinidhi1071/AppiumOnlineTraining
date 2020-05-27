package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MultiTouchAction_1 {
	
	@Test
    public void multiTouch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.the511plus.MultiTouchTester");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"MultiTouchTester");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TouchAction ta1=new TouchAction(driver);
		TouchAction swipe1 = ta1.press(194, 250).waitAction(5000).moveTo(840, 1758).release();
		TouchAction ta2=new TouchAction(driver);
		TouchAction swipe2 = ta1.press(413, 285).waitAction(5000).moveTo(968, 1620).release();
		MultiTouchAction ma=new MultiTouchAction(driver);
		ma.add(swipe1).add(swipe2).perform();


}
}
