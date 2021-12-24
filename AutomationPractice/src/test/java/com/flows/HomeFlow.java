package com.flows;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.HomePage;

public class HomeFlow {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private HomePage objHomePage;

	public HomeFlow(BaseTest baseTest) {
		this.objBaseTest = baseTest;
		objHomePage = new HomePage(objBaseTest);
	}

	public void addProductToCart() {
		
		objHomePage.moveToWomenOnHomePage();
		objHomePage.clickSummerDressesHomePage();
		
	}
}
