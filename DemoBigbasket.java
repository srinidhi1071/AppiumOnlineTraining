package Com.tyss.project.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoBigbasket {
	@Test
	public void tc_demo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("appPackage","com.bigbasket.mobileapp");
		cap.setCapability("appActivity","activity.SplashActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		Thread.sleep(2000);
	    WebElement adb = driver.findElementById("com.bigbasket.mobileapp:id/searchView");
	    adb.sendKeys("mangos");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		String[] itemlist = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText().split(" ",2);
		System.out.println(itemlist[0]);
		int count=Integer.parseInt(itemlist[0]);
		if(count>=140)
		{
		Assert.assertTrue(true);
	}
		else {
			Assert.fail();
		}

}
}
