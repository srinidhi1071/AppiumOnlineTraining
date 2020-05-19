package com.REALME;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Ratings {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "sabha");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("automationName", "appium");
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");

		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		
	//	cap.setCapability(MobileCapabilityType.APP, "‪C:\\Users\\hp\\Desktop\\APK\\apidemos.apk");
		cap.setCapability("UDID", "86589dab");
		cap.setCapability("noReset", true);
		
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(url,cap);
		 driver.findElementByAccessibilityId("Views").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
			WebElement rating2 = driver.findElementById("io.appium.android.apis:id/ratingbar2");
           Point loc = rating2.getLocation();
			int startx=loc.getX();
			int starty=loc.getY();
			int endx=(int)(rating2.getSize().getWidth()*0.7);
			int endy=starty;
			driver.swipe(startx, starty, endx, endy, 1000 );
			WebElement rating = driver.findElementById("io.appium.android.apis:id/rating");
		    System.out.println(rating.getText());
	}
}
