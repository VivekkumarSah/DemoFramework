package com.demo.stepdefinition;

import com.demo.pages.VerifyHome_Page;
import com.demo.pages.VerifyLogin_Page;
import com.demo.utilities.WebDriverConfigFunctions;

public class BaseTest_stepDef {
	
	
	protected WebDriverConfigFunctions webDriverConfig= new WebDriverConfigFunctions();
	protected VerifyHome_Page verifyHomePage =new VerifyHome_Page();
	protected VerifyLogin_Page verifyLoginPage = new VerifyLogin_Page();


}
