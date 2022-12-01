package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseClass.TestBase;

public class UserPage extends TestBase{


	@FindBy(xpath="//*[@class='btn btn-user']") WebElement UserBtn;	
	@FindBy(xpath=" //span[text()='User Name']")WebElement UserName;
	@FindBy (xpath="//*[contains(text(),'Manage User')]") WebElement UserHeading;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (className = "pagination-arrowRight") WebElement nextPage_arrow;
	@FindBy (className = "pagination-arrowLeft") WebElement PreviousPage_arrow;
	@FindBy(xpath="//*[contains(text(),'Manage Attendence')") WebElement Message1;
	@FindBy (xpath="//*[contains(text(),'In total there are 4 users.')]") WebElement footer_text;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnANewUser;
	@FindBy (xpath="//table/tbody/tr/i") WebElement UserAscOrder_btn;
	@FindBy (tagName=("td")) List<WebElement> colums;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement checkbox;
	@FindBy (xpath="//table//thead//tr//th//input") WebElement SelectAll_checkbox;
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMultiRowBtn;
	@FindBy(xpath="//*[contains(text(),'Are you sure')") WebElement Message2;
	@FindBy (tagName=("th")) List<WebElement> tableHeader;
	@FindBy (xpath="//table/tbody/tr/i") WebElement ClickNo_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement Delete_btn;
	@FindBy(xpath="//*[contains(text(),'User deleted')") WebElement Message3;
	@FindBy (xpath="//table/tbody/tr/i") WebElement Close_btn;
	@FindBy (id="search_query_top") WebElement search_txt;
	@FindBy (xpath="//table/tbody/tr/i") WebElement SearchInputTxt;
	@FindBy (xpath="//table/tbody/tr/i") WebElement Submit_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement SearchName;
	@FindBy(xpath="//*[contains(text(),'No Rows Displayed')") WebElement Message4;
	@FindBy (xpath="//button//span[text()=' Edit-btn']") WebElement edit_btn;
	@FindBy (xpath="//button//span[text()=' Delete-btn']") WebElement delete_btn;
	@FindBy(xpath="//*[contains(text(),'Are you sure you want to delete ')") WebElement Message5;
	@FindBy(xpath="//*[contains(text(),'You can Edit')") WebElement Message6;
	@FindBy(xpath="//*[@id='user_Id']")WebElement userId;
	@FindBy(xpath="//*[contains(text(),'User Id:')") WebElement Message7;
	@FindBy(xpath="//table/tbody/tr/i")WebElement AddNewUserBtn;
	@FindBy(xpath="//*[@class='btn user-Details']")WebElement btnNewUserDetails;
	@FindBy(xpath="//table/tbody/tr/i")WebElement CancelBtn;
	@FindBy(xpath="//table/tbody/tr/i")WebElement CancelIcon;
	@FindBy(xpath="//*[@class='btn placeholder-Details']")WebElement PlaceholderDetails;
	@FindBy(xpath="//*[@class='btn inputfield-Details']")WebElement InputFieldDetails;
	@FindBy(xpath="//*[@class='btn drop-down']")WebElement btndropdown;
	@FindBy(xpath=" //span[text()='State]")WebElement State;
	@FindBy (xpath="//div[@id='mat-select-value-1']/span") WebElement userRole_drpDwn;
	@FindBy(xpath="//*[contains(text(),'Error')")WebElement ErrorMessage;	
	@FindBy (id="id_firstname") WebElement firstName_txtBx;
	@FindBy (id="id_middlename") WebElement middleName_txtBx;
	@FindBy (id="id_lastname") WebElement lastName_txtBx;
	@FindBy (id="email") WebElement emailId_txtBx;
	@FindBy (xpath="//*[@placeholder='Please provide a mobile number.']") WebElement phoneNo_txtBx;
	@FindBy (xpath="//*[@aria-label='Add a new address']//span") WebElement address_txtBx;
	@FindBy (xpath="//*[@aria-label='Add a new address']//span") WebElement address_txtBx2;
	@FindBy (xpath="//*[@placeholder='Please provide a city.']") WebElement city_txtBx;
	@FindBy (xpath="//div[@id='mat-select-value-1']/span") WebElement state_drpDwn;
	@FindBy (xpath="//*[@placeholder='Please provide a postal code.']") WebElement postalcode_Bx;
	@FindBy (xpath="//*[contains(text(),'Program')]") WebElement ProgramTxt;
	@FindBy(xpath="//*[@class='btn drop-down']")WebElement UGdropdown;
	@FindBy(xpath="//*[@class='btn drop-down']")List <WebElement> UGdropdownList;
	@FindBy (xpath="//*[contains(text(),'PGProgram')]") WebElement PGProgramTxt;
	@FindBy(xpath="//*[@class='Skill-Details']")WebElement SkillTxt;
	@FindBy(xpath="//*[@class='Experience']")WebElement ExperienceTxt;
	@FindBy(xpath="//*[@class='User-Role']")WebElement UserRoleTxt;
	@FindBy(xpath="//*[@class='Visa-Status']")WebElement VisaStatusTxt;
	@FindBy(xpath="//*[@class='Batch']")WebElement BatchTxt;
	@FindBy(xpath="//*[@class='Comments']")WebElement CommentsTxt;
	@FindBy (xpath="//*[@class='success-primary']") WebElement SuccMessage;
	@FindBy(xpath="//*[@class='Add C/O, Apt, Suite, Unit']") WebElement AddCareOfBtn;


