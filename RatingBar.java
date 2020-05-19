package com.tyss.Appium.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RatingBar {
	@Test
	public void ratingTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Honor 10 Lite");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
		cap.setCapability("noReset", "true");

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement viewmenu = driver.findElementByAccessibilityId("Views");
		driver.tap(1, viewmenu, 500);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		WebElement ratingbar = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		Point loc = ratingbar.getLocation();
		int x=(int) (ratingbar.getSize().getWidth()*0.70);
		int y=loc.getY();

		driver.tap(1, x, y,1000);
		String rating = driver.findElementById("io.appium.android.apis:id/rating").getText();
		System.out.println("Rating is : " + rating);
		Assert.assertEquals(rating, "Rating: 3.5/5");

	}
}
