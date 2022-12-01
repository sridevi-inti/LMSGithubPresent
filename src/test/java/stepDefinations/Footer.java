package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import pages.FooterPage;

public class Footer extends TestBase{
	
	public FooterPage footerP = new FooterPage();
	
	@Then("^Admin\\/User\\/Staff see Footer text as \"(.*)\"$")
	public void admin_user_staff_see_footer_text_as(String footertext) {

		String actualmsg =footerP.footerText(footertext);
		Assert.assertEquals(footertext,actualmsg);
		System.out.println(actualmsg);

	}

}
