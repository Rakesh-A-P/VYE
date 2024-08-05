package com.StepDefinitions.LICENSE.Trading_Partner;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_12_Proceed_to_signin_Steps {

	public PageObjectManager pom;
	public TP_12_Proceed_to_signin_Steps() {
		pom=new PageObjectManager();
	}
	@Then("User proceed to sign in the Trading Partner")
	public void user_proceed_to_sign_in_the_Trading_Partner() throws InterruptedException {
	    
		pom.getTP_12_Proceed_to_signin_page().Proceed_to_signin();
	}
	
	
}
