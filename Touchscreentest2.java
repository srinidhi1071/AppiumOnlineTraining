package com.tyss.appiumproject.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Touchscreentest2 {
	@Test
	public void tc2_Touchscreentest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mycompany.anton_mokshyn.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement starttest = driver.findElementById("com.mycompany.anton_mokshyn.touchscreentest:id/start_button");
		driver.tap(1, starttest, 500);
		Thread.sleep(3000);
		Dimension dim = driver.manage().window().getSize();
		
		int startx1=(int)(dim.getWidth()*0.10);
		int endx1=startx1;
		int starty1=(int) (dim.getHeight()*0.90);
		int endy1=(int) (dim.getHeight()*0.10);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		int startx2=(int)(dim.getWidth()*0.90);
		int endx2=startx1;
		int starty2=(int) (dim.getHeight()*0.90);
		int endy2=starty2;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		
		driver.closeApp();
	}
}

