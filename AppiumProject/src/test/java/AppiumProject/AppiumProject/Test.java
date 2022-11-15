package AppiumProject.AppiumProject;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Test {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static void openCalculator() throws Exception {

		DesiredCapabilities Capabilities = new DesiredCapabilities();

		Capabilities.setCapability("deviceName", "OnePlus Nord 2T");
		Capabilities.setCapability("udid", "CA5PY9NBFQBM6TNZ");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "12");
		/*Capabilities.setCapability("appPackage", "com.oneplus.calculator");
		Capabilities.setCapability("appActivity", "com.oneplus.calculator.Calculator");*/
		Capabilities.setCapability("appPackage", "com.khulke.app");
		Capabilities.setCapability("appActivity", "com.khulke.app.useronboarding.ui.KhulkeSplashActivity");
		Capabilities.setCapability("noReset", "true");
		Capabilities.setCapability("automationName", "UiAutomator2");
		Capabilities.setCapability("autoGrantPermissions", "true");
		Capabilities.setCapability("appWaitForLaunch", "false");
		Capabilities.setCapability("ignoreHiddenApiPolicyError", "true");

		

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, Capabilities);

		System.out.println("Application Launched");
	}

}
