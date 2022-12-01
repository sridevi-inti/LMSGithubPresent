Feature: Add New Assignment  Functionality

  Background: 
    Given Admin/User Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Add New Assignment button
    Given Admin/User is on Manage Assignment page
    When Admin/User clicks a Add New Assignment button
    Then Admin/User should see a message "Staff only have access to add New Assignment"
