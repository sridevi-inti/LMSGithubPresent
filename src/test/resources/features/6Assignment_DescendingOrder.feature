Feature: Descending order Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Assignment Name are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Name Descending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Descending order

  Scenario: Verify Assignment Description are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Description Descending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Descending order

  Scenario: Verify Assignment Duedate are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Descending order

  Scenario: Verify Assignment Grade are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Grade Descending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Descending orde
