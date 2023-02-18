package com.demo.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class VerifyHome_stepDef extends BaseTest_stepDef{

	
	@Then("I verify the home page")
	public void verifyHomePage() {
		verifyHomePage.verfiyLogo();
	}
	
	@And("I click on logout")
	public void logout() {
		verifyHomePage.clickLogout();
	}
}
