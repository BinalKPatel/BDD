Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

Given User is present on Login Page
When title of login page is "CRMPRO - CRM software for customer relationship management, sales, and support."
Then user enter "<username>" and "<password>"
And user click on login button
And user is on Home Page "CRMPRO"
And quite Browser

Examples:
	| username | password |
	| binalpatel | 9@9RJFprTypdbyN |
	| binalpatelll | 9@9RJFprTypdbyN |