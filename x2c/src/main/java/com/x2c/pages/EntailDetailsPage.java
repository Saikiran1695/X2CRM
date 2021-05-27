package com.x2c.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.x2c.genericlib.BaseTest;

public class EntailDetailsPage {
	
	
	@FindBy(id="Leadstab") private WebElement leadstab;
	@FindBy(xpath="//td[contains(text(),'Lead Information')]/ancestor::table"
			+ "/preceding-sibling::table[1]/descendant::input[@value='Clone']") private WebElement cloneBtn;
	@FindBy(xpath="//td[contains(text(),'Lead Information')]/ancestor::table"
			+ "/preceding-sibling::table[1]/descendant::input[@value='Convert']") private WebElement convertBtn;
	
	public EntailDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickLeadsTab() {
		leadstab.click();
	}
	
	public void clickCloneBtn() {
		cloneBtn.click();
	}
	
	public void clickConvertBtn() {
		convertBtn.click();
	}

}
