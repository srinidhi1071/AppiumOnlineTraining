package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoOpenApp {
	
@Test(enabled=false)
	public void openApp() throws MalformedURLException {
	
	DesiredCapabilities cap=new DesiredCapabilities();		
	cap.setCapability("deviceName", "Redmi");
	cap.setCapability("platformName", "android");
	cap.setCapability("platformVersion", 6);
	cap.setCapability("automationName", "appium");
	cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
	cap.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
	AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	
	
	
	
}
@Test
public void openApp2() throws MalformedURLException, InterruptedException {

DesiredCapabilities cap=new DesiredCapabilities();		
cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
cap.setCapability("noReset", true);
cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.mShop.android.home.HomeActivity");
AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("mobiles");
Thread.sleep(2000);
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
Thread.sleep(3000);


}
	

}
