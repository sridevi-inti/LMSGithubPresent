Feature: Add New Assignment  Functionality

  Background: 
    Given Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Add New Assignment button
    Given Staff is on Manage Assignment page
    When Staff clicks a Add new assignment button
    Then Staff should see Assignment details window

  Scenario: No details Entered in  Assignment Details window
    Given Staff is on Assignment Details page
    When Staff  clicks on Save after leaving all the fields empty
    Then Staff should see an error message "Name is required"

  Scenario: Staff Validate Assignment Details window with entering all fields
    Given Staff is on Assignment Details page
    When Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate
    Then Staff should see a message "New Assignment successfully added"

  Scenario: Staff Click Cancel in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks cancel button with entering all fields
    Then Staff should see a Assignment details window is closed

  Scenario: Validate  Manage button in Assignment Grade
    Given Staff is on Assignment Details page
    When Staff clicks manage button under Assignment Grade
    Then Staff should be navigated to Grade Window
