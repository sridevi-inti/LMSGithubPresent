package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogoutPage;

public class Logout extends TestBase{

	public LogoutPage logout= new LogoutPage();

	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_User_Staff_Clicks_on_LogOut_button() {
		logout.clickLogout();
	}
	

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_User_Staff_should_be_navigated_to_Login_Screen() {
		String title = driver.getTitle();
		Assert.assertEquals("Login", title);
		System.out.println("User is on " + title + " Page" );
	}

}
