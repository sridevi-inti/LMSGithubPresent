Feature: Paginator Validation

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify paginator -next button  on the Program page
    Given Admin/User/Staff is on to Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches."

  Scenario: Verify  paginator -last button  on the Program page
    Given Admin/User/Staff is on Manage Batch
    When Admin/User/Staff Clicks on Enabled paginator-last button
    Then Admin/User/Staff should see last page

  Scenario: Verify  paginator -first button  on the Program page
    Given Admin/User/Staff on Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff should see first page
