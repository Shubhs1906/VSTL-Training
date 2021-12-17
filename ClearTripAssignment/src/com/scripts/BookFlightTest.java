package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pageFactory.BookFlightPage;

public class BookFlightTest extends BaseTest {

	static WebDriver driver = null;

	private BookFlightPage objBookFlightPage;

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		objBookFlightPage = new BookFlightPage(this);

	}

	@Test
	public void selectCreateNewAccountTest() {

		objBookFlightPage.selectOneWay();

	}

}
