Feature: Delete Functionality

  Background: 
    Given Admin Logged on to LMS Website
      | username | Password |
      | xyz1234  | kk12kk12 |
    When Admin is on ManageBatchpage

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on any Delete button on the right side
    When Admin Clicks on Yes  button
    Then Admin see a Successmessage "Program Deleted Succesfully"

  Scenario: Clicks on No button in Delete Confirm window
    Given Admin Clicks on any Delete button located on right side
    When Admin Clicks on No button
    Then Admin can see Batch Name not deleted
