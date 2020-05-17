package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Orientation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
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
	
		System.out.println("The initial Screen orientation is=>" + driver.getOrientation());
		
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		System.out.println("The oridentation of the screen after rotation=>"+driver.getOrientation());
		
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(2000);
		System.out.println("The oridentation of");
	
	
	}
}
