Feature: Delete Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin Verify the Delete Functionality
    Given Admin on Manage AttendancePage
    When Admin Clicks on the Delete Button
    Then Admin see Error Message as "Admin Has View Only Permission"
