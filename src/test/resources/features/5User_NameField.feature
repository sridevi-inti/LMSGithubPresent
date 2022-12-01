Feature: Name field

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating the User Details window with few fields empty
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks on Submit button after entering Few Field details
    Then Admin/User/Staff see error message Name Is Required
