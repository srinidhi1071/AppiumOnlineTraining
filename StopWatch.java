package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class StopWatch
{
	@Test
	public void tc_Tap() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.google.android.deskclock");
		cap.setCapability("appActivity", "com.android.deskclock.DeskClock");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement stopWatch = driver.findElementByXPath("//android.widget.TextView[@text='Stopwatch']");
		driver.tap(1, stopWatch, 500);
		Thread.sleep(2000);
		WebElement val = driver.findElementByXPath("//android.widget.TextView[@resource-id='com.google.android.deskclock:id/stopwatch_time_text']");
		String sec = val.getText();
		WebElement text = driver.findElementById("com.google.android.deskclock:id/stopwatch_hundredths_text");
		String msec = text.getText();
		System.out.println(sec+":"+msec);
		driver.tap(1, 540, 1640, 500);
		Thread.sleep(2000);
		driver.runAppInBackground(10);
		Thread.sleep(12000);
		driver.tap(1, 540, 1640, 500);
		WebElement val1 = driver.findElementByXPath("//android.widget.TextView[@resource-id='com.google.android.deskclock:id/stopwatch_time_text']");
		String sec1 = val.getText();
		WebElement text1 = driver.findElementById("com.google.android.deskclock:id/stopwatch_hundredths_text");
		String msec1 = text.getText();
		System.out.println(sec1+":"+msec1);
		WebElement reset = driver.findElementByAndroidUIAutomator("text(\"Reset\")");
		driver.tap(1, reset,500);
		
		
	}
}
