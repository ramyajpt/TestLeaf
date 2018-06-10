package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/features/CreateLead.feature", 
					glue = {"steps", "pages"}, monochrome = true /*, tags = {"@sanity or @smoke"}*/)
@RunWith(Cucumber.class)
public class RunTest {

}
