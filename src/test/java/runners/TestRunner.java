package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/featurefiles/MyTest.feature" }, glue = {
		"stepdefinations" }, plugin = { "pretty", "html:target/cucumberhtmlreport.html" }

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
