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
		
		objBaseTest.getObjSeleniumWrapperFunctions().Select(locator, intBirthDate);
		//objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName);

		if (intBirthDate > 0 && intBirthDate < 31)
			System.out.print("Date of Birth: " + intBirthDate);
		else
			System.out.println(" Please make sure that you use your real date of birth .");

	}

	public void enterBirthMonth(String strBirthMonth) {

		String strMonths[] = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };

		for (String element : strMonths) {
			if (element.equalsIgnoreCase(strBirthMonth))
				System.out.print(" " + strBirthMonth);

		}

	}

	public void enterBirthYear(int intBirthYear) {
		if (intBirthYear > 1905 && intBirthYear <= 2021)
			System.out.println(" " + intBirthYear);
		else
			System.out.println(" Please make sure that you use your real date of birth .");

	}

	public void selectGender(String strGender) {
		String strAllGender[] = { "custom", "female", "male" };

		for (String element : strAllGender) {
			if (element.equalsIgnoreCase(strGender))
				System.out.println("Gender: " + strGender);
		}

	}

}
