package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class AsscendingOrderPage extends TestBase{
	
	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (tagName=("td")) List<WebElement> colums;
	@FindBy(xpath="//*[@class='btn btn-name-asc']") WebElement nameAscending_btn;
	@FindBy(xpath="//*[@class='btn btn-description-asc']") WebElement descriptionAscending_btn;
	@FindBy(xpath="//*[@class='btn btn-duedate-asc']") WebElement duedateAscending_btn;
	@FindBy(xpath="//*[@class='btn btn-grade-asc']") WebElement gradeAscending_btn;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnbatchAsc;
	@FindBy(xpath=" //span[text()='Batch Description Ascending']")WebElement BatchDescriptionAsc;
	@FindBy(xpath="//*[@span/button/Noofclasses-Ascending']")WebElement btnnoofclassesAsc;
	@FindBy(xpath="//*[@span/button/Status-Asc']")WebElement btnStatusAsc;
	@FindBy(xpath="//*[@span/Program-name-Asc']")WebElement btnProgramnameAsc;
	@FindBy(xpath="//*[@span/button/Batch-Desc']")WebElement btnbatchDescAsc;
	@FindBy (xpath="//table/tbody/tr/i") WebElement programAscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement descriptionAscOrder_btn;
	
	

	//constructor
		public AsscendingOrderPage() {
			PageFactory.initElements(driver, this);
		}


		//Methods
		public void descriptionAscOrderbtn() {

			descriptionAscOrder_btn.click();
		}
		
		public void programAscOrderbtn() {

			programAscOrder_btn.click();
		}
		
		public void clickbatchDescAsc() {

			btnbatchDescAsc.click();
		}
		
		public void clickProgramNameAsc() {

			btnProgramnameAsc.click();

		}
		public void clickStatusAsc() {

			btnStatusAsc.click();

		}
		
		public void clicknoofclassesAsc() {

			btnnoofclassesAsc.click();
		}
		
		public String ValidateBatchDescriptionAsc() {
			return BatchDescriptionAsc.getText();
		}
		
		public void clickGradeAscending() 
		{
			gradeAscending_btn.click();	
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
		
		public int numberOfRows(int numberofrow) {

			System.out.println(Row.size());
			return numberofrow;
		}
		
		public void clickNameAscending() 
		{
			nameAscending_btn.click();	
		}
		
		public void clickDescriptionAscending() 
		{
			descriptionAscending_btn.click();	
		}
		
		public void clickDueDateAscending() 
		{
			duedateAscending_btn.click();	
		}
		
		public void clickbatchAsc() {

			btnbatchAsc.click();
		}


}
