package com.scripts;

import org.openqa.selenium.WebDriver;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest {

	private static int getBirthDate;
	private static int getBirthYear;
	private static String strGetGender;
	private static String strGetBirthMonth;

	public void beforeMainMethod() {
		this.itializeWebEnvironment();
		// SignUpPage objSignUpPage = new SignUpPage(this);
		// objSignUpPage.enterFirstName(strFirstName);

	}

	public void afterMethod() {
		this.tearDown();

	}

	public static void main(String[] args) {

		SignUpTest objSignUpTest = new SignUpTest();
		Utilities objUtilities = new Utilities();
		SignUpPage objSignUpPage = new SignUpPage(objSignUpTest);

		objSignUpTest.beforeMainMethod();

		String strFirstName = objUtilities.getFirstName(6);
		String strSurname = objUtilities.getSurname(6);
		String strMobileNumber = objUtilities.getMobileNumber(8);
		String strEmailAddress = objUtilities.getEmailAddress(8);
		String strNewPassword = objUtilities.getNewPassword(4);
		int intBirthDate = objUtilities.getBirthDate(getBirthDate);
		int intBirthYear = objUtilities.getBirthYear(getBirthYear);
		String strGender = objUtilities.getGender(strGetGender);
		String strBirthMonth = objUtilities.GetBirthMonth(strGetBirthMonth);

		System.out.println("");
		System.out.println("Sign Up It's quick and easy");
		System.out.println("");

		// objSignUpPage.selectCreateNewAccount();

		objSignUpPage.enterFirstName(strFirstName);
		objSignUpPage.enterSurname(strSurname);
		//objSignUpPage.enterMobileNumber(strMobileNumber);
		objSignUpPage.EmailAddress(strEmailAddress);
		objSignUpPage.SetNewPassword(strNewPassword);

		/*
		 * 
		 * objSignUpPage.enterBirthDate(intBirthDate);
		 * 
		 * objSignUpPage.enterBirthMonth(strBirthMonth);
		 * 
		 * objSignUpPage.enterBirthYear(intBirthYear);
		 * 
		 * objSignUpPage.selectGender(strGender);
		 * 
		 * System.out.println("");
		 * 
		 * System.out.println("        Sign Up");
		 * 
		 * // objSignUpTest.afterMethod();
		 */

	}

}
