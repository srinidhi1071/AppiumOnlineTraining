package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoCordinateXY {
	@Test
	public void demo_cordinat() throws MalformedURLException, InterruptedException {
		
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
		driver.findElementByAccessibilityId("Views").click();
		driver.tap(1, 260, 530, 500);
		Thread.sleep(1000);
		
		Dimension dim = driver.manage().window().getSize();
		int startx = dim.getWidth()/2;
		int starty = (int)(dim.getHeight()*0.80);
		int endx=startx;
		int endy=(int)(dim.getHeight()*0.20);
	
		driver.swipe(startx, starty, endx, endy, 1000);
}
}