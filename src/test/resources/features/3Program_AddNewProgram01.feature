Feature: Add A New Program Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Add A New Program button
    Given Admin is on Manage Program page
    When Admin Clicks on A New Program button
    Then Admin see header text as "Program Details"

  Scenario: No details Entered in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Save button with out entering  details
    Then Admin see Error message "Name is required"

  Scenario: Enters  All details in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Save Button after entering all details as "SDETTesting" and "Testing"
    Then Admin see Success message "New Program Created"

  Scenario: Enters Only Name in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Save Button after entering Name as "SDETTest"
    Then Admin see Error message "Description is required"

  Scenario: Enters Only Description  in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Save Button after entering Description as "Testing"
    Then Admin see Error message "Name is required"

  Scenario: Selects Only Status in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Save Button after selecting Status alone
    Then Admin see Error message "Name is required"

  Scenario: Click on Cancel button in Program Details window
    Given Admin Clicks on A New Program button
    When Admin Clicks on Cancel button
    Then Admin see a Program Details window getting closed
