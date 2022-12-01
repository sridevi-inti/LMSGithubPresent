Feature: Forgot Password

  Background: 
    Given Admin/User/Staff is on to LMS website

  Scenario: Validate forgot password link
    Given Admin/User/Staff is on Login Page
    When Admin/User/Staff clicks Forgot password link
    Then Admin/User/Staff should redirected to forgot Password page

  Scenario: Validate forgot password with  email id
    Given Admin/User/Staff is on Forgot Password Page
    When Admin/User/Staff clicks continue button after entering valid email address
    Then Admin/User/Staff should be redirected to enter verification code page
    And verification code will be sent to email

  Scenario: Validate verification code
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff clicks continue button after entering verification code as "12345"
    Then Admin/User/Staff should be redirected to reset password page

  Scenario: Validate click here link in verification code page
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff clicks "Click here" link to resend
    Then The verification code should be resend to email
