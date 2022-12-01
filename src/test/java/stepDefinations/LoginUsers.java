package stepDefinations;

import java.util.List;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginUsers extends TestBase{
	
	public LoginPage login = new LoginPage();
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_Logged_on_to_lms_website(DataTable table) {
		List<List<String>> data = table.cells();
		login.userNameTxt(data.get(1).get(0));
		login.passwordTxt(data.get(1).get(1));
		login.loginBtn();
	}

	@Given("Admin Logged on to LMS Website")
	public void admin_logged_on_to_lms_website(DataTable table) {
		List<List<String>> data = table.cells();
		login.userNameTxt(data.get(1).get(0));
		login.passwordTxt(data.get(1).get(1));
		login.loginBtn();
	} 

	@Given("User\\/Staff Logged on to LMS Website")
	public void user_staff_logged_on_to_lms_website(DataTable table) {
		List<List<String>> data = table.cells();
		login.userNameTxt(data.get(1).get(0));
		login.passwordTxt(data.get(1).get(1));
		login.loginBtn();
	}
	

	@Given("Admin\\/User\\/Staff is on to LMS website")
	public void admin_user_staff_is_on_to_lms_website() {
		String URL = driver.getCurrentUrl();
		Assert.assertEquals("//LMS.com", URL);
		System.out.println("User is on " +URL);
	}


}
