package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="login.feature",
		glue={"stepDefinitions"},
		dryRun=true
		)
public class demoRunner {

}
