package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Demo4 {
	
	@Test(enabled=false)
	public void test_ApiSendKeys() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("3. Holo Light Theme").click();
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("TestData");
		Thread.sleep(3000);
	}
	
	@Test
	public void test_bigBaasket() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6T");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 10);
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "activity.SplashActivity");
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		cap.setCapability("noReset", true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(3000);
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		
	}

}
