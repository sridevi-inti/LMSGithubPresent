Feature: Search

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Verify the presence of Input field for searching
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff see the Search Text box has text as "Search"

  Scenario: Verify the presence of search icon and text in the search input filed
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the search input field with search icon and text as Search

  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types Name to search
    Then Rows with the name should be displayed

  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types random text in search field which has no matching entry
    Then No rows is displayed
