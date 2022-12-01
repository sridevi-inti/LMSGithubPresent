package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseClass.TestBase;

public class RegistrationPage extends TestBase{


	@FindBy (id="id_firstname") WebElement firstName_txtBx;
	@FindBy (id="id_lastname") WebElement lastName_txtBx;
	@FindBy (xpath="//*[@aria-label='Add a new address']//span") WebElement address_txtBx;
	@FindBy (xpath="//*[@aria-label='Add street name']//span") WebElement streetName_txtBx;
	@FindBy (xpath="//*[@placeholder='Please provide a city.']") WebElement city_txtBx;
	@FindBy (xpath="//div[@id='mat-select-value-1']/span") WebElement state_drpDwn;
	@FindBy (xpath="//*[@placeholder='Please provide a ZIP code.']") WebElement zipCode_Bx;
	@FindBy (id="id_birthDate") WebElement birtDate_calendar;
	@FindBy (xpath="//*[contains(text(),'3')]") WebElement select_birtDate;
	@FindBy (xpath="//*[contains(text(),'September')]") WebElement select_Month;
	@FindBy (xpath="//*[contains(text(),'1990')]") WebElement select_year;
	@FindBy (id="id_username") WebElement userName_txtBx;
	@FindBy (xpath="//*[@placeholder='Please provide a mobile number.']") WebElement phoneNo_txtBx;
	@FindBy (id="id_password1") WebElement password_txt;
	@FindBy (id="email") WebElement emailId_txtBx;
	@FindBy (xpath="//input[@type='submit'] ") WebElement signUp_btn;
	@FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;
	@FindBy (xpath="//*[contains(text(),'Registration Form')]") WebElement registration_Form;
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;




	//constructor
	public RegistrationPage () {
		PageFactory.initElements(driver, this);
	}



	//Methods
	public void firstNametxtBx(String firstname) {

		firstName_txtBx.sendKeys(firstname);

	}

	public void CheckfirstName() {

		String firstName = firstName_txtBx.getAttribute("value");
		System.out.println("Entered value:"+firstName);;

	}


	public void lastNametxtBx(String lastname) {

		lastName_txtBx.sendKeys(lastname);

	}

	public void CheckLastName() {

		String LastName = lastName_txtBx.getAttribute("value");
		System.out.println("Entered value:"+LastName);

	}


	public void addresstxtBx(String address) {

		address_txtBx.sendKeys(address);

	}

	public void CheckAddress() {

		String Address = address_txtBx.getAttribute("value");
		System.out.println("Entered value:"+Address);

	}

	public void streetNametxtBx(String streetname) {

		streetName_txtBx.sendKeys(streetname);

	}

	public void CheckstreetName() {

		String streetname = streetName_txtBx.getAttribute("value");
		System.out.println("Entered value:"+streetname);

	}

	public void citytxtBx(String city) {

		city_txtBx.sendKeys(city);

	}

	public void Checkcity() {

		String cityname = city_txtBx.getAttribute("value");
		System.out.println("Entered value:"+cityname);

	}

	public void statedrpDwn() {

		Select dropdown = new Select(state_drpDwn);
		dropdown.selectByVisibleText("Gujrat");  
	}

	public void CheckState() {

		String statename = state_drpDwn.getAttribute("value");
		System.out.println("Entered value:"+statename);  
	}


	public void zipCodeBx(String zip) {

		zipCode_Bx.sendKeys(zip);

	}

	public void CheckzipCode() {

		String zipCode = zipCode_Bx.getAttribute("value");
		System.out.println("Entered value:"+zipCode);

	}

	public void birtDatecalendar() {

		birtDate_calendar.click();
		select_year.click();			
		select_Month.click();
		select_birtDate.click();

	}

	public void CheckBirtDate() {

		String BirtDate = birtDate_calendar.getAttribute("value");
		System.out.println("Entered value:"+BirtDate);

	}

	public void userNametxtBx(String username) {

		userName_txtBx.sendKeys(username);

	}

	public void CheckUserName() {

		String userName = userName_txtBx.getAttribute("value");
		System.out.println("Entered value:"+userName);

	}

	public void phoneNotxtBx(String phonenumber) {

		phoneNo_txtBx.sendKeys(phonenumber);

	}

	public void CheckphoneNo() {

		String phoneNo = phoneNo_txtBx.getAttribute("value");
		System.out.println("Entered value:"+phoneNo);

	}

	public void passwordtxt(String password) {

		password_txt.sendKeys(password);

	}

	public void CheckPassword() {

		String password = password_txt.getAttribute("value");
		System.out.println("Entered value:"+password);

	}

	public void emailIdtxtBx(String email) {

		emailId_txtBx.sendKeys(email);

	}

	public void CheckEmailId() {

		String emailId = emailId_txtBx.getAttribute("value");
		System.out.println("Entered value:"+emailId);

	}

	public String signUpbtnDisplay(String button) {

		boolean display = signUp_btn.isDisplayed();
		if(display==true) {
			signUp_btn.getText();
		}
		return button;
	}

	public void signUpbtnClick() {

		signUp_btn.click();

	}

	public String loginbtnDisplay(String button) {

		boolean display = login_btn.isDisplayed();
		
		if(display==true) {
			login_btn.getText();
		}
		return button;

	}

	public void loginbtnClick() {

		login_btn.click();

	}

	public boolean registrationFormDisplay(String text) {

		return registration_Form.isDisplayed();
	}

	
	public String Message(String expectedmsg) {

		return message.getText();

	}
	
	public void validateRegistrationPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Registration", title);
		System.out.println("User is on " +title+ " page " );
	}

}
