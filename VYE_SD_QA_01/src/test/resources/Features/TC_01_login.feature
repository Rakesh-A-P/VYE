@LoginTest
Feature: login
   @login
  Scenario Outline: Login with valid credentials for provider portal
    Given user is navigate to the VYE login page
    When user enters user name from sheet <sheetName> and row <rowNum> password and click on continue button
    And Provider Enrollemet Application continue or delete by using buttons <button>
    Then validate user is redirected to Dasboard "Provider Enrollment Supervisor (IU-Super Admin)"
 
   Examples:
   |  sheetName | rowNum |  button |
   |  Login       |0       |   delete|
              #Continue  delete
    
  