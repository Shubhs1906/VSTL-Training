package com.flows;

import com.generic.BaseTest;
import com.pageFactory.HomePage;
import com.pageFactory.SummerDressesPage;

public class AddToCartFlow {

	private BaseTest objBaseTest;
	private HomePage objHomePage;
	private SummerDressesPage objSummerDressesPage;

	public AddToCartFlow(BaseTest baseTest) {
		this.objBaseTest = baseTest;
		objHomePage = new HomePage(objBaseTest);
		objSummerDressesPage = new SummerDressesPage(objBaseTest);
	}

	public void addProductToCart() {

		objHomePage.moveToWomenOnHomePage();
		objHomePage.clickSummerDressesHomePage();
		objSummerDressesPage.verifySummerDressesPageIsDisplayed();
		objSummerDressesPage.getTextOfSummerDressesOnSummerDressesPage();
		//objSummerDressesPage.scrollToProductOnSummerDressesPage();
		objSummerDressesPage.moveToPrintedChiffonDressOnSummerDressesPage();
		objSummerDressesPage.clickOnAddToCartPrintedChiffonDressOnSummerDressesPage();
		objSummerDressesPage.clickOnContinueShoppingOnPopUpMenu();
		objSummerDressesPage.clickOnMyCartOnSummerDressesPage();

	}
}
