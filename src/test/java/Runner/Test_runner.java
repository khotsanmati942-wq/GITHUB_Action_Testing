package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(
            features = {"src/test/resources/Features"},
            glue = {"Step_defination"},
            plugin = {
                    "pretty",
                    "html:target/cucumber-reports.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            },
            dryRun = false
    )
    public class Test_runner extends AbstractTestNGCucumberTests {
    }



