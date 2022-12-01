package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class DeletePage extends TestBase{
	
	@FindBy (xpath="//button//span[text()=' Delete']") WebElement deleteMuti_btn;
	@FindBy(xpath="//*[@span/window-closed']")WebElement errormsg;
	@FindBy(xpath="//*[@class='btn Attndence-delete'')")WebElement btnclickdel;
	@FindBy(xpath="//*[@class='btn Attndence-delete-no')")WebElement btnclickdelno;
	@FindBy (xpath="//*[contains(text(),'Delete Confirm')]") WebElement DeletConfirm_Box;
	@FindBy(xpath="//*[@class='btn Attndence-delete-yes')")WebElement btnclickdelyes;
	@FindBy(xpath="//*[@class='btn btn-delete-on-top-left']") WebElement deleteOnTopLeft_btn;
	@FindBy(xpath="//*[@class='btn btn-no']") WebElement no_btn;
	@FindBy(xpath="//*[@class='btn btn-delete-on-right']") WebElement deleteOnRight_btn;
	@FindBy (xpath="//button//span[text()=' Delete Confirm']") WebElement DeleteConfirm_btn;
	@FindBy (xpath="//button//span[text()=' Cancel Delete']") WebElement DeleteCancel_btn;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (tagName=("td")) List<WebElement> colums;
	@FindBy (xpath="//button//span[text()=' Delete Program']") WebElement deleteRow_btn;
	
	
	
	
	//constructor
		public DeletePage() {
			PageFactory.initElements(driver, this);
		}


		//Methods
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
		
		public void DeleteRowBtn() {

			deleteRow_btn.click();
		}
		
		public void deleteConfirmBtn() {

			DeleteConfirm_btn.click();
		}
		public void deleteCancelBtn() {

			DeleteCancel_btn.click();
		}
		public void clickDeleteOnRight() 
		{
			deleteOnRight_btn.click();	
		}
		
		public void clickNo() 
		{
			no_btn.click();	
		}
		public void clickDeleteOnTopLeft() 
		{
			deleteOnTopLeft_btn.click();	
		}

		public void clickdelyesbtn() {
			btnclickdelyes.click();

		}
		
		public String DeleteConfirmBox(String expectedmsg) {

			return DeletConfirm_Box.getText();
		}
		
		public void clickdelnobtn() {
			btnclickdelno.click();
		}
		public void clickdeletebtn() {
			btnclickdel.click();

		}
		
		public String ErrorMessage(String expectedmsg) {

			return errormsg.getText();
		}
		
		public void deleteMultiRowBtn() {

			deleteMuti_btn.click();
		} 
		
		public boolean deleteMultiRowBtndisplay() {

			return deleteMuti_btn.isEnabled();
		}

}
