Feature: Search TextBox Functionality

  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff on to Batch page
    Then Admin/User/Staff see the Search Text box has text as "Search"
