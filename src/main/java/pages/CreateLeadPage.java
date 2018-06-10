package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;
	@FindBy(how= How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;
	@FindBy(how= How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;
	@FindBy(how= How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement eleMobileNumber;
	@FindBy(how= How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleMailID;
	@FindBy(how= How.NAME, using = "submitButton")
	private WebElement eleCreateLeadButton;
	@And("Enter Company Name as (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}
	@And("Enter First Name as (.*)")
	public CreateLeadPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	@And("Enter Last Name as (.*)")
	public CreateLeadPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	public CreateLeadPage typeMobileNumber(String data) {
		type(eleMobileNumber, data);
		return this;
	}
	
	public CreateLeadPage typeMailID(String data) {
		type(eleMailID, data);
		return this;
	}
	@When("Click Create Lead Button")
	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}

}
