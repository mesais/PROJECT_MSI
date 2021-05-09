Feature: Navigate to let's kode it website then open practice page

  @all
  @snapshot
  Scenario: Navigating to practice page
    Given I am on the letscodeit homepage
    And I navigate to practice page
    Then I assert the page title
    Then Take a screenshot

