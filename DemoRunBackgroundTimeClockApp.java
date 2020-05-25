package Com.tyss.project.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoRunBackgroundTimeClockApp {
	@Test
	public void dmotc_1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo v5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 6);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("uiautomator2ServerInstallTimeout",40000);
		cap.setCapability("appPackage","com.android.BBKClock");
		cap.setCapability("appActivity","Timer");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		//Thread.sleep(2000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[3]"
).click();
		
		WebElement min1 = driver.findElementById("com.android.BBKClock:id/minute_0");
		String vmin1=min1.getText();
		WebElement min2 = driver.findElementById("com.android.BBKClock:id/minute_1");
		String vmin2=min2.getText();

		WebElement sec1 = driver.findElementById("com.android.BBKClock:id/second_0");
		String vsec1=sec1.getText();
		WebElement sec2 = driver.findElementById("com.android.BBKClock:id/second_1");
		String vsec2=sec2.getText();
		WebElement msec = driver.findElementById("com.android.BBKClock:id/m_second_1");
		String vmsec=msec.getText();

		String strtTime = vmin1+vmin2+":"+vsec1+vsec2+"."+msec;

		//System.out.println("Starting Time--->"+vmin1+vmin2+":"+vsec1+vsec2+"."+msec);
		System.out.println("Starting Time--->"+strtTime);
		driver.findElementById("com.android.BBKClock:id/btu1").click();
		driver.runAppInBackground(10);
		Thread.sleep(12000);
		WebElement amin1 = driver.findElementById("com.android.BBKClock:id/minute_0");
		String avmin1=amin1.getText();
		WebElement amin2 = driver.findElementById("com.android.BBKClock:id/minute_1");
		String avmin2=amin2.getText();

		WebElement asec1 = driver.findElementById("com.android.BBKClock:id/second_0");
		String avsec1=asec1.getText();
		WebElement asec2 = driver.findElementById("com.android.BBKClock:id/second_1");
		String avsec2=asec2.getText();
		WebElement amsec = driver.findElementById("com.android.BBKClock:id/m_second_1");
		String avmsec=amsec.getText();
		
		String stopTime = avmin1+avmin2+":"+avsec1+avsec2+"."+amsec;
		System.out.println("Pause time--->"+stopTime);
//		driver.findElementById("com.android.BBKClock:id/btu1").click();
		Assert.assertNotEquals(strtTime, stopTime);

}
}