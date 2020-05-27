package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MultiTiouch {
	@Test
	public void tc_demo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("appPackage","com.the511plus.MultiTouchTester");
		cap.setCapability("appActivity","MultiTouchTester");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TouchAction ta1 = new TouchAction(driver);
		TouchAction swipe1 = ta1.press(235, 436).waitAction(4000).moveTo(532,1514).release();

		TouchAction ta2 = new TouchAction(driver);
		TouchAction swipe2 = ta1.press(555, 416).waitAction(4000).moveTo(562,1554).release();

		MultiTouchAction mt = new MultiTouchAction(driver);
		mt.add(swipe1).add(swipe2).perform();
	}
}
