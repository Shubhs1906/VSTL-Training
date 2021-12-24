package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public boolean clickOption(By locator) {

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
			new Actions(objBaseTest.getDriver()).dragAndDrop(from, to).perform();
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

	public boolean verifyDisplayedObject(By locator) {

		try {
			objBaseTest.getDriver().findElement(locator).isDisplayed();
			return true;
		} catch (Exception exception) {
			System.out.println("I got exception : " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}

	public boolean verifySelectedObject(By locator) {
		try {
			objBaseTest.getDriver().findElement(locator).isSelected();
			return true;
		} catch (Exception exception) {
			System.out.println("Expection is :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public boolean moveToObject(By locator) {
		try {
			WebElement element = objBaseTest.getDriver().findElement(locator);
			Actions action = new Actions(objBaseTest.getDriver());
			action.moveToElement(element).perform();
			return true;

		} catch (Exception exception) {
			System.out.println("Expection is :" + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	public boolean setImplicitWait(int intWaitTime) {

		try {
			objBaseTest.getDriver().manage().timeouts().implicitlyWait(intWaitTime, TimeUnit.SECONDS);
			return true;
		} catch (Exception exception) {
			System.out.println("Expection is :" + exception.getMessage());
			exception.printStackTrace();

			return false;
		}

	}

	public boolean setExplicitWait(By locator, long lngTimeOutInSeconds) {

		try {
			WebDriverWait wait = new WebDriverWait(objBaseTest.getDriver(), lngTimeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;

		} catch (Exception exception) {
			System.out.println("Expection is :" + exception.getMessage());
			exception.printStackTrace();

			return false;
		}

	}

	/*
	 * public static WebElement setExplicitlyWait(By locator) {
	 * objBaseTest.getDriver(); { WebElement webElement; try { webElement = new
	 * WebDriverWait(objBaseTest.getDriver(), 20)
	 * .until(ExpectedConditions.visibilityOfElementLocated(locator)); } catch
	 * (Exception e) {
	 * System.out.println("Element has not been visible, searched by element" +
	 * e); return null; } return webElement; } }
	 * 
	 * public boolean fluentWait(By locator) {
	 * 
	 * try { Wait<WebDriver> objWait = new
	 * FluentWait<WebDriver>(objBaseTest.getDriver())
	 * .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
	 * .withMessage("Your desired element is not found").ignoring(
	 * NoSuchElementException.class);
	 * objWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	 * return true;
	 * 
	 * } catch (Exception exception) { System.out.println("I got exception : " +
	 * exception.getMessage()); return false; } }
	 */

}
