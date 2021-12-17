package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;

public class BookFlightPage {

	private BaseTest objBaseTest;

	public BookFlightPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_oneWay = By.xpath("//p[@class='fs-3 fw-600 c-neutral-900'][contains(text(),'One way')]");

	public void selectOneWay() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_oneWay);

	}

}
