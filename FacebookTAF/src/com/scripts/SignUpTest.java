package com.scripts;

import org.openqa.selenium.WebDriver;
import com.pageFactory.SignUpPage;
import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.generic.Utilities;

public class SignUpTest extends BaseTest {

	private static int getBirthDate;
	private static String strGetGender;
	private static String strGetBirthMonth;
	private static String GetBirthYear;
	static WebDriver driver = null;

	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		SignUpPage objSignUpPage = new SignUpPage(this);
		objSignUpPage.selectCreateNewAccount();

		// ###############

		Utilities objUtilities = new Utilities();
		String strFirstName = objUtilities.getFirstName(6);
		String strSurname = objUtilities.getSurname(6);
		String strMobileNumber = objUtilities.getMobileNumber(8);
		String strEmailAddress = objUtilities.getEmailAddress(8);
		String strNewPassword = objUtilities.getNewPassword(4);
		int intBirthDate = objUtilities.getBirthDate(getBirthDate);
		String strBirthYear = objUtilities.getBirthYear(GetBirthYear);
		String strGender = objUtilities.getGender(strGetGender);
		String strBirthMonth = objUtilities.GetBirthMonth(strGetBirthMonth);

		System.out.println("");
		System.out.println("Sign Up It's quick and easy");
		System.out.println("");

		objSignUpPage.enterFirstName(strFirstName);
		objSignUpPage.enterSurname(strSurname);
		// objSignUpPage.enterMobileNumber(strMobileNumber);
		objSignUpPage.EmailAddress(strEmailAddress);
		objSignUpPage.SetNewPassword(strNewPassword);
		objSignUpPage.enterBirthDate(intBirthDate);
		objSignUpPage.enterBirthMonth(strBirthMonth);
		objSignUpPage.enterBirthYear(strBirthYear);
		objSignUpPage.selectGender(strGender);

		/*
		 * 
		 * System.out.println("");
		 * 
		 * System.out.println("        Sign Up");
		 * 
		 * // objSignUpTest.afterMethod();
		 */
		// ###############

	}

	public void afterMethod() {
		this.tearDown();

	}

	public static void main(String[] args) {

		SignUpTest objSignUpTest = new SignUpTest();

		objSignUpTest.beforeMainMethod();

	}

}
