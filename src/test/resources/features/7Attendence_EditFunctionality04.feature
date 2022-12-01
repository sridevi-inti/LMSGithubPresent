Feature: Edit Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin Verify the Edit Button
    Given Admin must be on the Manage Attendance Page
    When Admin clicks on Edit Button
    Then Admin see Error Message "Admin Has View Only Permission"
