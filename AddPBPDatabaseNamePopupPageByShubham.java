package com.popupFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class AddPBPDatabaseNamePopupPageByShubham {
	
	// Global variables
	private Pojo objPojo;
	private String strReturnVal = "";
	
	// Constructor of class
	public AddPBPDatabaseNamePopupPageByShubham(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	//Headers
		By loc_hdrAddPBPDatabaseName=By.xpath("//span[text()='Add PBP Database Name']");
		By loc_messageBox= By.xpath("//div[@id='messagedialog']//div//p");
		
		//Input
		By loc_inpName = By.xpath("//b[contains(text(),'PBP Database Name:')]//ancestor::div//div//input[@id='pbpDBName']");
		

		//Text box
		By loc_txtDescription = By.xpath("//b[contains(text(),'PBP Database Name:')]//ancestor::div//div//textarea[@id='pbpDBDescription']");

		//Button
		By loc_btnAddPBPDatabaseSave = By.xpath("//span[text()='Add PBP Database Name']//parent::div//following::div//button[text()='Save']");

		
	
	public void verifyAddPBPDatabaseNamePopupHeaderIsDisplayed(){
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdrAddPBPDatabaseName);
		objPojo.getObjUtilities().logReporter("Verify Add PBP Database Name popup header is displayed.", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_hdrAddPBPDatabaseName));
	}

	public String enterNameOnAddpbpDatabasePopup(String strName){
		strName=strName+objPojo.getObjWrapperFunctions().getRandomStrings(4);
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_inpName);
		objPojo.getObjWrapperFunctions().setText(loc_inpName, " ");
		objPojo.getObjWrapperFunctions().setText(loc_inpName, strName);
		objPojo.getObjUtilities().logReporter("Enter '"+strName+"' as PBP Database Name", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_inpName));
		return strName;
	}
	
	public String enterDescriptionOnAddpbpDatabasePopup(String strDescription){
		strDescription=strDescription+objPojo.getObjWrapperFunctions().getRandomStrings(4);
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_txtDescription);
		objPojo.getObjWrapperFunctions().setText(loc_txtDescription, " ");
		objPojo.getObjWrapperFunctions().setText(loc_txtDescription, strDescription);
		objPojo.getObjUtilities().logReporter("Enter '"+strDescription+"' as PBP Database description", objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_txtDescription));
		return strDescription;
	}

	public void clickSaveButtonOnAddPbpDatabasePopup(){
		objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_btnAddPBPDatabaseSave);
		objPojo.getObjUtilities().logReporter("Click on save button", 
				objPojo.getObjWrapperFunctions().checkElementDisplayed(loc_btnAddPBPDatabaseSave));
		objPojo.getObjWrapperFunctions().click(loc_btnAddPBPDatabaseSave);
	}

	public String getMessagedisplayedonPopup(){
		
		strReturnVal = objPojo.getObjWrapperFunctions().getText(loc_messageBox, "Text");
		objPojo.getObjUtilities().logReporter("Get message displayed on message popup", 
				"User should get the message text as '"+strReturnVal+"'",
				"User is able to get the message text as '"+strReturnVal+"'", !strReturnVal.equals(""));
		
		return strReturnVal;
	}

	public void verifymessageDisplayedOnMessagePopup(){
		strReturnVal=this.getMessagedisplayedonPopup();
		By locator = By.xpath("//p[text()='"+strReturnVal+"']");
		strReturnVal = objPojo.getObjWrapperFunctions().getText(locator, "Text");
		objPojo.getObjUtilities().logReporter("Verify message '"+strReturnVal+"' is displayed",
				"User should able to see message '"+strReturnVal+"' on popup",
				"User is able to see message '"+strReturnVal+"' on popup", 
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
	}

	public void clickCloseButton(){
		strReturnVal=this.getMessagedisplayedonPopup();
		By locator = By.xpath("(//p[text()='"+strReturnVal+"']//ancestor::div//following::div//button[text()='Close'])[1]");
		objPojo.getObjWrapperFunctions().checkElementDisplayed(locator);
		objPojo.getObjUtilities().logReporter("Click on Close button", 
				objPojo.getObjWrapperFunctions().checkElementDisplayed(locator));
		objPojo.getObjWrapperFunctions().click(locator);
	}

}
