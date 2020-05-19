package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RatingBar {
	@Test
	public void appium_demo7() throws Exception {
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
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		// cap.setCapability(capabilityName, value);
		// To install the Application on the device for the testing
		cap.setCapability("app", "C:\\Users\\Kiran\\Desktop\\New folder\\ApiDemos.apk");
		// To communicate with the server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To find the View button the Homepage using AndroidUIAutomator locator
		WebElement viewMenu = driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
		// To click on the ViewMenu
		driver.tap(1, viewMenu, 500);
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		WebElement rating = driver.findElement(By.id("io.appium.android.apis:id/ratingbar2"));
		Point loc = rating.getLocation();
		int startX = loc.getX();
		int startY = loc.getY();
		int endX = (int) (rating.getSize().getWidth() * 0.65);
		int endY = startY;
		driver.swipe(startX, startY, endX, endY, 1000);

		WebElement rating_text = driver.findElement(By.id("io.appium.android.apis:id/rating"));
		System.out.println(rating_text.getText());
	}

}
