package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchPage;
import pages.LoginPage;

public class Batch extends TestBase{
	
	LoginPage LP;
	Registration RP;
	BatchPage  BP;

	/* Batch Header */
	
	@When("Admin\\/User\\/Staff clicks on Batch button")
	public void admin_User_Staff_clicks_on_Batch_button() {
	    BP=new BatchPage();
	    BP.clickBatchButton();
	}
	
	@Then("^Admin\\/User\\/Staff see headertext as \"(.*)\"$")
	public void admin_User_Staff_see_headertext_as(String expectedmsg) {
		 BP= new BatchPage();

			String actualmsg =BP.Message(expectedmsg);
			Assert.assertEquals(expectedmsg,actualmsg);
			System.out.println(actualmsg);
		 
	}

		

	/* Batch Footer */
	
	@When("Admin\\/User\\/Staff is on Manage Batch Page")
	public void admin_User_Staff_is_on_Manage_Batch_Page() {
	    BP=new BatchPage();
	    String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Batch", title);
	    
	}
	
	@Then("^Admin\\/User\\/Staff see  Footertext as \"(.*)\"$")
	public void admin_User_Staff_see_Footertext_as(String expectedmsg) {
	   BP=new BatchPage();

		String actualmsg =BP.Message2(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}
	
	
	/*paginator batch*/
	
	@When("Admin\\/User\\/Staff is on the Manage Batch page")
	public void admin_User_Staff_is_on_the_Manage_Batch_page() {
		BP=new BatchPage();
	    String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Batch", title);
	}


	@Given("Admin\\/User\\/Staff is on to Manage Batch page")
	public void admin_User_Staff_is_on_to_Manage_Batch_page() {
	    
		 BP=new BatchPage();
		    String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Manage Batch", title);	
	}

	@Given("Admin\\/User\\/Staff is on Manage Batch")
	public void admin_User_Staff_is_on_Manage_Batch() {
		 BP=new BatchPage();
		    String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Manage Batch", title);

	}

	@Given("Admin\\/User\\/Staff on Manage Batch page")
	public void admin_User_Staff_on_Manage_Batch_page() {
		 BP=new BatchPage();
		    String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Manage Batch", title);
	}
	    
	/*Search TextBox Batch */
	
@When("Admin\\/User\\/Staff on to Batch page")
public void admin_User_Staff_on_to_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

	

@Given("Admin\\/User\\/Staff is onto the  Manage Batch page")
public void admin_User_Staff_is_onto_the_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}
	

@Then("Entries for the searched BatchName are shown.")
public void entries_for_the_searched_BatchName_are_shown() {
	BP=new BatchPage();
	String BatchName = BP.ValidateBatchName();
	Assert.assertEquals(BatchName, "Batch Details");
	System.out.println("Entries for search batch name are shown");
	
}

@Given("Admin\\/User\\/Staff is on ManageBatch page")
public void admin_User_Staff_is_on_ManageBatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}


@Given("Admin\\/User\\/Staff is on ManageBatch")
public void admin_User_Staff_is_on_ManageBatch() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Entries for the searched Batch status are shown.")
public void entries_for_the_searched_Batch_status_are_shown() {
   BP=new BatchPage();
   String BatchStatus = BP.ValidateBatchStatus();
	Assert.assertEquals(BatchStatus, "Batch Status");
	System.out.println("Entries for search batch Status are shown");
   
}

@Given("Admin\\/Staff\\/User on Manage Batch page")
public void admin_Staff_User_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Entries for the searched No Of Classes are shown.")
public void entries_for_the_searched_No_Of_Classes_are_shown() {
	BP=new BatchPage();
	   String NoOfClasses= BP.ValidateNoOfClasses();
		Assert.assertEquals(NoOfClasses, "No Of Classes");
		System.out.println("Entries for search batch Status are shown");
}
    


@Given("Admin\\/User\\/Staff is on Manage Batch page")
public void admin_User_Staff_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Entries for the searched Batch program Name are shown")
public void entries_for_the_searched_Batch_program_Name_are_shown() {
	String ProgramName= BP.ValidateProgramName();
	Assert.assertEquals(ProgramName, "Program Name");
	System.out.println("Entries for search batch Status are shown");
}

/*Ascending Order*/

@Given("User\\/Staff\\/Admin is on Manage Batch page")
public void user_Staff_Admin_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
public void admin_User_Staff_see_the_Batch_Name_displayed_in_Ascending_order() {
	
    BP=new BatchPage();
	String BatchNameAsc= BP.ValidateBatchNameAsc();
	Assert.assertEquals(BatchNameAsc, "Batch Name Asc");
	System.out.println("Entries with Batch Name displayed in Ascending Order");
}

