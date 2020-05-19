package com.tyss.appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scenerio1withTap {
	@Test
	public void apk_app() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		WebElement ratingbar = driver.findElementByXPath("(//android.widget.RatingBar[@index='1'])[1]");
		Point bar = ratingbar.getLocation();
//		int startx= bar.getX();
//		int starty=bar.getY();
//		int endx=(int) (ratingbar.getSize().getWidth()*0.70);
//		int endy= starty;
//		driver.swipe(startx, starty, endx, endy, 500);
		int x=(int) (ratingbar.getSize().getWidth()*0.70);
		int y=bar.getY();
	driver.tap(1,x, y, 500);
	String text = driver.findElementById("io.appium.android.apis:id/rating").getText();
	System.out.println(text);
	
	
	}
}