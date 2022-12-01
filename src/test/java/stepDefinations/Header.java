package stepDefinations;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import pages.HeaderPage;

public class Header extends TestBase{

	public HeaderPage headerP = new HeaderPage();


	@Then("^Admin see header text as \"(.*)\"$")
	public void admin_see_header_text_as(String text) {
		
		boolean display =headerP.Header_text(text);
		if(display == true) {
			System.out.println(text+" is displayed");
		}
		else {
			System.out.println(text+" not displayed");
		}
	}
	
	
	@Then("^Admin\\/User\\/Staff see header text \"(.*)\"$")
	public void admin_user_staff_see_header_text_as_Manage_Program(String text) {

		boolean display =headerP.Header_text(text);
		if(display == true) {
			System.out.println(text+" is displayed");
		}
		else {
			System.out.println(text+" not displayed");
		}
	}
	
	@Then("user should see header text as \"(.*)\"$")
	public void user_should_see_header_text_as(String string) {
		
		boolean display =headerP.Header_text(string);
		if(display == true) {
			System.out.println(string+" is displayed");
		}
		else {
			System.out.println(string+" not displayed");
		}
	}
	
	@Then("admin\\/staff should see header text as \"(.*)\"$")
	public void admin_staff_should_see_header_text_as(String string) {

		boolean display =headerP.Header_text(string);
		if(display == true) {
			System.out.println(string+" is displayed");
		}
		else {
			System.out.println(string+" not displayed");
		}

	}

}
