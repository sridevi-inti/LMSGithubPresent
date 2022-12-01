Feature: Number of rows in a Table

  Scenario: Validate Number of rows in a table
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Staff/Admin/User/ is on Manage Batch page
    Then Admin/User/Staff counts number of rows as 5 in a table
