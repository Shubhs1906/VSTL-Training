package com.flows;

import java.util.Hashtable;

import com.generic.BaseTest;
import com.generic.SeleniumWrapperFunctions;
import com.pageFactory.SignInSignOutPage;

public class SignInSignOutFlow {

	private BaseTest objBaseTest;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private SignInSignOutPage objSignInSignOutPage;
	public Hashtable<String, String> objHashtable;
	private String strGetIdPass;

	public SignInSignOutFlow(BaseTest baseTest) {
		this.objBaseTest = baseTest;
		objSignInSignOutPage = new SignInSignOutPage(objBaseTest);
		objHashtable = new Hashtable<String, String>();
		this.createValidUserCredential();
	}

	public Hashtable<String, String> createValidUserCredential() {
		objHashtable.put("EmailId", "mshubham1906@gmail.com");
		objHashtable.put("Password", "Admin@123");
		return objHashtable;
	}

	public void doSignIn() {

		objSignInSignOutPage.clickSignInButtonOnHomePage();

		strGetIdPass = objHashtable.get("EmailId");
		if (!strGetIdPass.equals(""))
			objSignInSignOutPage.enterUsername(strGetIdPass);

		strGetIdPass = objHashtable.get("Password");
		if (!strGetIdPass.equals(""))
			objSignInSignOutPage.enterPassword(strGetIdPass);

		objSignInSignOutPage.clickSignInButtonOnAuthenticationPage();
		
	}

}
