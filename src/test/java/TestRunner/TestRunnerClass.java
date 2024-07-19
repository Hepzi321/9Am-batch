package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Feature\\Data.feature",
		glue="Steps",
		publish=true,
		plugin= { "pretty", "html:target/output", "json:target/output.json"},
		
		monochrome=true,
		dryRun=false
		
	
		 
		
		
		
		)




public class TestRunnerClass {
	

}
