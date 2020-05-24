package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Touch_Actions 
{
	@Test
	public void touchEg() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity","ApiDemos");
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Expandable Lists").click();
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		WebElement menu1 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		

		TouchAction ta=new TouchAction(driver);
	//	ta.press(menu1).release().perform();
	    ta.longPress(menu1).release().perform();
	}
}
