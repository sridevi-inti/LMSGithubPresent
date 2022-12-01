Feature: Paginator Validation

  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."

  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Attendance
    Then Admin/User/Staff see all paginator buttons are Disabled
