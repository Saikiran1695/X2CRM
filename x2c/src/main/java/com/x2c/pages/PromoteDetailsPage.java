package com.x2c.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.x2c.genericlib.BaseTest;

public class PromoteDetailsPage {
	
	@FindBy(id="Campaignstab") private WebElement promoteTab;
	@FindBy(xpath="(//input[@name=\"edit2\"])[1]") private WebElement editBtn;
	@FindBy(xpath="//td[@class='title hline']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Delete']") private WebElement deleteBtn;
	
	
	public PromoteDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignTab() {
		return promoteTab;
	}

	public void setCampaignTab(WebElement campaignTab) {
		this.promoteTab = campaignTab;
	}
	
	
	public void clickPromoteTab() {
		promoteTab.click();
	}
	
	public void clickEditBtn() {
		editBtn.click();
	}
	
	public void clickdeleteBtn() {
		deleteBtn.click();
	}
}
