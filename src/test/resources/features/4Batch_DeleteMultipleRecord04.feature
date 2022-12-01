Feature: Delete Multiple Records Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Deleted Batch Names
    Given Admin/User/Staff  is on manageBatch page
    When Admin/User/Staff Enters deleted  Program Names in Search
    Then Admin/User/Staff finds results as no results
