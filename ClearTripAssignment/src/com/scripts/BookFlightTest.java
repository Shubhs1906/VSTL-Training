package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.BookFlightPage;

public class BookFlightTest extends BaseTest {

	static WebDriver driver = null;

	private BookFlightPage objBookFlightPage;

	private Utilities objUtilities = new Utilities();
	String strGetCities_1 = objUtilities.GetRandomCitiesFrom();
	String strGetCities_2 = objUtilities.GetRandomCitiesTo();
	String strGetNoOfAdults = objUtilities.getRandomNoOfAdults();
	String strGetNoOfChildren = objUtilities.getRandomNoOfChildren();
	String strGetNoOfInfants = objUtilities.getRandomNoOfInfants();
	
	

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		objBookFlightPage = new BookFlightPage(this);

	}

	@Test(priority = 1)
	public void selectRoundtripTest() {

		objBookFlightPage.selectRoundtrip();

	}

	@Test(priority = 2)
	public void enterBoardingPointTest() {

		objBookFlightPage.enterBoardingPoint(strGetCities_1);

	}

	@Test(priority = 3)
	public void selectCityDropdown_1() {

		if (strGetCities_1 == "Pune")
			objBookFlightPage.selectBoardingCityPune();
		else if (strGetCities_1 == "Nashik")
			objBookFlightPage.selectBoardingCityNashik();
		else if (strGetCities_1 == "Nagpur")
			objBookFlightPage.selectBoardingCityNagpur();
		else if (strGetCities_1 == "Mumbai")
			objBookFlightPage.selectBoardingCityMumbai();

	}

	@Test(priority = 4)
	public void enterAlightingPointTest() {

		objBookFlightPage.enterAlightingPoint(strGetCities_2);

	}

	@Test(priority = 5)
	public void selectCityDropdown_2() {

		if (strGetCities_2 == "Bangalore")
			objBookFlightPage.selectAlightingCityBangalore();
		else if (strGetCities_2 == "Belgaum")
			objBookFlightPage.selectAlightingCityBelgaum();
		else if (strGetCities_2 == "Mangalore")
			objBookFlightPage.selectAlightingCityMangalore();
		else if (strGetCities_2 == "Mysore")
			objBookFlightPage.selectAlightingCityMysore();

	}

	@Test
	public void selectNoOfAdults() {
		objBookFlightPage.selectNoOfAldults(strGetNoOfAdults);

	}

	@Test
	public void selectNoOfChildren() {
		objBookFlightPage.selectNoOfAldults(strGetNoOfChildren);

	}

	@Test
	public void selectNoOfInfants() {
		objBookFlightPage.selectNoOfAldults(strGetNoOfInfants);

	}
	
	
	
	
	
	
	
	
	

}
