Feature: Delete Multiple Records Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: User/Staff Verifys Deletion of Multiple Records
    Given User/Staff selects more than one Batch  Name using checkbox
    When User/Staff Cicks on Enabled Delete button on the top left hand side
    Then User/Staff will see a ErrorMessage as "Only Admin have Access"
