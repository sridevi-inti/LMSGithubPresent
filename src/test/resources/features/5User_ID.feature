Feature: ID

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify ID functionality
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks ID in any row
    Then Admin/User/Staff  see dialog box displayed with user information
