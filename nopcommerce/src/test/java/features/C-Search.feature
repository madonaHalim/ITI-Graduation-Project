Feature: User can search
Scenario Outline: User can search
Given  home page
When  login link
And I entered user "<email>","<password>"
  And clicks login
  And i entered search data "<product>"
  And i click search

  Examples:
  | email | password | product |
  | madona0@gmail.com | 123456 | computer |



