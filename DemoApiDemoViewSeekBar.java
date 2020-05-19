package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApiDemoViewSeekBar {
	@Test
	public void dmotc_1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","ApiDemos");
		//cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\pulkit\\Desktop\\Appium APK\\ApiDemos.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement viewsMenu = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		driver.tap(1, viewsMenu, 500);

		//driver.findElementByAccessibilityId("Views").click();
		//Thread.sleep(2000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollintoview(text(\"Seek Bar\"))");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))");
		
		
		Thread.sleep(2000);
		//WebElement seekBarmenu = driver.findElementByAndroidUIAutomator("AN(\"AV\")");
		WebElement seekBarmenu = driver.findElementByAndroidUIAutomator("text(\"Seek Bar\")");
           driver.tap(1, seekBarmenu,500);
          // Thread.sleep(2000);
           
           WebElement seekBar = driver.findElementById("io.appium.android.apis:id/seek");
         Point loc = seekBar.getLocation();
         int startx = loc.getX();
         int starty = loc.getY();
         
       int endx = (int)(seekBar.getSize().getWidth()*0.80);
       int endy = starty;
       
       driver.swipe(startx, starty, endx, endy,1000);
         
           
}
}