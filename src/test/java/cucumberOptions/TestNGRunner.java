package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",dryRun=true, glue="stepDefinitions",
monochrome=true, tags="@Mortgage or @NetBanking" , plugin= {"pretty","html:target/cucumber.html",
		"json:target/cucumberjson.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
