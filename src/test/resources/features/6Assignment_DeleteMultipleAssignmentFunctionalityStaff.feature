Feature: Delete Multiple Assignment Functionalty

  Background: 
    Given Staff logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Staff  validate delete button on the top left
    Given Staff is on Manage Assignment page
    When Staff clicks delete button on the top after selecting multiple checkbox
    Then Staff should see a Delete confirm window

  Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
    Then Staff should see a message "All Assignments are deleted Successfully"

  Scenario: Staff click No in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully
