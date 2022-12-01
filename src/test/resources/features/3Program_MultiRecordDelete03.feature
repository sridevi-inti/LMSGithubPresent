Feature: Delete Multiple Records Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Deletion of Multiple Records
    Given User/Staff selects more than one Program Name using checkbox
    When User/Staff Clicks on Enabled Delete button on the top left hand side
    Then User/Staff see a Error message as "Only Admin have Access"
