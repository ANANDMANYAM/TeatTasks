package RunnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  

@CucumberOptions(
		
		features= "C:\\Infocampus\\examples\\TestDemo\\src\\main\\java\\DocumentationFeatures",
		
		glue= {"StepDefinitions"},
		
		format = {"pretty","html:test_output"},
		
		dryRun = false
		
		)


public class Runner {
	
	

}
