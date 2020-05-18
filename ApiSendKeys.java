package com.tyss.appiumnativeapp.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiSendKeys 
{
	@Test
	public void tc_openapp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "SamsungA8+");
		cap.setCapability("platformName", "android");
		cap.setCapability( "platformVersion", "9");
		cap.setCapability("automationName", "appium");
		cap.setCapability("appPackage", "io.appium.andriod.apis");
		cap.setCapability("appActivity", "ApiDemos");
//		cap.setCapability("noReset", true);
//		cap.setCapability("fullReset", true);
//		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Den\\Desktop\\APK\\ApiDemos.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("3. Holo Light Theme").click();
		driver.findElementByAccessibilityId("io.appium.android.apis:id/edit").sendKeys("TestData");
		Thread.sleep(2000);
		
}

}
