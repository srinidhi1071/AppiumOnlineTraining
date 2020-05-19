package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DemoNotification {
	@Test
	public void tc_CheckNotification() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Vivo v5");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 6);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.bhanu.notificationreminders");
		cap.setCapability("appActivity", "com.bhanu.notificationreminders.MainDrawerActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement title = driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle");
		title.sendKeys("Notify");
		WebElement content = driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText");
		content.sendKeys("Active Now");
		WebElement clkNotify = driver.findElementById("com.bhanu.notificationreminders:id/btnNotify");
		//clkNotify.click();
		driver.tap(1, clkNotify, 500);
		Thread.sleep(3000);
		driver.openNotifications();
		Thread.sleep(3000);	
		driver.findElementByAccessibilityId("Read").click();
	}


}
