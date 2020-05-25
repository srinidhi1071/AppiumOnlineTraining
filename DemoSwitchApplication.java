package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoSwitchApplication {
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
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		if(driver.isAppInstalled("io.appium.android.apis")){
			System.out.println("is the app installed???--->"+driver.isAppInstalled("io.appium.android.apis"));
			driver.startActivity("io.appium.android.apis","ApiDemos");
		}
		else{
			System.out.println("In else block...Is the App installed???--->"+driver.isAppInstalled("io.appium.android.apis"));
			driver.installApp("C:\\Users\\Nimish Jain\\Desktop\\Appium APK\\ApiDemos.apk");
			System.out.println("Inelse block....Is the app installed???-->"+driver.isAppInstalled("io.appium.android.apis"));
			driver.startActivity("io.appium.android.apis","ApiDemos");
		}
Thread.sleep(2000);

driver.launchApp();
}
}
