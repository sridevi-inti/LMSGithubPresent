Feature: Assignment Google form

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin clicks Assignment Name
    Given Admin Logged on to LMS Website
    When Admin clicks on Assignment Name
    Then Admin should see a warning message "you dont have access"
