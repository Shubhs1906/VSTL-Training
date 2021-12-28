package com.generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	static WebDriver driver = null;
	private String strURL = "https://facebook.com/";

	private SeleniumWrapperFunctions ObjSeleniumWrapperFunctions;

	public void itializeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		ObjSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(ObjSeleniumWrapperFunctions);
		driver.get(strURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title : " + driver.getTitle());
		System.out.println("CurrentURL : " + driver.getCurrentUrl());
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

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
	
	public void getfailedTestScreenShot(String strFileName) {

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenshot,
					new File("/Users/admin/git/VSTL-Training/MavenFacebookAss/screenshots/" + strFileName + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
