Feature: CheckBox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Checkbox Functionality
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Selects First checkbox left to Program Name
    Then Admin/User/Staff see all the checkboxes in the Program page get selected
