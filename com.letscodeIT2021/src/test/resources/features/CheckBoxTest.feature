Feature: radio button test and take a screenshot

  @all
  @checkbox
  Scenario: Take a screenshot of radio button selection
    Given I am on the letscodeit homepage
    And I navigate to practice page
    Then check <this option>
    |peach|
    Then Take a screenshot with <thisName>
    |peach_check_snapshot |
