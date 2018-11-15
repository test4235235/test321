package sampleMavenProject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then; 
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/features")  

public class cos {
	@Given("^something new$")
	public void  typeWebpageUrlForGmailHomePage(String url) {
		System.out.println("hfjhkjh");
	} 

}
