package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	public String browserName;
	
	@Before
	public void beforeScenario(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		category="Smoke";
		authors="Ramya";
		browserName="chrome";
		test = startTestCase(sc.getName());
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp(browserName);		
		
		//getID() returns the line No of the scenario keyword.
		//If Scenario outline is used, getID() returns the line no of the data input
	}
	@After
	public void afterScenario(Scenario sc) {
		closeAllBrowsers();
		endResult();
	}

}
