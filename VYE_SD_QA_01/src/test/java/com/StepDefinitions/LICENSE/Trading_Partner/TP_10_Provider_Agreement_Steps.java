package com.StepDefinitions.LICENSE.Trading_Partner;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.And;

public class TP_10_Provider_Agreement_Steps {

	public PageObjectManager pom;
	public TP_10_Provider_Agreement_Steps() {
		pom=new PageObjectManager();
	}
	
	@And("User Signs the Trading Partner Provider Agreement")
	public void user_Signs_the_Trading_Partner_Provider_Agreement() throws InterruptedException {
 
		pom.getTP_10_Provider_Agreement_Page().Provider_agreemenet_signin_tab();
		
		pom.getTP_10_Provider_Agreement_Page().Provider_agreemenet_signin();
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
		
	}
}
