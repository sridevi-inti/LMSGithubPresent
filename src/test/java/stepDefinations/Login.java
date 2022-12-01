package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProgramPage;
import pages.RegistrationPage;

public class Login extends TestBase{
	
	RegistrationPage registration;
	LoginPage login;
	ProgramPage Ppage;
	

	@Given("Admin\\/User\\/Staff is on the Registration page")
	public void admin_user_staff_is_on_the_registration_page() {
		
		registration = new RegistrationPage();
		registration.validateRegistrationPage();
	}

	@When("Admin\\/User\\/Staff clicks on the login button")
	public void admin_user_staff_clicks_on_the_login_button() {
		login = new LoginPage();
		login.loginBtn();
		}

	@Then("Admin\\/User\\/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {
		login = new LoginPage();
		login.validateLoginPage();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		login.validateLoginPage();
		System.out.println("User is on login page");
		
	}

	@When("^user clicks on login button after entering username as \"(.*)\" and password as \"(.*)\"$")
	public void user_clicks_on_login_button_after_entering_username_and_password(String username, String password) {
		login = new LoginPage();
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();
	}

	@Given("admin\\/staff is on login page")
	public void admin_staff_is_on_login_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Login", title);
		System.out.println("User is on " + title + "page");
	}

	@When("^admin\\/staff clicks on login button after entering username as \"(.*) and password as \"(.*)$")
	public void admin_staff_clicks_on_login_button_after_entering_username_and_password(String username, String password) {
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();
		
	}

	@Then("^user should see an error message \"(.*)\"$")
	public void user_should_see_an_error_message(String expectedmsg) {
		
		String actualmsg =login.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("user clicks on login button after entering valid username as \"(.*)\" and invalid password as \"(.*)\"$")
	public void user_clicks_on_login_button_after_entering_valid_username_and_invalid_password(String username, String password) {
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();	   
	}
	
	@When("user clicks on login button after entering invalid username as \"(.*)\" and valid password as \"(.*)\"$")
	public void user_clicks_on_login_button_after_entering_invalid_username_as_and_valid_password(String username, String password) {
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();	   
	}
	
    @When("user clicks on login button after entering invalid username as \"(.*) and invalid password as \"(.*)$")
	public void user_clicks_on_login_button_after_entering_invalid_username_as_and_invalid_password(String username, String password) {
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();	
    }
    @When("user clicks on login button after entering valid username as \"(.*) and leaves password empty$")
	public void user_clicks_on_login_button_after_entering_valid_username_as_and_leaves_password_empty(String username) {
		login.userNameTxt(username);
		login.loginBtn();	
    }
		
		
	@When("Admin\\/Staff user clicks on login button after entering valid username as \"(.*), invalid password as \"(.*), and invalid code as \"(.*)$")
	public void admin_staff_user_clicks_on_login_button_after_entering_valid_invalid_and_invalid(String username, String password, String code) {
	   login.userNameTxt(username);
	   login.passwordTxt(password);
	   login.EnterCode(code);
	   login.loginBtn();
	}

	@Then("Admin\\/Staff should see an error message \"(.*)\"$")
	public void admin_staff_should_see_an_error_message(String expectedmsg) {
		
		String actualmsg =login.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
		}

	@When("Admin\\/Staff user clicks on login button after entering invalid username as \"(.*), invalid password as \"(.*), and leaves code empty$")
	public void admin_staff_user_clicks_on_login_button_after_entering_invalid_username_as_invalid_password_as_and_leaves_code_empty(String username, String password) {
		login.userNameTxt(username);
		login.passwordTxt(password);
		login.loginBtn();
	}

	@Given("Admin\\/User\\/Staff is on Login Page")
	public void admin_user_staff_is_on_login_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Login", title);
		System.out.println("Admin/user/staff is on " + title + "page");
	}

	@When("Admin\\/User\\/Staff clicks Forgot password link")
	public void admin_user_staff_clicks_forgot_password_link() {
		login.ForgotPwdBtnClick();		
	}
	

	@Then("Admin\\/User\\/Staff should redirected to forgot Password page")
	public void admin_user_staff_should_redirected_to_forgot_password_page() {
	   login.validateForgotPwd();
	}

	@Given("Admin\\/User\\/Staff is on Forgot Password Page")
	public void admin_user_staff_is_on_forgot_password_page() {
		login.validateForgotPwd();
	}

	@When("Admin\\/User\\/Staff clicks continue button after entering valid email address")
	public void admin_user_staff_clicks_continue_button_after_entering_valid_email_address() {
		login.ContinueBtnClick();
	}

	@Then("Admin\\/User\\/Staff should be redirected to enter verification code page")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page() {
	}

	@And("verification code will be sent to email")
	public void verification_code_will_be_sent_to_email_need_to_ask() {
		
		String expectedmsg = login.ComposeEmail();
		String actualmsg =login.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@Given("Admin\\/User\\/Staff is on Enter verification code Page")
	public void admin_user_staff_is_on_enter_verification_code_page() {
		login = new LoginPage();
		login.validateEnterVerifiCode();
	
	}

	@When("Admin\\/User\\/Staff clicks continue button after entering verification code as \"(.*)$")
	public void admin_user_staff_clicks_continue_button_after_entering_verification_code_as(String code) {
		login.EnterVerifcationCode();
		
	}

	@Then("Admin\\/User\\/Staff should be redirected to reset password page")
	public void admin_user_staff_should_be_redirected_to_reset_password_page() {
		login = new LoginPage();
		login.ValidateResetPassword();		
	}


	@When("Admin\\/User\\/Staff clicks {string} link to resend")
	public void admin_user_staff_clicks_link_to_resend(String string) {
		login.ClickHereToResend();
	}

	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email(String text) {
		String actualmsg =login.ResendText(text);
		Assert.assertEquals(text,actualmsg);
		System.out.println(actualmsg);
	}

	@Given("Admin\\/User\\/Staff is on Reset Password Page")
	public void admin_user_staff_is_on_reset_password_page() {
		login.ResetPwd();
		String title = driver.getTitle();
		Assert.assertEquals("Reset Password",title);
		System.out.println("User is on " + title + "page");
	}
	
	@When("Admin/User/staff clicks submit button after entering new password as \"(.*) and retype password as \"(.*)$")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_as__and_retype_password(String password, String newpassword) {
		login.NewPasswordTxt(password);
		login.RetypePasswordTxt(newpassword);
		login.SubmitBtnClick();
		
	}

	@Then("Admin\\/User\\/Staff  should be redirected to login page")
	public void admin_user_staff_should_be_redirected_to_login_page() {
		login.validateLoginPage();
	}

	@When("Admin\\/User\\/Staff  clicks submit button after entering new password \"(.*) and retype password \"(.*)$")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password(String password, String newpassword) {
		login.NewPasswordTxt(password);
		login.RetypePasswordTxt(newpassword);
		login.SubmitBtnClick();
	}

	@Then("Admin\\/User\\/Staff  should see an error message \"(.*)$")
	public void admin_user_staff_should_see_an_error_message(String expectedmsg) {
		String actualmsg =login.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin/User/Staff clicks submit button after entering password \"(.*)  with less than eight characters")
	public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(String password) {
		login.NewPasswordTxt(password);
		login.SubmitBtnClick();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expectedmsg) {
		String actualmsg =login.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin/User/Staff clicks submit button after entering password \"(.*) without Capital letter")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter(String password) {
		login.NewPasswordTxt(password);
		login.SubmitBtnClick();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering  password \"(.*) without Number")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_number(String password, String newpassword) {
		login.NewPasswordTxt(password);
		login.RetypePasswordTxt(newpassword);
		login.SubmitBtnClick();
	}

	@When("Admin/User/Staff clicks submit button after entering password \"(.*) without Special character")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character(String password) {
		login.NewPasswordTxt(password);
		login.SubmitBtnClick();
	}

	@When("Admin\\/User\\/Staff clicks cancel button after leaving password and retype password empty")
	public void admin_user_staff_clicks_cancel_button_after_leaving_password_and_retype_password_empty() {
		login.CancelBtnClick();
	}

	@Then("Admin\\/User\\/Staff  should see a refreshed reset password page with empty fields")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields(String password, String newpassword) {
		
		login.validateRefreshPwdPage();
				
	}

	
	

}
