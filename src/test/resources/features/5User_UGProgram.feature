Feature: UG Program

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating UG Program Dropdown
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks on UG Program dropdown
    Then Admin/User/Staff see list of UG Program
