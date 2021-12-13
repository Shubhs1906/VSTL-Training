package com.generic;

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
		System.out.println("Open URL : " + strURL);
		driver.manage().window().maximize();
		System.out.println("Title : " + driver.getTitle());
		System.out.println("CurrentURL : " + driver.getCurrentUrl());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
