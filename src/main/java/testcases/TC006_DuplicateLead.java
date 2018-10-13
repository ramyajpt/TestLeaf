package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.*;

import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead in Leaftaps";
		testNodes="Leads";
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	@Test(dataProvider = "fetchData")
	public void duplicateLead(String uName, String pwd, String mailID) 
	{
		FindLeadsPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickEmailLink()
		.typeMailID(mailID)
		.clickFindLeadsButton();
		
		String firstName = flp.getFirstName();
		
		flp
		.clickFirstRecordID()
		.clickDuplicateButton()
		.clickCreateLeadButton()
		.verifyFirstName(firstName);
		
		
	}
}
