package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;

public class SignInSignOutPage {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;

	public SignInSignOutPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_inpUsername = By.xpath("//input[@id='email']");
	By loc_inpPassword = By.xpath("//input[@id='passwd']");
	By loc_hdrAuthentication = By.xpath("//*[contains(text(),'	Authentication')]");
	By loc_btnSignIn = By.xpath("//button[@id='SubmitLogin']");
	
	By loc_SignIn = By.xpath("//a[@class='login']");

	public void verifySignInPageIsDisplayed() {
		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitWait(5);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyDisplayedObject(loc_SignIn));

	}

	public void clickSignInButtonOnHomePage() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_SignIn));

	}

	

	public void enterUsername(String strUsername) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpUsername, strUsername));
	}

	public void enterPassword(String strPassword) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
	}

	public void clickSignInButtonOnAuthenticationPage() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnSignIn));

	}
	
	
	
	
	
	
}
