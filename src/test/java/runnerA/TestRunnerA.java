package runnerA;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/kaziarahman/nopcommerce/src/test/java/featuresFileA/register.feature"
        ,glue={"stepsA"}
        ,monochrome = true //display the console output in readable format
        ,dryRun = true      // checking if mapping is in place
        //, tags = "~@sanityTest"
        // , tags = "~@SmokeTest"

        , plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.html" }
        // , plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" }

)

public class TestRunnerA {
}
