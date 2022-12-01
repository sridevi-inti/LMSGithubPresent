package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class FooterPage extends TestBase{
	
	@FindBy (xpath="//*[contains(text(),'Showing 1 to 5 of 9 entries')]") WebElement footer_text;
	
	//constructor
	public FooterPage() {
		PageFactory.initElements(driver, this);
	}


	//Methods

	public String footerText(String expectedmsg) {

		return footer_text.getText();
	}

}
