Feature: radio button test and take a screenshot

  @all
  @radio
  Scenario: Take a screenshot of radio button selection
    Given I am on the letscodeit homepage
    And I navigate to practice page
    Then BMW radio button test
    Then Take a screenshot with <thisName>
    |bmw_radio_snapshot |
