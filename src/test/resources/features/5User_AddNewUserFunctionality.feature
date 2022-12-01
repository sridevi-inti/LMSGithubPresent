Feature: Add New User Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate the presence of Add new user button
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the button with text "+ icon and Add New User"

  Scenario: Verify the functionality of Add new user button
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add New User
    Then Admin/User/Staff should see the "User details" dialog box
