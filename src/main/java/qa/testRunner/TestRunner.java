package qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= "C:\\Users\\HP\\git\\Automation\\Automation\\src\\main\\java\\qa\\feature\\Trade.feature",
    glue = {"qa.stepDefinations"},
    format = {"pretty","html:test-output"},
    //format={"json:target/Destination/cucumber.json","junit:target/Destination/out.xml","pretty"},
    dryRun = false,
    strict = true,
    monochrome = true
    //tags = {"@Test1,@Test2"}
    )

public class TestRunner {

}
