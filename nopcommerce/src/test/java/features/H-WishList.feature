

Feature: Add different products to the Wish list

  Scenario Outline: user can different products to the wishlist
    Given 1_home page
    When  2_click on login link
    And 3_entered the name and password "<email>","<password>"
    And 4_clicks login button
    And  5_Chooses Category
    And  6_go to The sub category
    And 7_choose The first product
    And  8_Add item to the wish list
    Then  9_Click his wish list
    And 10_user is redirected to the wish list page


    Examples:

      | email | password |
      | madona0@gmail.com | 123456 |
