Feature: Select category

 Scenario Outline: user can access any category


    Given the user in home_page
    When  I click on login_link
    And I entered the user_data "<email>","<password>"
    And clicks login_button
    Then user click on any sub-category
    And user redirected to the sub category page
    And user close_browser
   Examples:

     | email | password |
     | madona0@gmail.com | 123456 |