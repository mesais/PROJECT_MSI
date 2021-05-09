Feature: Negative Test Page title expected wrong

  Background: navigate to practice page
    Given I am on the letscodeit homepage
    And I navigate to practice page


  @all
  @negative
  Scenario: Navigating to practice page

    Then I assert the <page title>
    | Home Page title     | Practice Page Title    |
    | Home  Let's Kode It | Practice Let's Kode It |

# Page title is : Home  Let's Kode It
# This test will fail because it expects to find Practice Page Title: Practice Let's Kode It

  # Result of the test = expected [Practice Page Title] but found [Home Page title]
