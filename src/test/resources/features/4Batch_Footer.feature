Feature: Footer Validation

  Scenario: Validating the Manage Batch Footer
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Batch Page
    Then Admin/User/Staff see Footer text as "In total there are 21 batches."
