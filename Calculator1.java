package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator1 {

	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity",".Calculator");
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_06").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_add").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_equal").click();
		
		driver.close();
		}

}
