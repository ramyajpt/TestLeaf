package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead in Leaftaps";
		testNodes="Leads";
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	@Test(dataProvider = "fetchData")
	public void editLead(String uName, String pwd, String lName, String cName) 
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.typeLastName(lName)
		.clickFindLeadsButton()
		.clickFirstRecordID()
		.clickEditButton()
		.updateCompanyName(cName)
		.clickUpdateButton()
		.verifyCompanyName(cName);
	}
}
