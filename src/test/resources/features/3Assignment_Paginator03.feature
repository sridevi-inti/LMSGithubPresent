Feature: Paginator validation

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify  paginator -next button  on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to next page

  Scenario: Verify paginator -previous button on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator -previous button
    Then Admin/User/Staff Should be navigated to previous page

  Scenario: Verify paginator -last button on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-last button
    Then Admin/User/Staff Should be navigated to Last page

  Scenario: Verify paginator -first button on the Program page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff Should be navigated to First  page
