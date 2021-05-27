package com.x2c.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.x2c.genericlib.BaseTest;

public class HomePage {
	
	@FindBy(xpath="//a[text()='New Campaign']") private WebElement newPromoteBtn;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement promoteTab;
	@FindBy(xpath="//a[text()='Leads']") private WebElement entailTab;
	
	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampTab() {
		return newPromoteBtn;
	}
	
	public void clickNewCampaignBtn() {
		newPromoteBtn.click();
	}
	public void clickCampaignTab() {
		promoteTab.click();
	}
	public void clickEntailTab() {
		entailTab.click();
	}

}
