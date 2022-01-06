package com.flows;

import com.generic.Pojo;

import com.pageFactory.DashboardPageByShubham;

public class DashboardFlowByShubham {

	// Global Variable
	private Pojo objPojo;
	private String testData = "";
	// Reference object of Pages
	private DashboardPageByShubham objDashboardPageByShubham;

	// Constructor of class
	public DashboardFlowByShubham(Pojo pojo) {
		this.objPojo = pojo;
		objDashboardPageByShubham = new DashboardPageByShubham(objPojo);

	}

	public void selectMenuItemFromLeftSideBar() {
		testData = objPojo.getObjUtilities().dpString("SelectMenuItem");
		if (!testData.equals("")) {
			if (objDashboardPageByShubham.isMenuItemIconIsDisplayedOnDashboardPage())
				objDashboardPageByShubham.clickMenuItemIconOnDashboardPage();
			objDashboardPageByShubham.clickOnMenuItemFromLeftSideBarMenu(testData);

		}

	}
}
