Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given API for foreign exchange
    When posted with correct Information
    Then validate positive response code received
