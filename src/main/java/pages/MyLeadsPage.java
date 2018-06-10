package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLeadLink;
	@And("Click Create Leads Link")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLeadLink);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Find Leads")
	public static WebElement eleFindLeadsLink;
	
	public FindLeadsPage clickFindLeadsLink() {
		click(eleFindLeadsLink);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLeadsLink;
	
	public MergeLeadPage clickMergeLeadsLink() {
		click(eleMergeLeadsLink);
		return new MergeLeadPage();
	}

}
