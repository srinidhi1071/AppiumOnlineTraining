package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RedmiCamera_2 {
	
	@Test
	public void changeAspectRatio() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Camera");
		cap.setCapability("noReset", true);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement optionsBtn = driver.findElementById("com.android.camera:id/mode_button");
		driver.tap(1, optionsBtn, 500);
		WebElement settingsBtn = driver.findElementById("com.android.camera:id/setting_button");
		driver.tap(1, settingsBtn, 500);
		WebElement cameraFrameOption = driver.findElementByXPath("//android.widget.TextView[@text='Camera frame']");
		driver.tap(1, cameraFrameOption, 500);
		WebElement fullScreen = driver.findElementByAndroidUIAutomator("text(\"Full screen 16:9\")");
		driver.tap(1, fullScreen, 500);
		WebElement backwardBtn = driver.findElementById("miui:id/up");
		driver.tap(1, backwardBtn, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
	}

}
