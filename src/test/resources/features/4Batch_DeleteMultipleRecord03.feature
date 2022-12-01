Feature: Delete Multiple Records Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Batch page

  Scenario: Verify Deletion of Multiple Records
    Given Admin selects more than one Batch Name using checkbox
    When Admin Clicks on Enabled Delete button on the top left hand side
    Then Admin see header text of delete as "Delete Confirm"

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name
    When Admin Clicks on Yes  button
    Then Admin will be seeing the Success message as "Program Deleted Succesfully"

  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on Enabled button delete after selecting  more than one Batch Name
    When Admin Clicks on Yes  button
    Then Admin can see Program Names not deleted
