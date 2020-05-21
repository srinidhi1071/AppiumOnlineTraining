package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class BigBasket {

	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
    	cap.setCapability("appActivity", "activity.SplashActivity");
    	cap.setCapability("noReset", true);
    	cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.bigbasket.mobileapp:id/homePageSearchBox")).click();
    	driver.findElement(By.id("com.bigbasket.mobileapp:id/searchView")).sendKeys("mangoes");
    	driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
    	String items = driver.findElement(By.id("com.bigbasket.mobileapp:id/txtProductCount")).getText();
    	System.out.println("items = "+items);
    	 String[] itemNum = items.split(" ");
    	 int itemnumber = Integer.parseInt(itemNum[0]);
    	 System.out.println("item number "+itemnumber);
    	 Assert.assertTrue( itemnumber>140, "search items are less than 140");
	
	}
}
