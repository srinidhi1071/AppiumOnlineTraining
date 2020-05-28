package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class PhoneCall  
{
/* As Phone is native application, I was not able to find the details of appPackage and appActivity, using ActivityLauncher
 *so I have tried to get the same via, command prompt,(IN ADMIN MODE)
 *to make sure that the device is connected i have used command
 *                   c:/>adb devices
 *which returns UDID of device connected
 * then type         c:/>adb sehll
 * then type         $dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp'
 * 
 *    To get output from this command close all opened apps. then open only the desired native app.
 *    The output of this command will be appActivity and appPackage of desired native application.
 *    
 *    
 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "com.samsung.android.contacts");
		cap.setCapability("appActivity","com.android.dialer.DialtactsActivity");
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.tap(1,595,1393,500);
		
		driver.findElementById("com.samsung.android.contacts:id/two").click();
		driver.findElementById("com.samsung.android.contacts:id/one").click();
		driver.findElementById("com.samsung.android.contacts:id/two").click();
		
		Thread.sleep(10);

        WebElement ele = driver.findElementByAccessibilityId("SIM card 2 call");//.click();
		driver.tap(1,ele,500);
	}

}
