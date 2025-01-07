Feature: Test the login functionality of OrangeHRM using DataTable

  Scenario Outline: Test the valid login using DataTable
    Given User is on loginPage
    When User enters credentials using DataTable
      | Admin | admin123 |
    And Click on Login Button
    Then User should land on homePage
