package com.x2c.entail;

import org.testng.annotations.Test;

import com.x2c.genericlib.BaseTest;
import com.x2c.genericlib.FileLib;
import com.x2c.genericlib.WebDriverCommonLib;
import com.x2c.pages.ConvertEntailPage;
import com.x2c.pages.CreateEntailPage;
import com.x2c.pages.DisplayCustomViewPage;
import com.x2c.pages.EntailDetailsPage;
import com.x2c.pages.HomePage;
import com.x2c.pages.LoginPage;

public class ValidConvertEntail extends BaseTest {
	
	@Test
public void verifyConvertEntail() throws Throwable {
	LoginPage lp=new LoginPage();
	HomePage hp=new HomePage();
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	DisplayCustomViewPage dc=new DisplayCustomViewPage();
	CreateEntailPage ce=new CreateEntailPage();
	EntailDetailsPage ed=new EntailDetailsPage();
	lp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
	wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "homeTitle"), "Home Page");
	hp.clickEntailTab();
	wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "displayCustomViewDetailsTitle"), "Display custom view title Page");
	dc.clickNewEntailBtn();
	wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "createEntailTitle"), "Create Entail Page");
	ce.createEntail(flib.readDataFromExcel(EXCEL_PATH, "lead detail", 1, 0), flib.readDataFromExcel(EXCEL_PATH, "lead detail", 1, 1));
	wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "entailDetailsPage"), "Entail details Page");
	ed.clickConvertBtn();
	wlib.verify(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "convertEntailPage"), "Convert Entail Page");
	ConvertEntailPage cep=new ConvertEntailPage();
	cep.clickCalenderIcon();
	wlib.windowMaximize();
}

}
