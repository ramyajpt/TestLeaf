package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.*;

import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead in Leaftaps";
		testNodes="Leads";
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd, String fName) 
	{
		 FindLeadsPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickMergeLeadsLink()
		.clickFromImage()
		.typeFirstName(fName)
		.clickFindLeadsButton();
		
		 String fromRecordID = flp.getFirstID();
		 
		  flp.clickFirstRecordIDForMerge()
			  .clickToImage()
			  .typeFirstName(fName)
			  .clickFindLeadsButton()
		      .clickSecondRecordIDForMerge()
		 	  .clickMergeButton()
		 	  .clickFindLeadsLink()//THis duplicate code is available in MyLeads & ViewLeads Page
		 	  .typeLeadID(fromRecordID)
		 	  .clickFindLeadsButton()
		 	  .checkPagingInfo("No records to display");		
	}
}
