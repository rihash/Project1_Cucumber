package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Testing\\Ecilipse\\Cucumber_Project_Pr\\src\\main\\java\\feature\\TestProject.feature",
glue="stepdefinitions",
plugin={"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"} )

public class Runner {

}
