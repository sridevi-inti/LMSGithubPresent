Feature: Delete Assignment Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin/User/Staff clicks Assignment Name
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks on delete button
    Then Admin/User/Staff should see a message "Staff only have access"
