package utils;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
	private static AndroidDriver<WebElement> driver = null;
	
	public static AndroidDriver<WebElement> getDriver() {
		if(driver == null) {
			driver = inicializeDriver();
		}
		return driver;
	}
		
	private static AndroidDriver<WebElement> inicializeDriver() {

		try {

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("deviceName", "emulator-5554");
			desiredCapabilities.setCapability("automationName", "uiautomator2");
			desiredCapabilities.setCapability("appPackage", "br.com.icarros.androidapp");
			desiredCapabilities.setCapability("appActivity", "br.com.icarros.androidapp.ui.SplashActivity");
			desiredCapabilities.setCapability("fullReset", false);
			desiredCapabilities.setCapability("noReset", true);

			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static void quitDriver() {
		driver.closeApp();
		driver.close();
		driver.quit();
	}
}

