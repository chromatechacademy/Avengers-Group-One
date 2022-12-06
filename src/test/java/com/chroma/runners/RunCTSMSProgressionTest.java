package com.chroma.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  }, 
		features = "src/test/java/com/chroma/features", 
		glue = "com.chroma.stepDefinitions", 
<<<<<<< HEAD
		tags = "@Progression",
		dryRun =  false, 
=======
		tags = "@Progression", 
		dryRun =  false,
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
		monochrome = true, 
		strict = true
) 



public class RunCTSMSProgressionTest {

}
