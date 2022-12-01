Feature: Header validation

  Scenario: Validating Assignment Heading
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff see header text "Manage Assignment"
