Feature: User login test

  Background:
    And User goes to the site's main page


  Scenario: Login should be success
    And User enters first username from the page as "standard_user"
    And User enters password from the page as "secret_sauce"
    When User click on the login button
    Then Login should be successful
