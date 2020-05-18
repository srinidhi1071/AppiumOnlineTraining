package org.appium.basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreen_01 {

	AndroidDriver driver;
	Dimension dim;

	@BeforeMethod
	public void tc_openApp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("automationName", "appium");
		cap.setCapability("platformName", "andriod");
		cap.setCapability("platformVersion", "9");
		// cap.setCapability("fullReset", true);
		cap.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\DARSHAN\\Desktop\\appium batch\\jp.rallwell.siriuth.touchscreentest_2019-06-04.apk");

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void tc_screenTest01() {
		dim = driver.manage().window().getSize();
		int startx = (int) (dim.getWidth() * 0.20);
		int starty = (int) (dim.getHeight() * 0.20);
		int endx = (int) (dim.getWidth() * 0.80);
		int endy = (int) (dim.getHeight() * 0.20);
		
		int endx1 = (int) (dim.getHeight() * 0.80);

		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, startx, endx1, 1000);
		driver.swipe(endx, endy, endx, endx1, 1000);
		driver.swipe(startx, endx1, endx, endx1, 1000);
	}

	@Test
	public void tc_screenTest02() {
		dim = driver.manage().window().getSize();

		int startx = (int) (dim.getWidth() * 0.20);
		int starty = (int) (dim.getHeight() * 0.20);
		int endx = (int) (dim.getWidth() * 0.80);
		int endy = (int) (dim.getHeight() * 0.20);
	
		int endy1 = (int) (dim.getHeight() * 0.80);

		driver.swipe(startx, starty, startx, endy1, 1000);
		driver.swipe(startx, endy1, endx, endy1, 1000);
	}

	@Test
	public void tc_screenTest03() {
		dim = driver.manage().window().getSize();
		int startx = (int) (dim.getWidth() * 0.20);
		int starty = (int) (dim.getHeight() * 0.20);
		int endx = (int) (dim.getWidth() * 0.80);
		int endy = (int) (dim.getHeight() * 0.20);
		int endx1 = (int) (dim.getWidth() * 0.20);
		int endy1 = (int) (dim.getHeight() * 0.80);

		driver.swipe(startx, starty, startx, endy1, 1000);
		driver.swipe(startx, endy1, endx, endy1, 1000);
		driver.swipe(endx, starty, startx,endy1, 1000);

	}

	@Test
	public void tc_screenTest04() {
		dim = driver.manage().window().getSize();
		
		int startx = (int) (dim.getWidth() * 0.20);
		int starty = (int) (dim.getHeight() * 0.20);
		int endx = (int) (dim.getWidth() * 0.80);
		int endy = (int) (dim.getHeight() * 0.20);
	
		int endy1 = (int) (dim.getHeight() * 0.80);
		
		driver.swipe(endx, starty,startx, endy1, 1000);
		driver.swipe(startx,starty, endx,
				endy1, 1000);

	}
}
