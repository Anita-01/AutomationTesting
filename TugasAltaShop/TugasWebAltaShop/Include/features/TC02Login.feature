Feature: Login
	@validlogin
Scenario: As a user i want login to AltaShop
	Given User open link webAltaShop
	When User Fill LoginForm
	Then User enter email and password
	And Click on login button 
	Then User is navigated to dashboard page
	
	@invalidlogin
Scenario Outline: As a user i want try login with invalid data to AltaShop
	Given User open link webAltaShop
	When User Fill LoginForm
	Then User enter <Email> and <Password> in Login Page
	And Click on login button 
	Then I have notification danger
	
	Examples: 
	|Email								  						| Password								|
	|anita1237kik@gmail.com							| AnitaLasmariaSiagian 		|
	|anitasiagian11@gmail.com						| AnitaLasmariaSiagian123 |
	|anitasiagian11@gmail.com						|                         |
	|anitasiagianletmesoul@gmail.com		|                         |
	|anitasiagianletmesoul@gmail.com		|           							|
	|       														|AnitaLasmariaSiagian123  |
	|       														|												  |