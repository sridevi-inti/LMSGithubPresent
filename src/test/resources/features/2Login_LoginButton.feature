
Feature: Login button

 Background: 
    Given Admin/User/Staff is on to LMS website

  Scenario: Validation of the login url
    Given Admin/User/Staff is on the Registration page
    When Admin/User/Staff clicks on the login button
    Then Admin/User/Staff should be navigated to login page

  
