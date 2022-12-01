package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class LoginPage extends TestBase{

	@FindBy (id="id_username") WebElement userName_txt;
	@FindBy (id="id_password") WebElement password_txt;
	@FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;
	@FindBy (id="id_code") WebElement code_txt;
	@FindBy (xpath = "//*[@class='alert alert-primary']") WebElement Message;
	@FindBy (xpath = "//*[contains(text(),'Forgot Password')]") WebElement ForgotPwdBtn;
	@FindBy (id="input-mail") WebElement validEmail;
	@FindBy (id="compose-mail") WebElement ComposeEmail;
	@FindBy (id="continue") WebElement continueBtn;
	@FindBy (xpath = "//*[contains(text(),'Enter verification')]") WebElement EnterVerificationCode;
	@FindBy (id="id_code") WebElement VerificationCodeTxt;
	@FindBy (xpath = "//*[@class='btn btn-info']") WebElement ClickHereToResend_btn;
	@FindBy (xpath="//*[contains(text(),'Password resend')]") WebElement Resend_text;
	@FindBy (xpath = "//*[contains(text(),'Type in new Password')]") WebElement ResetPwdTxt;
	@FindBy (xpath="//*[contains(text(),'Reset Password)]") WebElement ResetPassword;
	@FindBy (id="id_password") WebElement NewPassword_txt;
	@FindBy (id="id_retype_password") WebElement RetypePassword_txt;
	@FindBy (id="continue") WebElement SubmitBtn;
	@FindBy (id="cancel") WebElement CancelBtn;


	//Constructor
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	//Methods
	public void userNameTxt(String username) {

		userName_txt.sendKeys(username);
	}


	public void passwordTxt(String Password) {

		password_txt.sendKeys(Password);
	}


	public void loginBtn() {

		login_btn.click();
	}

	public void EnterCode(String code)
	{
		code_txt.sendKeys(code);
	}

	public void ForgotPwdBtnClick() {
		ForgotPwdBtn.click();

	}

	public String Message(String expectedmsg) {

		return Message.getText();

	}

	public void validateForgotPwd() {


		String TxtForgtPwd = ForgotPwdBtn.getText();

		Assert.assertEquals("Forgot Password", TxtForgtPwd);
		System.out.println("User is on " + TxtForgtPwd + "page");
	}


	public String ComposeEmail() {

	    ForgotPwdBtn.getText();
		return ComposeEmail.getText(); 
	}


	public void ContinueBtnClick() {
		validEmail.sendKeys("abcxyz@gmail.com");
		continueBtn.click();

	}

	public void validateEnterVerifiCode() {


		String EnterVerifiCode = EnterVerificationCode.getText();

		Assert.assertEquals("Enter verification code below", EnterVerifiCode);
		System.out.println("User is on " + EnterVerifiCode + "page");
	}


	public void EnterVerifcationCode()
	{
		VerificationCodeTxt.sendKeys("12345");
		continueBtn.click();
	}

	public void ClickHereToResend() {

		ClickHereToResend_btn.click();
	}

	public String ResendText(String expectedmsg) {

		return Resend_text.getText();
	}

	public void ValidateResetPassword() {


		String TxtResetPwd = ResetPwdTxt.getText();

		Assert.assertEquals("Forgot Password", TxtResetPwd);
		System.out.println("User is on " + TxtResetPwd + "page");
	}

	public boolean ResetPwd() {

		return ResetPassword.isDisplayed();

	}

	public void NewPasswordTxt(String username) 
	{
		NewPassword_txt.sendKeys(username);
	}


	public void RetypePasswordTxt(String Password) {

		RetypePassword_txt.sendKeys(Password);
	}

	public void SubmitBtnClick() {

		SubmitBtn.click();
	}

	public void validateLoginPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Login", title);
		System.out.println("Admin/User/Staff is on " + title + "page");
	}

	public void CancelBtnClick() {

		CancelBtn.click();
	}

	public void validateRefreshPwdPage() {

		Assert.assertNull(NewPassword_txt);
		Assert.assertNull(RetypePassword_txt);

	}

}
