Feature: Delete Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin is on Manage Program page

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on any Delete button located on the right side
    When Admin Clicks on Yes  button
    Then Admin see Success message "Program Deleted Succesfully"

  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on any Delete button located on the right side
    When Admin Clicks on No button
    Then Admin can see Program Name not deleted
