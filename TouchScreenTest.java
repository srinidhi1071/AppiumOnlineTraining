package com.tyss.Appium.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenTest {

	AndroidDriver driver;
	Dimension dim;


	@BeforeMethod
	public void configApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Honor 10 Lite");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("noReset", "true");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void swipeTest1() {
	    dim = driver.manage().window().getSize();
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.20), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.80), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.80), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
	}

	@Test
	public void swipeTest2() {
		dim = driver.manage().window().getSize();
		
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.80), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
	}

	@Test
	public void swipeTest3() {
		dim = driver.manage().window().getSize();
		
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.80), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.80), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);

	}

	@Test
	public void swipeTest4() {
		dim = driver.manage().window().getSize();
		driver.swipe((int) (dim.getWidth() * 0.80), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.20),
				(int) (dim.getHeight() * 0.80), 1000);
		driver.swipe((int) (dim.getWidth() * 0.20), (int) (dim.getHeight() * 0.20), (int) (dim.getWidth() * 0.80),
				(int) (dim.getHeight() * 0.80), 1000);

	}
}
