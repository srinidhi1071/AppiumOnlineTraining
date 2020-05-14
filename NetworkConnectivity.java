package com.REALME;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class NetworkConnectivity {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "sabha");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("automationName", "appium");
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.flipkart.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");
		//cap.setCapability("app", "‪D:\\DragAndDrop.apk");
		cap.setCapability("UDID", "86589dab");
		cap.setCapability("noReset", true);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(url,cap);
		 driver.openNotifications();
		System.out.println(driver.getConnection());
        Thread.sleep(3000);
         driver.setConnection(Connection.WIFI);
         System.out.println(driver.getConnection());
       //  driver.setConnection(Connection.AIRPLANE); why bcoz airplane mode disconnect the usb connection because of this test ll failed
	}
}


