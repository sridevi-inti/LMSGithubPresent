package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class PaginatorPage extends TestBase{

	@FindBy (className = "pagination-arrowLast") WebElement lastPage_arrow;
	@FindBy (className = "pagination-arrowRight") WebElement nextPage_arrow;
	@FindBy (className = "pagination-arrowFirst") WebElement firstPage_arrow;
	@FindBy (className = "pagination-arrowLeft") WebElement prevPage_arrow;
	@FindBy (xpath="//*[contains(text(),'Showing 1 to 5 of 9 entries')]") WebElement table_text;



	//Constructor
	public PaginatorPage() {

		PageFactory.initElements(driver, this);
	}


	//Methods
	public void firstPageArrow() {

		firstPage_arrow.click();
	}

	public void disableFirstPageArrow() {

		String lastbtn = firstPage_arrow.getAttribute("class");

		if(lastbtn.contains("disable")) {
			System.out.println("User is on First page");
		}
		else {
			System.out.println("User is not on First page");
		}
	}


	public void nextPageArrow() {

		nextPage_arrow.click();
	}

	public void lastPageArrow() {

		lastPage_arrow.click();
	}


	public void disableLastPageArrow() {

		String lastarrowbtn = lastPage_arrow.getAttribute("class");

		if(lastarrowbtn.contains("disable")) {
			System.out.println("User is on last page");
		}
		else {
			System.out.println("User is not on last page");
		}
	}
	
	public String tableText(String expectedmsg) {

		return table_text.getText();
	}

	public void prevPageArrow() {

		prevPage_arrow.click();
	}


}
