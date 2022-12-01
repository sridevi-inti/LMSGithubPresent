Feature: Validating Address line

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating Address line  in User Details window
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks the button Add C/O, Apt, Suite, Unit
    Then Admin/User/Staff should see the input field with Label New Address2
