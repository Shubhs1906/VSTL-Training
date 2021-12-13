package com.generic;

import org.openqa.selenium.By;

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

}
