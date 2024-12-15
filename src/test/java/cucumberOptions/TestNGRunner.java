package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions",
monochrome=true, tags="@Mortgage or @NetBanking")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
