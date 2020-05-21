package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Camara1 
{
	@Test
	public void camarafun1() throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "com.sec.android.app.camera");
    	cap.setCapability("appActivity", ".Camera");
    	cap.setCapability("noReset", true);// if application asks for validation that will be 
    									   // disabled at the time of execution of code
    	cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");// UDID is the unique no. given to the device connected
		URL url=new URL("http://localhost:4723/wd/hub"); //tell that the application to be executed on localhost
		AndroidDriver driver=new AndroidDriver(url,cap); 
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
	}
}
