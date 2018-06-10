package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']/div[1]/div/input")
	private WebElement eleLeadID;
	
	public FindLeadsPage typeLeadID(String data) {
		type(eleLeadID, data);	
		return this;
	}
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']/div[2]/div/input")
	private WebElement eleFirstName;
	
	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']/div[3]/div/input")
	private WebElement eleLastName;
	
	public FindLeadsPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	public FindLeadsPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;	
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstRecordID;
	
	public ViewLeadPage clickFirstRecordID() {
		clickWithNoSnap(eleFirstRecordID);
		return new ViewLeadPage();
	}
	public MergeLeadPage clickFirstRecordIDForMerge() {
		clickWithNoSnap(eleFirstRecordID);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	public String getFirstID() {
		return getText(eleFirstRecordID);
	}
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")
	private WebElement eleSecondRecordID;
	
	public MergeLeadPage clickSecondRecordIDForMerge() {
		clickWithNoSnap(eleSecondRecordID);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	/*public String getSecondID() {
		return getText(eleSecondRecordID);
	}*/
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
	public WebElement eleFirstRecordFirstName;
	public String getFirstName() {
		return getText(eleFirstRecordFirstName);
	}
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement elePhoneLink;
	public FindLeadsPage clickPhoneLink() {
		click(elePhoneLink);
		return this;
	}
	//@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']")
	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement elePhoneNumber;
	
	public FindLeadsPage typePhoneNumber(String data) {
		type(elePhoneNumber, data);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//span[text()='Email']")
	private WebElement eleEmailLink;
	public FindLeadsPage clickEmailLink() {
		click(eleEmailLink);
		return this;
	}
	
	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement eleMailID;
	public FindLeadsPage typeMailID(String data) {
		type(eleMailID, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-paging-info']")
	private WebElement elePagingInfo;
	public FindLeadsPage checkPagingInfo(String data) {
		verifyPartialText(elePagingInfo, data);
		return this;
	}
}
