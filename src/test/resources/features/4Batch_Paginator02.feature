Feature: Paginator Validation

  Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on the Manage Batch page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 21 batches."
