package com.tyss.Appium.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Moto_Orientation 
{
	@Test
   public void orientationTest() throws MalformedURLException, InterruptedException
   {
	   DesiredCapabilities cap = new DesiredCapabilities();
	   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E3 POWER");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Shree\\Desktop\\Appium\\ApiDemos.apk");
        cap.setCapability("noReset","false");
        cap.setCapability("uiautomator2ServerLaunchTimeout",4000);
       

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		
		System.out.println("The initial screen orientation is ----->"+driver.getOrientation());
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		System.out.println("The orientation of screen after rotation is ---->"+driver.getOrientation());
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(2000);
		System.out.println("The orientation of screen after rotation is ---->"+driver.getOrientation());
   }
}
