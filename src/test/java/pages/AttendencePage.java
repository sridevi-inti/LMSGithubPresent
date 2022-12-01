package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class AttendencePage extends TestBase{

	@FindBy(xpath="//*[@class='btn btn-Attendence']")WebElement btnClickAttendence;
	@FindBy(xpath="//*[contains(text(),'Manage Attendence')")WebElement Message;
	@FindBy(xpath="//*[contains(text(),'Manage Attendence')")WebElement Message1;
	@FindBy(xpath="//*[contains(text(),'Showing 1 to 5 of 5 entries.')")WebElement Message2;
	@FindBy(xpath="//*[@class='btn Attndence-edit'')")WebElement btnClickedit;
	@FindBy(xpath="//*[contains(text(),'")WebElement Message3;
	@FindBy(xpath="//*[@class='btn Attndence-save'')")WebElement btnClicksave;
	@FindBy(xpath="//*[@class='btn Attndence-cancel'')")WebElement btnclickcancel;
	@FindBy(xpath="//*[@class='btn Attndence-delete'')")WebElement btnclickdel;
	@FindBy(xpath="//*[@class='btn Attndence-delete-yes')")WebElement btnclickdelyes;
	@FindBy(xpath="//*[@class='btn Attndence-delete-no')")WebElement btnclickdelno;
	@FindBy(xpath="//*[@class='btn Attndence-delete-no')")WebElement btnclickcheckbox;
	@FindBy(xpath="//*[@class='btn Attndence-present')")WebElement btnclickonPresent;
	@FindBy(xpath="//*[@class='btn Attndence-absent')")WebElement btnclickonAbsent;
	@FindBy(xpath="//*[contains(text(),'error')") WebElement errormsg;
	@FindBy(xpath="//*[contains(text(),'Success')") WebElement Successmsg;
	@FindBy(tagName=("td")) List<WebElement> AbsentUsers;
	@FindBy(tagName=("td")) List<WebElement> PresentUsers;
	@FindBy(tagName=("td")) List<WebElement> UsersList;	
	@FindBy (className = "pagination-arrowFirst") WebElement firstPage_arrow;
	
	//constructor
	public AttendencePage() {
		PageFactory.initElements(driver, this);
	}


	//Methods
	public void clickattendencebtn() {
		btnClickAttendence.click();

	}

	public String Message1(String expectedmsg) {
		return Message1.getText();

	}

	public String Message(String expectedmsg) {
		return Message.getText();

	}
	public String Message2(String expectedmsg) {
		return Message2.getText();

	}

	public String Message3(String expectedmsg) {
		return Message3.getText();


	}

	public void clickeditbtn() {
		btnClickedit.click();


	}

	public void clicksavebtn() {
		btnClicksave.click();

	}



	public void clickcancelbtn() {
		btnclickcancel.click();
	}


	public void clickdeletebtn() {
		btnclickdel.click();

	}


	public void clickdelyesbtn() {
		btnclickdelyes.click();

	}

	public void clickdelnobtn() {
		btnclickdelno.click();
	}


	public void clickcheckbox() {
		btnclickcheckbox.click();

	}

	public void clickonpresent() {

		btnclickonPresent.click();

	}

	public void clickonabsent() {

		btnclickonAbsent.click();

	}

	public void firstPage_arrow() {

		String lastbtn = firstPage_arrow.getAttribute("class");

		if(lastbtn.contains("disable")) {
			System.out.println("User is on First page");
		}
		else {
			System.out.println("User is not on First page");
		}


	}

	public void clickAttendencewindowclosed() {

	}

	public String ErrorMessage(String expectedmsg) {
		return errormsg.getText();
	}

	public List<WebElement> ValidateUserstList() {
		return UsersList;
	}

	public String SuccessMessage(String expecteddmsg) {

		return Successmsg.getText();

	}

	public List<WebElement> ValidatePresentList() {
		return PresentUsers;
	}

	public List<WebElement> ValidateAbsentList() {
		return AbsentUsers;
	}
}
