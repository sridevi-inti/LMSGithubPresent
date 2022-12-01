Feature: Checkbox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin/User/Staff validate check box on the left side to the Assignment Name
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks check box on the left side to the Assignment Name
    Then Admin/User/Staff should see a enabled delete button on the top left

  Scenario: User/Staff validate individual checkbox
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks individual checkbox button
    Then Admin/User/Staff should see a delete button on the top left
