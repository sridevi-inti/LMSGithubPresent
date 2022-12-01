Feature: Edit Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validates Edit button in Program Details window
    Given Admin is on Manage Program page
    When Admin clicks on Edit Button
    Then Admin see header text as "Program Details"
