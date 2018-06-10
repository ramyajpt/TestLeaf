package pages;

import pages.MyLeadsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using = "viewLead_firstName_sp")
	private WebElement eleViewFirstName;
	@Then("Verify lead is created successfully with first name as (.*)")
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleViewFirstName, data);
		return this;
	}
	@FindBy(how=How.ID, using = "viewLead_companyName_sp")
	private WebElement eleCompanyName;
	
	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Edit']")
	private WebElement eleEditButton;
	
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(how = How.XPATH, using = "//a[text()='Delete']")
	private WebElement eleDeleteButton;
	
	public MyLeadsPage clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	@FindBy(how = How.XPATH, using = "//a[text()='Duplicate Lead']")
	private WebElement eleDuplicateButton;
	
	public DuplicateLeadPage clickDuplicateButton() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
		
	public FindLeadsPage clickFindLeadsLink() {
		click(MyLeadsPage.eleFindLeadsLink);
		return new FindLeadsPage();
	}
}
