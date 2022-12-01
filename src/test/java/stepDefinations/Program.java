package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProgramPage;

public class Program extends TestBase{

	public ProgramPage program = new ProgramPage();
	public LoginPage login = new LoginPage();

	
	@When("Admin\\/User\\/Staff is on Manage Program page")
	public void admin_user_staff_is_on_Manage_Program_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Program",title);
		System.out.println("User is on " +title);
	}

	@Then("Entries for the searched Program Name are shown")
	public void entries_for_the_searched_program_name_are_shown() {
		program.tableValue();
	}
	

	@Then("Entries for the searched Program Description are shown")
	public void entries_for_the_searched_program_description_are_shown() {
		program.tableValue();
	}

	@Then("Entries for the searched Program Status are shown")
	public void entries_for_the_searched_program_status_are_shown() {
		program.tableValue();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
		program.statusAscOrderbtn();
	}

	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		program.programFormbtn();
		String title = driver.getTitle();
		Assert.assertEquals("Manage Program",title);
		System.out.println("User is on " +title);

	}

	@Then("^Admin see Error message \"(.*)\"$")
	public void admin_see_error_message(String expectedMsg) {
		String actualMsg = program.Message(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}


	@Then("^Admin see Success message \"(.*)\"$")
	public void admin_see_success_message(String expectedMsg) {
		String actualMsg = program.Message(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}

	@Then("^User/Staff see a Error message as \"(.*)\"$")
	public void User_Staff_see_a_Error_message_as_Only_Admin_have_Access(String expectedMsg) {
		String actualMsg = program.Message(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}


	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Program",title);
		System.out.println("User is on " +title);
	}

	@When("^Admin\\/User\\/Staff Enters newly added Program Name in Search as \"(.*)\"$")
	public void admin_user_staff_enters_newly_added_program_name_in_search_as(String programName) {
		program.search(programName);
	}

	@Then("Entry for the newly added Program Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {
		program.tableValue();
	}

	@Given("User\\/Staff is on Manage Program page")
	public void user_staff_is_on_manage_program_page() {
		program.programFormbtn();
		String title = driver.getTitle();
		Assert.assertEquals("Manage Program",title);
		System.out.println("User is on " +title);
	}

	@Then("^User\\/Staff see a Error message \"(.*)\"$")
	public void user_staff_see_a_error_message(String text) {
		String actualMsg = program.programDetailsForm(text);
		Assert.assertEquals(text,actualMsg);
		System.out.println(actualMsg);
	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name")
	public void admin_user_staff_selects_first_checkbox_left_to_program_name() {
		program.SelectAllCheckbox();
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {

		boolean selected =program.ValidateSelectAllCheckbox();
		if(selected == true) {
			System.out.println("Check box are selected");
		}
		else {
			System.out.println("Check box are not selected");
		}
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
		program.tableValue();
	}

	@When("^Admin\\/User\\/Staff Enters deleted  Program Name in Search as \"(.*)\"$")
	public void admin_user_staff_enters_deleted_program_name_in_search_as(String programName) {
		program.search(programName);
	}


	@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
	public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
		program.SelectAllCheckbox();
	}


	@Given("Admin selects more than one Program Name using checkbox")
	public void admin_selects_more_than_one_program_name_using_checkbox() {
		program.SelectAllCheckbox();
	}


	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Program Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
		program.SelectAllCheckbox();
		program.deleteMultiRowBtn();
	}


	@When("^Admin\\/User\\/Staff Enters deleted Program Names in Search as \"(.*)\"$")
	public void admin_user_staff_enters_deleted_program_names_in_search_as(String programName) {
		program.search(programName);
	}

	@Given("User\\/Staff selects more than one Program Name using checkbox")
	public void user_staff_selects_more_than_one_program_name_using_checkbox() {
		program.SelectAllCheckbox();
	}

	@When("^Admin Clicks on Save Button after updating Name as \"(.*)\"$")
	public void admin_clicks_on_save_button_after_updating_name_as(String name) {
		program.nametxtBx(name);
		program.saveBtn();
	}

	@When("^Admin  Clicks on Save Button after updating  Description as \"(.*)\"$")
	public void admin_clicks_on_save_button_after_updating_description_as(String description) {
		program.descriptiontxtBx(description);
		program.saveBtn();
	}

	@When("Admin  Clicks on Save Button after Changing  status")
	public void admin_clicks_on_save_button_after_changing_status() {
		program.radioBtn();
		program.saveBtn();
	}

	@When("^Admin\\/User\\/Staff Enters edited Program Name in Search \"(.*)\"$")
	public void admin_user_staff_enters_edited_program_name_in_search(String programName) {
		program.search(programName);
	}

	@Then("Entry for the edited Program Name is shown")
	public void entry_for_the_edited_program_name_is_shown() {
		program.tableValue();
	}

}
