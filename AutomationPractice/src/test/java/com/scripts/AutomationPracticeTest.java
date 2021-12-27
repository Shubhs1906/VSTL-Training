package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.flows.SignInSignOutFlow;
import com.flows.AddToCartFlow;
import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignInSignOutPage;
import com.pageFactory.SummerDressesPage;
import com.pageFactory.HomePage;

public class AutomationPracticeTest extends BaseTest {

	static WebDriver driver = null;
	private HomePage objHomePage;
	private AddToCartFlow objAddToCartFlow;
	private SummerDressesPage objSummerDressesPage;
	private SignInSignOutPage objSignInSignOutPage;
	private SignInSignOutFlow objSignInSignOutFlow;

	private Utilities objUtilities = new Utilities();

	public void initializeWebPageAndFlows() {
		objHomePage = new HomePage(this);
		objAddToCartFlow = new AddToCartFlow(this);
		objSignInSignOutPage = new SignInSignOutPage(this);
		objSignInSignOutFlow = new SignInSignOutFlow(this);
		objSummerDressesPage = new SummerDressesPage(this);
	}

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		this.initializeWebPageAndFlows();

	}

	@AfterClass
	public void afterMethod() {
		this.tearDown();

	}

	@Test(priority = 1)
	public void TCID_101_VerifySignInFunctionality() {

		objSignInSignOutPage.verifySignInPageIsDisplayed();
		objSignInSignOutFlow.doSignIn();

	}

	@Test(priority = 2)
	public void TCID_102_VerifyProductIsAddedToCart() {
		
		objHomePage.verifyUserSignedInAndHomePageIsDisplayed();
		objAddToCartFlow.addProductToCart();
		//objSummerDressesPage.verifyProductAddedToCart();

	}

	@Test(priority = 3)
	public void TCID_103_GetAllLinksOnSummerDressesPage() {

		// objSummerDressesPage.getAllLinksOnHomePage();

	}

	@Test(priority = 4)
	public void TCID_104_VerifyAllLinksOnPage() {

		objSummerDressesPage.getAllLinksOnSummerDressesPage();

	}
}
