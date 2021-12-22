package com.herokuapp.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.herokuapp.pageFactory.ActionEventPage;

public class ActionEventTest extends BaseTest {

	static WebDriver driver = null;
	private ActionEventPage objActionEventPage;
	private String strRandomDropDown;


	private Utilities objUtilities = new Utilities();
	String strFirstName = objUtilities.getFirstName(6);
	String strDropDown = objUtilities.getDropDown(strRandomDropDown);

	@BeforeClass
	public void beforeMainMethod() {

		this.itializeWebEnvironment();
		objActionEventPage = new ActionEventPage(this);

	}

	@AfterClass
	public void afterMethod() {
		// this.tearDown();

	}

	@Test
	public void dragAndDropObjectTest() {
		objActionEventPage.dragAndDropObject();

	}

	@Test
	public void clearWrittenTextTest() {
		objActionEventPage.clearWrittenText(strFirstName);
	}

	@Test
	public void navigateRefreshTest() {
		objActionEventPage.navigateOptions("refresh");
	}

	@Test
	public void navigateBackTest() {
		objActionEventPage.navigateOptions("back");
	}

	@Test
	public void navigateForwardTest() {
		objActionEventPage.navigateOptions("Forward");
	}

	@Test
	public void selectDDBoxTest() {
		objActionEventPage.selectDDBox("Option 1", "text");
	}

}
