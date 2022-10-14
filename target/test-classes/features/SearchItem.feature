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

  @test @regression @smoke
  Scenario: Verify and validate facets in the left panel
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user verifies left panel facets
      | Disciplines | Products | Abstract | Full Text | Publication Source Type | Document Type | Document Section | Term Count | PQ One Business | Providers | Publishers | Database Type | Document Status | MR3 Fields | Active Restrictions | Publication Subjects | Content Tier | Bundle Codes|



  @test1 @regression @smoke @C766484
  Scenario: Verify fields and options in searched result details
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user verifies left panel facets
      | Disciplines | Products | Abstract | Full Text | Publication Source Type | Document Type | Document Section | Term Count | PQ One Business | Providers | Publishers | Database Type | Document Status | MR3 Fields | Active Restrictions | Publication Subjects | Content Tier | Bundle Codes|
    When user clicks on one of the results from the list of results
    Then user verify the document page



    @test123 @regression @C766477
  Scenario: Verify reporting dropdown
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user clicks on reporting dropdown
    Then user should be able to see all the reporting options

   @regression @C766479
  Scenario: Verify and validate batch queues option
     When user enters username and password for login
     And user clicks on login button
     When user clicks on batch queue option
     Then user should be able to see batch queue options on page

  @regression @C766480
  Scenario: Verify and validate batch queues option
    When user enters username and password for login
    And user clicks on login button
    When user clicks on batch queue option
    Then user should be able to see batch queue options on page
    Then user verify process details options on batch queue page



  @regression @C766481
  Scenario: Verify and validate reporting dropdown option
    When user enters username and password for login
    And user clicks on login button
    When user clicks on reporting dropdown
    Then user should be able to see all the reporting options
    When user clicks on provisional reports option
    And user selects date from calendar
    And user clicks on download option
    Then user verify error message or downloaded report


  @regression @C766487
  Scenario: Verify and validate reporting dropdown option
    When user enters username and password for login
    And user clicks on login button
    When user clicks on reporting dropdown
    Then user should be able to see all the reporting options
    When user clicks on prod status report option
    Then excel report should be downloaded


  @test123 @regression @C766489
  Scenario: Verify settings options
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user clicks on settings option
    Then user should be able to see all the options under settings

  @C766555 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user clicks on arrow icon
    Then user should be able to see new values in the results



  @C766556 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user clicks on double arrow icon
    Then user should be able to see new values in the results

  @C766557 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user clicks on left sided double arrow icon after clicking on right sided double arrow icon
    Then user should be able to see new values in the results

  @C766558 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user selects items per page dropdown values
    Then user should be able to see new values in the results


  @C766559 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user clicks on bulk edit option
    Then user should be able to see all the respective fields in it


  @C766560 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user should be able to work with clear set option

  @C766561 @regression
  Scenario: Validation of search arrows and its values
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    Then user should be able to work with clear sort option


  @C766562 @regression
  Scenario: Validation of export option
    When user enters username and password for login
    And user clicks on login button
    Then user navigated to homepage
    When user search for the "water" in search field
    And user clicks on search button
    When user clicks on export option
    Then user should be able to see send and cancel option






