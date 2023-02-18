package com.demo.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "featureFile/Verifylogin.feature",
		glue = {"com.demo.stepdefinition"},
		plugin = {"pretty","html:target/HtmlReports"},
		monochrome = true
)
public class TestRunner {

}
