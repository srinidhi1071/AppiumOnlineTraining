package com.tyss.Appium.tests;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calculator_moto 
{
	@Test
	public void runCalculator1() throws MalformedURLException {
	DesiredCapabilities	cap	= new DesiredCapabilities();
	cap.setCapability("deviceName","Moto E3 POWER");
	cap.setCapability("automationName","Appium");
	cap.setCapability("platformName","android");	
	cap.setCapability("platformVersion","6.0");	
	cap.setCapability("appPackage","com.google.android.calculator");
	cap.setCapability("appActivity","com.android.calculator2.Calculator");
	//cap.setCapability("UDID","VQG3Y19119002512");	
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
   }
}
