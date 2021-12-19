package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.BaseTest;

public class BookFlightPage {

	private BaseTest objBaseTest;

	public BookFlightPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_roundTrip = By.xpath("//p[@class='fs-3 fw-600 c-neutral-900'][contains(text(),'Round trip')]");
	By loc_boardingPoint = By
			.xpath("//h4[contains(text(),'To')]/preceding::input[@placeholder='Any worldwide city or airport']");
	By loc_alightingPoint = By
			.xpath("//h4[contains(text(),'To')]/following::input[@placeholder='Any worldwide city or airport']");
	By loc_boardingCityMumbai = By.xpath("//p[contains(text(),'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]");
	By loc_boardingCityPune = By.xpath("//p[contains(text(),'Pune, IN - Lohegaon (PNQ)')]");
	By loc_boardingCityNashik = By.xpath("//p[contains(text(),'Nasik, IN - Ozhar Airport (ISK)')]");
	By loc_boardingCityNagpur = By.xpath("//p[contains(text(),'Nagpur, IN - Dr. Babasaheb Ambedkar (NAG)')]");
	By loc_alightingCityBangalore = By
			.xpath("//p[contains(text(),'Bangalore, IN - Kempegowda International Airport (BLR)')]");
	By loc_alightingCityMangalore = By.xpath("//p[contains(text(),'Mangalore, IN - Bajpe (IXE)')]");
	By loc_alightingCityBelgaum = By.xpath("//p[contains(text(),'Belgaum, IN - Sambre (IXG)')]");
	By loc_alightingCityMysore = By.xpath("//p[contains(text(),'Mysore, IN - Mysore (MYQ)')]");
	By loc_adults = By
			.xpath("//h4[contains(text(),'Adults')]/following-sibling::select[@class='bc-neutral-100 bg-transparent']");
	By loc_children = By.xpath(
			"//h4[contains(text(),'Children')]/following-sibling::select[@class='bc-neutral-100 bg-transparent']");
	By loc_infants = By.xpath(
			"//h4[contains(text(),'Infants')]/following-sibling::select[@class='bc-neutral-100 bg-transparent']");

	public void selectRoundtrip() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_roundTrip);

	}

	public void enterBoardingPoint(String strBoardingPoint) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_boardingPoint, strBoardingPoint);
	}

	public void selectBoardingCityMumbai() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_boardingCityMumbai);

	}

	public void selectBoardingCityPune() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_boardingCityPune);

	}

	public void selectBoardingCityNashik() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_boardingCityNashik);

	}

	public void selectBoardingCityNagpur() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_boardingCityNagpur);

	}

	public void enterAlightingPoint(String strAlightingPoint) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_alightingPoint, strAlightingPoint);
	}

	public void selectAlightingCityBangalore() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_alightingCityBangalore);

	}

	public void selectAlightingCityMangalore() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_alightingCityMangalore);

	}

	public void selectAlightingCityBelgaum() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_alightingCityBelgaum);

	}

	public void selectAlightingCityMysore() {

		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_alightingCityMysore);

	}

	public void selectNoOfAldults(String strNoOfAldults) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_adults, strNoOfAldults);
	}

	public void selectNoOfChildren(String strNoOfChildren) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_children, strNoOfChildren);
	}

	public void selectNoOfInfants(String strNoOfInfants) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_infants, strNoOfInfants);
	}
	
	
	
	
	
	
	
	
	
	
}
