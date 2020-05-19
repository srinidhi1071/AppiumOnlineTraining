package com.tyss.appiumproject.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoRatingBar {

	
	@Test
	public void tc_rating() throws MalformedURLException, InterruptedException {
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
        WebElement viewsMenu = driver.findElementByAndroidUIAutomator("text(\"Views\")");
	    driver.tap(1, viewsMenu, 500);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		WebElement ratingbar = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		Point loc = ratingbar.getLocation();    
		int startx=loc.getX();
	    int starty=loc.getY();
	    int endx=(int)(ratingbar.getSize().getWidth()*0.7);
	    int endy=starty;
	    driver.swipe(startx, starty, endx, endy, 1000);
        //driver.tap(1, endx, endy, 1000);
        String text = driver.findElementById("io.appium.android.apis:id/rating").getText();
        System.out.println("rating=" +text);
        Assert.assertEquals(text, "Rating: 3.5/5");
        
        
	
}
}
