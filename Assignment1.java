package com.tyss.appiumtraining.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Assignment1 {
	
	@Test
	public void test_BigBasket() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus6T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability("noReset", true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(3000);
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		Thread.sleep(3000);
		String items=driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText();
		System.out.println(items);
		String[] itemNum = items.split(" ");
		int iNum= Integer.parseInt(itemNum[0]);
		System.out.println(iNum);
		Assert.assertTrue(iNum>50, "search items are more then 50");
	}

}
