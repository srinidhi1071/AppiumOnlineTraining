package com.Appium.ProgramsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RateingStar {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity","ApiDemos");
		cap.setCapability("uiautomator2ServerInstallTimeout", 50000);
		cap.setCapability("UDID", "32004e3dbcad554b");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		views.click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		  
		WebElement ratingelement = driver.findElement(By.id("io.appium.android.apis:id/ratingbar2"));
		 
		
		Point loc = ratingelement.getLocation();
		
		int startx=loc.getX();
		int starty=loc.getY();
		int endx=(int)(ratingelement.getSize().getWidth()*0.7);
		int endy=starty;
		driver.tap(1, endx, endy, 1000);
		Thread.sleep(3000);
		String ratingmsg = driver.findElement(By.id("io.appium.android.apis:id/rating")).getText();
		
		System.out.println("rating message = "+ratingmsg);
		Assert.assertEquals(ratingmsg, "Rating: 3.5/5");
		
		
		
	}

}
