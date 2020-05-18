package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class DemoAPI {
	@Test(enabled = false)
	public void appium_demo() throws Exception {
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
		// To install the Application on the device for the testing
		cap.setCapability("app", "C:\\Users\\Kiran\\Desktop\\New folder\\ApiDemos.apk");
		// To communicate with the server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		// To click on the View button the Homepage
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		// To click on the control button
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		// To click on the Holo light theme
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Holo Light Theme\"]")).click();
		// To enter the name in the given editor space
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Kiran");
		// To click on the checkbox 1
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	}

	@Test(enabled = false)
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
		// To install the Application on the device for the testing
		cap.setCapability("app", "C:\\Users\\Kiran\\Desktop\\New folder\\ApiDemos.apk");
		// To communicate with the server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		// To click on the View button the Homepage
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		// To click on the control button
		driver.findElementByAccessibilityId("Views").click();
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElementByAccessibilityId("Controls").click();
		// To click on the Holo light theme
		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3.
		// Holo Light Theme\"]")).click();
		driver.findElementByAccessibilityId("3. Holo Light Theme").click();
		// To enter the name in the given editor space
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Kiran");
		// To click on the checkbox 1
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	}

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
		// To wait implicityly for the element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// TO clcik on the search bar
		driver.findElement(By.id("com.bigbasket.mobileapp:id/homePageSearchBox")).click();
		// To enter the text mango in the serach bar
		driver.findElement(By.id("com.bigbasket.mobileapp:id/searchView")).sendKeys("Mango");
		// To press enter Key in the mobile
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		String actual_product_count = "195 Items";
		String expected_product_count = driver.findElement(By.id("com.bigbasket.mobileapp:id/txtProductCount"))
				.getText();
		// System.out.println(product_count);
		// TO
		Assert.assertEquals(actual_product_count, expected_product_count);
	}

}
