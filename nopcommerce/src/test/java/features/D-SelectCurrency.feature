
Feature: Switch Currency

 Scenario Outline: Logged user could switch between any currencies US-euro

    Given  home_page
    When  I click login
    And I entered "<email>","<password>"
    And login button
    Then choose the Euro currency
    And user Close browser

   Examples:
     | email | password |
     | madona0@gmail.com | 123456 |
