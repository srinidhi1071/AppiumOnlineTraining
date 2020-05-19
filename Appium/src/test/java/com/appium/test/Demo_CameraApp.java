package com.appium.test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Demo_CameraApp {
	
	
	/**
	 * 
	 * @author jyotsana
	 *
	 */
	
	@Test
	public void tc_cameraApp() throws MalformedURLException, InterruptedException
	
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 9);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.android.camera");
		cap.setCapability("appActivity", "Camera");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeOut",4000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//switching camera to secondory camera settings
		WebElement switchfront=driver.findElementById("com.android.camera:id/v9_camera_picker");
		driver.tap(1, switchfront, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		//short video capturing
		WebElement switchfrontt=driver.findElementById("com.android.camera:id/v9_camera_picker");
		driver.tap(1, switchfrontt, 500);
		Thread.sleep(5000);
		WebElement Shortvideo=driver.findElementById("com.android.camera:id/text_item_title");
		driver.tap(1, Shortvideo, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		//flash light 
		WebElement flashlight=driver.findElementById("com.android.camera:id/top_alert_container");
		driver.tap(1, flashlight, 500);
		WebElement switchfront1=driver.findElementById("com.android.camera:id/v9_camera_picker");
		driver.tap(1, switchfront1, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		//portrait  mode
		WebElement portraitmode=driver.findElementById("com.android.camera:id/mode_select");
		driver.tap(1, portraitmode, 500);
		Thread.sleep(5000);
		WebElement switchfront3=driver.findElementById("com.android.camera:id/v9_camera_picker");
		driver.tap(1, switchfront3, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		//beautycam settings
		WebElement settingsbtn=driver.findElementById("com.android.camera:id/top_alert_container[@index='2']");
		driver.tap(1, settingsbtn, 500);
		Thread.sleep(5000);
		WebElement beautyfycam=driver.findElementById("android.widget.LinearLayout");
        driver.tap(1, beautyfycam, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		// for Video capturing
		driver.findElementByXPath("//	android.widget.TextView[@text='Video']").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(5000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
				
		
		
		
		
		
	}
	
	
	
	
	
	

}
