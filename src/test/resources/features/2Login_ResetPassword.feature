Feature: Reset password


  Background: user is on Reset password page
    Given Admin/User/Staff is on to LMS website

  Scenario: Validate Reset password
    Given Admin/User/Staff is on Reset Password Page
		When Admin/User/staff clicks submit button after entering new password as "abc123" and retype password as "abc123" 
		Then Admin/User/Staff  should be redirected to login page
		
 Scenario: Validate Reset password on mismatch
    Given Admin/User/Staff is on Reset Password Page
		When Admin/User/Staff  clicks submit button after entering new password ""abc123" and retype password "abc1233" 
	  Then Admin/User/Staff  should see an error message "password and retype password are mismatched"
	  
 Scenario: Validate Reset password with lessthan 8 characters
		When Admin/User/Staff clicks submit button after entering password "abc123"  with less than eight characters
		Then It should display an error message "The password must contain 8 characters"
		
 Scenario: Validate Reset password without capital letter
    Given Admin/User/Staff is on Reset Password Page
		When Admin/User/Staff clicks submit button after entering password "abc123" without Capital letter 
		Then It should display an error message "The password must contain one Capital letter"

 Scenario:  Validate Reset password without number
     Given Admin/User/Staff is on Reset Password Page
		When Admin/User/Staff clicks submit button after entering  password "abcjohn" without Number
		Then It should display an error message "The password must contain one Number"

		
 Scenario: Validate Reset password without special character
    Given Admin/User/Staff is on Reset Password Page
		When Admin/User/Staff clicks submit button after entering password "abcjohn" without Special character
		Then It should display an error message "The password must contain one Special character"

 Scenario: Validate Reset password with cancel button
    Given Admin/User/Staff is on Reset Password Page
		When Admin/User/Staff clicks cancel button after leaving password and retype password empty
		Then Admin/User/Staff  should see a refreshed reset password page with empty fields
