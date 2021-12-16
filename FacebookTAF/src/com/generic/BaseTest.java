package com.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {

	private WebDriver driver = null;
	private String strURL = "https://www.facebook.com/";

	private SeleniumWrapperFunctions ObjSeleniumWrapperFunctions;

	public void itializeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\git\\VSTL-Training\\FacebookTAF\\externalResources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		ObjSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(ObjSeleniumWrapperFunctions);
		driver.get(strURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title : " + driver.getTitle());
		System.out.println("CurrentURL : " + driver.getCurrentUrl());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
		return ObjSeleniumWrapperFunctions;
	}

	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.ObjSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}

	public void tearDown() {

		driver.close();
		System.out.println("Close Browser");
	}

}
