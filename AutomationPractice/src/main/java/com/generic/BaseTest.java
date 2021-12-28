package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseTest {
	private BaseTest objBaseTest;
	static WebDriver driver = null;
	public Properties objConfig;
	private String strURL = "";
	// private String strURL = "http://automationpractice.com/";

	private SeleniumWrapperFunctions ObjSeleniumWrapperFunctions;

	public void itializeWebEnvironment() {
		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/resources/chromedriver.exe");

		 driver = new ChromeDriver();
		ObjSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(ObjSeleniumWrapperFunctions);
		strURL = objConfig.getProperty("AUT_URL");
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

	// Reusable generic method

	public void loadConfigProperties() {

		try {
			objConfig = new Properties();
			objConfig.load(new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/configuration/config.properties"));

		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();

		}
	}

	public void getfailedTestScreenShot(String strFileName) {
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot,
					new File("/Users/admin/git/VSTL-Training/AutomationPractice/screenshots/" + strFileName + ".png"));
			
			Reporter.log(" <a href='"+screenshot.getAbsolutePath()+"'> <screenshot src='"+ screenshot.getAbsolutePath()+"' height='200' width='200'/> </a>  ");

		} catch (IOException e){
			e.printStackTrace();
		}

	}
}
