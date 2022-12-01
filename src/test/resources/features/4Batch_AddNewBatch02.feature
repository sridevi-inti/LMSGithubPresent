Feature: Add  A New Batch Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin/User/Staff Verify Added New Batch Name
    Given Admin/User/Staff is on to the ManageprogramPage
    When Admin/User/Staff Enters newly added Batch program Name in Search
    Then Entry for the newly added Batch Name is shown
