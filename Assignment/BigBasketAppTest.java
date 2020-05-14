package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasketAppTest {
	@Test
	public void searchTest() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
		cap.setCapability("noReset", true);
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").sendKeys("mangos");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		String[] actualTxt = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText().split(" ");
		System.out.println(Integer.parseInt(actualTxt[0]));
		Assert.assertTrue(Integer.parseInt(actualTxt[0]) > 140);
	}
}