Feature: Header Validation

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate the Manage page heading
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the page heading as Manage User
