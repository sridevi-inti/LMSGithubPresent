package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeletePage;

public class Delete extends TestBase{
	
	public DeletePage deleteP = new DeletePage();
	

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
		deleteP.DeleteRowBtn();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_Clicks_on_Enabled_Delete_button_on_the_top_left_hand_side() {
		 
		 deleteP.clickdeletebtn();
		
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {
		deleteP.tableValue();
	}
	
	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		boolean display =deleteP.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}
	
	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
		deleteP.DeleteRowBtn();
	}
	

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
		boolean display =deleteP.deleteMultiRowBtndisplay();
		if(display) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}
	
	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
		deleteP.deleteConfirmBtn();
	}
	

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		deleteP.deleteCancelBtn();
	}
	

	@When("Admin clicks on delete button")
	public void admin_clicks_on_delete_button() {
		deleteP.clickdeletebtn();
	}
	

	@When("Admin\\/User\\/Staff clicks on delete button")
	public void admin_User_Staff_clicks_on_delete_button() {
		deleteP.clickdeletebtn();
	}
	
	
	@When("Staff clicks on delete button on the right side")
	public void staff_clicks_on_delete_button_on_the_right_side() {
		deleteP.clickDeleteOnRight();
	}
	
	
	@When("Staff clicks Yes")
	public void staff_clicks_Yes() {
		deleteP.clickdelyesbtn();
	}
	
	
	@When("Staff clicks No")
	public void staff_clicks_No() {
		deleteP.clickNo();
	}
	
	@When("Admin\\/User\\/Staff clicks on delete button on the top left")
	public void admin_User_Staff_clicks_on_delete_button_on_the_top_left() {
		deleteP.clickDeleteOnTopLeft();
	}
	
	@When("User\\/Staff  clicks on to the Yes  button")
	public void user_Staff_clicks_on_to_the_Yes_button() {
		
		deleteP.clickdelyesbtn();
	}
	
	@Then("^Admin see header text of delete as \"(.*)\"$")
	public void admin_see_header_text_of_delete_as(String text) {
		String actualMsg = deleteP.DeleteConfirmBox(text);
		Assert.assertEquals(text,actualMsg);
		System.out.println(actualMsg); 
	}
	
	@When("Staff\\/User  Clicks the button No button")
	public void staff_User_Clicks_the_button_No_button() {
	    
		deleteP.clickdelnobtn();
	}
	
	@When("Admin Clicks on the Delete Button")
	public void admin_Clicks_on_the_Delete_Button() {
	
		deleteP.clickdeletebtn();
		
	}
	
	@Then("^User\\/Staff will see a ErrorMessage as \"(.*)\"$")
	public void user_Staff_will_see_a_ErrorMessage_as(String expectedmsg) {
		String actualmsg = deleteP.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	  
	}

	@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		deleteP.deleteMultiRowBtn();
	}
	

}
