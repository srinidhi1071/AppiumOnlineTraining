package com.appium.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo_ApiViewsAssignment {
	/**
	 * 
	 * @author jyotsana
	 *
	 */
	
	
	
	@Test
	public void Demo_ApiDemosapp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 9);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("3. Holo Light Theme").click();
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Viewstext");
	}



}
