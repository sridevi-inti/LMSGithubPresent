Feature: Paginator validation

  Scenario: Validating Assignment Paginator
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff see Paginator text as "Showing 1 to 3 of 3 entries"
