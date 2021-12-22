package com.herokuapp.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class ActionEventPage {

	private BaseTest objBaseTest;

	public ActionEventPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators

	By loc_object_A = By.xpath("//*[contains(text(),'A')]");
	By loc_object_B = By.xpath("//div[@class='_6ltg']//a[@role='button']");
	By loc_inputBox = By.xpath("//input[@type='number']");
	By loc_ddBox = By.xpath("//*[contains(text(),'Please select an option')]");

	public void dragAndDropObject() {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().dragAndDropOption(loc_object_A, loc_object_B));
	}

	public void clearWrittenText(String strInput) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clearWrittenText(loc_inputBox, strInput));
	}

	public void navigateOptions(String strNavigateOption) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().navigateOptions(strNavigateOption));
	}

	public void selectDDBox(String strDropDownOption, String strOptionType) {
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().selectDropDownOption(loc_ddBox,
				strDropDownOption, strOptionType));
	}

}
