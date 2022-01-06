package com.scripts.PBPIntegration;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flows.DashboardFlowByShubham;
import com.flows.LoginLogoutFlowByShubham;
import com.flows.PBPIntegrationFlowByShubham;
import com.flows.PbpIntegrationFlow;
import com.flows.commonFlows.CommonFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPageByShubham;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class CreateNewDatabaseTestByShubham extends BaseTest {
	
	// Global variables
		private CommonFlow objCommonFlow;
		private LoginPageByShubham objLoginPageByShubham;
		private DashboardFlowByShubham objDashboardFlowByShubham;
		private LoginLogoutFlowByShubham objLoginLogoutFlowByShubham;
		private PBPIntegrationFlowByShubham objPBPIntegrationFlowByShubham;
		private String testCaseID = "";
		
		
	// Initialize Flows
		public void initializeFlowsAndPages() {
			objCommonFlow = new CommonFlow(this);
			objPBPIntegrationFlowByShubham = new PBPIntegrationFlowByShubham(this);
			objLoginLogoutFlowByShubham = new LoginLogoutFlowByShubham(this);
			objDashboardFlowByShubham = new DashboardFlowByShubham(this); 
			objLoginPageByShubham = new LoginPageByShubham(this);
			
		}
			
			
			
	@BeforeClass(groups = { "P1", "P2", "P3" })
	public void initializeEnvironment() {
		this.initializeWebEnvironment("excel/PBPShubham");
		this.initializeFlowsAndPages();
		/* Resource Name has to be before login */
		objCommonFlow.setResourceName("Khushbu Borole");
		// objLoginLogoutFlow.doLogin();
	}

	@AfterClass(groups = { "P1", "P2", "P3" })
	public void tearDownEnvironment() {
		this.tearDownWebEnvironment();
		objCommonFlow = null;
		objLoginPageByShubham = null;

	}

	@BeforeMethod(groups = { "P1", "P2", "P3" })
	public void redirect_Me_To_HomePage_On_SH_Application(Method method) {
		testCaseID = method.getName();
		this.startTestExecutionVideoRecording(testCaseID);
		this.getObjWrapperFunctions().waitFor(5);
		System.out.println("Video Recording Started ....!!");
	}

	@AfterMethod
	public void stopVideoRecording() {
		this.stopTestExecutionVideoRecording();
		this.getObjWrapperFunctions().waitFor(5);
		System.out.println("Video Recording Stopped ....!!");
	}
	
	@Title("TCID_05_CreateNewDatabase")
	@Description("Create New Database")
	@Test(priority = 1, groups = { "P1" })
	public void TCID_05_CreateNewDatabase() {
		this.loadTestData("TCID_05_CreateNewDatabase");
		if (!this.getObjUtilities().dpString("runmode").equals("Y")) {
			throw new SkipException("Run Mode 'No'");
		}
		objCommonFlow.openAUT_URL();
		objLoginLogoutFlowByShubham.doLoginWithExcelParameter();
		objDashboardFlowByShubham.selectMenuItemFromLeftSideBar();
		objPBPIntegrationFlowByShubham.verifyHeaderOfPage();
		objPBPIntegrationFlowByShubham.CreateNewDatabaseInPBPIntegration();
	}

}
