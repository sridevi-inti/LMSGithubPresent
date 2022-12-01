package stepDefinations;

import java.util.List;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProgramPage;
import pages.UserPage;

public class User extends TestBase{
	
	ProgramPage Ppage;	
	UserPage UserPage;
	

	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
		Ppage = new ProgramPage();
		Ppage.manageProgramValidate();
	}

	@When("Admin\\/User\\/Staff clicks the Tab User")
	public void admin_user_staff_clicks_the_tab_User(String string) {
	    UserPage = new UserPage();
	    UserPage.UserBtnClick();
	}

	@Then("Admin\\/User\\/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage User", title);
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage User", title);
	}

	@Then("Admin\\/User\\/Staff should see the page heading as Manage User")
	public void admin_user_staff_should_see_the_page_heading_as_manage_user(String text) {
		boolean display = UserPage.MgeUserHeading(text);
		if(display == true) {
			System.out.println(text+" is displayed");
		}
		else {
			System.out.println(text+" not displayed");
		}

	}

	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage User", title);}

	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer int1) {
	   UserPage.isPaginationEnable(int1);
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	   Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
		UserPage.isPaginationEnable(int1);
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
		   UserPage.tableValue();
	}

	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {
	    UserPage.NextPageArrowClick();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed(String expectedMsg) {
		String actualMsg = UserPage.Message1(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}

	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {
		UserPage.ValidateUserName();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {
	    UserPage.PrevioustPageArrowClick();
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		UserPage.ValidateUserName();
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@When("Admin\\/User\\/Staff clicks << icon in pagination")
	public void admin_user_staff_clicks_icon_in_pagination() {
	    UserPage.PrevioustPageArrowClick();
	}

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@When("Admin\\/User\\/Staff clicks >> icon in pagination")
	public void admin_user_staff_clicks_the_icon_in_pagination() {
		UserPage.NextPageArrowClick();
	}

	@Then("Admin\\/User\\/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {
		Assert.assertEquals(UserPage.isNextPageArrowEnabled(), UserPage.expectedResult);
	}

	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
		UserPage.ValidateUserName();
	}

	@Then("^Admin\\/User\\/Staff should see the text \"(.*) beow the user table")
	public void admin_user_staff_should_see_the_text_beow_the_user_table(String footertext) {
		String actualmsg =UserPage.footerText(footertext);
		Assert.assertEquals(footertext,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("Admin\\/User\\/Staffshould see the table footer as \"(.*)$")
	public void admin_user_staffshould_see_the_table_footer_as(String footertext) {
		String actualmsg =UserPage.footerText(footertext);
		Assert.assertEquals(footertext,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("^Admin\\/User\\/Staff should see the button with text \"(.*)$")
	public void admin_user_staff_should_see_the_button_with_text(String string) {
	   UserPage.clickANewUser();
	}

	@Then("^Admin\\/User\\/Staff should see the \"(.*) dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String string) {
		String username = UserPage.ValidateUserName();
		Assert.assertEquals(username, "User Details");
		System.out.println("Entries for search User details are shown");
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user() {
		UserPage.ValidateUserName();
	}

	@Then("Admin\\/User\\/Staff should see the table header as \"Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void admin_user_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
	    UserPage.tableHeader();
	}

	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {
	    UserPage.UserAscOrderbtn();
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
	    UserPage.tableValue();
	}

	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
	    UserPage.CheckBox();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
		boolean selected =UserPage.SelectAllCheckbox();
		if(selected == true) {
			System.out.println("Check box are selected");
		}
		else {
			System.out.println("Check box are not selected");
		}
	}

	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
	    UserPage.uncheckCheckBox();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
	    UserPage.UncheckAllROwsCheckBox();
	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		boolean display =UserPage.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}

	@When("No rows is checked")
	public void no_rows_is_checked() {
		UserPage.uncheckCheckBox();
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		boolean display =UserPage.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		boolean display =UserPage.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}

	@Given("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
		boolean selected =UserPage.SelectAllCheckbox();
		if(selected == true) {
			System.out.println("Check box are selected");
		}
		else {
			System.out.println("Check box are not selected");
		}
	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	    UserPage.deleteMultiRowBtnClick();
	}

	@Then("^Confirm dialog box should be displayed with Text \"(.*)\" , button with text No , the button with text yes and close icon$")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_no_the_button_with_text_yes_and_close_icon1(String cfmDialogBox) {
		
		String cfmDialogBoxMessage = UserPage.confirmDilogBxMessage(cfmDialogBox);
		Assert.assertEquals(cfmDialogBoxMessage,cfmDialogBox);
		
	}
		

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon(String cfmDialogBox) {
		cfmDialogBox = UserPage.confirmDilogBx();

	}

	@When("Admin\\/User\\/Staff clicks button with text \"(.*)$")
	public void admin_user_staff_clicks_button_with_text(String string) {
	    UserPage.NoButtonClick();
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		UserPage.tableValue();
	}

	@Then("^Selected rows should be deleted and popup should be shown with success message \"(.*)$")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
	    UserPage.DeleteBtnClick();
	    UserPage.Message3(string);
	}

	@When("Admin\\/User\\/Staff clicks the close icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
	    UserPage.CloseBtnClick();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
	    UserPage.tableHeader();
	}



	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as Search")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
	    UserPage.SearchInputTxtVisible();
	}

	@When("Admin\\/User\\/Staff types Name to search")
	public void admin_user_staff_types_name_to_search(String string) {
	    UserPage.EnterNameToSearch(string);
	    UserPage.SubmitBtnClick();
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed(String expectedMsg) {
		UserPage.SearchInputNameVisible();
	}

	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry(String string) {
	    UserPage.EnterNameToSearch(string);
	    UserPage.SubmitBtnClick();
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed(String string) {
	    UserPage.Message3(string);

	}

	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
	    UserPage.EditBtnVisible();
	    UserPage.DeleteBtnVisible();
	}

	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
	    UserPage.DeleteBtnClick();
	}



	@Then("User Details dialog box should be displayed for editing")
	public void user_details_dialog_box_should_be_displayed_for_editing(String EditDilogBox) {
		 EditDilogBox = UserPage.validateEditDialogBox();
		Assert.assertEquals(EditDilogBox, "Are you sure you want to delete ");
	}

	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
	    UserPage.ClickOnId();
	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
	    UserPage.validateEditDialogBox();
	}

	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
	    UserPage.clickANewUser();
	}

	@Then("^Admin\\/User\\/Staff should see User Details window with text as \"(.*)$")
	public void admin_user_staff_should_see_user_details_window_with_text_as(String expectedmsg) {
		String actualmsg = UserPage.clickAUser(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
		UserPage.clickANewUserdetails();
	}

	@Given("Admin\\/User\\/Staff is on User Details window")
	public void admin_user_staff_is_on_user_details_window() {
		String title = driver.getTitle();
		Assert.assertEquals("User details Window", title);
		System.out.println("User is on " + title + " Page" );
	}

	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
	    UserPage.CancelBtnClick();
	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage User", title);
	}

	@Then("Admin\\/User\\/Staff should see a cancel icon")
	public void admin_user_staff_should_see_a_cancel_icon() {
	    UserPage.CancelIconVisible();
	}

	@When("Admin\\/User\\/Staff clicks cancel icon")
	public void admin_user_staff_clicks_cancel_icon() {
	    UserPage.CancelIconClick();
	}

	@Then("User Details window should be closed")
	public void user_details_window_should_be_closed() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage User", title);
	}

	@Then("Admin\\/User\\/Staff should see the placeholders with Text As First name,Middle name, Lastname,Email Adress,Phone No, Address,City, State, Postal Code, Program, UG Program, PG Program, Skill, Experience, Admin\\/User\\/Staff Role, Visa Status, Batch, Comments")
	public void admin_user_staff_should_see_the_placeholders_with_text_as_first_name_middle_name_lastname_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_batch_comments() {
	    UserPage.PlaceholderDetailsVisible();
	    
	}
	@Then("Admin\\/User\\/Staff should see the input fields for First Name, Middle Name, Last Name, Email Adress, Phone No, Address, City, State, Postal Code, Program, UG Program, PG Program, Skill, Experience, Admin\\/User\\/Staff Role, Visa Status, Batch, Comments corresponding to their labels")
	public void admin_user_staff_should_see_the_input_fields_for_first_name_middle_name_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_batch_comments_corresponding_to_their_labels() {
	    UserPage.InputFieldDetailsVisible();
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
	    UserPage.clickdropDownforState();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
		UserPage.viewStateDropdown();	
		}

	@When("Admin\\/User\\/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
		UserPage.clickdropDownforUserRole();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
	    UserPage.viewUserRoleDropdown();
	}

	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
		UserPage.SubmitBtnClick();
	}

	@Then("Admin\\/User\\/Staff should see a Error message Mandatory Fields Cannot Be Empty")
	public void admin_user_staff_should_see_a_error_message_mandatory_fields_cannot_be_empty(String expectedmsg) {
		String actualmsg =UserPage.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin\\/User\\/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields(DataTable table) {
		List<List<String>> data = table.cells();

		UserPage.firstNametxtBx(data.get(1).get(1));
		UserPage.middleNametxtBx(data.get(2).get(1));
		UserPage.lastNametxtBx(data.get(3).get(1));
		UserPage.emailIdtxtBx(data.get(4).get(1));
		UserPage.phoneNotxtBx(data.get(5).get(1));
		UserPage.addresstxtBx(data.get(6).get(1));
		UserPage.citytxtBx(data.get(7).get(1));
		UserPage.statedrpDwn();
		UserPage.PostalCodeBx(data.get(8).get(1));
		UserPage.ProgramtxtBx(data.get(9).get(1));
		UserPage.UGdrpDwn();
		UserPage.PGProgramtxtBx(data.get(10).get(1));
		UserPage.SkilltxtBx(data.get(11).get(1));
		UserPage.ExperiencetxtBx(data.get(12).get(1));
		UserPage.UserRoledrpDwn();
		UserPage.VisaStatustxtBx(data.get(13).get(1));
		UserPage.BatchtxtBx(data.get(14).get(1));
		UserPage.CommentstxtBx(data.get(15).get(1));
		
	}

	@Then("Admin\\/User\\/Staff  see Success message New User Created Should be Saved")
	public void admin_user_staff_see_success_message_new_user_created_should_be_saved(String expectedmsg) {
		String actualmsg =UserPage.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	 
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {
	  UserPage.statedrpDwn();
	  UserPage.SubmitBtnClick();
		
	}

	@Then("Admin\\/User\\/Staff see error message Name Is Required")
	public void admin_user_staff_see_error_message_name_is_required(String expectedmsg) {
		String actualmsg =UserPage.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}


	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address(String email) {
		UserPage.emailIdtxtBx(email);
		  UserPage.SubmitBtnClick();
	}

	@Then("Admin\\/User\\/Staff see error message Invalid Email Address")
	public void admin_user_staff_see_error_message_invalid_email_address(String expectedmsg) {
		String actualmsg =UserPage.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin\\/User\\/Staff Enters more than {int} digits")
	public void admin_user_staff_enters_more_than_digits(String phonenumber) {
		UserPage.phoneNotxtBx(phonenumber);
		  UserPage.SubmitBtnClick();

	}

	@Then("Admin\\/User\\/Staff see error message Invalid Input")
	public void admin_user_staff_see_error_message_invalid_input(String expectedmsg) {
		String actualmsg =UserPage.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@When("Admin\\/User\\/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
	   UserPage.statedrpDwnClick();
	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
		UserPage.alphaOrderDropdwnValue();
	}


	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
	   UserPage.UGdrpDwnClick();
	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
		UserPage.listOFUGdrpDwn();
	}


	@Then("Admin\\/User\\/Staff should see the input field with Label New Address2")
	public void admin_user_staff_should_see_the_input_field_with_label_new_address2() {
	   UserPage.AddNewAddressField2();
	}


	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
	   UserPage.SubmitBtn();
	}
	
	@When("Admin\\/User\\/Staff clicks the button Add C\\/O, Apt, Suite, Unit")
	public void admin_User_Staff_clicks_the_button_Add_C_O_Apt_Suite_Unit() {
	    UserPage.AddCareOfBtn();
	}


}
