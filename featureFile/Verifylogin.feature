Feature: Verifying the login functionality 

Scenario Outline: Verifying the login and logout function
	Given Reading data from proerties file and launching browser and opening application
	When I enter "<userName>" username and "<password>" password
	And I click on login button
	Then I verify the home page
	And I click on logout
	And I close the browser
	
	Examples: 
		| userName 	    | password	   |
		| standard_user | secret_sauce |
		| problem_user  | secret_sauce |