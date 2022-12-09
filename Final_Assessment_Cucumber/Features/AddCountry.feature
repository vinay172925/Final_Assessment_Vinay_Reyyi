#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: AddCountry
Scenario Outline: Adding Country to list
Given User Launches Chrome browser
When User opens1 URL "https://xlogist.pisystindia.com/admin/login"
And User enters Emails1 as "admin@gmail.com" and password1 as "Charlie123"
And click on locations1
Then click on AddCountry
And User enters country as "Peru"
Then click on Add1
And click on MainAdmin1
Then click on Logout1
And close browser1
