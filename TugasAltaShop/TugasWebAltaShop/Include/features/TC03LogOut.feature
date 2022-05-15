Feature:LogOut
Scenario: As a user i want logout to AltaShop

	Given User open link webAltaShop
	When User Fill LoginForm
	And User enter email and password
	And Click on login button 
	Then User LogOut from webAltaShop