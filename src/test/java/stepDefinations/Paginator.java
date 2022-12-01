package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginatorPage;

public class Paginator extends TestBase{

	public PaginatorPage paginator = new PaginatorPage();

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
		paginator.firstPageArrow();
	}


	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		paginator.nextPageArrow();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
		paginator.lastPageArrow();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -previous button")
	public void admin_User_Staff_Clicks_on_Enabled_paginator_previous_button() {
		paginator.prevPageArrow();
	}

	@Then("^Admin\\/User\\/Staff see the text as \"(.*)\"$")
	public void admin_user_staff_see_the_text_as(String text) {

		String actualmsg =paginator.tableText(text);
		Assert.assertEquals(text,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("Admin\\/User\\/Staff see all paginator buttons are Disabled")
	public void admin_User_Staff_see_all_paginator_buttons_are_Disabled() {
		paginator.firstPageArrow();

	}


	@Then("^Admin\\/User\\/Staff see Paginator text as \"(.*)\"$")
	public void admin_user_staff_see_paginator_text_as(String pagetext) {

		String actualmsg =paginator.tableText(pagetext);
		Assert.assertEquals(pagetext,actualmsg);
		System.out.println(actualmsg);
	}

	@Then("^Admin\\/User\\/Staff should see last page")
	public void admin_user_staff_should_see_last_page() {
		paginator.disableLastPageArrow();
	}


	@Then("Admin\\/User\\/Staff should see first page")
	public void admin_user_staff_should_see_first_page() {
		paginator.disableFirstPageArrow();
	}
}
