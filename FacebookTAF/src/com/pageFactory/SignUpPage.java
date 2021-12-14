package com.pageFactory;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import com.generic.BaseTest;

public class SignUpPage {
	// private static WebDriver driver = null;

	private BaseTest objBaseTest;

	public SignUpPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators
	By loc_clickCreateNewAcc = By.xpath("//div[@class='_6ltg']//a[@role='button']");
	By loc_inpFirstName = By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By loc_inpSurName = By.xpath("//div[@id='reg_form_box']//input[@name='lastname']");
	By loc_inpMobNum = By.xpath("//input[@name='reg_email__']");
	By loc_inpemailAdd = By.xpath("//input[@name='reg_email__']");
	By loc_setPassword = By.xpath("//input[@aria-label='New password']");
	By loc_inpemailAddAgain = By.xpath("//input[@aria-label='Re-enter email address']");
	By loc_inpBirthDate = By.xpath("//select[@aria-label='Day']");
	By loc_inpBirthMonth = By.xpath("//select[@aria-label='Month']");
	By loc_inpBirthYear = By.xpath("//select[@aria-label='Year']");
	By loc_inpMaleGender = By.xpath("//*[contains(text(),'Male')]");
	By loc_inpFemaleGender = By.xpath("//*[contains(text(),'Female')]");
	By loc_inpCustomGender = By.xpath("");

	public void selectCreateNewAccount() {
		objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickCreateNewAcc);

		System.out.print("Sign  Up Page Open");

	}

	public void enterFirstName(String strFirstName) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName);

		System.out.print("Name: " + strFirstName);

	}

	public void enterSurname(String strSurname) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurName, strSurname);

		System.out.println(" " + strSurname);

	}

	public void enterMobileNumber(String strMobileNumber) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpMobNum, strMobileNumber);

		if (strMobileNumber.length() == 10)
			System.out.println("Mobile Number: " + strMobileNumber);

	}

	public void EmailAddress(String strEmailAddress) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpemailAdd, strEmailAddress);

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpemailAddAgain, strEmailAddress);

		if (strEmailAddress.endsWith("@gmail.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else if (strEmailAddress.endsWith("@yahoo.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else if (strEmailAddress.endsWith("@vervesquare.com") == true)
			System.out.println("EmailAddress: " + strEmailAddress);
		else
			System.out.println("Enter valid Email Id");

	}

	public void SetNewPassword(String strNewPassword) {

		objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setPassword, strNewPassword);

		if (strNewPassword.length() >= 6)
			System.out.println("Password: " + strNewPassword);
		else if (strNewPassword.length() < 6)
			System.out.println(
					"Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).");
		else
			System.out.println(
					"Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).");

	}

	public void enterBirthDate(int intBirthDate) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByIndex(loc_inpBirthDate, intBirthDate);

		if (intBirthDate > 0 && intBirthDate < 31)
			System.out.print("Date of Birth: " + intBirthDate);
		else
			System.out.println(" Please make sure that you use your real date of birth .");

	}

	public void enterBirthMonth(String strGetBirthMonth) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByVisibleText(loc_inpBirthMonth, strGetBirthMonth);

		/*
		 * String strMonths[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
		 * "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		 * 
		 * for (String element : strMonths) { if
		 * (element.equalsIgnoreCase(strGetBirthMonth)) System.out.print(" " +
		 * strGetBirthMonth);
		 * 
		 * }
		 */

	}

	public void enterBirthYear(String strGetBirthYear) {

		objBaseTest.getObjSeleniumWrapperFunctions().selectByValue(loc_inpBirthYear, strGetBirthYear);

		/*
		 * if (intBirthYear > 1905 && intBirthYear <= 2021)
		 * System.out.println(" " + intBirthYear); else System.out.
		 * println(" Please make sure that you use your real date of birth .");
		 */

	}

	public void selectGender(String strGetGender) {

		String strAllGender[] = { "Custom", "Female", "Male" };

			
			if (strGetGender.equalsIgnoreCase("Male"))
				objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpMaleGender);
			else if (strGetGender.equalsIgnoreCase("Female"))
				objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpFemaleGender);
			
		

	}

}
