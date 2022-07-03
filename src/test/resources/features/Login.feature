Feature: ECMS Login
  @smoke
  Scenario: Valid login scenario
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage

@excel
Scenario: Passing data from excel file
  When user enters credentials from excel file using "Sheet1" and logged in

  @outline
  Scenario Outline: Passing data from excel file
    When user enters credentials "<username>" and "<password>" and clicked on logged in
    Examples:
      | username                      | password |
      | test_PQIS Editorial           | 1234     |
      | test_PQIS Content Corrections | 1234     |
      | test_GIS Editorial            | 1234     |
      | test_DISS Editorial           | 1234     |
      | test_books_editorial          | 1234     |

@test123
  Scenario: Verify message which browser to use
    When user is on login page
    Then user should be able to see message "Which browser is best to use?"

  @test123
  Scenario: Verify message which browser to use
    When user is on login page
    Then user should be able to see forgot password link

