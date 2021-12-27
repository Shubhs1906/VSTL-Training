package com.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	private WebDriver driver = null;
	public Properties objConfig;
	private String strURL = "";
	//private String strURL = "http://automationpractice.com/";

	private SeleniumWrapperFunctions ObjSeleniumWrapperFunctions;

	public void itializeWebEnvironment() {
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/resources/chromedriver.exe");

		driver = new ChromeDriver();
		ObjSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(ObjSeleniumWrapperFunctions);
		strURL=objConfig.getProperty("AUT_URL");
		driver.get(strURL);
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title : " + driver.getTitle());
		System.out.println("CurrentURL : " + driver.getCurrentUrl());
		

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
	
	
	//Reusable generic method

	public void loadConfigProperties(){
		
		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir") +"/src/test/resources/configuration/config.properties"));
			
		} catch (Exception exception) {
			System.out.println("I got exception : "+ exception.getMessage());
			exception.printStackTrace();
			
		}
	}
}
