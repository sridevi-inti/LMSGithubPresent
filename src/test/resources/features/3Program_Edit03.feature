Feature: Edit Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff Validate Edit button
    Given User/Staff is on Manage Program page
    When User/Staff Clicks on Edit buttton
    Then User/Staff see a Error message as "Only Admin have Access"
