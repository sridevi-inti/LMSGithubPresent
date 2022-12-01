Feature: Cancel(x) icon

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the presence of Cancel(x) icon in user detais window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a cancel icon

  Scenario: Functionality of Cancel(x) icon
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks cancel icon
    Then User Details window should be closed