@Given("User\\/Admin\\/Staff is on Manage Batch page")
public void user_Admin_Staff_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Given("Admin\\/User\\/Staff on Managebatch page")
public void admin_User_Staff_on_Managebatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
public void admin_User_Staff_see_the_Batch_Status_displayed_in_Ascending_order() {

	BP=new BatchPage();
	String BatchStatusAsc= BP.ValidateBatchStatusAsc();
	Assert.assertEquals(BatchStatusAsc, "Batch Status Asc");
	System.out.println("Entries with Batch Status displayed in Ascending Order");
}
    


@Given("Admin\\/User\\/Staff is on ManageBatchpage")
public void admin_User_Staff_is_on_ManageBatchpage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Ascending order")
public void admin_User_Staff_see_the_No_Of_Classes_displayed_in_Ascending_order() {
	BP=new BatchPage();
	String NoOfClassesAsc= BP.ValidateNoOfClassesAsc();
	Assert.assertEquals(NoOfClassesAsc, "No Of Classes Asc");
	System.out.println("Entries with No Of Classes displayed in Ascending Order");
}

@Given("Admin\\/User\\/Staff is on ManageBatchPage")
public void admin_User_Staff_is_on_ManageBatchPage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

/*Descending Order*/

@Given("Admin\\/Staff\\/User is on Manage Batch page")
public void admin_Staff_User_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}


@Then("Admin\\/User\\/Staff see the Batch Name displayed in Descending  order")
public void admin_User_Staff_see_the_Batch_Name_displayed_in_Descending_order() {
	 BP=new BatchPage();
		String BatchNameDesc= BP.ValidateBatchNameDesc();
		Assert.assertEquals(BatchNameDesc, "Batch Name Desc");
		System.out.println("Entries with Batch Name displayed in Descending Order");

    
}

@Given("User\\/Admin\\/Staff is on the Manage Batch page")
public void user_Admin_Staff_is_on_the_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the Batch Description displayed in Descending  order")
public void admin_User_Staff_see_the_Batch_Description_displayed_in_Descending_order() {
	BP=new BatchPage();
	String BatchDescriptionDesc= BP.ValidateBatchDescriptionDesc();
	Assert.assertEquals(BatchDescriptionDesc, "Batch Description Desc");
	System.out.println("Entries with Program Name displayed in Ascending Order");
   
}

@Given("Admin\\/User\\/Staff is on to the Manage Batch page")
public void admin_User_Staff_is_on_to_the_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the Batch Status displayed in Descending  order")
public void admin_User_Staff_see_the_Batch_Status_displayed_in_Descending_order() {
	BP=new BatchPage();
	String BatchStatusDesc= BP.ValidateBatchStatusDesc();
	Assert.assertEquals(BatchStatusDesc, "Batch Status Desc");
	System.out.println("Entries with Batch Status displayed in Descending Order");
}

@Given("Admin\\/User\\/Staff on ManageBatchpage")
public void admin_User_Staff_on_ManageBatchpage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Descending  order")
public void admin_User_Staff_see_the_No_Of_Classes_displayed_in_Descending_order() {
	BP=new BatchPage();
	String NoOfClassesDesc= BP.ValidateNoOfClassesDesc();
	Assert.assertEquals(NoOfClassesDesc, "No Of Classes Desc");
	System.out.println("Entries with No Of Classes displayed in Descending Order");
}

@Given("Admin\\/User\\/Staff is on managebatch page")
public void admin_User_Staff_is_on_managebatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending  order")
public void admin_User_Staff_see_the_Program_Name_displayed_in_Descending_order() {
	BP=new BatchPage();
	String ProgramNameDesc= BP.ValidateProgramNameDesc();
	Assert.assertEquals(ProgramNameDesc, "Program Name Desc");
	System.out.println("Entries with ProgramName displayed in Descending Order");
}


/*Number of Rows in Batch */

@When("Staff\\/Admin\\/User\\/ is on Manage Batch page")
public void staff_Admin_User_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

/* Add New Batch 01 */

@Given("Admin is on Manage Batch page")
public void admin_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Given("Admin Clicks on to {string} button")
public void admin_Clicks_on_to_button(String string) {
           BP=new BatchPage();
           BP.clickANewBatch();
}

@Then("Admin sees Errormessage \"(.*)\"$")
public void admin_sees_Errormessage(String expectedmsg) {
	String actualmsg =BP.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
    
}
@Given("Admin Clicks on to the  + A New Batch")
public void admin_Clicks_on_to_the_A_New_Batch() {
    BP=new BatchPage();
   	BP.clickANewBatch();


}


