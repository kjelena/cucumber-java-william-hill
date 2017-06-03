Feature: Check that bet working correct

  Scenario Outline: Check that price calculate
    Given I have opened William hill start page
    And I have selected Football from navigation
    And I have pressed home button for first football game
    And I have selected first football event
    When I enter bet <bet>
    Then Price depends on odds calculated <bet>

    # You can add more bets in "Examples", which you want, in this case better to use example that testData
    # Test data class was not implemented because for such test from my perspective is not required
    # If i will have some forms (login, register) then i will implement access to data using MVC pattern, through models.
    Examples:
        | bet  |
        | 0.05 |
