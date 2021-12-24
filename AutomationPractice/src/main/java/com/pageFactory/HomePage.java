package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class HomePage {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;

	public HomePage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators
	By loc_hovrBtnWomen = By.xpath("//a[@title='Women']");
	By loc_btnSummerDresses = By.xpath("//a[@title='Summer Dresses']/preceding::a[@title='Summer Dresses']");
	
	
	
	
	public void moveToWomenOnHomePage(){
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToObject(loc_hovrBtnWomen));
	}
	
	public void clickSummerDressesHomePage(){
		
		//explicit wait
		objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_btnSummerDresses, 10);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnSummerDresses));
		
	}

}











/*public void verifyHomePageIsDisplayed() {
objBaseTest.getObjSeleniumWrapperFunctions().setImplicitWait(5);
Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyDisplayedObject(loc_hdrAuthentication));
}*/