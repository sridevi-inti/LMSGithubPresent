Feature: Search TextBox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Search by  Program Name
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Name as "SDETtest" to be searched
    Then Entries for the searched Program Name are shown

  Scenario: Search by Program Description
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Description as "machine learning" to be searched
    Then Entries for the searched Program Description are shown

  Scenario: Search by  Program Status
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff enters Program Status as "Active" to be searched
    Then Entries for the searched Program Status are shown
