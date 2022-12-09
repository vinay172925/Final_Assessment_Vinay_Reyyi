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
Feature: AddCity
Scenario Outline: Adding City
Given User Launch Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin"
And User enters Emails as "admin@gmail.com" and password as "123456"
And click on locations
Then click on AddCity
And User enters city as "vishakaptnam"
Then click on Add
And click on MainAdmin
Then click on Logout
And close browser
