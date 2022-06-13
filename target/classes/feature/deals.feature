Feature: Free CRM Create Contact
  
  Scenario: Free CRM Create a new contact scenarios
    Given User is present on Login Page
    When title of login page is "CRMPRO - CRM software for customer relationship management, sales, and support."
    Then user enter username and password
    | binalpatel | 9@9RJFprTypdbyN |
    Then user click on login button
		Then user is on Home Page "CRMPRO"
		Then user moves to a new deal page
		Then user enter deal detail
		| test deal | 1000 | 50 | 10 |
		And quite Browser   