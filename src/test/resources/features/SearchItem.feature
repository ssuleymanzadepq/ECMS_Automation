Feature: Search item in the search bar

  @test @regression
  Scenario: Verify and validate search item
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user verifies the items shown in the list


  @outline @regression
  Scenario Outline: Passing data from excel file
    When user enters credentials "<username>" and "<password>" and clicked on logged in
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user verifies the items shown in the list
    Examples:
      | username                      | password |
      | test_PQIS Editorial           | 1234     |
      | test_PQIS Content Corrections | 1234     |
      | test_GIS Editorial            | 1234     |
      | test_DISS Editorial           | 1234     |
      | test_books_editorial          | 1234     |

  @test1 @regression
  Scenario: Verify and validate facets in the left panel
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user verifies left panel facets
      | Disciplines | Products | Abstract | Full Text | Publication Source Type | Document Type | Document Section | Term Count | PQ One Business | Providers | Publishers | Database Type | Document Status | MR3 Fields | Active Restrictions | Publication Subjects | Content Tier | Bundle Codes|









