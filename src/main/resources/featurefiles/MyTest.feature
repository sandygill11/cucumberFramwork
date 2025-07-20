Feature: Test Login scenarios
  I want to test login cases

  Scenario: Validate a user can successfully login with correct credentials
    Given Browser is launched successfully
    And User can access software testing site "https://practicesoftwaretesting.com/"
    When User clicks on Sign In option from menu
    And User clicks on Register your account
    Then User lands to Customer Registration Page
    When User fills FistName "Sandy"
    And User fills LastName "Gill"
    Then Validate if Register Button is Displayed
    And Browser is closed
    
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
