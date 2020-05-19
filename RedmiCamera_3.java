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

public class RedmiCamera_3 {
	
	@Test
	public void changeVividMode() throws MalformedURLException {
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
		WebElement changeEffectBtn = driver.findElementById("com.android.camera:id/effect_mode_button");
		driver.tap(1, changeEffectBtn, 500);
		WebElement vividOption = driver.findElementByAndroidUIAutomator("text(\"Vivid\")");
		driver.tap(1, vividOption, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
	}

}
