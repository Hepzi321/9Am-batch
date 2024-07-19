Feature: Facebook login check using chrome

Background: 

Given User launches the fb url

Scenario: facebook page login

When User enter the username in facebook
And User enters the password
And User clicks on login button
Then User should be on facebook page