Feature: CheckBox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verifies Checkbox Functionality
    Given Admin/User/Staff lands on Manage batch page
    When Admin/User/Staff Selects First checkbox left to Batch Name
    Then Admin/User/Staff see all the checkboxes in the Batch page get selected
