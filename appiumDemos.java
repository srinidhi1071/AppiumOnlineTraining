package com.tyss.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appiumDemos {
	@Test
	public void tc_noRestDemo1() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\123\\Downloads\\SHAREit\\Redmi Note 4\\file\\ApiDemos.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   /*driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
   driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
   driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Holo Light Theme\"]").click();
   driver.findElementById("io.appium.android.apis:id/edit").sendKeys("black");*/
   driver.findElementByAccessibilityId("Views").click();
   driver.findElementByAccessibilityId("Controls").click();
   Thread.sleep(3000);
   driver.findElementByAccessibilityId("3. Holo Light Theme").click();
   driver.findElementById("io.appium.android.apis:id/edit").sendKeys("black");
   
   
		
	}

}
