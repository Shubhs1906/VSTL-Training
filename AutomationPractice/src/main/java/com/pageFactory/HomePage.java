package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;

public class HomePage {

	private BaseTest objBaseTest;

	public HomePage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators
	By loc_btnSummerDresses = By.xpath("//a[@title='Summer Dresses']/preceding::a[@title='Summer Dresses']");

	By loc_hovrBtnWomen = By.xpath("//a[@title='Women']");
	By loc_btnCustomerAccountName = By.xpath("//a[@title='View my customer account']");
	
	
	
	
	public void verifyUserSignedInAndHomePageIsDisplayed() {
		
		// Implicit Wait 
		
		  objBaseTest.getObjSeleniumWrapperFunctions().setImplicitWait(5);
		  Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().
		  verifyDisplayedObject(loc_btnCustomerAccountName));
		  Reporter.log("Verify User Signed In And Home Page Is Displayed.", true);
	}

	public void moveToWomenOnHomePage() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToObject(loc_hovrBtnWomen));
		Reporter.log("Mouse over to Women.", true);
	}

	public void clickSummerDressesHomePage() {

		// Explicit Wait
		
		objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_btnSummerDresses, 10);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnSummerDresses));
		Reporter.log("Click on Summer Dresses Button.", true);

	}

	

}

