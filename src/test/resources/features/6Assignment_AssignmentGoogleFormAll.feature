Feature: Assignment Google form

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Admin/User/Staff clicks Assignment Name
    Given Admin/User/Staff is on Assignment page
    When Admin/User/Staff clicks on Assignment Name
    Then Admin/User/Staff should be navigated to Assignment Google form page

  Scenario: Admin/User/Staff validate assignment Google form with entering all fields
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks on submit button after entering all questions and mail id
    Then Admin/User/Staff should see a message as "Assignment Google form submited successfully"

  ####Successful message should displayed
  Scenario: Admin/User/Staff validate assignment Google form leaving empty
    Given Admin/User/Staff is on Assignment page
    When Admin/User/Staff clicks on submit button after leaving all questions and mail id
    Then Admin/User/Staff should get a warning message "Must enter the mandatory fields"

  Scenario: Admin/User/Staff Validate Assignment google form after cliclking clear button
    Given Admin/User/Staff is on Assignment page
    When Admin/User/Staff clicks clear form button after entering all questions and mail id
    Then Admin/User/Staff should see a message as "Assignment Google form cleared successfully"

  ######Successful message should displayed
  Scenario: Admin/User/Staff clicks Switch account
    Given Admin/User/Staff is on Assignment page
    When Admin/User/Staff clicks Switch account link
    Then Admin/User/Staff should see a message as "Switched over the account Successfully"
#######Successful message should be displayed
