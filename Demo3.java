package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo3 {

	
	
		@Test
		public void dmotc_1() throws MalformedURLException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
			cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\pulkit\\Desktop\\Appium APK\\ApiDemos.apk");
			AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.findElementByAccessibilityId("Views").click();
			driver.findElementByAccessibilityId("Controls").click();
			driver.findElementByAccessibilityId("3. Holo Light Theme").click();
			driver.findElementById("io.appium.android.apis:id/edit").sendKeys("testdemo");
			driver.findElementById("io.appium.android.apis:id/button").click();
	
			

	}
	}

	
	

