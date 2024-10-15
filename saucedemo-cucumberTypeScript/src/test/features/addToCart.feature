Feature: Products test

  Background:
    And User goes to the site's main page


  Scenario Outline: add product to cart
    And User enters first username from the page as "<username>"
    And User enters password from the page as "<password>"
    And User click on the login button
    And User adds a "<product>"
    When User goes to cart
    Then In cart should be the "<product>"

    Examples:
    | username      | password    | product             |
    | standard_user | secret_sauce| Sauce Labs Backpack |
    | problem_user  | secret_sauce| Sauce Labs Onesie   |