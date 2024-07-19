package com.StepDefinitions;

import com.PageObjectManager.PageObjectManager;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;

public class TC_16_LogOutSteps extends BaseUtilClass {
    public PageObjectManager pom;
	public TC_16_LogOutSteps() {
		pom=new PageObjectManager();
	}
	@Then("Logout from Provider Portal")
	public void logout_from_Provider_Portal() throws InterruptedException {
		
		actionClick(pom.getLogoutPage().getProvider_Admin());
		Thread.sleep(3000);
		actionClick(pom.getLogoutPage().getLogoutbutton());
		
		
		
		
	}


	
	
	
	
	
}
