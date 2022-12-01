Feature: Validating the text fields on the Registration page

  Background: 
    Given Admin/User/Staff is on to LMS website

  Scenario: Enter the First Name field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the First Name "FirstName" in Alphabets only
    Then The First Name will be displayed

  Scenario: Enter the Last Name Field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the Last Name "LastName" in Alphabets only
    Then The Last Name will be displayed

  Scenario: Enter the Address Field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the Address "365 milton place" in Alpha Numerics and /or Symbols
    Then The Address will be displayed

  Scenario: Enter the Street Name Field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the Street name "xyz123" using Alpha Numerics and or Symbols
    Then The Street Name will be displayed

  Scenario: Enters the Zip field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the five digit Zip code "12345" using Numbers only
    Then The Zip code will be displayed

  Scenario: Enters the City field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the City Name "Abc" in Alphabets only
    Then The City will be displayed

  Scenario: Selects the State field
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff selects the respective State Name from the DropBox
    Then The State Name will be displayed

  Scenario: Enter the Phone Number
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the valid ten digit Mobile number "1234567898" in Numerics
    Then The Mobile Number will be displayed

  Scenario: Selects the Birth Date
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Selects the Date of Birth from the Calender
    Then Birth Date will be Displayed

  Scenario: Enter valid Password
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff  Enters the valid Password with one Upper case, one Numeric , one special charecter , eight charecters "S1@wertyuio"
    Then Admin/User/Staff Password will be displayed

  Scenario: Enter Valid UserName
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the valid UserName "Test user"
    Then Admin/User/Staff UsesrName will be displayed

  Scenario: Enter Valid Email
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Enters the valid Email "testuser@abc.com"
    Then Admin/User/Staff Email will be displayed

  Scenario: Validating the Sign Up form with all fields empty
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff enters submit button with all fields empty
    Then Admin/User/Staff should get a message for empty fields as "Enters all fields"

  Scenario: Validating the First Name field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid First Name as "re4354@@"
    Then Admin/User/Staff should get a Message "Enter valid First Name"

  Scenario: Validating the Last Name field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Last Name as "@@@@@"
    Then Admin/User/Staff should get a message as "Enter valid Last Name"

  Scenario: Validating the Address field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number as "@@^^^@@@"
    Then Admin/User/Staff should get a invalid address message as "Enter valid Address"

  Scenario: Validating the Street Name field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Street Name as "****"
    Then Admin/User/Staff should get a message "Enter valid Street Name"

  Scenario: Validating the Zip field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Zip as "@@13$$*"
    Then Admin/User/Staff should get a message for zip as "Enter valid Zip"

  Scenario: Validating the City field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid City as "as@@13$$*"
    Then Admin/User/Staff should get a message for city as "Enter valid City"

  #used cucumber data table
  Scenario: Validating the State field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button without selecting State
      | Fields        | Values           |
      | First Name    | Jerry            |
      | Last Name     | Win              |
      | Address       | 365 milton place |
      | Street Name   | xyz123           |
      | city          | abcd             |
      | zipcode       |            12345 |
      | username      | Test user        |
      | Email Address | testuser@abc.com |
      | phonenumber   |       1234567898 |
      | Password      | Password1        |
    Then Admin/User/Staff should get a message for state field as "State is required"

  Scenario: Validating the Phone Number field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Phone Number as "123456@#4"
    Then Admin/User/Staff should get a message for phone number as "Enter valid Phone Number"

  #used cucumber data table
  Scenario: Validating the BirthDate field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button without selecting BirthDate
      | Fields        | Values           |
      | First Name    | Tom              |
      | Last Name     | Jerry            |
      | Address       | 365 milton place |
      | Street Name   | xyz123           |
      | city          | abcd             |
      | zipcode       |            12345 |
      | username      | Test user        |
      | Email Address | testuser@abc.com |
      | phonenumber   |       1234567898 |
      | Password      | Password1        |
    Then Admin/User/Staff should get a message for birthdate as "BirthDate is required"

  Scenario: Validating the UserName field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name as "@@##"
    Then Admin/User/Staff should get a message for name as "Please Enter valid Admin/User/Staff Name"

  Scenario: Validating the Password field on Registeration Page
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff clicks Sign Up button with invalid Password as "22@@#**12#"
    Then Admin/User/Staff should get a message for password as "Enter valid Password"

  #used cucumber data table
  Scenario: Validating Sign Up form with valid data
    Given Admin/User/Staff is on the Registeration Page
    When Admin/User/Staff Clicks on Sign Up button after entering all valid details
      | Fields        | Values           |
      | First Name    | Jerry            |
      | Last Name     | Tom              |
      | Address       | 365 milton place |
      | Street Name   | xyz123           |
      | city          | abcd             |
      | zipcode       |            12345 |
      | username      | Test user        |
      | Email Address | testuser@abc.com |
      | phonenumber   |       1234567898 |
      | Password      | Password1        |
    Then Admin/User/Staff should get a success message "Registeration successful"

  #used cucumber data table
  Scenario: Validating the signup form with existing name
    Given Admin/User/Staff is on the Registeration Page
    When User clicks Sign Up button with existing Admin/User/Staff name
      | Fields        | Values           |
      | First Name    | Jerry            |
      | Last Name     | Tom              |
      | Address       | 365 milton place |
      | Street Name   | xyz123           |
      | city          | abcd             |
      | zipcode       |            12345 |
      | username      | Test user        |
      | Email Address | testuser@abc.com |
      | phonenumber   |       1234567898 |
      | Password      | Password1        |
    Then Admin/User/Staff should see the message "Admin/User/Staff name already exist"
