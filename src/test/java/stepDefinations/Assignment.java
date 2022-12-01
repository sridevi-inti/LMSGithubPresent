package stepDefinations;


import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AssignmentPage;

public class Assignment extends TestBase{
	
	public AssignmentPage assignment=new AssignmentPage();

	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_User_Staff_clicks_on_Assignment_Page() {
	    assignment.clickAssignmentPage();
	}

	//Footer
	@Then("Admin\\/User\\/Staff Should see a Footer text \"(.*)\"$")
	public void admin_User_Staff_Should_see_a_Footer_text(String expectedmsg) 
	{
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	//Paginator

	@Given("Admin\\/User\\/Staff is on Assignment Page")
	public void admin_User_Staff_is_on_Assignment_Page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Then("Admin\\/User\\/Staff Should be navigated to next page")
	public void admin_User_Staff_Should_be_navigated_to_next_page() {
	    //assignment.validatePaginatorNextPage();
	    if(driver.getPageSource().contains("You are on Paginator next page"))
		{
			System.out.println("You are on Paginator next page" );
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals("You are on Paginator next page",driver.getTitle());
		}
	}
	
	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_User_Staff_Should_be_navigated_to_previous_page() {
	    //assignment.validatePaginatorPreviousPage();
		if(driver.getPageSource().contains("You are on Paginator previous page"))
		{
			System.out.println("You are on Paginator previous page" );
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals("You are on Paginator previous page",driver.getTitle());
		}
	}

	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_User_Staff_Should_be_navigated_to_Last_page() {
		if(driver.getPageSource().contains("You are on Paginator last page"))
		{
			System.out.println("You are on Paginator last page" );
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals("You are on Paginator last page",driver.getTitle());
		}
	}


	@Then("Admin\\/User\\/Staff Should be navigated to First  page")
	public void admin_User_Staff_Should_be_navigated_to_First_page() {
		if(driver.getPageSource().contains("You are on Paginator first page"))
		{
			System.out.println("You are on Paginator first page" );
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals("You are on Paginator first page",driver.getTitle());
		}
	}

	//Search Text Box

	@Then("The requested assignment details should be displayed")
	public void the_requested_assignment_details_should_be_displayed(){
		assignment.tableValue();
	}
	
	////////Add New Assignment
	
	@Given("Admin\\/user\\/Staff logged on to LMS website")
	public void admin_user_Staff_logged_on_to_LMS_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on Assignments page")
	public void admin_User_Staff_is_on_Assignments_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@When("Admin\\/User\\/Staff clicks on Assignment")
	public void admin_User_Staff_clicks_on_Assignment() {
	    assignment.clickAssignment();
	}

	@Then("Admin\\/User\\/Staff should see a newly added Assignment")
	public void admin_User_Staff_should_see_a_newly_added_Assignment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Admin\\/User Logged on to LMS website")
	public void admin_User_Logged_on_to_LMS_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Admin\\/User is on Manage Assignment page")
	public void admin_User_is_on_Manage_Assignment_page() 
	{
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	@Then("^Admin\\/User should see a message \"(.*)\"$")
	public void admin_User_should_see_a_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@Given("Staff Logged on to LMS website")
	public void staff_Logged_on_to_LMS_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Staff is on Manage Assignment page")
	public void staff_is_on_Manage_Assignment_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Then("Staff should see Assignment details window")
	public void staff_should_see_Assignment_details_window() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment Details", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Given("Staff is on Assignment Details page")
	public void staff_is_on_Assignment_Details_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment Details", title);
		System.out.println("User is on " + title + " Page" );
	}


	@Then("^Staff should see an error message \"(.*)\"$")
	public void staff_should_see_an_error_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	
		}

	@Then("^Staff should see a message \"(.*)\"$")
	public void staff_should_see_a_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("Staff should see a Assignment details window is closed")
	public void staff_should_see_a_Assignment_details_window_is_closed() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@When("Staff clicks manage button under Assignment Grade")
	public void staff_clicks_manage_button_under_Assignment_Grade() {
	    assignment.clickManage();
	}

