package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Camera_Access2 {
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
		driver.findElementById("com.lenovo.scg:id/camera_back_setting_button_id").click();
		
		 //WebElement aspectbtn = driver.findElementByAndroidUIAutomator("class(\"android.widget.RelativeLayout\")");
		//driver.tap(1, aspectbtn, 500);
		driver.findElementById("com.lenovo.scg:id/TextView01").click();
		 Thread.sleep(6000);
		 driver.findElementById("com.lenovo.scg:id/radio").click();
		//driver.findElementById("com.lenovo.scg:id/TextView01").click();
		Point loc = driver.findElementById("com.lenovo.scg:id/camera_back_setting_button_id").getLocation();
		driver.tap(1,(WebElement) loc, 500);
		
	}
}


