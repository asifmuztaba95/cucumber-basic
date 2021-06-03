Feature: Have i read cucumber?
  Few tests to see if i have read cucumber

  Scenario: Have i read cucumber?
    Given did not read gherkin
    When i ask have i read cucumber
    Then tell me "NO"

  Scenario: Have i read cucumber?
    Given did read gherkin
    When i ask have i read cucumber
    Then tell me "YES"