package com.x2c.entail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.x2c.genericlib.BaseTest;
import com.x2c.genericlib.FileLib;
import com.x2c.genericlib.WebDriverCommonLib;
import com.x2c.pages.DisplayCustomViewPage;
import com.x2c.pages.HomePage;
import com.x2c.pages.LoginPage;


public class ValidSearchEntail extends BaseTest{
	@Test
	public void searchFindEntail() throws Throwable {
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "homeTitle"), "Home Page");
		hp.clickEntailTab();
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "displayCustomViewDetailsTitle"), "Display custom view details Page");
		DisplayCustomViewPage dc=new DisplayCustomViewPage();
		dc.searchFindEntail(flib.readDataFromExcel(EXCEL_PATH, "find entail", 1, 0), "Sai Kiran");
		wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "displayCustomViewDetailsTitle"), "Display custom view details Page");
		
	}

}
