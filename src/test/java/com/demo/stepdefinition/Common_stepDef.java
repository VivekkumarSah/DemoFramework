package com.demo.stepdefinition;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Common_stepDef extends BaseTest_stepDef {

	
	@Given("Reading data from proerties file and launching browser and opening application")
	public void launching_browser_and_open_application() {
		webDriverConfig.launchBrowserAndApplication();
	}
	
	@And("I close the browser")
	public void I_close_browser() {
		webDriverConfig.tearDownMain();;
	}
}
