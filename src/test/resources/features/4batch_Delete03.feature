Feature: Delete Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Deleted Program Name
    Given Admin/Staff/User  on to manage batch page
    When Admin/User/Staff Enters deleted batch Program Name in Search
    Then Admin/User/Staff finds no results
