Feature: input fields

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the presence of input fields
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the input fields for First Name, Middle Name, Last Name, Email Adress, Phone No, Address, City, State, Postal Code, Program, UG Program, PG Program, Skill, Experience, Admin/User/Staff Role, Visa Status, Batch, Comments corresponding to their labels
