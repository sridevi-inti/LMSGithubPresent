package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class Search extends TestBase{

	public SearchPage searchP = new SearchPage();
	

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
		searchP.tableValue();
	}

	@When("Admin\\/User\\/Staff enters Batch Name  to be searched")
	public void admin_User_Staff_enters_Batch_Name_to_be_searched() {

		searchP.sendBatchName();
	}

	@Then("Entries for the searched Batch Description are shown.")
	public void entries_for_the_searched_Batch_Description_are_shown() {
		
		String BatchDescription = searchP.ValidateBatchDescription();
		Assert.assertEquals(BatchDescription, "Batch Details");
		System.out.println("Entries for search batch Description are shown");

	}

	@When("Admin\\/User\\/Staff enters Batch Status to be searched")
	public void admin_User_Staff_enters_Batch_Status_to_be_searched() {
		
		searchP.sendBatchStatus();
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_User_Staff_enters_Program_Name_to_be_searched() {
		
		searchP.sendProgramName();

	}
	
	@Then("^Admin\\/User\\/Staff see the Search Text box has text as \"(.*)\"$")
	public void admin_User_Staff_see_the_Search_Text_box_has_text_as(String expectedmsg) {
	   
		String actualmsg =searchP.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	@When("Admin\\/User\\/Staff enters Batch Description to be searched")
	public void admin_User_Staff_enters_Batch_Description_to_be_searched() {
		
		searchP.sendBatchDescription();
	}
	
	@When("Admin\\/User\\/Staff enters No Of Classes to be searched")
	public void admin_User_Staff_enters_No_Of_Classes_to_be_searched() {
		
		searchP.sendnoOfclasses();
			
	}
	

	@When("^Admin\\/User\\/Staff clicks Search bar after entering Assignment name as \"(.*)\"$")
	public void admin_User_Staff_clicks_Search_bar_after_entering_Assignment_name_as(String string) {
		searchP.clickSearchBtn(string);
	}
	

	@When("^Admin\\/User\\/Staff enters Program Name as \"(.*)\" to be searched$")
	public void admin_user_staff_enters_program_name_as_to_be_searched(String programName) {
		searchP.search(programName);
	}

	@When("^Admin\\/User\\/Staff enters Program Description as \"(.*)\" to be searched$")
	public void admin_user_staff_enters_program_description_as_to_be_searched(String programDescription) {
		searchP.search(programDescription);
	}
	
	@When("^Admin\\/User\\/Staff enters Program Status as \"(.*)\" to be searched$")
	public void admin_user_staff_enters_program_status_as_to_be_searched(String programStatus) {
		searchP.search(programStatus);
	}
}
