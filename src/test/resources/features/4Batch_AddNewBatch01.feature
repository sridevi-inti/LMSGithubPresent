Feature: Add  A New Batch Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate Add A New Batch button
    Given Admin is on Manage Batch page
    When Admin clicks + A New Batch button
    Then Admin see header text as "Batch Details"

  Scenario: No details Entered in Batch Details window
    Given Admin Clicks on to " + A New Batch" button
    When Admin Clicks on Save Button with out entering  details
    Then Admin sees Errormessage "Name is required"

  Scenario: Enters Only Name in Batch Details window
    Given Admin Clicks on to the  + A New Batch
    When Admin Clicks on Save Button after entering Name alone
    Then Admin see Errormessage "Description is required"

  Scenario: Enters Only Description in Batch Details window
    Given Admin clicks on the + A New Batch button
    When Admin Clicks on Save Button after entering Description alone
    Then Admin will see Errormessage "Name is required"

  Scenario: Verify Program Name Dropdown in Batch Details window
    Given Admin clicks + A New Batch button
    When Admin Clicks on DropDown Menu
    Then Admin see list of all Program Names

  Scenario: Selects only a Program name from Dropdown in Batch Details window
    Given Admin clicks + A New Batch button 
    And  Clicks on DropDown Menu in Batch Details window
    When Admin Clicks on Save button after selecting a Program Name only from the dropdown
    Then Admin will see Errormessage as "Name is required"

  Scenario: Selects Status only in Batch Details window
    Given Admin clicks + A New Batch button
    When Admin Clicks on Save Button after selecting Status alone
    Then Admin will be seeing the Error message "Name is required"

  Scenario: Enters Only Number Of Classes in Batch Details window
    Given Admin Clicks on the button " + A New Batch"
    When Admin Clicks on Save Button after entering only Number Of Classes
    Then Admin will see Errormessage "Name is required"

  Scenario: Enter All details in Batch Details window
    Given Admin Clicks on the button " + A New Batch"
    When Admin Clicks on Save Button after entering all details
    Then Admin see Successmessage as "New Batch Created"

  Scenario: Click on Cancel button in Batch Details window
    Given Admin clicks + A New Batch button
    When Admin Clicks on Cancel button
    Then Admin see a Batch Details window getting closed
