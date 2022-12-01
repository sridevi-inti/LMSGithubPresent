package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class LogoutPage extends TestBase{

	@FindBy (xpath="//*[contains(text(),'Logout')]") WebElement logout_btn;

	//constructor
	public LogoutPage() {
		PageFactory.initElements(driver,this);
	}

	public void clickLogout() {

		logout_btn.click();
	}

}
