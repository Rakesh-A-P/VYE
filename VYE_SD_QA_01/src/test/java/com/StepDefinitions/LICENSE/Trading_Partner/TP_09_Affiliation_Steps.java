package com.StepDefinitions.LICENSE.Trading_Partner;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_09_Affiliation_Steps {
	public PageObjectManager pom;
	public TP_09_Affiliation_Steps() {
		pom=new PageObjectManager();
	}
	@Then("Perform the action on Affiliation section")
	public void perform_the_action_on_Affiliation_section() throws InterruptedException {
	   
		pom.getTP_09_Affiliation_Page().Affiliation_tab_click();
		
	   pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
	}



}
