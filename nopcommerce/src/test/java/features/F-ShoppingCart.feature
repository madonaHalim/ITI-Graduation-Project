

Feature: Add different products to the shopping cart

 Scenario Outline: user can different products to the shopping cart

    Given the_user in home page
    When  I-click-on-login-link
    And entered-login data "<email>","<password>"
    And clicks-login-button
    And  Chooses category
    And  Chooses subcategory
    And choose the first product
    And  Add item
    And  choose another category
    And choose the second product
    And  Add another Item
    Then  click his shopping cart
#    And user is redirected to the shopping cart
    And close_browser

    Examples:

      | email | password |
      | madona0@gmail.com | 123456 |