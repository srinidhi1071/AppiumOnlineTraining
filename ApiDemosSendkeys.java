package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosSendkeys {
	@Test(enabled=false)
	public void enterData() throws MalformedURLException, InterruptedException {

	DesiredCapabilities cap=new DesiredCapabilities();		
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
	AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Holo Light Theme\"]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText\r\n" + 
			"")).sendKeys("xyz");
	
	Thread.sleep(3000);
	

}
	@Test
	public void enterData2() throws MalformedURLException, InterruptedException {

	DesiredCapabilities cap=new DesiredCapabilities();		
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
	AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElementByAccessibilityId("Views").click();
	driver.findElementByAccessibilityId("Controls").click();
	driver.findElementByAccessibilityId("3. Holo Light Theme").click();
	driver.findElementById("io.appium.android.apis:id/edit").sendKeys("XYZ");
	Thread.sleep(3000);
	

}
}	
