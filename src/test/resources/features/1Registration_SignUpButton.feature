Feature: Sign Up Button

  Scenario: Validating the Sign Up button visibility
    Given Admin/User/Staff is on to LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees a button with text as "Sign Up" on the form
