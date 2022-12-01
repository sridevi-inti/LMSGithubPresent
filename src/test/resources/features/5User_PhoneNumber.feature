Feature: PhoneNumber

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating the Phone number
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters more than 10 digits
    Then Admin/User/Staff see error message Invalid Input
