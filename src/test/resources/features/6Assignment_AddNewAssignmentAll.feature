Feature: Add New Assignment  Functionality

  Background: 
    Given Admin/user/Staff logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: validate New assignment
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on Assignment
    Then Admin/User/Staff should see a newly added Assignment
