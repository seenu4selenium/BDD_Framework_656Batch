@tag
Feature: Facebook login functionality

  @tag1
  Scenario: FB login with invalid testdata
    Given Open any browser with fb URL
    When User type invalid test data
    And Click on Login button
    Then System will display error message or not

  @tag2
  Scenario: FB login with valid testdata
    Given Open any browser with fb URL
    When User type valid test data
    And Click on Login button
    Then System will display error message or not
