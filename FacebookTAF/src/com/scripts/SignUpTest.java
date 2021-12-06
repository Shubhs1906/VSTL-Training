package com.scripts;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest {

	private static int getBirthDate;
	private static int getBirthYear;
	private static String strGetGender;
	private static String strGetBirthMonth;
	
	public void  beforeMethod() {
		this.itializeWebEnvironment("www.facebook.com");
		
	}

	public static void main(String[] args) {

		BaseTest objBaseTest = new BaseTest();
		SignUpPage objSignUpPage = new SignUpPage();
		Utilities objUtilities = new Utilities();

		String strFirstName = objUtilities.getFirstName(6);
		String strSurname = objUtilities.getSurname(6);
		String strMobileNumber = objUtilities.getMobileNumber(8);
		String strEmailAddress = objUtilities.getEmailAddress(8);
		String strNewPassword = objUtilities.getNewPassword(4);
		int intBirthDate = objUtilities.getBirthDate(getBirthDate);
		int intBirthYear = objUtilities.getBirthYear(getBirthYear);
		String strGender = objUtilities.getGender(strGetGender);
		String strBirthMonth = objUtilities.GetBirthMonth(strGetBirthMonth);

		objBaseTest.itializeWebEnvironment("www.facebook.com");

		System.out.println("");
		System.out.println("Sign Up It's quick and easy");
		System.out.println("");

		objSignUpPage.enterFirstName(strFirstName);

		objSignUpPage.enterSurname(strSurname);

		objSignUpPage.enterMobileNumber(strMobileNumber);

		objSignUpPage.EmailAddress(strEmailAddress);

		objSignUpPage.SetNewPassword(strNewPassword);

		objSignUpPage.enterBirthDate(intBirthDate);

		objSignUpPage.enterBirthMonth(strBirthMonth);

		objSignUpPage.enterBirthYear(intBirthYear);

		objSignUpPage.selectGender(strGender);

		System.out.println("");

		System.out.println("        Sign Up");

	}

}