	//constructor
	public UserPage() {
		PageFactory.initElements(driver, this);
	}


	//Methods
	
public void AddNewAddressField2() {
		
	boolean display =address_txtBx2.isDisplayed();
	
	if(display == true) {
		System.out.println("input field with Label New Address2 is displayed");
	}
	else {
		System.out.println("input field with Label New Address2 is not displayed");
	}
	}
	
	public void AddCareOfBtn() {
		
		AddCareOfBtn.click();
	}

	public 	String expectedResult;

	public void UserBtnClick() {
		UserBtn.click();     
	}

	public String ValidateUserName() {
		return UserName.getText();
	}

	public boolean MgeUserHeading(String text) {

		return UserHeading.isDisplayed();
	}

	public void isPaginationEnable(int noOfRows) {

		this.expectedResult =  Row.size()> noOfRows ? "Yes" : "No";
	}

	public String isNextPageArrowEnabled() {

		String nextarrowbtn = nextPage_arrow.getAttribute("class");

		return nextarrowbtn.contains("enable") ? "Yes" : "No";

	}

	public void NextPageArrowClick() {
		nextPage_arrow.click();
	}

	public String Message1(String expectedmsg) {
		return Message1.getText();
	}

	public void PrevioustPageArrowClick() {
		PreviousPage_arrow.click();
	}

	public String footerText(String expectedmsg) {

		return footer_text.getText();
	}

	public void clickANewUser() {

		btnANewUser.click();

	}

	public void UserAscOrderbtn() {

		UserAscOrder_btn.click();
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

	public void CheckBox() {

		checkbox.click();
	}

	public boolean SelectAllCheckbox() {

		return SelectAll_checkbox.isSelected();
	}

	public void uncheckCheckBox() {

		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is still selected");
		}
		else
		{
			System.out.println("Checkbox is deselected successfully");
		}
	}

	public boolean deleteMultiRowBtndisplay() {

		return deleteMultiRowBtn.isEnabled();
	}

	public void deleteMultiRowBtnClick() {

		deleteMultiRowBtn.click();
	}

