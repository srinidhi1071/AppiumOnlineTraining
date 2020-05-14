package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApiAppClick {
	
	
	/*@Test(description="Locators")
	public void tc_apiDemosSendKeys() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Holo Light Theme\"]").click();
        driver.findElementById("io.appium.android.apis:id/edit").sendKeys("anusha");    
		Thread.sleep(3000);
	}*/
	
	
	@Test(description="Locators")
	public void tc_apiDemosSendKeys1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability("noReset", "true");
		cap.setCapability(MobileCapabilityType.APP, "G:\\ApiDemos.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Controls").click();
        driver.findElementByAccessibilityId("3. Holo Light Theme").click();
        driver.findElementById("io.appium.android.apis:id/edit").sendKeys("anusha");    
		Thread.sleep(3000);
	}

}
