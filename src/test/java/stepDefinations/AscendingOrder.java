package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AsscendingOrderPage;

public class AscendingOrder extends TestBase{
	
	public AsscendingOrderPage Asscending = new AsscendingOrderPage();

	
	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
		Asscending.tableValue();
	}
	

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer numberofrow) {
		Asscending.numberOfRows(numberofrow); 

	}
	

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
	public void admin_User_Staff_should_see_the_Assignment_Description_displayed_in_Ascending_order() {
		Asscending.tableValue();
	}
	

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
	public void admin_User_Staff_should_see_the_Assignment_Name_displayed_in_Ascending_order() {
		Asscending.tableValue();
	}
	

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
	public void admin_User_Staff_should_see_the_Assignment_Due_Date_displayed_in_Ascending_order() {
		Asscending.tableValue();
	}
	
	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
	public void admin_User_Staff_should_see_the_Assignment_Grade_displayed_in_Ascending_order() {
		Asscending.tableValue();
	}	
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Name_Ascending_Arrow() {
		Asscending.clickNameAscending();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Description_Ascending_Arrow() {
		Asscending.clickDescriptionAscending();
	}
	

	@ When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Due_Date_Ascending_Arrow() {
		Asscending.clickDueDateAscending();
	}
	

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Grade_Ascending_Arrow() {
		Asscending.clickGradeAscending();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Name_Ascending_Arrow() {
	   
		Asscending.clickbatchAsc();
	}
	
	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
	public void admin_User_Staff_see_the_Batch_Description_displayed_in_Ascending_order() {
		
		
		String BatchDescriptionAsc= Asscending.ValidateBatchDescriptionAsc();
		Assert.assertEquals(BatchDescriptionAsc, "Batch Description Asc");
		System.out.println("Entries with Batch Description displayed in Ascending Order");
			
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Status_Ascending_Arrow() {
	    
		Asscending.clickStatusAsc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on No Of Classess Ascending Arrow")
	public void admin_User_Staff_Clicks_on_No_Of_Classess_Ascending_Arrow() {
	   
		Asscending.clicknoofclassesAsc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Program Name Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Program_Name_Ascending_Arrow() {
	   
		Asscending.clickProgramNameAsc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Description_Ascending_Arrow() {
	  
		Asscending.clickbatchDescAsc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		Asscending.programAscOrderbtn();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
		Asscending.descriptionAscOrderbtn();
	}
	
	@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
		Asscending.tableValue();
	}
	
	@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
		Asscending.tableValue();
	}
	
	
	
	
}
