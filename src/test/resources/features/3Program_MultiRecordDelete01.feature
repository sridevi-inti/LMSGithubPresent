Feature: Delete Multiple Records Functionality

  Scenario: Verify the state of Delete button on left hand side
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see the Delete button on the top left hand side as Disabled
