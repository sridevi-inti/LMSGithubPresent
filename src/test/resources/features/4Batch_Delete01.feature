Feature: Delete Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Delete Functionality
    Given Admin is on ManageBatchpage
    When Admin Clicks on any Delete button located on the right side
    Then Admin see header text of delete as "Delete Confirm"
