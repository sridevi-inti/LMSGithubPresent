Feature: Header Validation

  Scenario: Validating the heading of Registration form
    Given Admin/User/Staff is on to LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff see header text "Registration Form"
