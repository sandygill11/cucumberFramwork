package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/featurefiles/MyTest.feature" }, glue = { "stepdefinations",
		"hooks" }, dryRun = false, plugin = { "pretty", "html:target/cucumberhtmlreport.html" }

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
