package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class BatchPage extends TestBase{

	@FindBy(xpath="//*[@class='btn btn-batch']") WebElement btnClickBatch;	
	@FindBy(xpath="//*[contains(text(),'Manage Attendence')") WebElement Message2;
	@FindBy(xpath="//*[contains(text(),'+A Attendence-button')") WebElement Message3;
	@FindBy(xpath="//*[contains(text(),'In total there are 21 batches.')") WebElement Message1;
	@FindBy(xpath="//*[@class='btn btn-next']") WebElement btnpagenext;
	@FindBy(xpath="//*[@class='btn btn-last']")	WebElement btnpagelast;
	@FindBy(xpath="//*[@span/button[text()='1']")WebElement btnpagefirst;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnbatchAsc;
	@FindBy(xpath="//*[@span/button/Batch-Desc']")WebElement btnbatchDescAsc;
	@FindBy(xpath="//*[@span/button/Status-Asc']")WebElement btnStatusAsc;
	@FindBy(xpath="//*[@span/button/Noofclasses-Ascending']")WebElement btnnoofclassesAsc;
	@FindBy(xpath="//*[@span/Program-name-Asc']")WebElement btnProgramnameAsc;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchNameDesc;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchDescDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchStatusDesc;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnnoofclassesDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnprogramNameDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnANewBatch;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnSaveBatch;
	@FindBy(xpath="//*[contains(text(),'Showing 1 to 5 of 21 batches.')")WebElement Message;
	@FindBy(xpath="//*[contains(text(),'Search')")WebElement Message4;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Name']")WebElement input_data;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Description']")WebElement input_data1;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Status']")WebElement input_data2;
	@FindBy(xpath="//*[@id='searchtextbox-no-of-classes']")WebElement input_data3;
	@FindBy(xpath="//*[@id='searchtextbox-Program Name']")WebElement input_data4;
	@FindBy(xpath="//*[contains(text(),'Error')")WebElement ErrorMessage;
	@FindBy(xpath="//*[contains(text(),'Success')")WebElement successMessage;
	@FindBy(xpath="//*[@class='btn drop-down']")WebElement btndropdown;
	@FindBy(xpath="//*[@class='btn batch-Details']")WebElement btnNewBatchDetails;
	@FindBy(xpath="//*[@class='btn program-drop-down']")WebElement btnProgramdropdown;
	@FindBy(xpath="//*[@class='btn Status']")WebElement btnStatus;
	@FindBy(xpath="//button//span[text()=' Cancel']")WebElement btncancel;
	@FindBy(xpath="//button//span[text()='Click']")WebElement btnclickedit;
	@FindBy(xpath="//button//span[text()='Delete']")WebElement btnclickdel;
	@FindBy(xpath="//button//span[text()='Yes']")WebElement btnclickyes;
	@FindBy(xpath="//button//span[text()='No']")WebElement btnclickno;
	@FindBy(xpath=" //span[text()='Batch Name']")WebElement BatchName;
	@FindBy(xpath=" //span[text()='Batch Description']")WebElement BatchDescription;
	@FindBy(xpath=" //span[text()='Batch Status']")WebElement BatchStatus;
	@FindBy(xpath=" //span[text()='NoOfClasses']")WebElement NoOfClasses;
	@FindBy(xpath=" //span[text()='Program Name']")WebElement ProgramName;
	@FindBy(xpath=" //span[text()='Batch Name Ascending']")WebElement BatchNameAsc;
	@FindBy(xpath=" //span[text()='Batch Description Ascending']")WebElement BatchDescriptionAsc;
	@FindBy(xpath=" //span[text()='Batch Status Ascending']")WebElement BatchStatusAsc;
	@FindBy(xpath=" //span[text()='No Of Classes Ascending']")WebElement NoOfClassesAsc;
	@FindBy(xpath=" //span[text()='Program Name Ascending']")WebElement ProgramNameAsc;
	@FindBy(xpath=" //span[text()='Batch Name Descending']")WebElement BatchNameDesc;
	@FindBy(xpath=" //span[text()='Batch Description Descending']")WebElement BatchDescriptionDesc;
	@FindBy(xpath=" //span[text()='Batch Status Descending']")WebElement BatchStatusDesc;
	@FindBy(xpath=" //span[text()='No Of Classes Ascending']")WebElement NoOfClassesDesc;
	@FindBy(xpath=" //span[text()='Program Name Descending']")WebElement ProgramNameDesc;
	@FindBy(xpath="//*[@class='btn window close']")WebElement btnwindowclosed;
	@FindBy(xpath="//*[@class='btn window close']")WebElement BatchDetails;
	@FindBy(xpath=" //span[text()='Edit Attendence Name Description']")WebElement EditBatchNameDescription;
	@FindBy(xpath=" //span[text()='Program Name Not Del']")WebElement ProgramNameNotDel;
	@FindBy(xpath=" //span[text()='Batch Name No Results']")WebElement NoResults;
	@FindBy(xpath="//*[@span/Delete-disabled']")WebElement DelDisabled;
	@FindBy(xpath="//*[@span/select-multiple-checkbox']")WebElement multiplecheckbox;
	@FindBy(xpath="//*[@span/Delete-Enabled']")WebElement DelEnabled;
	@FindBy(xpath="//*[@span/window-closed']")WebElement BatchDetailswindowclosed;
	@FindBy(xpath="//*[@span/window-closed']")WebElement errormsg;
	@FindBy(xpath="//*[@span/batch-message']")WebElement batchMessage;
	@FindBy(xpath="//button//span[text()='Checkbox']") WebElement btnfirstcheckbox;
	@FindBy(xpath="//button//span[text()='closed']") WebElement attendencewindowclosed;
	@FindBy(xpath="//button//span[text()='Delete']") WebElement btndelete;
	@FindBy(tagName=("td")) List<WebElement> UsersList;
	@FindBy (className = "pagination-arrowLast") WebElement SeelastPage;
	@FindBy (className = "pagination-arrowFirst") WebElement SeeFirstPage;

	//constructor
	public BatchPage() {
		PageFactory.initElements(driver, this);
	}

	//Methods
	public void clickBatchButton() {
		btnClickBatch.click();

	}


	public String Message2(String expectedmsg) {
		return Message.getText();
	}

	public String Message4(String expectedmsg) {
		return Message.getText();
	}

	public void clickpagenextbtn() {

		btnpagenext.click();
	}

	public void clickpagelastbtn() {

		btnpagelast.click();
	}

	public void clickpagefirstbtn() {
		btnpagefirst.click();
	}

	public void clickbatchAsc() {

		btnbatchAsc.click();
	}

	public void clickbatchDescAsc() {

		btnbatchDescAsc.click();
	}
	public void clickStatusAsc() {

		btnStatusAsc.click();

	}
	public void clicknoofclassesAsc() {

		btnnoofclassesAsc.click();
	}

	public void clickProgramNameAsc() {

		btnProgramnameAsc.click();

	}

	public void clickBatchNameDesc() {

		btnBatchNameDesc.click();
	}

	public void clickBatchDescDes() {
		btnBatchDescDes.click();
	}

	public void clickBatchStatusDesc() {

		btnBatchStatusDesc.click();
	}

	public void clicknoofclassesDes() {

		btnnoofclassesDes.click();
	}

	public void clickprogramNameDes() {

		btnprogramNameDes.click();
	}

	public void clickANewBatch() {

		btnANewBatch.click();

	}
	public void clickSaveBatch() {

		btnSaveBatch.click();
	}

	public String Message(String expectedmsg) {
		return Message3.getText();

	}

	public String Message1(String expectedmsg) {
		return Message1.getText();

	}

	public String Message3(String expectedmsg) {
		return Message3.getText();

	}
	public void sendBatchName() {
		input_data.sendKeys("Batch Name");
	}

	public void sendBatchDescription(){
		input_data1.sendKeys("Batch Description");

	}

	public void sendBatchStatus() {

		input_data2.sendKeys("Batch Status");
	}

	public void sendnoOfclasses() {

		input_data3.sendKeys("no of classes");

	}

	public void sendProgramName() {

		input_data4.sendKeys("program Name");
	}



	public void clickdropDown() {

		btndropdown.click();

	}


	public void clickANewBatchdetails() {

		btnNewBatchDetails.click();

	}

	public void selectProgramdropdown() {

		btnProgramdropdown.click();

	}


	public void selectStatus() {

		btnStatus.click();

	}

	public void clickCancelbtn() {
		btncancel.click();

	}

	public void clickEdit() {
		btnclickedit.click();

	}


	public void clickyes() {
		btnclickyes.click();

	}

	public void clickno() {
		btnclickno.click();

	}

	public void clickFirstCheckBox() {
		btnfirstcheckbox.click();

	}

	public String ValidateBatchName() {
		return BatchName.getText();



	}

	public String ValidateBatchDescription() {

		return BatchDescription.getText();
	}

	public String ValidateBatchStatus() {

		return BatchStatus.getText();
	}

	public String ValidateNoOfClasses() {

		return NoOfClasses.getText();
	}

	public String ValidateProgramName() {

		return ProgramName.getText();
	}

	public String ValidateBatchNameAsc() {

		return BatchNameAsc.getText();
	}

	public String ValidateBatchDescriptionAsc() {
		return BatchDescriptionAsc.getText();
	}

	public String ValidateBatchStatusAsc() {

		return BatchStatusAsc.getText();
	}

	public String ValidateNoOfClassesAsc() {

		return NoOfClasses.getText();
	}

	public String ValidateProgramNameAsc() {

		return ProgramName.getText();
	}

	public String ValidateBatchNameDesc() {

		return BatchNameDesc.getText();
	}

	public String ValidateBatchDescriptionDesc() {

		return BatchDescriptionDesc.getText();
	}

	public String ValidateBatchStatusDesc() {

		return BatchStatusDesc.getText();
	}

	public String ValidateNoOfClassesDesc() {

		return NoOfClassesDesc.getText();
	}

	public String ValidateProgramNameDesc() {

		return ProgramNameDesc.getText();
	}

	public void windowClosed() {

		btnwindowclosed.click();

	}

	public String ValidateBatchDetails() {

		return BatchDetails.getText();
	}


	public String ValidateEditBatchNameDescription() {

		return EditBatchNameDescription.getText();
	}

	public String ValidateprogramNameNotDeleted() {

		return ProgramNameNotDel.getText();
	}

	public String ValidateNoResults() {

		return NoResults.getText();
	}

	public String ValidateDelDisabled() {

		return DelDisabled.getText();
	}

	public boolean selectmulticheckbox() {

		return multiplecheckbox.isSelected();
	}



	public boolean ValidateDelEnabled() {

		return DelEnabled.isEnabled();
	}

	public boolean ValidateBatchDetailswindowclosed() {

		return BatchDetailswindowclosed.isDisplayed();
	}

	public String ErrorMessage(String expectedmsg) {

		return errormsg.getText();
	}

	public String SuccessMessage(String expectedmsg) {

		return  successMessage.getText();
	}

	public String clickABatchMessage(String expectedmsg) {

		return batchMessage.getText();

	}

	public void SeeFirstPage() {
		String firstbtn = SeeFirstPage.getAttribute("class");

		if(firstbtn.contains("disable")) {
			System.out.println("User is on First page");
		}
		else {
			System.out.println("User is not on First page");
		}


	}

	public void SeelastPage() {
		String lastbtn = SeelastPage.getAttribute("class");

		if(lastbtn.contains("disable")) {
			System.out.println("User is on Last page");
		}
		else {
			System.out.println("User is not on Last page");
		}
	}


	public void clickdelete() {
		btndelete.click();

	}

	public boolean ValidateAttendenceDetailswindowclosed() {
		return attendencewindowclosed.isDisplayed();
	}

	public List<WebElement> ValidateUserstList() {
		return UsersList;
	}
}
