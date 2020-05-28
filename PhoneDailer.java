package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class PhoneDailer {
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
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.dialer");
		// To set the appActivity
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.dialer.main.impl.MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To find kep pad button
		WebElement keyPad = driver.findElementByAccessibilityId("key pad");
		// To tap on keypad
		driver.tap(1, keyPad, 500);
		// To find button 9 in the key pad
		WebElement pressNine = driver.findElementByXPath("//android.widget.TextView[@text='9']");
		// To find button 0 in the key pad
		WebElement pressZero = driver.findElementByXPath("//android.widget.TextView[@text='0']");
		// To find button 3 in the key pad
		WebElement pressThree = driver.findElementByXPath("//android.widget.TextView[@text='3']");
		// To find button 5 in the key pad
		WebElement pressFive = driver.findElementByXPath("//android.widget.TextView[@text='5']");
		// To find button 2 in the key pad
		WebElement pressTwo = driver.findElementByXPath("//android.widget.TextView[@text='2']");
		// To find button 7 in the key pad
		WebElement pressSeven = driver.findElementByXPath("//android.widget.TextView[@text='7']");
		// To tap on key 9
		driver.tap(1, pressNine, 10);
		// To tap on key 0
		pressZero.click();
//		driver.tap(1, pressZero, 10);
		// To tap on key 3
		driver.tap(1, pressThree, 10);
		// To tap on key 5
		driver.tap(1, pressFive, 10);
		// To tap on key 2
		driver.tap(1, pressTwo, 10);
		// To tap on key 2
		driver.tap(1, pressTwo, 10);
		// To tap on key 0
		pressZero.click();
//		driver.tap(1, pressZero, 10);
		// To tap on key 0
		pressZero.click();
//		driver.tap(1, pressZero, 10);
		// To tap on key 3
		driver.tap(1, pressThree, 10);
		// To tap on key 7
		driver.tap(1, pressSeven, 10);
		// To find the dialer key
		WebElement dailer = driver.findElementByAccessibilityId("dial");
		// To tap on the dialer key
		driver.tap(1, dailer, 500);
		// To find the call end key
		WebElement callEnd = driver.findElementByAccessibilityId("End call");
		// To tap on call end key
		driver.tap(1, callEnd, 500);
	}
}
