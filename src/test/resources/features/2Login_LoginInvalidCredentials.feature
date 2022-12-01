
Feature: Login-Invalid Credentials

 Background: 
    Given Admin/User/Staff is on to LMS website

 Scenario: User login with valid username and invalid password
    Given user is on login page
    When user clicks on login button after entering valid username as "test123" and invalid password as "abcxyz"
   	Then user should see an error message "Entered invalid password"
      
 Scenario: User login with invalid username and valid password
    Given user is on login page
    When user clicks on login button after entering invalid username as "testnew" and valid password as "abctest"
    Then user should see an error message "Entered invalid username"  
      
 Scenario: User login with invalid username and invalid password
    Given user is on login page
    When user clicks on login button after entering invalid username as "testnew" and invalid password as "abcxyz"
    Then user should see an error message "The username and password are incorrect"
    
      	
 Scenario: User login with valid username and leaves password empty
    Given user is on login page
    When user clicks on login button after entering valid username as "testnew" and leaves password empty
    Then user should see an error message "enter valid password"
    
 Scenario: Admin/Staff with valid username, invalid password and code
    Given admin/staff is on login page
    When Admin/Staff user clicks on login button after entering valid username as "Abcsrs", invalid password as "abc123", and invalid code as "2345"
   	Then Admin/Staff should see an error message "Entered invalid username"
    
   
Scenario: Admin/Staff with invalid username and invalid password without code
    Given admin/staff is on login page
  	When Admin/Staff user clicks on login button after entering invalid username as "Abcsrs", invalid password as "welcomeabc", and leaves code empty
    Then Admin/Staff should see an error message "The code is required"
    
   