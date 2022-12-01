package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class HeaderPage extends TestBase{
	
	@FindBy (xpath="//*[contains(text(),'value')]") WebElement Header_text;
	
	
	//constructor
	public HeaderPage() {
		PageFactory.initElements(driver, this);
	}


	//Methods
	
	public boolean Header_text(String expectedmsg) {

		return Header_text.isDisplayed();
	}

}
