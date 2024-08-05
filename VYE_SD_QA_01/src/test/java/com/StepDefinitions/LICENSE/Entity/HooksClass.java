package com.StepDefinitions.LICENSE.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
 
import Utilities.BaseUtilClass;
import Utilities.BrowserType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseUtilClass{
	 
		@Before("@login")
		public void Launchbrowser() throws FileNotFoundException, IOException {
			
			//getDriverchrome();
		getDriver(BrowserType.CHROME);
			//driver.get("https://dyp-staging.dev.hhstechgroup.com/dashboard");
			getUrl(getPropertyFileValue("urlsd"));
			maximize();

			
			
		}
	 
//			@After
//		public void quitebrowser() {
//			driver.quit();
//				}
//	 
	 
	 
	

}
