Feature: Register Action
Scenario: Register into Gost
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Registration Details
	Then Message displayed Register Successfully
Scenario: Successful LogOut
	When User LogOut from the Application
	Then User Navigate to LogIn Page