Feature: Edit Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff  Validate Edit button
    Given User/Staff on Manage Batch page
    When User/Staff Clicks on Edit buttton
    Then User/Staff will see Error message  "Only Admin have Access"
