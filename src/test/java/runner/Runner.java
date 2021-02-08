package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	//test defination class : - to run the feature file
@CucumberOptions(
		
		plugin= {"html:target/cucumber_test_report"},  //to generate report in cucumber
		
		features = {"Features"},	//retreive the features files under the Features folder
		
		glue = {"stepDefinationFiles"},  //retrieve the stepDefinationFiles under the stepDefinatioFiles Package
		
								//Custom Tags
		
		//tags = {"SmokeTest"},	//to run a perticular scenario
		
		//tags = {"@All"}	//to run all the scnarios under @All tag
		
		//tags = {"Books"}	//only the Books Scenario will run
			
		tags= {"@ninja"}
		)	
public class Runner {

}
