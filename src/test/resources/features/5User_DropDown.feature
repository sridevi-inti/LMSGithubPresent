Feature: Drop down

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify drop down menu for state
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks the drop down icon for state
    Then Admin/User/Staff should select from the drop down menu for state

  Scenario: Verify drop down menu for user role
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks the drop down icon for User Role
    Then Admin/User/Staff should select from the drop down menu for user role
