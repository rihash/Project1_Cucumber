
Feature: Class Project 1


  @Test1
  Scenario: Selecting a Mobile App, adding to cart and checkout
    Given Opening browser
    And Enter username
    And Enter password 
    When Click capcha
    And Click login 
    Then Click service tab
    And Click Order New Service
    And Click Mobile Category
    And Select Mobile Application
    Then Add to cart and continue
    And Validate product is added
    Then Click checkout
    And Click complete order
    And Close browser

