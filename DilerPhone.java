package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DilerPhone {
	@Test
	public void tc_demo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");		
		cap.setCapability("appPackage","com.android.dialer");
		cap.setCapability("appActivity","BBKTwelveKeyDialer");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.android.dialer:id/five").click();
		driver.findElementById("com.android.dialer:id/four").click();
		driver.findElementById("com.android.dialer:id/seven").click();
		driver.findElementById("com.android.dialer:id/dialButtonSim1").click();
		driver.findElementById("com.android.incallui:id/end_button").click();
	}
}
