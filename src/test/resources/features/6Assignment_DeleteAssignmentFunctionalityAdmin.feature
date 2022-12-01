Feature: Delete Assignment Functionality

  Background: 
    Given Admin logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin clicks delete button
    Given Admin is on Manage Assignment page
    When Admin clicks on delete button
    Then Admin should see a message "Staff only have access"
