package demo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Notification {
	
	@Test
	public void appium_Bigbasket() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		// To set the Device name
		cap.setCapability("deviceName", "motorola one vision");
		// To set the platformName
		cap.setCapability("platformName", "andriod");
		// To set the platform version number
		cap.setCapability("platforVersion", "10");
		// To set the automation name
		cap.setCapability("automationName", "appium");
		// To continue with last settings of the Application
		cap.setCapability("noReset", true);
		// To set the appPackage
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
		// To set the appActivity
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainDrawerActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//To enter the text in the Note title text box
		driver.findElement(By.id("com.bhanu.notificationreminders:id/txtNewNoteTitle")).sendKeys("Kiran");
		//To enter the text into Note content text box
		driver.findElement(By.id("com.bhanu.notificationreminders:id/txtNewNoteText")).sendKeys("Testdata");
		//To find the Notify button
		WebElement Notify_button = driver.findElement(By.id("com.bhanu.notificationreminders:id/btnNotify"));
		//To tap on the Notify button
		driver.tap(1,Notify_button, 500);
		//To open the Notification
		driver.openNotifications();
		//To click on the read button in the notification
		driver.findElementByAccessibilityId("Read").click();
		
		
		
	}

}
