package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class DescendingOrderPage extends TestBase{

	@FindBy (xpath="//table/tbody/tr") List<WebElement> Row;
	@FindBy (tagName=("td")) List<WebElement> colums;
	@FindBy (xpath="//table/tbody/tr/i") WebElement statusDscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement descriptionDscOrder_btn;
	@FindBy (xpath="//table/tbody/tr/i") WebElement programDscOrder_btn;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnprogramNameDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnnoofclassesDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchStatusDesc;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchDescDes;
	@FindBy(xpath="//table/tbody/tr/i")WebElement btnBatchNameDesc;
	@FindBy(xpath="//*[@class='btn btn-grade-desc']") WebElement gradeDescending_btn;
	@FindBy(xpath="//*[@class='btn btn-duedate-desc']") WebElement duedateDescending_btn;
	@FindBy(xpath="//*[@class='btn btn-description-desc']") WebElement descriptionDescending_btn;
	@FindBy(xpath="//*[@class='btn btn-name-desc']") WebElement nameDescending_btn;



	//constructor
	public DescendingOrderPage() {
		PageFactory.initElements(driver, this);
	}


	//Methods

	public void clickNameDescending() 
	{
		nameDescending_btn.click();	
	}
	
	public void clickDescriptionDescending() 
	{
		descriptionDescending_btn.click();	
	}

	public void clickDueDateDescending() 
	{
		duedateDescending_btn.click();	
	}
	public void clickGradeDescending() 
	{
		gradeDescending_btn.click();	
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

	public void programDscOrderbtn() {

		programDscOrder_btn.click();
	}

	public void descriptionDscOrderbtn() {

		descriptionDscOrder_btn.click();
	}

	public void statusDscOrderbtn() {

		statusDscOrder_btn.click();
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

}
