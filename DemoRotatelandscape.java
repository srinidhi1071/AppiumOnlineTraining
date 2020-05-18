package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoRotatelandscape {
	@Test
	public void demo_orientataion() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","ApiDemos");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("The Intaial orientatation is--> "+driver.getOrientation());
		Thread.sleep(1000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println(""+driver.getOrientation());
		Thread.sleep(1000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(1000);
		System.out.println(""+driver.getOrientation());
		
	}

}
