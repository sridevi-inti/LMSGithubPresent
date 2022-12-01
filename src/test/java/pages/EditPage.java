package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class EditPage extends TestBase {
	
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnSave;
	@FindBy(xpath="//*[@class='btn btn-edit']") WebElement edit_btn;
	@FindBy(xpath="//*[@class='btn Attndence-cancel'')")WebElement btnclickcancel;
	
	//constructor
			public EditPage() {
				PageFactory.initElements(driver, this);
			}


			//Methods
			public void clickcancel() {
				btnclickcancel.click();
			}
			
			public void clickSave() {

				btnSave.click();
			}
			
			public void clickEdit() 
			{
				edit_btn.click();	
			}

}
