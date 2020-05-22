package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LockedAction 
{
	@Test
	public void tc_LongPress() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G4");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", 7);
		cap.setCapability("automationName", "appium");
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		if(driver.isLocked())
		{
			System.out.println("Device is LOCK??---->"+driver.isLocked());
			driver.unlockDevice();
		}
		else
		{
			System.out.println("Device is lock???--->"+driver.isLocked());
			System.out.println("Lock the Phone");
			driver.lockDevice();
			System.out.println("Device has LOCKED???--->"+driver.isLocked());
			driver.unlockDevice();
		}
	}
}
