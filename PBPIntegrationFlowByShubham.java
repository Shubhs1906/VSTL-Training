package com.flows;


import com.generic.Pojo;
import com.pageFactory.PBPIntegrationPageByShubham;
import com.popupFactory.AddPBPDatabaseNamePopupPageByShubham;

public class PBPIntegrationFlowByShubham {

	// Global variables
	
	private PBPIntegrationPageByShubham objPBPIntegrationPageByShubham;
	private AddPBPDatabaseNamePopupPageByShubham objAddPBPDatabasePopupPageByShubham;
	private String strDatabaseName;
	
	// Reference object of Pages
	
	private Pojo objPojo;
	private String testData = "";// ,testData_1="", testData_2 = "";

	// Constructor of class
		public PBPIntegrationFlowByShubham(Pojo pojo) {
			this.objPojo = pojo;
			objPBPIntegrationPageByShubham = new PBPIntegrationPageByShubham(objPojo);
			objAddPBPDatabasePopupPageByShubham = new AddPBPDatabaseNamePopupPageByShubham(objPojo);
		}

		
		
	public void verifyHeaderOfPage(){
		objPBPIntegrationPageByShubham.verifyHeaderOfPage();
	}
	
	public void CreateNewDatabaseInPBPIntegration() {
		testData = objPojo.getObjUtilities().dpString("PBPIntegrationGrid");
		if (!testData.equals("")) {
			objPBPIntegrationPageByShubham.clickGridMenuOnPbpIntegrationPage(testData);
		}
		objAddPBPDatabasePopupPageByShubham.verifyAddPBPDatabaseNamePopupHeaderIsDisplayed();
		testData = objPojo.getObjUtilities().dpString("textBoxPBPName");
		if (!testData.equals("")) {
			strDatabaseName = objAddPBPDatabasePopupPageByShubham.enterNameOnAddpbpDatabasePopup(testData);
		}
		testData = objPojo.getObjUtilities().dpString("textBoxPBPDescription");
		if (!testData.equals("")) {
			objAddPBPDatabasePopupPageByShubham.enterDescriptionOnAddpbpDatabasePopup(testData);
		}
		objAddPBPDatabasePopupPageByShubham.clickSaveButtonOnAddPbpDatabasePopup();
		objAddPBPDatabasePopupPageByShubham.verifymessageDisplayedOnMessagePopup();
		objAddPBPDatabasePopupPageByShubham.clickCloseButton();
	}

}
