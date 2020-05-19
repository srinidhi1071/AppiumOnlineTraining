package demo;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class XpathByClassName {
	@Test
	public void appium_demo7() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		// To set the Device name
		cap.setCapability("deviceName", "motorola one vision");
		// To set the platformName
		cap.setCapability("platformName", "andriod");
		// To set the platform version number
		cap.setCapability("platforVersion", "10");
		// To set the automation name
		cap.setCapability("automationName", "appium");
		// To continue with last settings of the Application
		cap.setCapability("noReset", true);
		cap.setCapability("uiautomator2ServerInstallTimeout", 40000);
		// cap.setCapability(capabilityName, value);
		// To install the Application on the device for the testing
		cap.setCapability("app", "C:\\Users\\Kiran\\Desktop\\New folder\\ApiDemos.apk");
		// To communicate with the server
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To find the View button the Homepage using AndroidUIAutomator locator
		WebElement viewMenu = driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
		// To click on the ViewMenu
		driver.tap(1, viewMenu, 500);
		// To fiind the ControlMenu
		WebElement controlMenu = driver.findElement(By.xpath("//android.widget.TextView[@index='4']"));
		// To click on the control button
		driver.tap(1, controlMenu, 500);
		// To find the Holo light Theme
		WebElement holoLightTheme = driver
				.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Holo Light Theme']"));
		driver.tap(1, holoLightTheme, 500);
		// To hide the Keyboard
		driver.hideKeyboard();
		// To find the dropdown menu option
		WebElement dropDown = driver.findElement(By.xpath("//android.widget.TextView[@text='Mercury']"));
		driver.tap(1, dropDown, 500);
		// To get the all the option in the menu
		List<MobileElement> dropDownMenu = driver.findElements(By.xpath("//android.widget.CheckedTextView"));
		// To print the dropdown options
		Thread.sleep(2000);
		for (MobileElement ele : dropDownMenu) {
			System.out.println(ele.getText());

		}
	}

}
