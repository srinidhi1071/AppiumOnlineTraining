package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApiSeekBar 
{
	@Test
	public void tc_tapandSwipe
	() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement viewsMenu = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, viewsMenu, 500);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))");
		WebElement seekBarMenu = driver.findElementByAndroidUIAutomator("text(\"Seek Bar\")");
		driver.tap(1, seekBarMenu, 500);
		WebElement seekBar = driver.findElementById("io.appium.android.apis:id/seek");
		Point loc = seekBar.getLocation();
		int startx = loc.getX();
		int starty = loc.getY();
		int endx = (int)(seekBar.getSize().getWidth()*0.80);
		int endy = starty;
		driver.swipe(startx, starty, endx, endy, 1000);

}

}
