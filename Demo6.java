package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo6 {

	@Test
	public void test_tapAction() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement viewsMenu= driver.findElementByAndroidUIAutomator("text(\"Views\")");
		//WebElement viewsMenu = driver.findElementByAccessibilityId("Views");
		
		driver.tap(1, viewsMenu, 500);
		//driver.tap(1, 469, 1599, 500);
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))");
		
		//driver.swipe(521,1637 ,409 ,439 ,1000 );
//		Dimension dim = driver.manage().window().getSize();
//		int startx = dim.getWidth()/2;
//		int starty = (int) (dim.getHeight()*0.08);
//		int endx= startx; // OR int endx= dim.getWidth()/2;
//		int endy= (int)(dim.getHeight()*0.20);
//		driver.swipe(startx, starty, endx, endy, 1000);
	}

}
