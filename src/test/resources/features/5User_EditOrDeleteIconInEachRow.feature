Feature: Edit/Delete icon in each row

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate the presence of Edit/Delete icon
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the buttons with edit/delete icon in each row of Edit/Delete coulmn

  Scenario: Validate Functionality of delete button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks delete button
    Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name)" , button with text No , the button with text yes and close icon

  Scenario: Updating with Edit button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks Edit button
    Then User Details dialog box should be displayed for editing
