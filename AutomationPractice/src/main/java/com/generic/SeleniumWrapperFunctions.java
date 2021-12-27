package com.generic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
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
	
	public boolean setFluentWait(By locator, long lngTimeOutInSeconds, long lngPollingInSec){
		try {
			Wait<WebDriver> wait =  new FluentWait<>(objBaseTest.getDriver())
					.withTimeout(Duration.ofSeconds(lngTimeOutInSeconds))
			.pollingEvery(Duration.ofSeconds(lngPollingInSec))
			.ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;

		} catch (Exception exception) {
			System.out.println("Expection is :" + exception.getMessage());
			exception.printStackTrace();

			return false;
		}

	}

	public void verifyBrokenLinks() {
		String homePage = "http://automationpractice.com/";
		List<WebElement> links = objBaseTest.getDriver().findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			if (url == null || url.isEmpty()) {
				Reporter.log(url + "  URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(homePage)) {
				Reporter.log(url + " - URL belongs to another domain.");
				continue;
			}

			verifyActiveLink(url);

		}

	}

	public void verifyActiveLink(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				Reporter.log(linkUrl + " - " + httpURLConnect.getResponseMessage());

			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				Reporter.log(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}
