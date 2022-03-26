Feature: Search item in the search bar

  @test
  Scenario: Verify and validate search item
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button

  @outline
  Scenario Outline: Passing data from excel file
    When user enters credentials "<username>" and "<password>" and clicked on logged in
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Examples:
      | username                      | password |
      | test_PQIS Editorial           | 1234     |
      | test_PQIS Content Corrections | 1234     |
      | test_GIS Editorial            | 1234     |
      | test_DISS Editorial           | 1234     |
      | test_books_editorial          | 1234     |







