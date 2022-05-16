Feature: User login
  Scenario: User login valid data
    Given User on page
    When User enter username and password
    When User click on login button to submit
    Then User see quick launch panel on dashboard

    Scenario Outline: User login scenario
      Given User on page
      When User enter username and password "<username>" "<password>"
      When User click on login button to submit
      Then User see result "<result>"
      Examples:
      |username|password   |result            |
      |Admin   |admin123   |quick launch panel|
      |ways77  |           | warning          |
      |        |admin123   | warning          |
      |        |           | warning          |
      |Admin   |aaadmin123 | warning          |