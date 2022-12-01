Feature: Delete Multiple Assignment Functionalty

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin/User/Staff Validate Disabled delete button
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on delete button on the top left
    Then Admin/User/Staff/ should see a disabled delete button
