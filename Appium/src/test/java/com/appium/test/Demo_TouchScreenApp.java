package com.appium.test;

import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.MobileCapabilityType;


    public class Demo_TouchScreenApp {
   	 /**
   		 * 
   		 * @author jyotsana
   		 *
   		 */
   	 
   	 
		@Test
		public void tc_TouchscreenApp() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"jp.rallwell.siriuth.touchscreentest" );
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
			cap.setCapability("noReset", true);
			cap.setCapability("uiautomator2ServerInstallTimeOut",4000);
			AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			WebElement testpoint = driver.findElementById("jp.rallwell.siriuth.touchscreentest:id/surfaceView");
			driver.tap(1, testpoint, 500);
			//for vertical line
			Thread.sleep(3000);
			Dimension dim = driver.manage().window().getSize();
			int startx=(int)(dim.getWidth()*0.90);
			int endx=(int)(dim.getWidth()*0.10);
			int starty=(int) (dim.getHeight()*0.10);
			int endy=starty;
			driver.swipe(startx, starty, endx, endy, 1000);
			//for horizontal line
			int startx1=endx;
			int endx1=startx1;
			int starty1=(int) (dim.getHeight()*0.90);
			int endy1=starty;
			driver.swipe(startx1, starty1, endx1, endy1, 1000);
			//for vertical line
			int startx2=startx;
			int endx2=endx;
			int starty2=(int) (dim.getHeight()*0.90);
			int endy2=starty2;
			driver.swipe(startx2, starty2, endx2, endy2, 1000);
			//for horizontal line
			int startx3=startx;
			int endx3=startx;
			int starty3=(int) (dim.getHeight()*0.90);
			int endy3=(int) (dim.getHeight()*0.10);
			driver.swipe(startx3, starty3, endx3, endy3, 1000);
			
		
		}
	}


	
	
	
	
	
	
	
