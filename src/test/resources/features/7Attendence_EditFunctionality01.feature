Feature: Verify the Edit Button

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the Edit Button
    Given User/Staff is on the Manage Attendance page
    When User/Staff Clicks on Edit buttton
    Then Admin see header text as "Attendance Details"
