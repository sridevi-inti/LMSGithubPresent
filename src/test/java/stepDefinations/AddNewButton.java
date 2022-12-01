package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddNewButtonPage;

public class AddNewButton extends TestBase{

	
	public AddNewButtonPage addNew = new AddNewButtonPage();
	
	
	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_Clicks_on_Save_Button_after_selecting_Status_alone() {
	    addNew.selectStatus();
	    addNew.clickSave();
	    
	}
	
	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
		addNew.cancelBtn();
	}
	

	@When("Staff  clicks on Save after leaving all the fields empty")
	public void staff_clicks_on_Save_after_leaving_all_the_fields_empty() {
		addNew.clickSave();
	}
	
	@When("Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate")
	public void staff_clicks_Save_button_after_entering_assignment_name_assignment_description_assignment_Grade_and_Duedate() {
		addNew.clickSave();
	}
	
	@When("Staff clicks cancel button with entering all fields")
	public void staff_clicks_cancel_button_with_entering_all_fields() {
		addNew.cancelBtn();
	}
	
	@When("Admin clicks + A New Batch button")
	public void admin_clicks_A_New_Batch_button() {
		addNew.clickANewBatch();
	}
	
	@And("Clicks on DropDown Menu in Batch Details window")
	public void Clicks_on_DropDown_Menu_in_Batch_Details_window() {
		addNew.clickANewBatchdetails();		
	}
	
	@When("Admin Clicks on Save button after selecting a Program Name only from the dropdown")
	public void admin_Clicks_on_Save_button_after_selecting_a_Program_Name_only_from_the_dropdown() {
		addNew.selectProgramdropdown();
		addNew.clickSave();
	} 
	
	@Given("Admin Clicks on the button \"(.*)\"$")
	public void admin_Clicks_on_the_button(String expectedmsg) {
		String actualmsg = addNew.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
		addNew.clickANewBatch();	
	}
	
	@When("Admin Clicks on Save Button after entering only Number Of Classes")
	public void admin_Clicks_on_Save_Button_after_entering_only_Number_Of_Classes() {
	
		addNew.clickSave();
	}
	
	@When("Admin Clicks on Save Button after entering all details")
	public void admin_Clicks_on_Save_Button_after_entering_all_details() {
	   
		addNew.clickSave();
	}
	
	@When("User\\/Staff Clicks on  + A New Program button")
	public void user_Staff_Clicks_on_A_New_Program_button() {
		
		addNew.clickANewBatch();

	}
	
	@When("Admin Clicks on A New Program button")
	public void dmin_clicks_on_a_new_program_button() {
		addNew.addNewProgramBtn();
	}
	

	@When("Admin Clicks on Save button with out entering  details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		addNew.clickSave();
	}

	@When("^Admin Clicks on Save Button after entering all details as \"(.*)\" and \"(.*)\"$")
	public void admin_clicks_on_save_button_after_entering_all_details_as_and(String name, String description) {
		addNew.nametxtBx(name);
		addNew.descriptiontxtBx(description);
		addNew.radioBtn();
		addNew.clickSave();
	}
	

	@When("^Admin Clicks on Save Button after entering Name as \"(.*)\"$")
	public void admin_clicks_on_save_button_after_entering_name_as(String name) {
		addNew.nametxtBx(name);
		addNew.clickSave();		
	}
	

	@When("^Admin Clicks on Save Button after entering Description as \"(.*)\"$")
	public void admin_clicks_on_save_button_after_entering_description_as(String description) {
		addNew.descriptiontxtBx(description);
		addNew.clickSave();
	}
	
	@When("User\\/Staff Clicks on A New Program button")
	public void user_staff_clicks_on_a_new_program_button() {
		addNew.addNewProgramBtn();
	}
	
	@When("Admin\\/User clicks a Add New Assignment button")
	public void admin_User_clicks_a_Add_New_Assignment_button() {
		addNew.clickAddNewAssignment();
	}
	
	@When("Staff clicks a Add new assignment button")
	public void staff_clicks_a_Add_new_assignment_button() {
		addNew.clickAddNewAssignment();
	}
	@When("Admin Clicks on Save Button after entering Name alone")
	public void admin_Clicks_on_Save_Button_after_entering_Name_alone() {
	  
		addNew.clickSave();
	}
	
	@When("Admin Clicks on Save Button with out entering  details")
	public void admin_Clicks_on_Save_Button_with_out_entering_details() {
	   
		addNew.clickSave();
	}
	
	@When("Admin Clicks on Save Button after entering Description alone")
	public void admin_Clicks_on_Save_Button_after_entering_Description_alone() {
	    
	    addNew.clickSave();
	}
	

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
		addNew.clickANewUser();
	}
}
