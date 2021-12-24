package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.SignInSignOutFlow;
import com.flows.HomeFlow;
import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignInSignOutPage;
import com.pageFactory.HomePage;

public class AutomationPracticeTest extends BaseTest {

	static WebDriver driver = null;
	private HomePage objHomePage;
	private HomeFlow objHomeFlow;

	private SignInSignOutPage objSignInSignOutPage;
	private SignInSignOutFlow objSignInSignOutFlow;
	
	
	private Utilities objUtilities = new Utilities();

	public void initializeWebPageAndFlows() {
		objHomePage = new HomePage(this);
		objHomeFlow = new HomeFlow(this);
		objSignInSignOutPage = new SignInSignOutPage(this);
		objSignInSignOutFlow = new SignInSignOutFlow(this);
	}

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		this.initializeWebPageAndFlows();
		

	}

	@AfterClass
	public void afterMethod() {
		// this.tearDown();

	}

	@Test(priority = 1)
	public void TCID_101() {
		
		objSignInSignOutPage.verifySignInPageIsDisplayed();
		objSignInSignOutFlow.doSignIn();
		
	}

	@Test(priority = 2)
	public void TCID_102() {
		
		
		objHomeFlow.addProductToCart();

	}
}
