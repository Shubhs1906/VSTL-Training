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

	public void setText(By locator, String strInputValue) {
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		System.out.println("set text : " + strInputValue);
	}

	public void click(By locator) {
		objBaseTest.getDriver().findElement(locator).click();
		System.out.println("click : ");
	}
	
	public void Select (By locator, String strInputDropDown  ) {
		
		WebElement element = objBaseTest.getDriver().findElement(locator);
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(strInputDropDown);
		
	}

}
