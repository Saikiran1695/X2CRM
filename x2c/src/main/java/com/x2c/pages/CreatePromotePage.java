package com.x2c.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.x2c.genericlib.BaseTest;

public class CreatePromotePage {
	
	@FindBy(name="property(Campaign Name)") private WebElement promoteName;
	@FindBy(xpath="//div[@class='bodyText mandatory']/following-sibling::table[2]//input[@value='Save']") private WebElement saveBtn;
	
	public CreatePromotePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCampaignName() {
		return promoteName;
	}

	public void setCampaignName(WebElement campaignName) {
		this.promoteName = campaignName;
	}


	public void createPromote(String cName) {
		
		promoteName.clear();
		promoteName.sendKeys(cName);
		saveBtn.click();
		
		
	}
	

}
