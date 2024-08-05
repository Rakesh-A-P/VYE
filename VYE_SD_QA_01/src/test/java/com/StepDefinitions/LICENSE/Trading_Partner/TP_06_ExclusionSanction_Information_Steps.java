package com.StepDefinitions.LICENSE.Trading_Partner;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_06_ExclusionSanction_Information_Steps {
	

	public PageObjectManager pom;
	public TP_06_ExclusionSanction_Information_Steps() {
		pom=new PageObjectManager();
	}
	
	@Then("^Performing Exclusion\\/Sanction Information section question by using Exclusion option (.+)$")
	public void performing_Exclusion_Sanction_Information_section_question_by_using_Exclusion_option_yes(String ExclusionOption) throws InterruptedException {
	 
		pom.getTP_06_Exclusion_Sanction_page().Exclusion_Sanction_Information_Tab();
		
		pom.getTP_06_Exclusion_Sanction_page().Exclusion_section_A_Has_the_Trading_partner(ExclusionOption);
		
		pom.getTP_06_Exclusion_Sanction_page().Exclusion_section_B_Has_the_Trading_partner(ExclusionOption);
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
		
		
	}

}
