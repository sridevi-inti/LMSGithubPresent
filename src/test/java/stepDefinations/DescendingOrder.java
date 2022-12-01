package stepDefinations;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DescendingOrderPage;

public class DescendingOrder extends TestBase{
	
	public DescendingOrderPage Descending = new DescendingOrderPage();

	
	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
	public void admin_User_Staff_should_see_the_Assignment_Name_displayed_in_Descending_order() {
		Descending.tableValue();
	}
	

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Name_Descending_Arrow() {
		Descending.clickNameDescending();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Description_Descending_Arrow() {
		Descending.clickDescriptionDescending();
	}
	
	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
	public void admin_User_Staff_should_see_the_Assignment_Description_displayed_in_Descending_order() {
		Descending.tableValue();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Due_Date_Descending_Arrow() {
		Descending.clickDueDateDescending();
	}
	
	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
	public void admin_User_Staff_should_see_the_Assignment_Due_Date_displayed_in_Descending_order() {
		Descending.tableValue();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
	public void admin_User_Staff_Clicks_on_Assignment_Grade_Descending_Arrow() {
		Descending.clickGradeDescending();
	}
	
	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending orde")
	public void admin_User_Staff_should_see_the_Assignment_Grade_displayed_in_Descending_orde() {
		Descending.tableValue();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Name Descending  Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Name_Descending_Arrow() {
	  
		Descending.clickBatchNameDesc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Description Descending  Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Description_Descending_Arrow() {
	   
		Descending.clickBatchDescDes();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Batch Status Descending  Arrow")
	public void admin_User_Staff_Clicks_on_Batch_Status_Descending_Arrow() {
	   
		Descending.clickBatchStatusDesc();
	}
	
	@When("Admin\\/User\\/Staff Clicks on No Of Classess Descending   Arrow")
	public void admin_User_Staff_Clicks_on_No_Of_Classess_Descending_Arrow() {
	    
		Descending.clicknoofclassesDes();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Descending  Arrow")
	public void admin_User_Staff_Clicks_on_Program_Name_Descending_Arrow() {
	   
		Descending.clickprogramNameDes();
	    
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		Descending.programDscOrderbtn();
	}
	
	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
		Descending.tableValue();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	public void admin_user_staff_clicks_on_program_description_descending_arrow() {
		Descending.descriptionDscOrderbtn();
	}
	
	@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order")
	public void admin_user_staff_see_the_program_description_displayed_in_descending_order() {
		Descending.tableValue();
	}
	
	@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	public void admin_user_staff_clicks_on_program_status_descending_arrow() {
		Descending.statusDscOrderbtn();
	}
	

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
	public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
		Descending.tableValue();
	}
	

}
