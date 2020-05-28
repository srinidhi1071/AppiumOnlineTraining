package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridApplication {
	@Test
    public void openHybridApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.snc.test.webview2");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.snc.test.webview.activity.SplashActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("com.snc.test.webview2:id/action_go_website").click();
		WebElement inputElement = driver.findElementById("com.snc.test.webview2:id/input_url");
		inputElement.clear();
		inputElement.sendKeys("m.facebook.com");
		driver.findElementById("android:id/button1").click();
		System.out.println("The present context is = "+driver.getContext());
		Set contextSet = driver.getContextHandles();
		System.out.println("Number of contexts present in the application = "+contextSet);
		ArrayList<String> al=new ArrayList<String>(contextSet);
		driver.context(al.get(1));
		System.out.println("The context after switching is = "+driver.getContext());
		driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("sss@gmail.com");
			
	}		

}
