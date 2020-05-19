package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoNetwork {
	@Test
	public void demo_network() throws MalformedURLException, InterruptedException {
		
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
		System.out.println("Intial condition--->"+driver.getConnection());
		Thread.sleep(1000);
		driver.setConnection(Connection.WIFI);
		System.out.println("connection after change-->"+driver.getConnection());
		driver.setConnection(Connection.NONE);
		Thread.sleep(1000);
		System.out.println("connection after change-->"+driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);
		
		
	}

}
