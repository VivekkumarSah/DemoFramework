package com.demo.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerfiyLogin_stepDef extends BaseTest_stepDef {

	
	@When("^I enter \"(.*)\" username and \"(.*)\" password$")
	public void I_enter_userName_passwrod(String userName,String passwrod) throws InterruptedException {
		verifyLoginPage.setUserName(userName);
		verifyLoginPage.setPassword(passwrod);
	}

	@Then("^I click on login button$")
	public void clickLoginButtion() {
		verifyLoginPage.clickLogin();
	}
}
