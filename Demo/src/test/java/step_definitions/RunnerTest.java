package step_definitions;

import java.io.File;
import java.io.IOException;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



/**
 * this is the runner file for running with TestNG.
 * @author vibhav.gupta
 *
 */
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target2/cucumber-html-report",
				   "json:target/cucumber.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		            		
		},
		tags = {"@CCUI"}
		)
public class RunnerTest extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void teardown() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("Output");
        
      
    }
}