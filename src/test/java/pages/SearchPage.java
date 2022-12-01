package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy (id="search_query_top") WebElement search_txt;
	@FindBy(xpath="//*[@class='btn btn-search']") WebElement search_btn;
	@FindBy(xpath="//*[@id='searchtextbox-no-of-classes']")WebElement input_data3;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Description']")WebElement input_data1;
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;
	@FindBy(xpath="//*[@id='searchtextbox-Program Name']")WebElement input_data4;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Status']")WebElement input_data2;
	@FindBy(xpath=" //span[text()='Batch Description']")WebElement BatchDescription;
	@FindBy(xpath="//*[@id='searchtextbox-Attendence-Name']")WebElement input_data;
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (tagName=("td")) List<WebElement> colums;
	
	
	//constructor
		public SearchPage () {
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
		public void sendBatchName() {
			input_data.sendKeys("Batch Name");
		}
		
		public String ValidateBatchDescription() {

			return BatchDescription.getText();
		}
		
		public void sendBatchStatus() {

			input_data2.sendKeys("Batch Status");
		}

		
		public void sendProgramName() {

			input_data4.sendKeys("program Name");
		}
		
		public String Message(String expectedmsg) {

			return message.getText();

		}
		
		public void sendBatchDescription(){
			input_data1.sendKeys("Batch Description");

		}
		
		public void sendnoOfclasses() {

			input_data3.sendKeys("no of classes");

		}
		
		public void search(String input) {

			search_txt.sendKeys(input);
		}
		
		public void clickSearchBtn(String input) 
		{
			search_btn.sendKeys(input);	
		}

}
