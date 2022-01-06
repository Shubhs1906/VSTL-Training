package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;
import com.popupFactory.AddFolderPopupPage;

public class PBPIntegrationPageByShubham {
	// Global Variables
		private Pojo objPojo;
		private String strReturnVal = "";
		
		By loc_hdrofEachPage = By.xpath("//span[@class='logo-mini']//child::img[@src='/Content/css/custom-theme/images/eMedicareSync-logo.png' and @title='eMedicareSync']//following::h1");
		
		
		public PBPIntegrationPageByShubham(Pojo pojo) {
			this.objPojo = pojo;
		
			
		}

		
		public String getHeaderOfPage() {
			strReturnVal = objPojo.getObjWrapperFunctions().getText(loc_hdrofEachPage, "Text");
			objPojo.getObjUtilities().logReporter("Get header of current page", 
					"User should get the header text '"+strReturnVal+"'", 
					"User is able to get the header text '"+strReturnVal+"'", !strReturnVal.equals(""));
			return strReturnVal;
		}
		public void verifyHeaderOfPage() {
			strReturnVal = this.getHeaderOfPage();
			System.out.println("Get Return Value:"+strReturnVal);
			By locator = By.xpath("//h1[text()='"+strReturnVal+"']");
			strReturnVal = objPojo.getObjWrapperFunctions().getText(locator, "Text");
			objPojo.getObjUtilities().logReporter("Verify page header '"+strReturnVal+"' is displayed",
					"User should able to see header '"+strReturnVal+"' of page",
					"User is able to see header '"+strReturnVal+"' of page", 
					objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
		}
		
		public void clickGridMenuOnPbpIntegrationPage(String gridName) {
			By locator = By.xpath("//a[text()='Manage PBP Database']//ancestor::ul//following::div//table//td[@id='pPBPDatabasegrid_left']//td[@title='"+gridName+"']");
			objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
			objPojo.getObjUtilities().logReporter("Verify user can click on grid name",
					"User should be able to click on grid name '"+gridName+"'",
					"User is able to click on grid name '"+gridName+"'",
					objPojo.getObjWrapperFunctions().click(locator));
		}
}
