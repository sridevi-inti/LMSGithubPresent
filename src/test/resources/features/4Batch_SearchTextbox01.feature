Feature: Search TextBox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Search  by Batch Name
    Given Admin/User/Staff is onto the  Manage Batch page
    When Admin/User/Staff enters Batch Name  to be searched
    Then Entries for the searched BatchName are shown.

  Scenario: Search  by Batch Description
    Given Admin/User/Staff is on ManageBatch page
    When Admin/User/Staff enters Batch Description to be searched
    Then Entries for the searched Batch Description are shown.

  Scenario: Search  by Batch Status
    Given Admin/User/Staff is on ManageBatch
    When Admin/User/Staff enters Batch Status to be searched
    Then Entries for the searched Batch status are shown.

  Scenario: Search  by No Of Classes
    Given Admin/Staff/User on Manage Batch page
    When Admin/User/Staff enters No Of Classes to be searched
    Then Entries for the searched No Of Classes are shown.

  Scenario: Search  by Program Name
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Program Name to be searched
    Then Entries for the searched Batch program Name are shown
