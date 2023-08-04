
Feature: User  Registration

   User Open the Browser And Go To The Home Page And Then Click On Registration

 Scenario Outline:  User  Registration
    Given the user in home page
    When I click on register link
    And I entered "<firstname>","<lastname>","<email>","<password>","<confirm-password>"
    And clicks register button
    Then the Registration page displayed successfully
    And user quit the Browser

    Examples:

      | firstname | lastname | email | password | confirm-password |
      | Madonna | Halim | madona0@gmail.com | 123456 | 123456|
#      | Mina | Halim | mina33@gmail.com | 12345678 | 123456|


