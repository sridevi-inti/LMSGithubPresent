Feature: Edit Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verifys Edited Program Name/Program Description
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Enters edited Program Name in Search "QATester"
    Then Entry for the edited Program Name is shown
