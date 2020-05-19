package com.tyss.appium;

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

public class DemoCam {
	
	@Test(enabled=false)
	public void tc1_camera() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RedmiNote4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Camera");
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementById("com.android.camera:id/v9_shutter_button_internal").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(3000);
		WebElement switchbtn = driver.findElementById("com.android.camera:id/v9_camera_picker");		
		driver.tap(1, switchbtn, 500);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	
	}
	
	
	@Test(enabled=false)
	public void tc2_video() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RedmiNote4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Camera");
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Video\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	
	}
	
	@Test(enabled=false)
	public void tc3_Flashon() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RedmiNote4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Camera");
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.camera:id/top_config_00").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"On\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	

	}
	
	
	@Test
	public void tc_Timeron() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RedmiNote4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);;
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "Camera");
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.camera:id/top_config_06").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	

	}
}
