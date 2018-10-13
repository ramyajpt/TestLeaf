/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public static RemoteWebDriver driver;
	
	@Given("Invoke the LeafTaps application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the username")
	public void enterUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("Enter the password")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");	
	}
	@And("Click Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click CRMSFA link")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();	
	}
	@And("Click Create Leads Link")
	public void clickCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter First Name as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);	
	}
	@And("Enter Last Name as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);	
	}
	@And("Enter Company Name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@When("Click Create Lead Button")
	public void clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify lead is created successfully")
	public void verifyCreateLead() {
		System.out.println("Lead created successfully.");
	}
}
*/