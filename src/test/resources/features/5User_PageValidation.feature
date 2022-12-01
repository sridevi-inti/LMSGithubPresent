Feature: Page Validation

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate landing in Manage page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff clicks the Tab User
    Then Admin/User/Staff should see the Manage user page
