Feature: Header Validation

  Scenario: Validating the Manage Batch Header
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff clicks on Batch button
    Then Admin/User/Staff see header text "Manage Batch"
