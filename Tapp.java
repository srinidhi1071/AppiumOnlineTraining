package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Tapp {
	@Test
	public void appium_demo1() throws Exception {
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
//		cap.setCapability(capabilityName, value);
		// To install the Application on the device for the testing
		cap.setCapability("app", "C:\\Users\\Kiran\\Desktop\\New folder\\ApiDemos.apk");
		// To communicate with the server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To click on the View button the Homepage
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		// To click on the control button
		WebElement views = driver.findElementByAccessibilityId("Views");
		Thread.sleep(2000);
		driver.tap(1, 144, 1889, 500);
		
		
		
	}

}
