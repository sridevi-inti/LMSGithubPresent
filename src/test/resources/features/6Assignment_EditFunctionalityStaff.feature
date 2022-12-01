Feature: Edit Functionality

  Background: 
    Given Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Staff Validates Edit button
    Given Staff is on Manage Assignment page
    When Staff clicks an edit Assignment button
    Then Staff should see a Assignment details window

  Scenario: Staff Edit Assignment Name in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button  after edits Assignment Name
    Then Staff should see a message "Assignment Name Updated"

  Scenario: Staff Edit Assignment Description in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button  after edits Assignment Description
    Then Staff should see a message "Assignment Description Updated"

  Scenario: Staff Edit Assignment Grade in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button After edits Assignment Grade
    Then Staff should see a message "Assignment Grade Updated"

  Scenario: Staff Edit Assignment DueDate in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button After edits Assignment DueDate
    Then Staff should see a message "Assignment Due Date Updated"

  Scenario: Staff Click Cancel in  Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks cancel button
    Then Staff Should see a Assignment Details Page is closed
