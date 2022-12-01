
Feature: Login-Valid Credentials

  Background: 
    Given Admin/User/Staff is on to LMS website

  Scenario: Login with valid credentials
    Given user is on login page
    When user clicks on login button after entering username as "gfteuryt" and password as "ddfsasda"
    Then user should see header text as "Manage Program"
    
  Scenario: Admin/staff login with valid credentials
    Given admin/staff is on login page
    When admin/staff clicks on login button after entering username as "xyz1234" and password as "kk12kk12"
    Then admin/staff should see header text as "Manage Program"
    
    
  
