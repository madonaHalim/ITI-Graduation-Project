Feature: Add different products to the compare list

  Scenario Outline: user can different products to the Compare list

    Given the_home_page
    When  click-on-login-link
    And entered-data "<email>","<password>"
    And click_login_button
    And  Chooses_Category
    And  choose the sub category
    And Choose  first product
    And  Add item to the Compare list
    And  choose Another_category
    And  go to The sub category
    And Choose Second product
    And  Add another Item to the compare list
    Then  Click his compare list
    And user is redirected to the compare list page
    And end browser
    Examples:

      | email | password |
      | madona0@gmail.com | 123456 |