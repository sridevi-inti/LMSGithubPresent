Feature: Footer Validation

  Scenario: Validating the Attendance Footer
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."
