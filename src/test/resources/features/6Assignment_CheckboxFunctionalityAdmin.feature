Feature: Checkbox Functionality

  Background: 
    Given Admin logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin validate check box on the left side to the Assignment Name
    Given Admin is on Manage Assignment page
    When Admin clicks check box on the left side to the Assignment Name
    Then Admin should see a warning message "Admin dont have access "

  Scenario: Admin validate individual checkbox
    Given Admin is on Manage Assignment page
    When Admin clicks individual checkbox button
    Then Admin should see a warning message "Admin dont have access "
