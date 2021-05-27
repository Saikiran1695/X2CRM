package com.x2c.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.x2c.genericlib.BaseTest;

public class CreateEntailPage {
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement companyName;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastName;
	@FindBy(xpath="//div[@class='bodyText mandatory']/following-sibling::table[2]//input[@value='Save']") private WebElement saveBtn;
	
	public CreateEntailPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public void setCompanyName(WebElement companyName) {
		this.companyName = companyName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	
	public void createEntail(String cName,String lName) {
		companyName.sendKeys(cName);
		lastName.sendKeys(lName);
		saveBtn.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}

}
