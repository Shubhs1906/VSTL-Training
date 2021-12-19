package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private WebDriver driver = null;
	private String strURL = "https://www.cleartrip.com/";

	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;

	public void itializeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/externalResources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		driver.get(strURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// System.out.println("Title : " + driver.getTitle());
		// System.out.println("CurrentURL : " + driver.getCurrentUrl());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunctions;
	}

	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}

	public void tearDown() {

		driver.close();
		System.out.println("Close Browser");
	}

}
