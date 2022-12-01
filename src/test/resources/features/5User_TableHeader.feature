Feature: Table header

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating Table header
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User
    Then Admin/User/Staff should see the table header as "Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names

  Scenario: Verify the functionality of sort icon present in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks sort icon in table header
    Then Table rows should be sorted

  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checks empty checkbox in header
    Then Check box in all the rows of user table should be checked

  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff unchecks checkbox in header
    Then Check box in all the rows of user table should be unchecked
