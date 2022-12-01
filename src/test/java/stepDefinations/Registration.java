package stepDefinations;

import java.util.List;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class Registration extends TestBase{

	public RegistrationPage registration = new RegistrationPage();


	@When("Admin\\/User\\/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page() {

		String title = driver.getTitle();
		Assert.assertEquals("Registration", title);
		System.out.println("User is on " +title);

	}

	@Then("^Admin\\/User\\/Staff sees a button with text \"(.*)\" on the form$")
	public void admin_user_staff_sees_a_button_with_text_Log_in_on_the_form(String buttontxt) {

		String display =registration.loginbtnDisplay(buttontxt);
		Assert.assertEquals(buttontxt, display);
		System.out.println(buttontxt+" is displayed");
	}


	@Given("Admin\\/User\\/Staff is on the Registeration Page")
	public void admin_user_staff_is_on_the_registeration_page() {

		String title = driver.getTitle();
		Assert.assertEquals("Registration", title);
		System.out.println("User is on " +title);
	}


	@When("Admin\\/User\\/Staff selects the Log in button")
	public void admin_user_staff_selects_the_log_in_button() {

		registration.loginbtnClick();

	}

	@Then("Admin\\/User\\/Staff lands on Log in page")
	public void admin_user_staff_lands_on_log_in_page() {

		String title = driver.getTitle();
		Assert.assertEquals("Log in", title);
		System.out.println("User is on " +title);

	}


	@Then("^Admin\\/User\\/Staff sees a button with text as \"(.*)\" on the form$")
	public void admin_user_staff_sees_a_button_with_text_as_Sign_Up_on_the_form(String button) {

		String display = registration.signUpbtnDisplay(button);
		Assert.assertEquals(button, display);
		System.out.println(button+" is displayed");
	}

	@When("^Admin\\/User\\/Staff Enters the First Name \"(.*)\" in Alphabets only$")
	public void admin_user_staff_enters_the_First_Name_in_alphabets_only(String firstname) {

		registration.firstNametxtBx(firstname);

	}

	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {

		registration.CheckfirstName();

	}

	@When("^Admin\\/User\\/Staff Enters the Last Name \"(.*)\" in Alphabets only$")
	public void admin_user_staff_enters_the_Last_Name_in_alphabets_only(String lastname) {

		registration.lastNametxtBx(lastname);

	}

	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed() {

		registration.CheckLastName();

	}

	@When("^Admin\\/User\\/Staff Enters the Address \"(.*)\" in Alpha Numerics and \\/or Symbols$")
	public void admin_user_staff_enters_the_address_in_alpha_numerics_and_or_symbols(String address) {

		registration.addresstxtBx(address);
	}

	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {

		registration.CheckAddress();
	}

	@When("^Admin\\/User\\/Staff Enters the Street name \"(.*)\" using Alpha Numerics and or Symbols$")
	public void admin_user_staff_enters_the_street_name_using_alpha_numerics_and_or_symbols(String streetname) {

		registration.streetNametxtBx(streetname);
	}

	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed() {

		registration.CheckstreetName();
	}

	@When("^Admin\\/User\\/Staff Enters the five digit Zip code \"(.*)\" using Numbers only$")
	public void admin_user_staff_enters_the_five_digit_zip_code_using_numbers_only(String zip) {

		registration.zipCodeBx(zip);

	}

	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {

		registration.CheckzipCode();
	}

	@When("^Admin\\/User\\/Staff Enters the City Name \"(.*)\" in Alphabets only$")
	public void admin_user_staff_enters_the_city_name_in_alphabets_only(String city) {

		registration.citytxtBx(city);
	}

	@Then("The City will be displayed")
	public void the_city_will_be_displayed() {

		registration.Checkcity();
	}

	@When("Admin\\/User\\/Staff selects the respective State Name from the DropBox")
	public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {

		registration.statedrpDwn();
	}

	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {

		registration.CheckState();
	}

	@When("^Admin\\/User\\/Staff Enters the valid ten digit Mobile number \"(.*)\" in Numerics$")
	public void admin_user_staff_enters_the_valid_ten_digit_mobile_number_in_numerics(String phonenumber) {

		registration.phoneNotxtBx(phonenumber);
	}

	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {

		registration.CheckphoneNo();
	}

	@When("Admin\\/User\\/Staff Selects the Date of Birth from the Calender")
	public void admin_user_staff_selects_the_date_of_birth_from_the_calender() {

		registration.birtDatecalendar();
	}

	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {

		registration.CheckBirtDate();
	}

	@When("^Admin\\/User\\/Staff  Enters the valid Password with one Upper case, one Numeric , one special charecter , eight charecters \"(.*)\"$")
	public void admin_user_staff_enters_the_valid_password_with_one_upper_case_one_numeric_one_special_charecter_eight_charecters(String password) {

		registration.passwordtxt(password);
	}

	@Then("Admin\\/User\\/Staff Password will be displayed")
	public void admin_user_staff_password_will_be_displayed() {

		registration.CheckPassword();
	}

	@When("^Admin\\/User\\/Staff Enters the valid UserName \"(.*)\"$")
	public void admin_user_staff_enters_the_valid_user_name(String username) {

		registration.userNametxtBx(username);
	}

	@Then("Admin\\/User\\/Staff UsesrName will be displayed")
	public void admin_user_staff_usesr_name_will_be_displayed() {

		registration.CheckUserName();
	}

	@When("^Admin\\/User\\/Staff Enters the valid Email \"(.*)\"$")
	public void admin_user_staff_enters_the_valid_email(String email) {

		registration.emailIdtxtBx(email);
	}

	@Then("Admin\\/User\\/Staff Email will be displayed")
	public void admin_user_staff_email_will_be_displayed() {

		registration.CheckEmailId();
	}

	@When("Admin\\/User\\/Staff enters submit button with all fields empty")
	public void admin_user_staff_enters_submit_button_with_all_fields_empty() {
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for empty fields as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_Enters_all_fields(String expectedmsg) {

		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid First Name as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name(String firstname) {
		registration.firstNametxtBx(firstname);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a Message \"(.*)\"$")
	public void admin_user_staff_should_get_a_Message_enter_valid_first_name(String expectedmsg) {

		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Last Name as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name_as(String lastname) {
		registration.lastNametxtBx(lastname);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_last_name(String expectedmsg) {

		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Address by not Providing House Number as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number_as(String address) {
		registration.addresstxtBx(address);
		registration.signUpbtnClick();
	}


	@Then("^Admin\\/User\\/Staff should get a invalid address message as \"(.*)\"$")
	public void admin_user_staff_should_get_a_invalid_address_message_enter_valid_address(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Street Name as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name_as(String streetname) {
		registration.streetNametxtBx(streetname);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_street_name(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Zip as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_zip_as(String zip) {
		registration.zipCodeBx(zip);
		registration.signUpbtnClick();
	}

	@Then("^Admin/User/Staff should get a message for zip as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_zip(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid City as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_city_as(String city) {
		registration.citytxtBx(city);
		registration.signUpbtnClick();
	}

	@Then("^Admin/User/Staff should get a message for city as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_city(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button without selecting State")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_state(DataTable table) {
		List<List<String>> data = table.cells();

		registration.firstNametxtBx(data.get(1).get(1));
		registration.lastNametxtBx(data.get(2).get(1));
		registration.addresstxtBx(data.get(3).get(1));
		registration.streetNametxtBx(data.get(4).get(1));
		registration.citytxtBx(data.get(5).get(1));
		registration.zipCodeBx(data.get(6).get(1));
		registration.userNametxtBx(data.get(7).get(1));
		registration.emailIdtxtBx(data.get(8).get(1));
		registration.phoneNotxtBx(data.get(9).get(1));
		registration.passwordtxt(data.get(10).get(1));
		registration.birtDatecalendar();
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for state field as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_state_is_required(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Phone Number as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number_as(String phonenumber) {
		registration.phoneNotxtBx(phonenumber);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for phone number as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_phone_number(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button without selecting BirthDate")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date(DataTable table) {
		List<List<String>> data = table.cells();

		registration.firstNametxtBx(data.get(1).get(1));
		registration.lastNametxtBx(data.get(2).get(1));
		registration.addresstxtBx(data.get(3).get(1));
		registration.streetNametxtBx(data.get(4).get(1));
		registration.citytxtBx(data.get(5).get(1));
		registration.zipCodeBx(data.get(6).get(1));
		registration.userNametxtBx(data.get(7).get(1));
		registration.emailIdtxtBx(data.get(8).get(1));
		registration.phoneNotxtBx(data.get(9).get(1));
		registration.passwordtxt(data.get(10).get(1));
		registration.statedrpDwn();
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for birthdate as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_birth_date_is_required(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Admin\\/User\\/Staff Name as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name_as(String username) {
		registration.userNametxtBx(username);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for name as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("^Admin\\/User\\/Staff clicks Sign Up button with invalid Password as \"(.*)\"$")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_password_as(String password) {
		registration.passwordtxt(password);
		registration.signUpbtnClick();
	}

	@Then("^Admin\\/User\\/Staff should get a message for password as \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_enter_valid_password(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}



	@When("Admin\\/User\\/Staff Clicks on Sign Up button after entering all valid details")
	public void admin_user_staff_clicks_on_sign_up_button_after_entering_all_valid_details(DataTable table) {

		List<List<String>> data = table.cells();

		registration.firstNametxtBx(data.get(1).get(1));
		registration.lastNametxtBx(data.get(2).get(1));
		registration.addresstxtBx(data.get(3).get(1));
		registration.streetNametxtBx(data.get(4).get(1));
		registration.citytxtBx(data.get(5).get(1));
		registration.zipCodeBx(data.get(6).get(1));
		registration.userNametxtBx(data.get(7).get(1));
		registration.emailIdtxtBx(data.get(8).get(1));
		registration.phoneNotxtBx(data.get(9).get(1));
		registration.passwordtxt(data.get(10).get(1));
		registration.statedrpDwn();
		registration.birtDatecalendar();
		registration.signUpbtnClick();				 
	}

	@Then("^Admin\\/User\\/Staff should get a success message \"(.*)\"$")
	public void admin_user_staff_should_get_a_message_registeration_successful(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	   
	}

	@When("User clicks Sign Up button with existing Admin\\/User\\/Staff name")
	public void user_clicks_sign_up_button_with_existing_admin_user_staff_name_as(DataTable table) {
		List<List<String>> data = table.cells();

		registration.firstNametxtBx(data.get(1).get(1));
		registration.lastNametxtBx(data.get(2).get(1));
		registration.addresstxtBx(data.get(3).get(1));
		registration.streetNametxtBx(data.get(4).get(1));
		registration.citytxtBx(data.get(5).get(1));
		registration.zipCodeBx(data.get(6).get(1));
		registration.userNametxtBx(data.get(7).get(1));
		registration.emailIdtxtBx(data.get(8).get(1));
		registration.phoneNotxtBx(data.get(9).get(1));
		registration.passwordtxt(data.get(10).get(1));
		registration.statedrpDwn();
		registration.birtDatecalendar();
		registration.signUpbtnClick();

	}

	@Then("Admin\\/User\\/Staff should see the message \"(.*)\"$")
	public void admin_user_staff_should_see_the_message_admin_user_staff_name_already_exist(String expectedmsg) {
		String actualmsg =registration.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}


}
