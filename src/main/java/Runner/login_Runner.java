package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_WorkSpace\\BDD\\src\\main\\java\\feature\\deals.feature"},//the path of feature folder or feature class
		glue = {"stepDefination"},//path of step defination file
		plugin = {"pretty","html:test-output"},
		//plugin = {"json:json_output/cucumber.json" ,"junit:junit_xml/cucumber.xml" }
		monochrome = true,//display console output in proper readable format
		strict = true,//it will check if any steps not define in step defination file fail execution
		dryRun = false
		//to check maping is proper bwn feature file and step def file
		)
public class login_Runner {
	
}
