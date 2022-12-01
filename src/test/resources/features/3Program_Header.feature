Feature: Header Validation

  Scenario: Validating the Manage Program Header
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see header text "Manage Program"
