package com.x2c.promote;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.x2c.genericlib.BaseTest;
import com.x2c.genericlib.FileLib;
import com.x2c.genericlib.WebDriverCommonLib;
import com.x2c.pages.LoginPage;

public class ValidLoginTest extends BaseTest{
	
	@Test
	public void loginToApp() throws Throwable {
		LoginPage lp =new LoginPage();
		FileLib fl= new FileLib();
		lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));
		WebDriverCommonLib wd =new WebDriverCommonLib();
		wd.verify(wd.getPageTitle(), fl.readPropData(PROP_PATH, "homeTitle"), "Home page");
	}

}
