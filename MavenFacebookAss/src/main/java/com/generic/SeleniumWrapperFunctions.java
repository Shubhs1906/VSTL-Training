package com.generic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWrapperFunctions {

	private BaseTest objBaseTest;

	public SeleniumWrapperFunctions(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	public boolean setText(By locator, String strInputValue) {

		try {
			objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
		/* System.out.println("set text : " + strInputValue); */
	}

	public boolean click(By locator) {

		try {
			objBaseTest.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	/*public boolean selectByIndex(By locator, int intInputDropDown) {

		try {
			WebElement element = objBaseTest.getDriver().findElement(locator);
			Select dropDown = new Select(element);
			dropDown.selectByIndex(intInputDropDown);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean selectByVisibleText(By locator, String strInputDropDown_1) {

		try {
			WebElement element = objBaseTest.getDriver().findElement(locator);
			Select dropDown = new Select(element);
			dropDown.selectByVisibleText(strInputDropDown_1);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean selectByValue(By locator, String strInputDropDown_2) {

		try {
			WebElement element = objBaseTest.getDriver().findElement(locator);
			Select dropDown = new Select(element);
			dropDown.selectByValue(strInputDropDown_2);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public boolean setDropDown(By locator, String strDate) {
		try {
			WebElement dropDown = objBaseTest.getDriver().findElement(locator);
			Select selectDropDown = new Select(dropDown);
			selectDropDown.selectByVisibleText(strDate);
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}*/

	public boolean selectDropDownOption(By locator, String strDropDownOption, String strOptionType) {

		try {
			if (strOptionType.equals("Value")) {
				WebElement element = objBaseTest.getDriver().findElement(locator);
				Select dropDown = new Select(element);
				dropDown.selectByValue(strDropDownOption);
			} else if (strOptionType.equals("Text")) {
				WebElement element = objBaseTest.getDriver().findElement(locator);
				Select dropDown = new Select(element);
				dropDown.selectByVisibleText(strDropDownOption);
			}
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

}
