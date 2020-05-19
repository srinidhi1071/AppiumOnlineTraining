package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoCamera {
	@Test
	public void dmotc_1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		cap.setCapability("appPackage","com.android.camera");
		cap.setCapability("appActivity","Camera");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		WebElement switchBtn = driver.findElementById("com.android.camera:id/camera_toggle_button");
		driver.tap(1, switchBtn, 500);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		

}
}
