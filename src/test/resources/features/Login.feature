Feature: user login
  Scenario: user login valid data
    Given user on page
    When user click login to navigate form page
    When user enter username and password
    When user click on login button to submit
    Then user see username on dashboard

    Scenario Outline: user login scenario
      Given user on page
      When user click login to navigate form page
      When user enter username and password "<username>" "<password>"
      When user click on login button to submit
      Then user see result "<result>"
      Examples:
      |username|password   |result       |
      |ways77  |Minumair77!|text username|
      |ways77  |           | warning     |
      |        |Minumair77!| warning     |
      |        |           | warning     |
      |ways7   |Minumair77!| Invalid username or password!|