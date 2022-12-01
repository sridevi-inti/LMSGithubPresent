Feature: Cancel button

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the presence of Cancel button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Cancel  in User Details window

  Scenario: Validate Fucntionality of Cancel button
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks cancel button
    Then Admin/User/Staff  see User Details window getting  closed
