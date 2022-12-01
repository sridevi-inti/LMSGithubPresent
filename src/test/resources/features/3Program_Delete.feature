Feature: Delete Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Deleted Program Name
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Enters deleted  Program Name in Search as "SDETTesting"
    Then Admin/User/Staff finds no results
