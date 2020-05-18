package com.tyss.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class touchScreen {
	@Test(enabled=false)
	public void tc1_square() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.swipe(134, 1094, 134, 180, 500);
		driver.swipe(134, 180, 592, 180, 500);
		driver.swipe(592, 180, 592, 1098, 500);
		driver.swipe(592, 1098, 134, 1098, 500);*/
	
		Dimension dim = driver.manage().window().getSize();
		int startx = (int)(dim.getWidth()*0.2);
		int starty = (int)(dim.getHeight()*0.8);
		int endx = startx;
		int endy=(int)(dim.getHeight()*0.2);
		driver.swipe(startx, starty, endx, endy, 1000);
		
		int startx1 = (int)(dim.getWidth()*0.2);
		int starty1 = (int)(dim.getHeight()*0.2);
		int endx1 = (int)(dim.getWidth()*0.8);
		int endy1=starty1;
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		int startx2 = (int)(dim.getWidth()*0.8);
		int starty2 = (int)(dim.getHeight()*0.2);
		int endx2 = startx2;
		int endy2=(int)(dim.getHeight()*0.8);
	
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		
		int startx3 = (int)(dim.getWidth()*0.8);
		int starty3 = (int)(dim.getHeight()*0.8);
		int endx3 = (int)(dim.getWidth()*0.2);
		int endy3=starty3;
		driver.swipe(startx3, starty3, endx3, endy3, 1000);
			
}
	
	
	@Test(enabled=false)
	public void tc2_Lshape() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
		int startx = (int)(dim.getWidth()*0.2);
		int starty = (int)(dim.getHeight()*0.2);
		int endx = startx;
		int endy=(int)(dim.getHeight()*0.8);
		driver.swipe(startx, starty, endx, endy, 1000);
		
		int startx1 = (int)(dim.getWidth()*0.2);
		int starty1 = (int)(dim.getHeight()*0.8);
		int endx1 = (int)(dim.getWidth()*0.8);
		int endy1=starty1;
		driver.swipe(startx1, starty1, endx1, endy1, 1000);		
}
	
	@Test(enabled=false)
	public void tc3_Ldiagonal() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
		int startx = (int)(dim.getWidth()*0.2);
		int starty = (int)(dim.getHeight()*0.2);
		int endx = startx;
		int endy=(int)(dim.getHeight()*0.8);
		driver.swipe(startx, starty, endx, endy, 1000);
		
		int startx1 = (int)(dim.getWidth()*0.2);
		int starty1 = (int)(dim.getHeight()*0.8);
		int endx1 = (int)(dim.getWidth()*0.8);
		int endy1=starty1;
		driver.swipe(startx1, starty1, endx1, endy1, 1000);		
		
		int startx2 = (int)(dim.getWidth()*0.2);
		int starty2 = (int)(dim.getHeight()*0.8);
		int endx2 = (int)(dim.getWidth()*0.8);
		int endy2=(int)(dim.getHeight()*0.2);
	
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
}
	
	@Test
	public void tc4_xshape() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "RedmiNote4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7");
		cap.setCapability("automationName", "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		cap.setCapability("noReset", "true");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
		int startx = (int)(dim.getWidth()*0.2);
		int starty = (int)(dim.getHeight()*0.2);
		int endx = (int)(dim.getWidth()*0.8);
		int endy=(int)(dim.getHeight()*0.8);
		driver.swipe(startx, starty, endx, endy, 1000);
		
		int startx1 = (int)(dim.getWidth()*0.8);
		int starty1 = (int)(dim.getHeight()*0.2);
		int endx1 = (int)(dim.getWidth()*0.2);
		int endy1=(int)(dim.getHeight()*0.8);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);		
		
	
}
}
