Feature: Add A New Program Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Added New Program Name
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Enters newly added Program Name in Search as "SDETTesting"
    Then Entry for the newly added Program Name is shown
