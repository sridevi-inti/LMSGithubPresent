Feature: Ascending order Functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify Batch Name are displayed in Ascending order
    Given User/Staff/Admin is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Name Ascending Arrow
    Then Admin/User/Staff see the Batch Name displayed in Ascending order

  Scenario: Verify Batch Description are displayed in Ascending order
    Given User/Admin/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Description Ascending Arrow
    Then Admin/User/Staff see the Batch Description displayed in Ascending order

  Scenario: Verify Batch Status are displayed in Ascending order
    Given Admin/User/Staff on Managebatch page
    When Admin/User/Staff Clicks on Batch Status Ascending Arrow
    Then Admin/User/Staff see the Batch Status displayed in Ascending order

  Scenario: Verify No Of Classess are displayed in Ascending order
    Given Admin/User/Staff is on ManageBatchpage
    When Admin/User/Staff Clicks on No Of Classess Ascending Arrow
    Then Admin/User/Staff see the No Of Classes displayed in Ascending order

  Scenario: Verify Program Name are displayed in Ascending order
    Given Admin/User/Staff is on ManageBatchPage
    When Admin/User/Staff Clicks on Batch Program Name Ascending Arrow
    Then Admin/User/Staff see the Program Name displayed in Ascending order
