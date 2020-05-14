package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class NotificationAppTest {
	@Test
	public void searchTest() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainDrawerActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("Testcsc");
		driver.tap(1, driver.findElementById("com.bhanu.notificationreminders:id/btnNotify"), 500);
		driver.openNotifications();
		driver.tap(1, driver.findElementById("android:id/big_text"), 500);
		driver.tap(1, driver.findElementById("com.bhanu.notificationreminders:id/invite_friends_close"), 500);

	}
}
