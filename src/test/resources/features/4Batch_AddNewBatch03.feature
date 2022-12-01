Feature: Add  A New Batch Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff Validate Add A New Batch button
    Given User/Staff is on Manage Batch page
    When User/Staff Clicks on  + A New Program button
    Then User/Staff will see Error message  "Only Admin have Access"
