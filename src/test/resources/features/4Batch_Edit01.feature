Feature: Edit Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verifys Edited Batch Name/BatchDescription
    Given Admin/User/Staff is on the ManageBatch page
    When Admin/User/Staff  Enters edited Batch Name/Batch Description in Search
    Then Entry for the edited  Batch Name/Batch Description is shown
