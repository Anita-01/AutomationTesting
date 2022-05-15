Feature: ViewCategory
Scenario: As a user i want to see product in AltaShop
		
		Given I am Login to AltaShop Website
		When I am in DashboardPage
		Then I click the SearchMenu
		And I Search Kesehatan
		Then I see the list item of Kesehatan
		And I Search Tensi Darah Elektrik
		And I see the list item of Tensi Darah Elektrik
		Then I close the browser