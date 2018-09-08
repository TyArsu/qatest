Feature: Login
Scenario: Login with valid username and password 

Given User is on  http://newtours.demoaut.com/
When 	User enters valid username
When  User enters valid password 
Then User clicks on submit button 


