Feature: Delete Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the Delete Functionality
    Given User/Staff will be on Manage Attendance page
    When User/Staff Clicks on Delete buttton
    Then Admin see header text of delete as "Delete Confirm"

  Scenario: Click on "Yes" button in Delete Confirm window
    Given User/Staff Clicks on Delete buttton
    When User/Staff  clicks on to the Yes  button
    Then User/Staff  see Successmessage "Program Deleted Succesfully"

  Scenario: Click on "No" button in Delete Confirm window
    Given User/Staff Clicks on Delete buttton
    When Staff/User  Clicks the button No button
    Then User/Staff see the "Program Name not deleted"
