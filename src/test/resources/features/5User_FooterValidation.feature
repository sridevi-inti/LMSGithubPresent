Feature: Footer Validation

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating table footer
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staffshould see the table footer as "In total there are 4 users".
