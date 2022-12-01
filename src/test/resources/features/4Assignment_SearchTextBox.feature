Feature: Search TextBox Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks Search bar after entering Assignment name as "Assignment Name"
    Then The requested assignment details should be displayed
#######validate search feature for description,DueDate should also be added
