package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Demo {
	@Test
	public void tc_openApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","vivov5");
		cap.setCapability("platformNname","android");
		cap.setCapability("paltformVersion", 6);
		cap.setCapability("automationName","appium");
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity","Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	}

}
