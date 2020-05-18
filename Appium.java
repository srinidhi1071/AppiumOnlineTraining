package demo;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {

	 @Test
	 public void appium_demo() throws Exception {
		 DesiredCapabilities cap = new DesiredCapabilities();
		 //To set the Device name 
		 cap.setCapability("deviceName", "motorola one vision");
		 //To set the platformName
		 cap.setCapability("platformName", "andriod");
		 //To set the platform version number 
		 cap.setCapability("platforVersion", "10");
		 //To set the automation name
		 cap.setCapability("automationName","appium");
		 //To set the appPacage of the testing application
		 cap.setCapability("appPackage", "com.google.android.calculator");
		 //To set the appActivity of the testing application
		 cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		 //To communicate with the server 
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 Thread.sleep(2000);
		 //To click on the digit 8 in the calculator
		 driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		 //To click on the + button in the calculator
		 driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		 //To click on the digit 9 in the calculator
		 driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		 //To click on the button = in the calculator
		 driver.findElement(By.id("resource-id	com.google.android.calculator:id/eq")).click();
	 }
	 @Test(enabled=false)
	 public void appiumCalculator() throws Exception {
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one vision");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "andriod");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		 cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
		 cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		 driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		 driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		 driver.findElement(By.id("resource-id	com.google.android.calculator:id/eq")).click();
	 }
}
