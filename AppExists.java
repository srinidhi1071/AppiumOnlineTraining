package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppExists 
{
	@Test
	public void appExi() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
	//	cap.setCapability("appPackage", "io.appium.android.apis");
	//	cap.setCapability("appActivity","ApiDemos");
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		if(driver.isAppInstalled("io.appium.android.apis"))
		{
			System.out.println("Yes, the app is installed");
		}
		else
		{
			System.out.println("no app is not installed");
		}
	
	}
}
