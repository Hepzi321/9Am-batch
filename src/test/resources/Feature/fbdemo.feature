Feature: Login the functionality check for the facebook page

Background: 

Given User launches the fb url

@Outline
Scenario: Login the facebook page


When User enter the username
And User enters the password
And User clicks on login button
Then User should be on facebook page


Scenario: Login the page with valid credentials using parameters


When User enter the username "Admin"
And User enters the password "admin123"
And User clicks on login button
Then User should be on facebook page


#Scenario Outline: Login the page with valid credentials using parameters
#
#Given User launches the fb url
#When User enter the usernamed "<username>" for login page
#And User enters the password "<password>" for login page
#And User clicks on login button
#Then User should be on facebook page
#
#
#Examples:
#|username|password|
#|oranium |16516316|
#|Tech    |6668    |
#|Admin   |726     |  
#
