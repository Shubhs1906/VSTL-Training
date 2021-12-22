package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class OrangeHrmPage {
	
	private BaseTest objBaseTest;

	public OrangeHrmPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_txtUsername = By.xpath("//input[@name='txtUsername']");
	By loc_txtPassword = By.xpath("//input[@name='txtPassword']");
	By loc_roundTrip = By.xpath("//p[@class='fs-3 fw-600 c-neutral-900'][contains(text(),'Round trip')]");
	By loc_btnLogin = By.xpath("//input[@id='btnLogin']");
	
	//input[@name='txtUsername']    Admin
	//input[@name='txtPassword']    admin123
	
	
	public void enterUsername(String strUsername) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtUsername, strUsername));
	}
	
	public void enterPassword(String strPassword) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_txtPassword, strPassword));
	}
	
	public void selectLogin() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_btnLogin));

	}

	
	
	
	

}
