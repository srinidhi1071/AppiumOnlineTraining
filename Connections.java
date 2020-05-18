package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Connections {
	@Test
	public void appium_Bigbasket() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		// To set the Device name
		cap.setCapability("deviceName", "motorola one vision");
		// To set the platformName
		cap.setCapability("platformName", "andriod");
		// To set the platform version number
		cap.setCapability("platforVersion", "10");
		// To set the automation name
		cap.setCapability("automationName", "appium");
		// To continue with last settings of the Application
		cap.setCapability("noReset", true);
		// To set the appPackage
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		// To set the appActivity
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.openNotifications();
		Thread.sleep(3000);
		System.out.println("Connection--"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.AIRPLANE);
		Thread.sleep(3000);
		System.out.println("connection--"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		System.out.println("Connection---"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.NONE);
		
	}
}
