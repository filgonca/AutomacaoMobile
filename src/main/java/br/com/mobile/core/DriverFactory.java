package br.com.mobile.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "emulator-5556");
		//desiredCapabilities.setCapability("App", "driver\\CTAppium1_2.apk");
		caps.setCapability("appPackage", "com.ctappium");
		caps.setCapability("appActivity", "com.ctappium.MainActivity");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\fillipe.lopes\\eclipse-workspace\\AutomacaoMobile\\driver\\chromedriver_2_44.exe");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
