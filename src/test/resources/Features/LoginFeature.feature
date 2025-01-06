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
#Feature: Test the login functionality of OrangeHRM
#Scenario: Test the valid login
#Given User is on loginPage
#When User enters "Admin" and "admin123"
#And Click on Login Button
#Then User should land on homePage
Feature: Test the login functionality of OrangeHRM

  Scenario Outline: Test the valid login
    Given User is on loginPage
    When User enters <username> and <password>
    And Click on Login Button
    Then User should land on homePage

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin1   | admin123 |
