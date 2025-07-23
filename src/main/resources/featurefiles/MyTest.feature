Feature: Test Login scenarios
  I want to test login cases

  #Scenario: Validate a user can successfully login with correct credentials
    #Given User can access software testing site "https://practicesoftwaretesting.com/"
    #When User clicks on Sign In option from menu
    #And User clicks on Register your account
    #Then User lands to Customer Registration Page
    #When User fills FistName "Sandy"
    #And User fills LastName "Gill"
    #Then Validate if Register Button is Displayed
    
  Scenario Outline: Validate that user not able to login with incorrect username and password
    Given User can access software testing site "https://practicesoftwaretesting.com/"
    When User clicks on Sign In option from menu
    When User enters email "<email address>"
    When User enters password "<password>"
    And User click on login button
    Then Validate the message
     
    Examples: 
      | email address  | password |
      | test01@gmail.com | test123 |
      | test02@gmail.com | test100 |
