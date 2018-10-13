package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.*;

import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete Lead in Leaftaps";
		testNodes="Leads";
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider = "fetchData")
	public void deleteLead(String uName, String pwd, String mobileNumber) 
	{
		FindLeadsPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneLink()
		.typePhoneNumber(mobileNumber)
		.clickFindLeadsButton();
		
		String firstID = flp.getFirstID();
		
		flp
		.clickFirstRecordID()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.typeLeadID(firstID)
		.clickFindLeadsButton()
		.checkPagingInfo("No records to display");
		
	}
}
