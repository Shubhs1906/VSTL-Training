package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;

public class SummerDressesPage {

	private BaseTest objBaseTest;

	public SummerDressesPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	// Locators
	By loc_hdrSummerDresses = By.xpath("//span[contains(text(),'Summer Dresses')][@class='category-name']");
	By loc_imgPrintedChiffonDress = By.xpath("//img[@title='Printed Chiffon Dress']");
	By loc_btnAddToCart = By
			.xpath("//img[@title='Printed Chiffon Dress']/following::span[contains(text(),'Add to cart')]");
	By loc_btnContinueShopping = By.xpath("//img[@title='Printed Chiffon Dress']/following::span[@title='Continue shopping']");
	By loc_btnMyCart = By.xpath("//a[@title='View my shopping cart']");
	By loc_imgPrintedChiffonDressMyCart = By.xpath("//img[@alt='Printed Chiffon Dress']/preceding::dd[@class='first_item']");
	
	
	

	public void verifySummerDressesPageIsDisplayed() {

		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitWait(5);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyDisplayedObject(loc_hdrSummerDresses));
		Reporter.log("Verify Summer Dresses page is displayed.", true);
	}

	public void moveToPrintedChiffonDressOnSummerDressesPage() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().moveToObject(loc_imgPrintedChiffonDress));
		Reporter.log("Mouse over to Printed Chiffon Dress.", true);
	}

	public void clickOnAddToCartPrintedChiffonDressOnSummerDressesPage() {

		// Fluent Wait

		objBaseTest.getObjSeleniumWrapperFunctions().setFluentWait(loc_btnAddToCart, 10, 2);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnAddToCart));
		Reporter.log("click on add To cart.", true);

	}
	
	public void clickOnContinueShoppingOnPopUpMenu() {

		// Explicit Wait

		objBaseTest.getObjSeleniumWrapperFunctions().setExplicitWait(loc_btnContinueShopping, 5);
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnContinueShopping));
		Reporter.log("Click On Continue shopping.", true);

	}
	
	
	public void clickOnMyCartOnSummerDressesPage() {

		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().clickOption(loc_btnMyCart));
		Reporter.log("Click On My Cart.", true);
	}
	
	public void verifyProductAddedToCart() {

		
		Assert.assertTrue(objBaseTest.getObjSeleniumWrapperFunctions().verifyDisplayedObject(loc_imgPrintedChiffonDressMyCart));
		Reporter.log("Verify product is added to cart.", true);
	}
public void getAllLinksOnSummerDressesPage() {
		
		
		
		objBaseTest.getObjSeleniumWrapperFunctions().setImplicitWait(5);
		List<WebElement> allLinkList = objBaseTest.getDriver().findElements(By.tagName("a"));
		System.out.println("Link list size: " + allLinkList.size());
		for (WebElement webElement : allLinkList) {
			Reporter.log("All links : " + webElement.getText(), true);
		}

	}

	public void verifyAllLinksOnSummerDressesPage() {

		objBaseTest.getObjSeleniumWrapperFunctions().verifyBrokenLinks();

	}
	

}
