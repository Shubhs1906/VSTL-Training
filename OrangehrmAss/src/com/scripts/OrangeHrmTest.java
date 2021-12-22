package com.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;

import com.pageFactory.OrangeHrmPage;

public class OrangeHrmTest extends BaseTest {

	static WebDriver driver = null;

	private OrangeHrmPage objOrangeHrmPage;

	private Utilities objUtilities = new Utilities();

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		objOrangeHrmPage = new OrangeHrmPage(this);
		
	}
	
	@Test(priority = 1)
	public void enterIdPassword() {
		objOrangeHrmPage.enterUsername("Admin");
		objOrangeHrmPage.enterPassword("admin123");

	}
	
	@Test(priority = 2)
	public void selectLoginTest() {
		objOrangeHrmPage.selectLogin();

	}
	
	

}
