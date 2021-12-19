package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {

	private BaseTest objBaseTest;

	public SeleniumWrapperFunctions(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	public void setText(By locator, String strInputValue) {
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		System.out.println("set text : " + strInputValue);
	}

	public void click(By locator) {
		objBaseTest.getDriver().findElement(locator).click();
		System.out.println("click : ");
	}

	public void selectByIndex(By locator, int intInputDropDown) {

		WebElement element = objBaseTest.getDriver().findElement(locator);
		Select dropDown = new Select(element);
		dropDown.selectByIndex(intInputDropDown);

	}

	public void selectByVisibleText(By locator, String strInputDropDown_1) {

		WebElement element = objBaseTest.getDriver().findElement(locator);
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(strInputDropDown_1);

	}

	public void selectByValue(By locator, String strInputDropDown_2) {

		WebElement element = objBaseTest.getDriver().findElement(locator);
		Select dropDown = new Select(element);
		dropDown.selectByValue(strInputDropDown_2);
	}

	// div[@class='DayPicker-wrapper']
	// button[@class='flex flex-middle flex-between t-all fs-2
	// focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3
	// pt-2 pb-2 ba br-4 h-8 c-neutral-900']

	public void dateSelecter() {

		// h4[contains(text(),'Children')]/preceding::select[@class='bc-neutral-100
		// bg-transparent']

	}

}