	@Then("Staff should be navigated to Grade Window")
	public void staff_should_be_navigated_to_Grade_Window() {
		String title = driver.getTitle();
		Assert.assertEquals("Grade Window", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	//////Edit Functionality
	@Given("Admin\\/User\\/Staff is on Manage Assignment page")
	public void admin_User_Staff_is_on_Manage_Assignment_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Then("^Admin\\/User\\/Staff should see a message \"(.*)\"$")
	public void admin_User_Staff_should_see_a_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@Then("Staff should see a Assignment details window")
	public void staff_should_see_a_Assignment_details_window() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment details", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	@Then("Staff Should see a Assignment Details Page is closed")
	public void staff_Should_see_a_Assignment_Details_Page_is_closed() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	/////Asignment Google Form///////

	@When("Admin clicks on Assignment Name")
	public void admin_clicks_on_Assignment_Name() {
	    assignment.clickAssignmentName();
	}

	@Then("^Admin should see a warning message \"(.*)\"$")
	public void admin_should_see_a_warning_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@Given("Admin\\/User\\/Staff is on Assignment page")
	public void admin_User_Staff_is_on_Assignment_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment Page", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	@When("Admin\\/User\\/Staff clicks on Assignment Name")
	public void admin_User_Staff_clicks_on_Assignment_Name() {
	    assignment.clickAssignmentName();
	}
	
	@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
	public void admin_User_Staff_should_be_navigated_to_Assignment_Google_form_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment google Form", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	@Given("Admin\\/User\\/Staff is on Assignment  Google form page")
	public void admin_User_Staff_is_on_Assignment_Google_form_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Assignment google Form", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
	public void admin_User_Staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
	    assignment.clickSubmit();
	}
	
	@Then("^Admin\\/User\\/Staff should see a message as \"(.*)\"$")
	public void admin_User_Staff_should_see_a_message_as(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
	public void admin_User_Staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
	    assignment.clickSubmit();
	}
	
	@Then("^Admin\\/User\\/Staff should get a warning message \"(.*)\"$")
	public void admin_User_Staff_should_get_a_warning_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@When("Admin\\/User\\/Staff clicks clear form button after entering all questions and mail id")
	public void admin_User_Staff_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
	    assignment.clickClear();
	}

	@Then("Admin\\/User\\/Staff should get message \"(.*)\"$")
	public void admin_User_Staff_should_get_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@When("Admin\\/User\\/Staff clicks Switch account link")
	public void admin_User_Staff_clicks_Switch_account_link() {
	    assignment.clickSwitchAccount();
	}
	
	//////////Delete Assignment Functionality
	
	@Given("Admin logged on to LMS website")
	public void admin_logged_on_to_LMS_website() {
		
	}

	@Given("Admin is on Manage Assignment page")
	public void admin_is_on_Manage_Assignment_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Then("Admin should see a message \"(.*)\"$")
	public void admin_should_see_a_message(String expectedmsg) {
		String actualmsg =assignment.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@Given("Staff logged on to LMS website")
	public void staff_logged_on_to_LMS_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Staff should see a Delete Confirmation window as \"(.*)\"$")
	public void staff_should_see_a_Delete_Confirmation_window_as(String text) {
		String actualMsg = assignment.DeleteConfirmBox(text);
		Assert.assertEquals(text,actualMsg);
		System.out.println(actualMsg);
	}
	
	@Given("Staff is on Delete Confirmation window")
	public void staff_is_on_Delete_Confirmation_window() {
		String title = driver.getTitle();
		Assert.assertEquals("Delete Confirmation Window", title);
		System.out.println("User is on " + title + " Page" );
	}

	@Then("Confirmation delete window should be closed successfully")
	public void confirmation_delete_window_should_be_closed_successfully() {
		String title = driver.getTitle();
		Assert.assertEquals("Manage Assignment", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	//////////Delete Multiple Assignment Functionality
	
	
	@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void admin_User_Staff_should_see_a_disabled_delete_button() {
		boolean display =assignment.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}
	
	@When("Staff clicks delete button on the top after selecting multiple checkbox")
	public void staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {
	    assignment.clickDeleteOnTopLeft();
	}
	
	@Then("Staff should see a Delete confirm window")
	public void staff_should_see_a_Delete_confirm_window() {
		String title = driver.getTitle();
		Assert.assertEquals("Delete Confirm Window", title);
		System.out.println("User is on " + title + " Page" );
	}
	
	/////////CheckBox Functionality

	@When("Admin clicks check box on the left side to the Assignment Name")
	public void admin_clicks_check_box_on_the_left_side_to_the_Assignment_Name() {
	    assignment.clickCheckbox();
	}

	@When("Admin clicks individual checkbox button")
	public void admin_clicks_individual_checkbox_button() {
	    assignment.clickCheckbox();
	}
	
	@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
	public void admin_User_Staff_clicks_check_box_on_the_left_side_to_the_Assignment_Name() {
		assignment.clickAllCheckbox();
	}

	@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
	public void admin_User_Staff_should_see_a_enabled_delete_button_on_the_top_left() {
		boolean display =assignment.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}

	@When("Admin\\/User\\/Staff clicks individual checkbox button")
	public void admin_User_Staff_clicks_individual_checkbox_button() {
	    assignment.clickCheckbox();
	}

	@Then("Admin\\/User\\/Staff should see a delete button on the top left")
	public void admin_User_Staff_should_see_a_delete_button_on_the_top_left() {
		boolean display =assignment.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}
}
