package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".\\src\\test\\resources\\Features\\fbLoginwithMultipleTestdata.feature",
		glue = "stepdefinitions",
		//tags = "@tag2",
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
public class RunTestNGTest extends AbstractTestNGCucumberTests{

}
