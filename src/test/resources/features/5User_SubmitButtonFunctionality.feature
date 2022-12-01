Feature: Submit button functionality

  Background: 
    Given Admin/User/Staff Logged on to LMS website
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: Validating the User Details window with all fields empty
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks submit button with all details empty
    Then Admin/User/Staff should see a Error message Mandatory Fields Cannot Be Empty

  Scenario: Adding new User
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks Submit button by entering all valid values in required fields
      | Fields        | Values           |
      | First name    | Jerry            |
      | Middle name   | John             |
      | Last name     | Kris             |
      | Email address | testuser@abc.com |
      | Phone no      |       1234567898 |
      | Address       | 365 milton place |
      | City          | abcd             |
      | State         | California       |
      | Postal Code   |            12345 |
      | Program       | abcd123          |
      | UG Program    | Hello World      |
      | PG Program    | xyz123           |
      | Skill         | abc              |
      | Experience    | qrst             |
      | User Role     | Test user        |
      | Visa Status   | 1 year           |
      | Batch         | plan             |
      | Comments      | Good             |
    Then Admin/User/Staff  see Success message New User Created Should be Saved
