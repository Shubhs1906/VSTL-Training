package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.google.common.base.Verify;

public class SignUpPage {
	// private static WebDriver driver = null;

	private BaseTest objBaseTest;

	public SignUpPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators  //div[@class='_6ltg']//a[@role='button']
	By loc_clickCreateNewAcc = By.xpath("//div[@class='_6ltg']//a[@role='buon']");
	By loc_inpFirstName = By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By loc_inpSurName = By.xpath("//div[@id='reg_form_box']//input[@name='lastname']");
	By loc_inpMobNum = By.xpath("//input[@name='reg_email__']");
	By loc_inpemailAdd = By.xpath("//input[@name='reg_email__']");
	By loc_setPassword = By.xpath("//input[@aria-label='New password']");
	By loc_inpemailAddAgain = By.xpath("//input[@aria-label='Re-enter email address']");
	By loc_inpBirthDate = By.xpath("//select[@aria-label='Day']");
	By loc_inpBirthMonth = By.xpath("//select[@aria-label='Month']");
	By loc_inpBirthYear = By.xpath("//select[@aria-label='Year']");
	By loc_inpMaleGender = By.xpath("//*[contains(text(),'Male')]/following::input[@type='radio']");
	By loc_inpFemaleGender = By.xpath("//*[contains(text(),'Female')]/following::input[@type='radio']");
	By loc_inpCustomGender = By.xpath("//*[contains(text(),'Custom')]/following::input[@type='radio']");

	public void selectCreateNewAccount() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_clickCreateNewAcc));

	}

	public void enterFirstName(String strFirstName) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName));

	}

	public void enterSurname(String strSurname) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpSurName, strSurname));

	}

	public void enterMobileNumber(String strMobileNumber) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpMobNum, strMobileNumber));

		/* if (strMobileNumber.length() == 10) */

	}

	public void EmailAddress(String strEmailAddress) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpemailAdd, strEmailAddress));
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_inpemailAddAgain, strEmailAddress));

		/*
		 * if (strEmailAddress.endsWith("@gmail.com") == true)
		 * System.out.println("EmailAddress: " + strEmailAddress); else if
		 * (strEmailAddress.endsWith("@yahoo.com") == true)
		 * System.out.println("EmailAddress: " + strEmailAddress); else if
		 * (strEmailAddress.endsWith("@vervesquare.com") == true)
		 * System.out.println("EmailAddress: " + strEmailAddress); else
		 * System.out.println("Enter valid Email Id");
		 */

	}

	public void SetNewPassword(String strNewPassword) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().setText(loc_setPassword, strNewPassword));

		/*
		 * if (strNewPassword.length() >= 6) System.out.println("Password: " +
		 * strNewPassword); else if (strNewPassword.length() < 6)
		 * System.out.println(
		 * "Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &)."
		 * ); else System.out.println(
		 * "Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &)."
		 * );
		 */

	}

	public void enterBirthDate(int intBirthDate, String strOptionType) {

		String strBirthDate = Integer.toString(intBirthDate);

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_inpBirthDate,
				strBirthDate, strOptionType));

		/*
		 * if (intBirthDate > 0 && intBirthDate < 31)
		 * System.out.print("Date of Birth: " + intBirthDate); else System.out.
		 * println(" Please make sure that you use your real date of birth .");
		 */

	}

	public void enterBirthMonth(String strGetBirthMonth, String strOptionType) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_inpBirthMonth,
				strGetBirthMonth, strOptionType));

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

	public void enterBirthYear(String strGetBirthYear, String strOptionType) {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_inpBirthYear,
				strGetBirthYear, strOptionType));

		/*
		 * if (intBirthYear > 1905 && intBirthYear <= 2021)
		 * System.out.println(" " + intBirthYear); else System.out.
		 * println(" Please make sure that you use your real date of birth .");
		 */

	}

	public void selectGender(String strGetGender) {

		if (strGetGender.equalsIgnoreCase("Male"))
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpMaleGender));
		else if (strGetGender.equalsIgnoreCase("Female"))
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpFemaleGender));
		else if (strGetGender.equalsIgnoreCase("Custom"))
			Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().click(loc_inpCustomGender));

	}

}
