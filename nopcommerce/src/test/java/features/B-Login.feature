Feature: User can login with valid email and password

 Scenario Outline: User login
    Given  user in home page
    When  click on login link
    And entered "<email>","<password>"
    And click login button
    Then the login page display successful
    And  logout
    And  quit the Browser

   Examples:

     | email | password |
     | madona0@gmail.com | 123456 |
#     | mina33@gmail.com | 12345678 |
