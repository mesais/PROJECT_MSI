Feature: radio button test and take a screenshot
  Background: navigate to practice page
    Given I am on the letscodeit homepage
    And I navigate to practice page

  @all
  @dropdown
  Scenario: Take a screenshot of radio button selection

    Then select benz option at dropdown
    Then Take a screenshot with <thisName>
    |benz_option_snapshot |