@Then("Admin see Errormessage \"(.*)\"$")
public void admin_see_Errormessage(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg =BP.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
    
}




@Given("Admin clicks on the + A New Batch button")
public void admin_clicks_on_the_A_New_Batch_button() {
   BP=new BatchPage();
   BP.clickANewBatch();
}

@Then("^Admin will see a Errormessage \"(.*)\"$ ")
public void admin_will_see_a_Errormessage(String expectedmsg) {
	String actualmsg =BP.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg); 
}

@When("Admin Clicks on DropDown Menu")
public void admin_Clicks_on_DropDown_Menu() {
    BP=new BatchPage();
    BP.clickdropDown();
}

 @Then("Admin see list of all Program Names")
public void admin_see_list_of_all_Program_Names() {
	BP=new BatchPage();
	String ProgramName= BP.ValidateProgramName();
	Assert.assertEquals(ProgramName, "Program Name");
	System.out.println("Entries with List of program Names Displayed");
  
}
 
    @Then("^Admin will see Errormessage as \"(.*)\"$")
    public void admin_will_see_Errormessage_as(String expectedmsg) {
    	BP=new BatchPage();
    	String actualmsg =BP.ErrorMessage(expectedmsg);
    	Assert.assertEquals(expectedmsg,actualmsg);
    	System.out.println(actualmsg);
    	  BP.clickANewBatchdetails();	
        
    }

    @Then("Admin will be seeing the Error message \"(.*)\"$")
    public void admin_will_be_seeing_the_Error_message(String expectedmsg) {
    	BP=new BatchPage();
    	String actualmsg =BP.ErrorMessage(expectedmsg);
    	Assert.assertEquals(expectedmsg,actualmsg);
    	System.out.println(actualmsg);
        
    }
  
    @Then("Admin will see Errormessage \"(.*)\"$")
    public void admin_will_see_Errormessage(String expectedmsg) {
    	BP=new BatchPage();
    	String actualmsg = BP.ErrorMessage(expectedmsg);
    	Assert.assertEquals(expectedmsg,actualmsg);
    	System.out.println(actualmsg);
    
}


@Then("Admin see Successmessage as \"(.*)\"$")
public void admin_see_Successmessage_as(String expectedmsg) {
	BP=new BatchPage();
	String actualmsg = BP.SuccessMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
}


@Then("^Admin see Success message \"(.*)\"$ ")
public void admin_see_Success_message(String expectedmsg) {
	BP=new BatchPage();
	String actualmsg = BP.SuccessMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
    
}



@Then("Admin see a Batch Details window getting closed")
public void admin_see_a_Batch_Details_window_getting_closed() {
	BP=new BatchPage();
	String BatchDetails= BP.ValidateBatchDetails();
	Assert.assertEquals(BatchDetails, "Batch Details");
	BP.windowClosed();
	System.out.println("Entries with Batch Details displayed will be closed");
	
	
}

/* Add New Batch 02 */

@Given("Admin\\/User\\/Staff is on to the ManageprogramPage")
public void admin_User_Staff_is_on_to_the_ManageprogramPage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage program", title);
}


@When("Admin\\/User\\/Staff Enters newly added Batch program Name in Search")
public void admin_User_Staff_Enters_newly_added_Batch_program_Name_in_Search() {
    BP=new BatchPage();
    BP.sendBatchName();
}

@Then("Entry for the newly added Batch Name is shown")
public void entry_for_the_newly_added_Batch_Name_is_shown() {
	
    BP=new BatchPage();
	String NewBatchName= BP.ValidateBatchName();
	Assert.assertEquals(NewBatchName, "Batch Name");
	System.out.println("Entries with List of New program Names Displayed");
    
    
    
}

/*Add new Batch 03*/

@Given("User\\/Staff is on Manage Batch page")
public void user_Staff_is_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}


@Then("^User/Staff should see an Errormessage \"(.*)\"$ ")
public void user_Staff_should_see_an_Errormessage(String expectedmsg) {
	BP=new BatchPage();
	String actualmsg = BP.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
}

/* Edit Batch 01*/

@Given("Admin is on ManageBatch page")
public void admin_is_on_ManageBatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin clicks on Edit buttton")
public void admin_clicks_on_Edit_buttton() {
    BP=new BatchPage();
    BP.clickEdit();
}

