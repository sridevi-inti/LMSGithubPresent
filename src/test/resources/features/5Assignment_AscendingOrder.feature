Feature: Ascending Order Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Assignment Name are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Name Ascending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Ascending order

  Scenario: Verify Assignment Description are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Description Ascending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Ascending order

  Scenario: Verify Assignment Duedate are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Ascending order

  Scenario: Verify Assignment Grade are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Ascending order
