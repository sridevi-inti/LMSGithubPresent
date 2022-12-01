Feature: Title of your feature

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff Validate Add A New Program button
    Given User/Staff is on Manage Program page
    When User/Staff Clicks on A New Program button
    Then User/Staff see a Error message as "Only Admin have Access"
