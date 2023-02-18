$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:featureFile/Verifylogin.feature");
formatter.feature({
  "name": "Verifying the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the login and logout function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Reading data from proerties file and launching browser and opening application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003cuserName\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "When "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on logout",
  "keyword": "And "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the login and logout function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Reading data from proerties file and launching browser and opening application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demo.stepdefinition.Common_stepDef.launching_browser_and_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"standard_user\" username and \"secret_sauce\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerfiyLogin_stepDef.I_enter_userName_passwrod(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerfiyLogin_stepDef.clickLoginButtion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerifyHome_stepDef.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerifyHome_stepDef.logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.Common_stepDef.I_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the login and logout function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Reading data from proerties file and launching browser and opening application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demo.stepdefinition.Common_stepDef.launching_browser_and_open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"problem_user\" username and \"secret_sauce\" password",
  "keyword": "When "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerfiyLogin_stepDef.I_enter_userName_passwrod(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerfiyLogin_stepDef.clickLoginButtion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerifyHome_stepDef.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.VerifyHome_stepDef.logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.demo.stepdefinition.Common_stepDef.I_close_browser()"
});
formatter.result({
  "status": "passed"
});
});