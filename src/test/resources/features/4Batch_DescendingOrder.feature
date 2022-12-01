Feature: Descending order Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Batch Name are displayed in Descending order
    Given Admin/Staff/User is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Name Descending  Arrow
    Then Admin/User/Staff see the Batch Name displayed in Descending  order

  Scenario: Verify Batch Description are displayed in Descending order
    Given User/Admin/Staff is on the Manage Batch page
    When Admin/User/Staff Clicks on Batch Description Descending  Arrow
    Then Admin/User/Staff see the Batch Description displayed in Descending  order

  Scenario: Verify Batch Status are displayed in Descending order
    Given Admin/User/Staff is on to the Manage Batch page
    When Admin/User/Staff Clicks on Batch Status Descending  Arrow
    Then Admin/User/Staff see the Batch Status displayed in Descending  order

  Scenario: Verify No Of Classess are displayed in Descending order
    Given Admin/User/Staff on ManageBatchpage
    When Admin/User/Staff Clicks on No Of Classess Descending   Arrow
    Then Admin/User/Staff see the No Of Classes displayed in Descending  order

  Scenario: Verify Program Name are displayed in Descending order
    Given Admin/User/Staff is on managebatch page
    When Admin/User/Staff Clicks on Program Name Descending  Arrow
    Then Admin/User/Staff see the Program Name displayed in Descending  order
