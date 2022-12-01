Feature: Delete Assignment Functionality

  Background: 
    Given Staff logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Staff clicks delete button
    Given Staff is on Manage Assignment page
    When Staff clicks on delete button on the right side
    Then Staff should see a Delete Confirmation window as "All Assignment Deleted Successfully"

  Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
    Then Staff should see a message "Assignment Deleted Successfully"

  Scenario: Staff clicks No button in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully
