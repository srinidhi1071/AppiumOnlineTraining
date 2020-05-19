package com.tyss.appiumproject.test;

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

public class Camera_Access {
	@Test
	public void tc1_Camera() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenovo.scg");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "camera.Camera");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(2000);
		WebElement switchcam = driver.findElementById("com.lenovo.scg:id/cameraswitchtofront");
		driver.tap(1, switchcam, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);	
	}
	@Test
	public void tc2_Camera() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenovo.scg");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "camera.Camera");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		WebElement vbtn = driver.findElementById("com.lenovo.scg:id/shutter_button_video");
		driver.tap(1, vbtn, 500);
		WebElement rbtn = driver.findElementById("com.lenovo.scg:id/shutter_button_video");
		driver.tap(1, rbtn, 500);
		Thread.sleep(6000);
		driver.findElementById("com.lenovo.scg:id/shutter_button_video_pause").click();
		
	}
}
