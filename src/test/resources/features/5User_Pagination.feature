Feature: Pagination

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validate the presence of pagination
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the text "Showing 1 to 4 of 4 entries" beow the user table

  Scenario: Validate the Pagination control with less rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has less than or equal to 5 rows
    Then Pagination control should be disabled

  Scenario: Validate the Pagination control with more than 5 rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has more than 5 rows
    Then Pagination control should be enabled

  Scenario: Verify pagination next link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks next link of pagination
    Then Next page should be displayed

  Scenario: Verify pagination next link after last record of user table
    Given last page of Admin/User/Staff records are displayed
    When Admin/User/Staff clicks next link of pagination
    Then Next link of pagination should be disabled

  Scenario: Verify pagination Previous link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks previous link of pagination
    Then previous page should be displayed

  Scenario: Verify pagination previous link in first page of user table
    Given First page of user table is displayed
    When Admin/User/Staff clicks previous link of pagination
    Then Previous link of pagination should be disabled

  Scenario: Verify button with << icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks << icon in pagination
    Then Admin/User/Staff clicks should see the First page of the table

  Scenario: Verify button with >> icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks >> icon in pagination
    Then Admin/User/Staff clicks should see the last page of the table

  Scenario: Verifiy the entry details below data table
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staff should see the text "Showing 1 to 4 of 4 entries" beow the user table
