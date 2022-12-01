package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class ProgramPage extends TestBase{

	@FindBy (id="search_query_top") WebElement search_txt;
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;
	@FindBy (xpath="//button//span[text()=' Delete Program']") WebElement deleteRow_btn;
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	@FindBy (xpath="//button//span[text()=' Edit Program']") WebElement edit_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement programAscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement descriptionAscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement statusAscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement programDscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement descriptionDscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement statusDscOrder_btn;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement SelectAll_checkbox;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement checkbox;
	@FindBy (xpath="id('mat-radio-40')//span") WebElement radio_btn;
	@FindBy (id="id_name") WebElement name_txtBx;
	@FindBy (xpath="//*[@aria-label='Description']//span") WebElement description_txtBx;
	@FindBy (id="submit") WebElement save_btn;
	@FindBy (xpath="//button//span[text()=' Delete Confirm']") WebElement DeleteConfirm_btn;
	@FindBy (xpath="//button//span[text()=' Cancel Delete']") WebElement DeleteCancel_btn;
	@FindBy (xpath="//button//span[text()=' close']") WebElement close_from;
	@FindBy (xpath="//*[contains(text(),'program Form')]") WebElement program_btn;
	@FindBy (xpath="//*[contains(text(),'Manage Program')]") WebElement program_Form;
	@FindBy (xpath="//*[contains(text(),'Program Details')]") WebElement programDetails_Form;
	@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (tagName=("td")) List<WebElement> colums;


	//constructor
	public ProgramPage() {
		PageFactory.initElements(driver, this);
	}



	//Methods
	public void programFormbtn() {

		program_btn.click();
	}

	public void SelectAllCheckbox() {

		SelectAll_checkbox.click();
	}

	public void CheckBox() {

		checkbox.click();
	}

	public void editBtn() {

		edit_btn.click();
	}

	public void DeleteRowBtn() {

		deleteRow_btn.click();
	}

	public boolean deleteMultiRowBtndisplay() {

		return deleteMuti_btn.isEnabled();
	}


	public void deleteMultiRowBtn() {

		deleteMuti_btn.click();
	} 

	public void deleteConfirmBtn() {

		DeleteConfirm_btn.click();
	}

	public void deleteCancelBtn() {

		DeleteCancel_btn.click();
	}


	public boolean ValidateSelectAllCheckbox() {

		return SelectAll_checkbox.isSelected();
	}

	public void ValidateCheckBox() {

		checkbox.isSelected();
	}


	public void saveBtn() {

		save_btn.click();
	}

	public void radioBtn() {

		radio_btn.click();
	}

	public void nametxtBx(String name) {

		name_txtBx.sendKeys(name);

	}

	public void descriptiontxtBx(String description) {

		description_txtBx.sendKeys(description);

	}

	public boolean programForm(String text) {

		return program_Form.isDisplayed();
	}
	
	public void manageProgramValidate() {

		 program_Form.isDisplayed();
	}


	public String programDetailsForm(String expectedmsg) {

		return programDetails_Form.getText();
	}

	public String DeleteConfirmBox(String expectedmsg) {

		return DeletConfirm_Box.getText();
	}

	public void search(String input) {

		search_txt.sendKeys(input);
	}

	public void tableValue() {

		int col = colums.size();
		int row = Row.size();
		for(int j=1;j<=col;j++) {			
			for(int i=1;i<=row;i++)
			{
				System.out.println(String.valueOf(i));
			}
		}
	}

	public void programAscOrderbtn() {

		programAscOrder_btn.click();
	}

	public void descriptionAscOrderbtn() {

		descriptionAscOrder_btn.click();
	}

	public void statusAscOrderbtn() {

		statusAscOrder_btn.click();
	}

	public void programDscOrderbtn() {

		programDscOrder_btn.click();
	}

	public void descriptionDscOrderbtn() {

		descriptionDscOrder_btn.click();
	}

	public void statusDscOrderbtn() {

		statusDscOrder_btn.click();
	}

	public String Message(String expectedmsg) {

		return message.getText();

	}

	public int numberOfRows(int numberofrow) {

		System.out.println(Row.size());
		return numberofrow;
	}
}

