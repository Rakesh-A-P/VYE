package com.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.PageObjectManager.PageObjectManager;
import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;


public class TC_06_EntityExclusionSanctionStep extends BaseUtilClass

{
	
	public PageObjectManager pom;
	
	public TC_06_EntityExclusionSanctionStep() {
		 pom = new PageObjectManager();
		
	}
	
	@Then("^User Goes to Exclusion Sanction Information Section and Select (.+)$")
	public void user_Goes_to_Exclusion_Sanction_Information_Section_and_Select_as_option(String Options) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	   
	   try {
		   
		   scrollToViewelement(pom.getEntityExclusionSanctionPage().getExclusionSanction_Information_tab());
		   
		   actionClick(pom.getEntityExclusionSanctionPage().getExclusionSanction_Information_tab());
		   Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	} 


	
		
	
	  pom.getEntityExclusionSanctionPage().SelectQuestionA1(Options);
		  
		   pom.getEntityExclusionSanctionPage().SelectQuestionA2(Options);
		  
		  pom.getEntityExclusionSanctionPage().SelectQuestionA3(Options);
		
		  pom.getEntityExclusionSanctionPage().SelectQuestionA4(Options);
		  
		  
		  
		  pom.getEntityExclusionSanctionPage().SelectQuestionA5(Options);
		   
		   pom.getEntityExclusionSanctionPage().SelectQuestionA6(Options);
		  	    pom.getEntityExclusionSanctionPage().SelectQuestionA7(Options);



	
	   pom.getEntityExclusionSanctionPage().SelectQuestionB1(Options);
		
		pom.getEntityExclusionSanctionPage().SelectQuestionB2(Options);
		   
		   pom.getEntityExclusionSanctionPage().SelectQuestionB3(Options);
		   
		   pom.getEntityExclusionSanctionPage().SelectQuestionB4(Options);
		   
		  pom.getEntityExclusionSanctionPage().SelectQuestionB5(Options);
		   
		   pom.getEntityExclusionSanctionPage().SelectQuestionB6(Options);
		   
		   pom.getEntityExclusionSanctionPage().SelectQuestionB7(Options);
		   
		 pom.getEntityExclusionSanctionPage().SelectQuestionB8(Options);
		 
	     scrollToViewelement(pom.getEntityInformationPage().getNext());
	     
		click(pom.getEntityInformationPage().getNext());

	}
}
