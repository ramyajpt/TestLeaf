package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, MyHomePage.class);
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Leads")
	private WebElement eleLeadsLink;
	
	public MyLeadsPage clickLeadsLink()
	{
		click(eleLeadsLink);
		return new MyLeadsPage();
	}
}
