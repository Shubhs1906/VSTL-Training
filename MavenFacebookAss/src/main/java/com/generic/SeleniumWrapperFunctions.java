package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	public boolean selectDropDownOption(By locator, String strDropDownOption, String strOptionType) {

		try {
			if (strOptionType.equalsIgnoreCase("Value")) {
				WebElement element = objBaseTest.getDriver().findElement(locator);
				Select dropDown = new Select(element);
				dropDown.selectByValue(strDropDownOption);
			} else if (strOptionType.equalsIgnoreCase("Text")) {
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

	public boolean dragAndDropOption(By fromlocator, By toLocator) {

		try {
			WebElement from = objBaseTest.getDriver().findElement(fromlocator);
			WebElement to = objBaseTest.getDriver().findElement(toLocator);
			(new Actions(objBaseTest.getDriver())).dragAndDrop(from, to).perform();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean clearWrittenText(By locator, String strInput) {

		try {
			objBaseTest.getDriver().findElement(By.name(strInput)).clear();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean navigateOptions(String strNavigateOption) {

		try {
			if (strNavigateOption.equalsIgnoreCase("back")) {
				objBaseTest.getDriver().navigate().back();
			} else if (strNavigateOption.equalsIgnoreCase("forward")) {
				objBaseTest.getDriver().navigate().forward();
			} else if (strNavigateOption.equalsIgnoreCase("refresh")) {
				objBaseTest.getDriver().navigate().refresh();
			}
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

}
