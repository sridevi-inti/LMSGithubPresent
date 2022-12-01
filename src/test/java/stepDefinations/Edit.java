package stepDefinations;

import baseClass.TestBase;
import io.cucumber.java.en.When;
import pages.EditPage;

public class Edit extends TestBase{

	public EditPage editP = new EditPage();

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
		editP.clickEdit();
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_User_Staff_clicks_Edit_button() {
		editP.clickEdit();  
	}

	@When("Staff clicks an edit Assignment button")
	public void staff_clicks_an_edit_Assignment_button() {
		editP.clickEdit();
	}

	@When("Staff clicks Save button  after edits Assignment Name")
	public void staff_clicks_Save_button_after_edits_Assignment_Name() {
		editP.clickSave();
	}

	@When("Staff clicks Save button  after edits Assignment Description")
	public void staff_clicks_Save_button_after_edits_Assignment_Description() {
		editP.clickSave();
	}

	@When("Staff clicks Save button After edits Assignment Grade")
	public void staff_clicks_Save_button_After_edits_Assignment_Grade() {
		editP.clickSave();
	}

	@When("Staff clicks Save button After edits Assignment DueDate")
	public void staff_clicks_Save_button_After_edits_Assignment_DueDate() {
		editP.clickSave();
	}

	@When("Staff clicks cancel button")
	public void staff_clicks_cancel_button() {
		editP.clickcancel();
	}

	@When("User\\/Staff clicks on Cancel button after entering details")
	public void user_Staff_clicks_on_Cancel_button_after_entering_details() {
		
		editP.clickcancel();
	}

	@When("User\\/Staff clicks on Save button after enabling Absent details")
	public void user_Staff_clicks_on_Save_button_after_enabling_Absent_details() {
	
		editP.clickSave();
	}

	@When("User\\/Staff clicks on Save button after disabling Present details")
	public void user_Staff_clicks_on_Save_button_after_disabling_Present_details() {
		
		editP.clickSave();
	}

	@When("User\\/Staff clicks on Save button after changing User name")
	public void user_Staff_clicks_on_Save_button_after_changing_User_name() {
		
		editP.clickSave();
	}

	@When("User\\/Staff clicks on Save button after changing Program Name")
	public void user_Staff_clicks_on_Save_button_after_changing_Program_Name() {
		
		editP.clickSave();
	}

	@When("Admin clicks on Edit Button")
	public void admin_clicks_on_Edit_Button() {
		
		editP.clickEdit();

	}

	@When("Admin Clicks on Save Button after updating Description")
	public void admin_Clicks_on_Save_Button_after_updating_Description() {
		
		editP.clickSave();
	}

	@When("Admin Clicks on Save button after Selecting another Program Name")
	public void admin_Clicks_on_Save_button_after_Selecting_another_Program_Name() {
		
		editP.clickSave();
	}

	@When("Admin Clicks on Save Button after updating Name")
	public void admin_Clicks_on_Save_Button_after_updating_Name() {
		
		editP.clickSave();
	}


	@When("Admin Clicks on Save Button after updating Status")
	public void admin_Clicks_on_Save_Button_after_updating_Status() {
		
		editP.clickSave();;
	}

	@When("Admin Clicks on Save Button after updating No Of Classes")
	public void admin_Clicks_on_Save_Button_after_updating_No_Of_Classes() {
		
		editP.clickSave();;

	}



}
