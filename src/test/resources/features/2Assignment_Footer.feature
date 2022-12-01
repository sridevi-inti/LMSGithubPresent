Feature: Footer validation

  Scenario: Validating Assignment Footer
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"
