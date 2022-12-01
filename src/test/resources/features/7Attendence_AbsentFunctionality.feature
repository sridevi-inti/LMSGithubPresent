Feature: Absent Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verifying the Functionality of a Absent button
    Given Admin/User/Staff will be on Manage Attendance Page
    When Admin/User/Staff  Clicks on Absent
    Then Admin/User/Staff  see the list of  "User Name" who are Absent