@Then("^Admin see headertext as \"(.*)\"$")
public void admin_see_headertext_as(String expectedmsg) {
   BP=new BatchPage();
   String actualmsg = BP.Message1(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
   BP.clickANewBatch();
   
}


/* Edit Batch 02*/

@Given("Admin will click on to the Edit button")
public void admin_will_click_on_to_the_Edit_button() {
	BP=new BatchPage();
         BP.clickEdit();
}



@Then("^Admin can see a SuccessMessage as \"(.*)\"$ ")
public void admin_can_see_a_Success_Message_as (String expectedmsg) {
	
	BP=new BatchPage();
	   String actualmsg = BP.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	

   
}
@Given("Admin should be clicking on Edit button")
public void admin_should_be_clicking_on_Edit_button() {
	BP=new BatchPage();
		BP.clickEdit();
}




@Given("^Admin  clicks on to button \"(.*)\"$")
public void admin_clicks_on_to_button(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	
		BP.clickEdit();

}



@Then("Admin see SuccessMessage \"(.*)\"$")
public void admin_see_SuccessMessage(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	

}

@Given("^Admin  Clicks on \"(.*)\"$ button")
public void admin_Clicks_on_button(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	
		BP.clickEdit();
}

    

@Then("Admin see successmessage \"(.*)\"$")
public void admin_see_successmessage(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);

}
@Given("Admin  clicks on to the \"(.*)\"$ button")
public void admin_clicks_on_to_the_button(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);	
		BP.clickEdit();
}
   

