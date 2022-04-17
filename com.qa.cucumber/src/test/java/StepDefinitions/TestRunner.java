package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/htmlReports/htmlReport",
"json:target/JsonReports/JsonReport.json",
"junit:target/xmlReports/xmlReport.xml"}
			)
public class TestRunner {

}
