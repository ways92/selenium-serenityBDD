Feature: user login
  Scenario: user login valid data
    Given user on page
    When user click login to navigate form page
    When user enter username and password
    When user click on login button to submit
    Then user see username on dashboard