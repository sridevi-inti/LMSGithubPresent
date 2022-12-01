Feature: Header Validation

  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text "Manage Attendance"