@Then("^Admin see Successmessage \"(.*)\"$")
public void admin_see_Successmessage(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
}
@Given("Admin  clicks  \"(.*)\"$ button")
public void admin_clicks_button(String expectedmsg) {
	BP=new BatchPage();
	String actualmsg = BP.Message(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
	BP.clickEdit();
	
}
@When("Admin Clicks on Cancel")
public void admin_Clicks_on_Cancel() {
	BP=new BatchPage();
	BP.clickCancelbtn();
}
   

@Then("Admin see Batch Details window getting closed")
public void admin_see_Batch_Details_window_getting_closed() {
	BP=new BatchPage();
	boolean BatchDetailswindowcloded= BP.ValidateBatchDetailswindowclosed();
	Assert.assertEquals(BatchDetailswindowcloded, "Batch Deatils Window closed");
	System.out.println("Entries with List of Batch names whose Batch Details window closed");
}
    

/*Add Batch 03*/

@Given("Admin\\/User\\/Staff is on the ManageBatch page")
public void admin_User_Staff_is_on_the_ManageBatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin\\/User\\/Staff  Enters edited Batch Name\\/Batch Description in Search")
public void admin_User_Staff_Enters_edited_Batch_Name_Batch_Description_in_Search() {
    BP=new BatchPage();
    BP.sendBatchName();
    BP.sendBatchDescription();
}

@Then("Entry for the edited  Batch Name\\/Batch Description is shown")
public void entry_for_the_edited_Batch_Name_Batch_Description_is_shown() {
	
	BP=new BatchPage();
	String EditBatchDescriptionName= BP.ValidateEditBatchNameDescription();
	Assert.assertEquals(EditBatchDescriptionName, "Batch Name");
	System.out.println("Entries with List of Edit Batch Names Displayed");

    
}

/* Add Batch 04*/

@Given("User\\/Staff on Manage Batch page")
public void user_Staff_on_Manage_Batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("User\\/Staff will see Error message  {string}")
public void user_Staff_will_see_Error_message(String errormsg) {
	BP=new BatchPage();
	String actualmsg = BP.ErrorMessage(errormsg);
	Assert.assertEquals(errormsg,actualmsg);
	System.out.println(actualmsg);
    
}


/* Delete Batch 01*/


@Given("Admin is on ManageBatchpage")
public void admin_is_on_ManageBatchpage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@Then("^Admin will see headertext as \"(.*)\"$")
public void admin_will_see_headertext_as(String expectedmsg) {
   BP=new BatchPage();
   String actualmsg = BP.Message(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
   
}

/* Delete Batch 02*/

@Given("Admin Clicks on any Delete button on the right side")
public void admin_Clicks_on_any_Delete_button_on_the_right_side() {
	BP=new BatchPage();
    BP.clickdelete();
}

@Then("^Admin see a Successmessage \"(.*)\"$")
public void admin_see_a_Successmessage(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.SuccessMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
}

@Given("Admin Clicks on any Delete button located on right side")
public void admin_Clicks_on_any_Delete_button_located_on_right_side() {
	BP=new BatchPage();
    BP.clickdelete();
}


@Then("Admin can see Batch Name not deleted")
public void admin_can_see_Batch_Name_not_deleted() {
	BP=new BatchPage();
	String ProgramNameNotDel= BP.ValidateprogramNameNotDeleted();
	Assert.assertEquals(ProgramNameNotDel, "Program Name Not Deleted");
	System.out.println("Entries with List of Program Names not Deleted is Displayed");

    
}

/* Delete Batch 03*/

@Given("Admin\\/Staff\\/User  on to manage batch page")
public void admin_Staff_User_on_to_manage_batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin\\/User\\/Staff Enters deleted batch Program Name in Search")
public void admin_User_Staff_Enters_deleted_batch_Program_Name_in_Search() {
    BP=new BatchPage();
    BP.sendProgramName();
}

/* delete batch 04*/

@Given("User\\/Staff on ManageBatch page")
public void user_Staff_on_ManageBatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}


@Then("^User\\/Staff will see a Error message \"(.*)\"$")
public void user_Staff_will_see_a_Error_message(String expectedmsg) {
	BP=new BatchPage();
	   String actualmsg = BP.ErrorMessage(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
    
}

/* Delete Multiple records 01*/


@When("Admin\\/User\\/Staff is on Manage batch page")
public void admin_User_Staff_is_on_Manage_batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}


/* Delete Multiple records 02*/

@Given("Admin\\/User\\/Staff is on the ManageBatchpage")
public void admin_User_Staff_is_on_the_ManageBatchpage() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
public void admin_User_Staff_selects_more_than_one_Batch_Name_using_checkbox() {
	BP=new BatchPage();
	BP.selectmulticheckbox();
	BP.ValidateDelEnabled();

    
}

/*Delete Multiple Records 03*/

@Given("Admin selects more than one Batch Name using checkbox")
public void admin_selects_more_than_one_Batch_Name_using_checkbox() {
    BP=new BatchPage();
    BP.selectProgramdropdown();
}


@Then("^Admin will see headerText as \"(.*)\"$")
public void admin_will_see_headerText_as(String expectedmsg) {
	 BP= new BatchPage();

		String actualmsg =BP.Message(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
}

@Given("Admin Clicks on Enabled Delete button after selecting  more than one Batch Name")
public void admin_Clicks_on_Enabled_Delete_button_after_selecting_more_than_one_Batch_Name() {
	 BP= new BatchPage();
	 BP.ValidateDelEnabled();
    
}

@Then("^Admin will be seeing the Success message as \"(.*)\"$")
public void admin_will_be_seeing_the_Success_message_as(String expectedmsg) {
	BP=new BatchPage();
	String actualmsg = BP.SuccessMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
	
}

@Given("Admin Clicks on Enabled button delete after selecting  more than one Batch Name")
public void admin_Clicks_on_Enabled_button_delete_after_selecting_more_than_one_Batch_Name() {
	BP=new BatchPage();
	BP.ValidateDelEnabled();
   
}

/* Delete Multiple Records 04*/

@Given("Admin\\/User\\/Staff  is on manageBatch page")
public void admin_User_Staff_is_on_manageBatch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
public void admin_User_Staff_Enters_deleted_Program_Names_in_Search() {
	BP=new BatchPage();
	BP.ValidateProgramName();
	
    
}
@Then("Admin\\/User\\/Staff finds results as no results")
public void admin_User_Staff_finds_results_as_no_results() {
   BP=new BatchPage();
   BP.clickno();
}


/* Delete Multiple Records 05*/

@Given("User\\/Staff selects more than one Batch  Name using checkbox")
public void user_Staff_selects_more_than_one_Batch_Name_using_checkbox() {
    BP=new BatchPage();
    BP.selectmulticheckbox();
}

@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
public void user_Staff_Cicks_on_Enabled_Delete_button_on_the_top_left_hand_side() {
   BP=new BatchPage();
   BP.clickdelete();
}

/* Checkbox Batch */

@Given("Admin\\/User\\/Staff lands on Manage batch page")
public void admin_User_Staff_lands_on_Manage_batch_page() {
	BP=new BatchPage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Batch", title);
}

@When("Admin\\/User\\/Staff Selects First checkbox left to Batch Name")
public void admin_User_Staff_Selects_First_checkbox_left_to_Batch_Name() {
    BP=new BatchPage();
    BP.clickFirstCheckBox();
}

@Then("Admin\\/User\\/Staff see all the checkboxes in the Batch page get selected")
public void admin_User_Staff_see_all_the_checkboxes_in_the_Batch_page_get_selected() {
	BP=new BatchPage();
	BP.selectmulticheckbox();
	System.out.println("Entries with List of New program Names Displayed");
    
    
}
	
	
}
