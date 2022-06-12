

Feature: Free CRM Create Contact
  
  Scenario Outline: Free CRM Create a new contact scenarios
    Given User is present on Login Page
    When title of login page is "CRMPRO - CRM software for customer relationship management, sales, and support."
    Then user enter "<username>" and "<password>"
    Then user click on login button
		Then user is on Home Page "CRMPRO"
		Then user moves to a new contact page
		Then user enter "<firstname>","<lastname>" and "<position>"
		And quite Browser
    
    Examples: 
      | username  | password | firstname  | lastname  | position |
      | binalpatel | 9@9RJFprTypdbyN | kk | kk | kk |
      
