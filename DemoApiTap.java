package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApiTap {
	@Test
	public void tc_tap() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");		
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//WebElement viewsMenu = driver.findElementByAccessibilityId("Views");
		WebElement viewsMenu = driver.findElementByAndroidUIAutomator("text(\"Views\")");
	    driver.tap(1, viewsMenu, 500);
	   // one more way to tap the element with 4 arguments
		//driver.tap(1, 360, 1193, 1000);
		
//		driver.swipe(394, 1075, 394,312,1000);
//		Thread.sleep(3000);

//		Dimension dim = driver.manage().window().getSize();
//		int startx=dim.getWidth()/2;
//		int starty=(int)(dim.getHeight()*0.8);
//		int endx=startx;
//		int endy=(int)(dim.getHeight()*0.2);
//		driver.swipe(startx, starty, endx, endy, 1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))");
		
		
		
	}
}

