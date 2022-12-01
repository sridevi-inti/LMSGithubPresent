Feature: Edit Functionality

  Background: 
    Given User/Staff Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When User/Staff must be on Manage Attendence Page

  Scenario: Edit ProgramName in Attendance Details window
    Given User/Staff Clicks on Edit buttton
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit User Name Attendance Details window
    Given User/Staff Clicks on Edit buttton
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit Present in Attendance Details window
    Given User/Staff Clicks on Edit buttton
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit Absent in Attendance Details window
    Given User/Staff Clicks on Edit buttton
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Click on Cancel button in Attendance Details window
    Given User/Staff Clicks on Edit buttton
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed
