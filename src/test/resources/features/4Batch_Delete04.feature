Feature: Delete Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff Validates Delete button
    Given User/Staff on Manage Batch page
    When User/Staff Clicks on Delete buttton
    Then User/Staff will see a Error message "Only Admin have Access"
