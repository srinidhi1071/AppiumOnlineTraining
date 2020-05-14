package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class BigBasket 
{
	@Test(enabled = false)
	public void enterValue() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "activity.SplashActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		driver.pressKeyCode(AndroidKeyCode.ENTER);	
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	}
	
	
	@Test
	
	public void verifyItemsCount() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "activity.SplashActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		String count = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText();
		System.out.println(count);
		String []ch=count.split(" ");
		for (int i=0; i<ch.length; i++) 
		{
			System.out.println(ch[i]);
		}
		int num = Integer.valueOf(ch[0]);
		System.out.println(num);
		Assert.assertTrue(num>=100);
	}
}
