package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead in Leaftaps";
		testNodes="Leads";
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd, String cName, String fName, String lName, String mobileNumber, String mailID) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeMobileNumber(mobileNumber)
		.typeMailID(mailID)
		.clickCreateLeadButton()
		.verifyFirstName(fName);
	}

}
