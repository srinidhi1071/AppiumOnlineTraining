package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeProgram {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity","ApiDemos");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		WebElement viewsMenu=driver.findElementByAccessibilityId("Views");
		
		driver.tap(1,469,1599,500);
		Thread.sleep(2000);
		driver.swipe(521, 1637, 409, 439, 1000);
		
	}

}
