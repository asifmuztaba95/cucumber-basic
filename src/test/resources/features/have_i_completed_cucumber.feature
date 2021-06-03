Feature: Have i completed cucumber?
  Few tests to see if i completed cucumber

  Scenario Outline: Have i completed cucumber?
    Given "<status>" completed gherkin
    When i ask have i completed cucumber
    Then give me "<answer>"

    Examples:
      | status | answer |
      |  did   |  YES   |
      | didnot |  NO    |


