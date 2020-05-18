package demo;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreenTest {
	
//To Draw like below pattern
	/*
	 
	 *******
	 *     *
	 *     *
	 *     *
	 *******
	 
	 */
	@Test()
	public void touchScreenA() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one vision");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "andriod");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Dimension dim = driver.manage().window().getSize();
		int startX = (int) (dim.getWidth() * 0.10);
		int endX = (int) (dim.getWidth() * 0.90);
		int startY = (int) (dim.getHeight() * 0.90);
		int endY = startY;
		driver.swipe(startX, startY, endX, endY, 2000);

		int startX1 = (int) (dim.getWidth() * 0.90);
		int endX1 = (int) (dim.getWidth() * 0.10);
		int startY1 = (int) (dim.getHeight() * 0.10);
		int endY1 = startY1;
		driver.swipe(startX1, startY1, endX1, endY1, 2000);

		int startY2 = (int) (dim.getHeight() * 0.10);
		int endY2 = (int) (dim.getHeight() * 0.90);
		int startX2 = (int) (dim.getWidth() * 0.90);
		int endX2 = startX2;
		driver.swipe(startX2, startY2, endX2, endY2, 2000);

		int startY3 = (int) (dim.getHeight() * 0.90);
		int endY3 = (int) (dim.getHeight() * 0.10);
		int startX3 = (int) (dim.getWidth() * 0.10);
		int endX3 = startX3;
		driver.swipe(startX3, startY3, endX3, endY3, 2000);
	}
	
	//To Draw like below pattern
		/*
		 
		 *
		 *     
		 *     
		 *     
		 *******
		 
		 */
	@Test
	public void touchScreenB() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one vision");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "andriod");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Dimension dim = driver.manage().window().getSize();
		int startX = (int) (dim.getWidth() * 0.10);
		int endX = (int) (dim.getWidth() * 0.90);
		int startY = (int) (dim.getHeight() * 0.90);
		int endY = startY;
		driver.swipe(startX, startY, endX, endY, 2000);

		int startY3 = (int) (dim.getHeight() * 0.90);
		int endY3 = (int) (dim.getHeight() * 0.10);
		int startX3 = (int) (dim.getWidth() * 0.10);
		int endX3 = startX3;
		driver.swipe(startX3, startY3, endX3, endY3, 2000);
	}

	//To Draw like below pattern
			/*
			 
			 *       *
			 *     *
			 *  *   
			 **    
			 *******
			 
			 */
	@Test
	public void touchScreenC() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one vision");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "andriod");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Dimension dim = driver.manage().window().getSize();
		int startX = (int) (dim.getWidth() * 0.10);
		int endX = (int) (dim.getWidth() * 0.90);
		int startY = (int) (dim.getHeight() * 0.90);
		int endY = startY;
		driver.swipe(startX, startY, endX, endY, 2000);

		int startY3 = (int) (dim.getHeight() * 0.90);
		int endY3 = (int) (dim.getHeight() * 0.10);
		int startX3 = (int) (dim.getWidth() * 0.10);
		int endX3 = startX3;
		driver.swipe(startX3, startY3, endX3, endY3, 2000);

		int startY23 = (int) (dim.getHeight() * 0.90);
		int endY23 = (int) (dim.getHeight() * 0.10);
		int startX23 = (int) (dim.getWidth() * 0.10);
		int endX23 = (int) (dim.getWidth() * 0.90);
		driver.swipe(startX23, startY23, endX23, endY23, 2000);

	}

	@Test
	public void touchScreenD() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one vision");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "andriod");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		Dimension dim = driver.manage().window().getSize();

		int startY23 = (int) (dim.getHeight() * 0.90);
		int endY23 = (int) (dim.getHeight() * 0.10);
		int startX23 = (int) (dim.getWidth() * 0.10);
		int endX23 = (int) (dim.getWidth() * 0.90);
		driver.swipe(startX23, startY23, endX23, endY23, 2000);

		int startY = (int) (dim.getHeight() * 0.90);
		int endY = (int) (dim.getHeight() * 0.10);
		int startX = (int) (dim.getWidth() * 0.90);
		int endX = (int) (dim.getWidth() * 0.10);
		driver.swipe(startX, startY, endX, endY, 2000);

	}

}
