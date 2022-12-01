Feature: Edit Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin is on Manage Program page

  Scenario: Edit Program Name in Program Details window
    Given Admin clicks on Edit Button
    When Admin Clicks on Save Button after updating Name as "QATester"
    Then Admin see Success message "Updated Program Name"

  Scenario: Edit Program Description in Program Details window
    Given Admin clicks on Edit Button
    When Admin  Clicks on Save Button after updating  Description as "Testers"
    Then Admin see Success message "Updated Description"

  Scenario: Edit Program Status in Program Details window
    Given Admin clicks on Edit Button
    When Admin  Clicks on Save Button after Changing  status
    Then Admin see Success message "Updated Status"

  Scenario: Click on Cancel button in Program Details window
    Given Admin clicks on Edit Button
    When Admin Clicks on Cancel button
    Then Admin see a Program Details window getting closed
