package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class AddNewButtonPage extends TestBase{
	
	@FindBy(xpath="//*[@class='btn Status']")WebElement btnStatus;
	@FindBy(xpath="//table/tbody/tr/i")WebElement clickSave;
	@FindBy (xpath="//button//span[text()=' Cancel']") WebElement cancel_btn;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnANewBatch;
	@FindBy(xpath="//*[@class='btn batch-Details']")WebElement btnNewBatchDetails;
	@FindBy (xpath="//*[@aria-label='Add a new Program']//span") WebElement AddNewProgram_btn;
	@FindBy(xpath="//*[@class='btn program-drop-down']")WebElement btnProgramdropdown;
	@FindBy (id="id_name") WebElement name_txtBx;
	@FindBy (xpath="//*[@aria-label='Description']//span") WebElement description_txtBx;
	@FindBy (xpath="id('mat-radio-40')//span") WebElement radio_btn;
	@FindBy(xpath="//*[@class='btn btn-add-new-assignment']") WebElement addNewAssignment_btn;
	@FindBy(xpath="//*[contains(text(),'+A Attendence-button')") WebElement Message;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnANewUser;
	
	
	//constructor
		public AddNewButtonPage() {
			PageFactory.initElements(driver, this);
		}


		//Methods
		
		public void clickANewUser() {

			btnANewUser.click();

		}
		public String Message(String expectedmsg) {
			return Message.getText();

		}
		public void clickAddNewAssignment() 
		{
			addNewAssignment_btn.click();	
		}
		public void radioBtn() {

			radio_btn.click();
		}

		public void descriptiontxtBx(String description) {

			description_txtBx.sendKeys(description);

		}
		public void nametxtBx(String name) {

			name_txtBx.sendKeys(name);

		}

		public void selectProgramdropdown() {

			btnProgramdropdown.click();

		}

		public void addNewProgramBtn() {

			AddNewProgram_btn.click();
		}
		public void clickANewBatchdetails() {

			btnNewBatchDetails.click();

		}

		public void clickANewBatch() {

			btnANewBatch.click();

		}
		
		public void cancelBtn() {

			cancel_btn.click();
		}

		public void selectStatus() {

			btnStatus.click();

		}
		
		public void clickSave() {

			clickSave.click();
		}
		

}
