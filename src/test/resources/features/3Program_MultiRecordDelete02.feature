Feature: Delete Multiple Records Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validates Multiple Program Selection
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff selects more than one Program Name using checkbox
    Then Admin/User/Staff see the Delete button on the top left hand side as Enabled

  Scenario: Verify Deleted Program Names
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Enters deleted Program Names in Search as "SDETTesting"
    Then Admin/User/Staff finds no results
