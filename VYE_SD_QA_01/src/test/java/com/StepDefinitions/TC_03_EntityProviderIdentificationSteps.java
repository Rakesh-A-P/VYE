package com.StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.PageObjectManager.PageObjectManager;
import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;


public class TC_03_EntityProviderIdentificationSteps extends BaseUtilClass {
    
	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_03_EntityProviderIdentificationSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}

	@Then("^Fills all the Details of Provider Identifiers from Sheet (.+) and row (.+) and Options (.+)$")
	public void fills_all_the_Details_of_Provider_Identifiers_from_Sheet_Invaild_data_for_individual_and_row_and_Options_yes(String sheetName , int rowNum, String Options) throws InterruptedException, InvalidFormatException, IOException  {
	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		 String claim_submission = testdata.get(rowNum).get("claim submission ");
		 String Services_Type = testdata.get(rowNum).get("Services Type");
		 String medicare_id = testdata.get(rowNum).get("medicare id");
		 String Effective_date = testdata.get(rowNum).get("Effective date");
		 String end_date = testdata.get(rowNum).get("end date");
		 String other_state_option1 = testdata.get(rowNum).get("Other state option");
		 String other_state_medicaid = testdata.get(rowNum).get("Other state medicaid");
	  try {
		  scrollToViewelement(pom.getEntityProviderIdentificationPage().getProvider_Identifiers_tab());
	
		actionClick(pom.getEntityProviderIdentificationPage().getProvider_Identifiers_tab());
		
		
	} catch (Exception e) {
		
		
	} 
	
	  try {
		 pom.getEntityProviderIdentificationPage().SelectQuestion1npi(Options);
	   sendkeys(pom.getEntityProviderIdentificationPage().getNPI(), DB.getNpiP().get(0));
		
	} catch (Exception e) {
		// TODO: handle exception
	} 
	  
	   


	
	
		 pom.getEntityProviderIdentificationPage().SelectQuestion1medicare(Options);
		
	    	scrollToViewelement(pom.getEntityProviderIdentificationPage().getAddline_Medicare());
		
		 javascriptactionClick(pom.getEntityProviderIdentificationPage().getAddline_Medicare());
		 sendkeys(pom.getEntityProviderIdentificationPage().getMedicare_Id(), medicare_id);
		 sendkeys(pom.getEntityProviderIdentificationPage().getEffective_Date(), Effective_date);
		 sendkeys(pom.getEntityProviderIdentificationPage().getEnd_Date(), end_date);
		
	    	scrollToViewelement(pom.getEntityProviderIdentificationPage().getSave());
		
		 actionClick(pom.getEntityProviderIdentificationPage().getSave());
	
//		 
		 pom.getEntityProviderIdentificationPage().SelectQuestion1medicaredirector(Options);
		 
//Other Medicaid State
		 pom.getEntityProviderIdentificationPage().SelectQuestionothermedicarestate(Options);
		
		 scrollToViewelement(pom.getEntityProviderIdentificationPage().getAddline_other_Medicare());
		
			actionClick(pom.getEntityProviderIdentificationPage().getAddline_other_Medicare());

		    	scrollToViewelement(pom.getEntityProviderIdentificationPage().getOther_state_medicaid1());
				
				actionClick(pom.getEntityProviderIdentificationPage().getOther_state_medicaid1());
				Thread.sleep(1000);
			    // System.out.println(other_state_option1);
			   actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
			//	actionClick(pom.getEntityAllTheDropdownPage().other_state_medicaid_option(other_state_medicaid));
				Thread.sleep(1000);
				actionClick(pom.getEntityProviderIdentificationPage().getState_program());
				Thread.sleep(1000);
				actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
				//javascriptactionClick(pom.getEntityAllTheDropdownPage().other_state_option(other_state_option1));
		
	      sendkeys(pom.getEntityProviderIdentificationPage().getEnrollment_Begin_Date(), Effective_date);
	      sendkeys(pom.getEntityProviderIdentificationPage().getEnrollment_End_Date(), end_date);
	
	    	scrollToViewelement(pom.getEntityProviderIdentificationPage().getSave());
		
	      actionClick(pom.getEntityProviderIdentificationPage().getSave());
			
	
	   
	  
	  
	     
//Additional Information
	     
	    	scrollToViewelement(pom.getEntityProviderIdentificationPage().getYes_Teaching_Facility());
		
	      pom.getEntityProviderIdentificationPage().SelectQuestionteachingfacility(Options);
		 sendkeys(pom.getEntityProviderIdentificationPage().getClaim_submission(), claim_submission);
		 actionClick(pom.getEntityProviderIdentificationPage().getElectronic());
		
		pom.getEntityProviderIdentificationPage().SelectQuestionindianhealth(Options);
		 sendkeys(pom.getEntityProviderIdentificationPage().getServices_Type(), Services_Type);
	
		 

	
	
    	scrollToViewelement(pom.getEntityInformationPage().getNext());
	
	   actionClick(pom.getEntityInformationPage().getNext());
	}

	

}
