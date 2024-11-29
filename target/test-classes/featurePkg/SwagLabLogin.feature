
  Feature: Test whether use can navigate to prodct page successfully
  
  Scenario: need to navigate to the SwagLabs site with correct credentials
    Given As a user need to open the login page
    When User enter correct user name
    And User enter correct password
    And User click login button
    Then User need to navigate to the product home page

