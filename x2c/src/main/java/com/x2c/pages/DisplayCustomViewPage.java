package com.x2c.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.x2c.genericlib.BaseTest;

public class DisplayCustomViewPage {
	
	@FindBy(name="cvid") private WebElement status;
	@FindBy(xpath="//input[@value=\"New Campaign\"]") private WebElement newPromoteBtn;
	@FindBy(xpath="//*[@id='idForCV']//table[2]//tbody//tr[2]//td//tbody//tr[2]//td[3]//a[@class='link']") private WebElement promoteName;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newEntailBtn;
	@FindBy(name="searchString") private WebElement findEntailTxtbox;
	@FindBy(name="Go") private WebElement gobtn;
	@FindBy(xpath="//table[@class='secContent']//tbody//tr[*]//td[@class='tableData'][3]") List<WebElement> createdList;
	public DisplayCustomViewPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public WebElement getPromoteName() {
		return promoteName;
	}


	public void setPromoteName(WebElement promoteName) {
		this.promoteName = promoteName;
	}


	public void statusDropDownList(String value) {
		Select select =new Select(status);
		select.selectByValue(value);
		}
	
	public void clickNewCampaignBtn() {
		newPromoteBtn.click();
	}
	
	public void clickOnCampaign() {
		promoteName.click();
	}
	
	public void clickNewEntailBtn() {
		newEntailBtn.click();
	}
	
	public void searchFindEntail(String findentail,String searchEntail) {
		findEntailTxtbox.clear();
		findEntailTxtbox.sendKeys(findentail);
		gobtn.click();
		for(WebElement oneentail:createdList) {
			String entailName=oneentail.getText();
			System.out.println(entailName);
			if(entailName.equals(searchEntail)) {
				Reporter.log("Our entail is searched", true);
				break;
			}
			else {
				Reporter.log("Our entail is not searched", true);
			}
			
		}
		
	}
	
	public void captureAllCreated() {
		Reporter.log("Created ones are",true);
		for(WebElement oneentail:createdList) {
			String Name=oneentail.getText();
			Reporter.log(Name,true);
		}
	}
	
	public void verifyCreationCapture(String entail) {
		for(WebElement oneentail:createdList) {
			String entailName=oneentail.getText();
			System.out.println(entailName);
			if(entailName.equals(entail)) {
				Reporter.log("Our entail is created", true);
				break;
			}
			else {
				Reporter.log("Our entail is not created", true);
			}
			
		}
	}
	
	
	
	

}
