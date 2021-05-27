package com.x2c.entail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void run() {
		Reporter.log("Demo tests are running successfully ", true);
	}
	
	@Test
	public void sun() {
		Reporter.log("Demo tests are running successfully ", true);
	}
	
	
	@Test
	public void fast() {
		Reporter.log("Demo tests are running fastly ", true);
	}
}
