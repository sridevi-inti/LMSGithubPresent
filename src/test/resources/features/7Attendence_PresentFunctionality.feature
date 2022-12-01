Feature: Present Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verifying the Functionality of a Present button
    Given Admin/User/Staff will be on  ManageAttendancepage
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of  "User Name" who are Present
