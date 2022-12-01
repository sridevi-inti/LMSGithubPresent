Feature: Delete Multiple Records Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Program page

  Scenario: Verifys Deletion of Multiple Records
    Given Admin selects more than one Program Name using checkbox
    When Admin Clicks on Enabled Delete button on the top left hand side
    Then Admin see header text of delete as "Delete Confirm"

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name
    When Admin Clicks on Yes  button
    Then Admin see Success message "Program Deleted Succesfully"

  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name
    When Admin Clicks on No button
    Then Admin can see Program Names not deleted
