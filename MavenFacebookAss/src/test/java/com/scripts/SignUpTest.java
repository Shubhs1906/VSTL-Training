package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pageFactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.generic.Utilities;

public class SignUpTest extends BaseTest {

	private static int getBirthDate;
	private static String strGetGender;
	private static String strGetBirthMonth;
	private static String GetBirthYear;
	private String strRandomDropDown;
	static WebDriver driver = null;

	private SignUpPage objSignUpPage;

	private Utilities objUtilities = new Utilities();
	String strFirstName = objUtilities.getFirstName(6);
	String strSurname = objUtilities.getSurname(6);
	String strMobileNumber = objUtilities.getMobileNumber(8);
	String strEmailAddress = objUtilities.getEmailAddress(8);
	String strNewPassword = objUtilities.getNewPassword(4);
	int intBirthDate = objUtilities.getBirthDate(getBirthDate);
	String strBirthYear = objUtilities.getBirthYear(GetBirthYear);
	String strGender = objUtilities.getGender(strGetGender);
	String strBirthMonth = objUtilities.GetBirthMonth(strGetBirthMonth);
	String strDropDown = objUtilities.getDropDown(strRandomDropDown);


	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		objSignUpPage = new SignUpPage(this);

	}

	@AfterClass
	public void afterMethod() {
		//this.tearDown();

	}

	@Test(priority=1)
	public void selectCreateNewAccountTest () {

		objSignUpPage.selectCreateNewAccount();

	}

	@Test(priority=2)
	public void inputNameTest () {
		objSignUpPage.enterFirstName(strFirstName);
		objSignUpPage.enterSurname(strSurname);

	}

	@Test(priority=3)
	public void inputEmailAddressTest () {
		// objSignUpPage.enterMobileNumber(strMobileNumber);
		objSignUpPage.EmailAddress(strEmailAddress);

	}

	@Test(priority=4)
	public void inputPasswordTest () {
		objSignUpPage.SetNewPassword(strNewPassword);

	}

	@Test(priority=5)
	public void inputDateTest () {
		objSignUpPage.enterBirthDate(intBirthDate, "Value");
		objSignUpPage.enterBirthMonth(strBirthMonth, "text");
		objSignUpPage.enterBirthYear(strBirthYear, "value");
	}

	@Test(priority=6)
	public void selectGenderTest () {
		objSignUpPage.selectGender(strGender);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * // objSignUpPage.selectCreateNewAccount(); //
	 * objSignUpPage.enterFirstName(strFirstName);
	 * objSignUpPage.enterSurname(strSurname); //
	 * //objSignUpPage.enterMobileNumber(strMobileNumber);
	 * objSignUpPage.EmailAddress(strEmailAddress);
	 * objSignUpPage.SetNewPassword(strNewPassword);
	 * objSignUpPage.enterBirthDate(intBirthDate);
	 * objSignUpPage.enterBirthMonth(strBirthMonth);
	 * objSignUpPage.enterBirthYear(strBirthYear);
	 * objSignUpPage.selectGender(strGender);
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * SignUpTest objSignUpTest = new SignUpTest();
	 * 
	 * objSignUpTest.beforeMainMethod(); 
	 * }
	 */

}
