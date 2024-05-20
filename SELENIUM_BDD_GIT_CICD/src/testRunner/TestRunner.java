package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue= {"stepDefination"},
		plugin= {"pretty","html:target/cucumber-reports"},
		dryRun = false,
		
		monochrome=true    //basically use for the display output in better way
		
		
		)

public class TestRunner {

}
