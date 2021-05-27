package com.x2c.promote;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.x2c.genericlib.BaseTest;
import com.x2c.genericlib.FileLib;
import com.x2c.genericlib.WebDriverCommonLib;
import com.x2c.pages.CreatePromotePage;
import com.x2c.pages.DisplayCustomViewPage;
import com.x2c.pages.HomePage;
import com.x2c.pages.LoginPage;
import com.x2c.pages.PromoteDetailsPage;



public class ValidEditPromotePage extends BaseTest {

	@Test
	public void verifyEditCampaign() throws Throwable {
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		FileLib flib=new FileLib();
		DisplayCustomViewPage dc=new DisplayCustomViewPage();
		WebDriverCommonLib wLib= new WebDriverCommonLib();
		lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
		wLib.verify(wLib.getPageTitle(),flib.readPropData(PROP_PATH, "homeTitle"), " Home Page");
		hp.clickCampaignTab();
		wLib.verify(wLib.getPageTitle(), flib.readPropData(PROP_PATH, "displayCustomViewDetailsTitle"), "Display custom view page");
		dc.clickNewCampaignBtn();
		CreatePromotePage cd=new CreatePromotePage();
		cd.createPromote(flib.readDataFromExcel(EXCEL_PATH, "sheet2", 1, 0));
		wLib.verify(wLib.getPageTitle(),flib.readPropData(PROP_PATH, "promoteDetailsPage"), "Promote Details Page");
		PromoteDetailsPage cp= new PromoteDetailsPage();
		cp.clickEditBtn();
		wLib.verify(wLib.getPageTitle(), flib.readPropData(PROP_PATH, "editPromoteTitle"), "Edit Promote Page");
		CreatePromotePage cc=new CreatePromotePage();
		cc.createPromote(flib.readDataFromExcel(EXCEL_PATH, "sheet3", 1, 0));
		wLib.verify(wLib.getPageTitle(),flib.readPropData(PROP_PATH, "promoteDetailsPage"), "Promote Details Page");
		cp.clickPromoteTab();
		wLib.verify(wLib.getPageTitle(), flib.readPropData(PROP_PATH, "displayCustomViewDetailsTitle"), "Display custom view page");
		dc.verifyCreationCapture("Twitter");
		wLib.getFullScreenshot("F:\\Selenium\\x2crm\\src\\test\\resources\\Screenshot\\EditedCampaignSS.png");
		
	}
}
