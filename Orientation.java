package demo;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class Orientation {
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
		String actual_product_count = "156 Items";
		String expected_product_count = driver.findElement(By.id("com.bigbasket.mobileapp:id/txtProductCount"))
				.getText();
		// System.out.println(product_count);
		// TO
		Assert.assertEquals(actual_product_count, expected_product_count);
		
		System.out.println("Initial orientation of the screen---"+driver.getOrientation());
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		System.out.println("Orientation of the screen after rotation----"+driver.getOrientation());
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		System.out.println("Orientation of the screen after rotation----"+driver.getOrientation());
		
	}

}
