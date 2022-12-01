Feature: Delete Icon

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the presence of Delete icon in manage user page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the delete icon at the top left corner of the user table

  Scenario: Behaviour of Delete icon when no rows unchecked
    Given Admin/User/Staff table is displayed in manage user page
    When No rows is checked
    Then Delete icon at the top left corner of the user table disabled

  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checks the rows in user table
    Then Delete icon at the top left corner of the user table enabled

  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff checks the rows in user table
    When Admin/User/Staff clicks the delete icon at the top left corner of user table
    Then Confirm dialog box should be displayed with Text "Are you sure you want to delete the selected Admin/User/Staffs?" , button with text No , the button with text yes and close icon

  Scenario: Validating Confirm dialog box by selecting No
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text "No"
    Then Selected rows should not be deleted and dialog box should be closed

  Scenario: Validating Confirm dialog box by selecting Yes
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text "Yes"
    Then Selected rows should be deleted and popup should be shown with success message "User deleted"

  Scenario: Validating Confirm dialog box by clicking close(x) icon
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks the close icon
    Then Confirm dialog box should be closed
