package stepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AttendencePage;
import pages.BatchPage;
import pages.LoginPage;


public class Attendence extends TestBase{
	LoginPage LP;
	Registration RP;
	BatchPage  BP;
	AttendencePage AP;
	
	/* Attendance Header */
	

	@When("Admin\\/User\\/Staff Clicks on Attendance button")
	public void admin_User_Staff_Clicks_on_Attendance_button() {
	    AP=new AttendencePage();
	    AP.clickattendencebtn();
	    
	}
	

	@Then("^Admin\\/User\\/Staff see header text as \"(.*)\"$")
	public void admin_User_Staff_see_header_text_as(String expectedmsg) {
	    AP=new AttendencePage();
	    String actualmsg =AP.Message1(expectedmsg);
		Assert.assertEquals(expectedmsg,actualmsg);
		System.out.println(actualmsg);
	}


	/*Attendence Footer*/

	@When("Admin\\/User\\/Staff is on Manage Attandance page")
	public void admin_User_Staff_is_on_Manage_Attandance_page() {
		AP=new AttendencePage();
	    String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Attendence", title);
	}
	
	/*paginator Attendence */
	

@When("Admin\\/User\\/Staff is on Manage Attendance page")
public void admin_User_Staff_is_on_Manage_Attendance_page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
}

@When("Admin\\/User\\/Staff is on Manage Attendance")
public void admin_User_Staff_is_on_Manage_Attendance() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
}

/*Edit functionality Attendence */


@Given("User\\/Staff is on the Manage Attendance page")
public void user_Staff_is_on_the_Manage_Attendance_page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
}


/*Edit Functionality 02*/

@Given("User\\/Staff should be on LMS Website page")
public void user_Staff_should_be_on_LMS_Website_page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
    
}
@Given("User\\/Staff must be on Manage Attendence Page")
public void user_Staff_must_be_on_Manage_Attendence_Page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
	
}

@Then("User\\/Staff see the success message \"(.*)\"$")
public void user_Staff_see_the_success_message(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =AP.SuccessMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
	
}


@Then("User\\/Staff see a Attendance Details window getting closed")
public void user_Staff_see_a_Attendance_Details_window_getting_closed() {
    AP=new AttendencePage();
    AP.clickAttendencewindowclosed();
}

/* Edit Functionality Attendence 03*/

@When("Admin must be on the Manage Attendance Page")
public void admin_must_be_on_Manage_Attendance_Page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
    
    
}

@Then("^Admin see Error Message \"(.*)\"$")
public void admin_see_Error_Message(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =AP.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
	
    
}
/*Delete Functionality Attendence 01*/

@Given("User\\/Staff will be on Manage Attendance page")
public void user_Staff_will_be_on_Manage_Attendance_page() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
    
    
}

@Then("^Admin see headertext as the \"(.*)\"$")
public void admin_see_headertext_as_the(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =BP.Message1(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
    
}
	 	
@Then("^User\\/Staff  see Successmessage \"(.*)\"$")
public void user_Staff_see_Successmessage(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =AP.SuccessMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
	
}


@Then("^User\\/Staff see the \"(.*)\"$")
public void user_Staff_see_the(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =AP.Message3(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
    

}


/*Delete Functionality 02*/

@Given("Admin on Manage AttendancePage")
public void admin_on_Manage_AttendancePage() {
	AP=new AttendencePage();
    String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
}


@Then("^Admin see Error Message as \"(.*)\"$")
public void admin_see_Error_Message_as(String expectedmsg) {
	AP=new AttendencePage();
	String actualmsg =AP.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg);
    
}

/* Check bob Functionality */


@Given("Admin\\/User\\/Staff on ManageAttendancepage")
public void admin_User_Staff_on_ManageAttendancepage() {
   AP=new AttendencePage();
   String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Manage Attendence", title);
   
}

@When("Admin\\/User\\/Staff Clicks on Checkbox")
public void admin_User_Staff_Clicks_on_Checkbox() {
	AP=new AttendencePage();
	AP.clickcheckbox();
}

@Then("Admin\\/User\\/Staff  see list of Users in that Program")
public void admin_User_Staff_see_list_of_Users_in_that_Program() {
	AP=new AttendencePage();
	List<WebElement> UsersList= BP.ValidateUserstList();
	Assert.assertEquals(UsersList, "Users List");
   System.out.println("List of users in that Program");
}


/* Attendence Present Functionality*/

@Given("Admin\\/User\\/Staff will be on  ManageAttendancepage")
public void admin_User_Staff_will_be_on_ManageAttendancepage() {
	AP=new AttendencePage();
	   String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Attendence", title);
}

@When("Admin\\/User\\/Staff  Clicks on Present")
public void admin_User_Staff_Clicks_on_Present() {
   AP=new AttendencePage();
   AP.clickonpresent();
   
}

@Then("Admin\\/User\\/Staff  see the list of  \"(.*)\" who are Present")
public void admin_User_Staff_see_the_list_of_who_are_Present(String string) {
	AP=new AttendencePage();
	List<WebElement> PresentList= AP.ValidatePresentList();
	Assert.assertEquals(PresentList, "Present List");
    System.out.println("List of the present candidates displayed");
}


/*Attendence Absent Functionality */

@Given("Admin\\/User\\/Staff will be on Manage Attendance Page")
public void admin_User_Staff_will_be_on_Manage_Attendance_Page() {
	AP=new AttendencePage();
	   String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Manage Attendence", title);
}

@When("Admin\\/User\\/Staff  Clicks on Absent")
public void admin_User_Staff_Clicks_on_Absent() {
	AP=new AttendencePage();
	AP.clickonabsent();
}

@Then("Admin\\/User\\/Staff  see the list of  {string} who are Absent")
public void admin_User_Staff_see_the_list_of_who_are_Absent(String string) {
	AP=new AttendencePage();
	List<WebElement> AbsentList= AP.ValidateAbsentList();
	Assert.assertEquals(AbsentList, "Absent List");
    System.out.println("List of absent candidates will be displayed");
}

}
