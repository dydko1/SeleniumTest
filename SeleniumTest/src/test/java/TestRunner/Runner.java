package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"} ,features = "src/test/java/Feature", glue = "StepDefinition", tags = "@SignUpFeature")
@CucumberOptions(features = "src/test/java/Feature", glue = "StepDefinition", tags = "@SignUpFeature")
public class Runner {

}