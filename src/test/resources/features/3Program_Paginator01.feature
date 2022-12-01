Feature: Paginator Validation

  Scenario: Validating the Manage Program Paginator
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 9 entries"

  Scenario: Validate Number of rows in a table
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff counts number of rows as 5 in a table