	public String confirmDilogBx() {

		return Message2.getText();

	}
	public void UncheckAllROwsCheckBox() {

		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is still selected");
		}
		else
		{
			System.out.println("Checkbox is deselected successfully");
		}
	}
	public void tableHeader() {


		int TbleHeader = tableHeader.size();
		for(int j=1;j<=TbleHeader;j++) {			

			System.out.println(String.valueOf(j));
		}

	}

	public void NoButtonClick() {

		ClickNo_btn.click();	 
	}

	public void DeleteBtnClick() {
		int row = Row.size();
		Delete_btn.click(); 
		int presentRow =Row.size();

		if (presentRow<row) {

			System.out.println("Rows deleted");

		}
		else {
			System.out.println("Rows not deleted");
		}

	}

	public String Message3(String expectedmsg) {

		return Message3.getText();
	}

	public void CloseBtnClick() {

		Close_btn.click();
	}

	public void search(String input) {

		search_txt.sendKeys(input);
	}

	public void SearchInputTxtVisible() {

		SearchInputTxt.isDisplayed();
	}

	public void EnterNameToSearch(String string) {

		search_txt.sendKeys(string);
	}

	public void SubmitBtnClick() {

		Submit_btn.click();
	}
	
	public void SubmitBtn() {

		Submit_btn.getText();
	}

	public void SearchInputNameVisible() {

		SearchName.isDisplayed();
	}

	public void Message4() {

		Message3.getText();
	}

	public void EditBtnVisible() {

		edit_btn.isDisplayed();

	}

	public void DeleteBtnVisible() {

		delete_btn.isDisplayed();
	}

	public void EditBtnClick() {

		edit_btn.click();
	}

	public String validateEditDialogBox() {

		return Message6.getText();

	}

	public void ClickOnId() {

		userId.click();
	}

	public String validateDialogBxUserInfo() {

		return Message7.getText();

	}

	public String clickAUser(String expectedmsg) {

		return AddNewUserBtn.getText();

	}
	public void clickANewUserdetails() {

		btnNewUserDetails.click();
	}

	public void CancelBtnClick() {

		CancelBtn.click();
	}

	public void CancelIconClick() {

		CancelIcon.click();
	}

	public void CancelIconVisible() {

		CancelIcon.isDisplayed();
	}

	public void PlaceholderDetailsVisible() {

		PlaceholderDetails.isDisplayed();
	}

	public void InputFieldDetailsVisible() {

		InputFieldDetails.isDisplayed();
	}

	public void clickdropDownforState() {

		btndropdown.click();

	}
	public void viewStateDropdown() {

		State.isDisplayed();

	}
	public void clickdropDownforUserRole() {

		btndropdown.click();

	}
	
	public void viewUserRoleDropdown() {

		userRole_drpDwn.isDisplayed();

	}

	public String ErrorMessage(String expectedmsg) {

		return ErrorMessage.getText();
	}

	public void firstNametxtBx(String firstname) {

		firstName_txtBx.sendKeys(firstname);

	}

	public void middleNametxtBx(String middlename) {

		middleName_txtBx.sendKeys(middlename);

	}

	public void lastNametxtBx(String lastname) {

		lastName_txtBx.sendKeys(lastname);

	}
	public void emailIdtxtBx(String email) {

		emailId_txtBx.sendKeys(email);

	}
	public void phoneNotxtBx(String phonenumber) {

		phoneNo_txtBx.sendKeys(phonenumber);

	}

	public void addresstxtBx(String address) {

		address_txtBx.sendKeys(address);

	}

	public void citytxtBx(String city) {

		city_txtBx.sendKeys(city);

	}

	public void statedrpDwn() {

		Select dropdown = new Select(state_drpDwn);
		dropdown.selectByVisibleText("Gujrat");  
	}

	public void PostalCodeBx(String zip) {

		postalcode_Bx.sendKeys(zip);

	}

	public void ProgramtxtBx(String program) {

		ProgramTxt.sendKeys(program);

	}

	public void UGdrpDwn() {
		UGdropdown.click();
		Select dropdown = new Select(UGdropdown);
		dropdown.selectByVisibleText("abc");  
	}
	
	public void listOFUGdrpDwn() {
		
		int listOfUG = UGdropdownList.size();
		for(int j=1;j<=listOfUG;j++) {			

				System.out.println(String.valueOf(j));
		}
	
	}

	public void PGProgramtxtBx(String PGprogram) {

		ProgramTxt.sendKeys(PGprogram);
	}

	public void SkilltxtBx(String skill) {

		SkillTxt.sendKeys(skill);
	}

	public void ExperiencetxtBx(String experience) {

		ExperienceTxt.sendKeys(experience);
	}

	public void UserRoledrpDwn() {
		state_drpDwn.click();
		Select dropdown = new Select(userRole_drpDwn);
		dropdown.selectByVisibleText("Junior");  

	}

	public void VisaStatustxtBx(String visaStatus) {

		VisaStatusTxt.sendKeys(visaStatus);
	}

	public void BatchtxtBx(String Batch) {

		BatchTxt.sendKeys(Batch);
	}

	public void CommentstxtBx(String Comments) {

		CommentsTxt.sendKeys(Comments);
	}
	public String SuccessMessage(String expectedmsg) {

		return SuccMessage.getText();

	}

	public void statedrpDwnClick() {
		state_drpDwn.click();

	}


	public void UGdrpDwnClick() {
		UGdropdown.click();

	}
	

	public void alphaOrderDropdwnValue() {
		
		 Select dropdown = new Select(state_drpDwn);
		 
		// Get all options
		 List<WebElement> allOptionsElement = dropdown.getOptions();
		 
		 // Creating a list to store drop down options
		 List<String> options = new ArrayList<String>();
		 
		 for(WebElement optionElement : allOptionsElement)
		    {
		        options.add(optionElement.getText());
		    }
		// Creating a temp list to sort
		    List<String> tempList = new ArrayList<String>(options);

		    Collections.sort(tempList);

		    System.out.println("Sorted List "+ tempList);

		    boolean ifSortedAscending = options.equals(tempList);

		    if(ifSortedAscending)
		    {
		        System.out.println("List is sorted");
		    }
		    else
		        System.out.println("List is not sorted.");
}

	public String confirmDilogBxMessage(String text) {

		return Message2.getText();

	}




}




