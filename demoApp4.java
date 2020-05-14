package com.tyss.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class demoApp4 {
	
	@Test
	public void tc_openapp() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "activity.SplashActivity");
		cap.setCapability("noReset", true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Thread.sleep(2000);
    driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
    Thread.sleep(2000);
    driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("mangos");
    Thread.sleep(2000);
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	String items = driver.findElement(By.id("com.bigbasket.mobileapp:id/txtProductCount")).getText();
	System.out.println("items = "+items);
	 String[] itemNum = items.split(" ");
	 int itemnumber = Integer.parseInt(itemNum[0]);
	 System.out.println("item number "+itemnumber);
	 Assert.assertTrue( itemnumber>140, "search items are less than 140");

 System.out.println("successs machaaaaaaa");
    
    
   
    
	}

}
