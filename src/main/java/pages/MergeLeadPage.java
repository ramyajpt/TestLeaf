package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromImage;	
	public FindLeadsPage clickFromImage() {
		click(eleFromImage);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToImage;	
	public FindLeadsPage clickToImage() {
		click(eleToImage);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement eleMergeButton;
	public ViewLeadPage clickMergeButton() {
		clickWithNoSnap(eleMergeButton);
		acceptAlert();
		return new ViewLeadPage();
	}
	
}
