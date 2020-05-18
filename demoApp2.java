package com.tyss.appium;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class demoApp2 {
	
	 @Test
		public void tc_noRestDemo1() throws Exception {
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("deviceName", "RedmiNote4");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "7");
			cap.setCapability("automationName", "appium");
			
			cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\123\\Downloads\\SHAREit\\Redmi Note 4\\file\\ApiDemos.apk");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
			driver.findElementByAccessibilityId("Views").click();
			Thread.sleep(3000);
			//driver.tap(1, viewsMenu , 500);
			//Thread.sleep(3000);
			//driver.tap(1, 131, 1771, 500);
			driver.swipe(281, 1403, 186, 269, 1000);
			
			
		}

}
