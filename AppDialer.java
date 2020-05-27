package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppDialer 
{
	@Test
	public void tc_DialNumber() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "DialtactsActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dialPad = driver.findElementByXPath("//android.widget.ImageButton[@content-desc='dial pad']");
		driver.tap(1, dialPad, 500);
		WebElement one = driver.findElementById("com.android.dialer:id/one");
		driver.tap(1, one, 100);
		WebElement nine = driver.findElementById("com.android.dialer:id/nine");
		driver.tap(1, nine, 100);
		WebElement eight = driver.findElementById("com.android.dialer:id/eight");
		driver.tap(1, eight, 100);
		WebElement dial = driver.findElementById("com.android.dialer:id/dialpad_floating_action_button");
		driver.tap(1, dial, 500);
	}
	
	
}
