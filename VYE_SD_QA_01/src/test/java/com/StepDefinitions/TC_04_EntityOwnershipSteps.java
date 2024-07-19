package com.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;

import com.PageObjectManager.PageObjectManager;

import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;



public class TC_04_EntityOwnershipSteps extends BaseUtilClass {


	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_04_EntityOwnershipSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
		 
	}
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  
	  @Then("^User goes to Ownership section and Select as (.+) for All the Answers from Sheet (.+) and row (.+) table (.+)$")
	  public void user_goes_to_Ownership_section_and_Select_as_yes_for_All_the_Answers_from_Sheet_Invaild_data_for_individual_and_row_table(String OptionsOwnership ,String sheetName , int rowNum, int mutlipledata) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	  
		 int data= mutlipledata;
	      
	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
                String Select_Ownership_Code = testdata.get(rowNum).get("Select Ownership Code");
		String First_Name1 = testdata.get(rowNum).get("First Name");
		String Ownership_Per1 = testdata.get(rowNum).get("Ownership % *");
		String Effective_date1 = testdata.get(rowNum).get("Effective date");
		String end_date1 = testdata.get(rowNum).get("end date");
		String Address1 = testdata.get(rowNum).get("Address");
		String Ownership_typ1 = testdata.get(rowNum).get("Ownership Type ");
		String Ownership_code1 = testdata.get(rowNum).get("Ownership Code");
		 String Provider_name3= DB.getBusiness_name().get(0);
	     	String FEIN3= DB.getSsnP().get(0);
	     	
	  
	     	
	     	  actionClick(pom.getEntityOwnershipPage().getOwnership_tab());
	     	 Thread.sleep(1000);
	     	 
	        	
		        	 
	    	sendkeys(pom.getEntityOwnershipPage().getSelect_Ownership_Code(), Select_Ownership_Code);
			javascriptactionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
			
			
			
//question 2-------------------------------------------------------------------------------------------		

	        pom.getEntityOwnershipPage().SelectQuestion2(OptionsOwnership);
	  
	     	if(OptionsOwnership.equalsIgnoreCase("yes")) {
	     	
			for(int i=0;i<data;i++)
			{
				
			Map<String, String> rowData =testdata.get(i);
	
		    String First_Name = rowData.get("First Name");
			String Last_Name= rowData.get("Last Name");
			String Middle_Name = rowData.get("Middle Name");
			String SSN =rowData.get("SSN");
			String NPI = rowData.get("NPI");
			String Date_of_birth = rowData.get("Date_of_birth");
			String Ownership_Per= rowData.get("Ownership % *");
			String Effective_date = rowData.get("Effective date");
			String end_date = rowData.get("end date");
			String Address = rowData.get("Address");
			

			
		
			
		   scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question21());
	     		javascriptactionClick(pom.getEntityOwnershipPage().getAdd_line_question21());
	     		sendkeys(pom.getEntityOwnershipPage().getFirst_Name(), First_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(),Middle_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getSSN1(), SSN);
	    		sendkeys(pom.getEntityOwnershipPage().getNPI(), NPI);
	    		sendkeys(pom.getEntityOwnershipPage().getDate_of_birth(), Date_of_birth);
	    		// scrollToViewelement(pom.getEntityOwnershipPage().getOwnership_Type());
	    		scrollBy(driver, 200);
	    		 Thread.sleep(1000);
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Type());
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Typ_Directe());
	    		sendkeys(pom.getEntityOwnershipPage().getOwnership_percent(), Ownership_Per);
	    		actionClick(pom.getEntityOwnershipPage().getRelationship_to_Provider());
	    		javascriptactionClick(pom.getEntityOwnershipPage().getRelationship_parent());
	    		sendkeys(pom.getEntityOwnershipPage().getEffective_date(), Effective_date);
	    		sendkeys(pom.getEntityOwnershipPage().getEnd_date(), end_date);
	    		

	    		scrollToViewelement(pom.getEntityOwnershipPage().getAddress());
	    		

	    		sendkeys(pom.getEntityOwnershipPage().getAddress(), Address);
	    		
	    		scrollBy(driver, 200);
	    	    Thread.sleep(2000);
	    	    actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	    	    Thread.sleep(1000);
	    		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	    	
	    		actionClick(pom.getEntityOwnershipPage().getSave());
		     		
		     		
		     		
		     		
		     		
		     		
			}
		
		
			for(int i=0;i<data;i++)
			{
			Map<String, String> rowData =testdata.get(i);
			 String First_Name= DB.getFirst_name().get(i);
			 String Last_Name= DB.getLast_name().get(i);
			 String NPI= DB.getNpi().get(i);
			 String Date_of_birth= DB.getDob().get(i);
	     	String FEIN2= DB.getSsn().get(i);
			String Middle_Name = rowData.get("Middle Name");
			String Ownership_Per= rowData.get("Ownership % *");
			String Effective_date = rowData.get("Effective date");
			String end_date = rowData.get("end date");
			String Address = rowData.get("Address");

			           scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question2());
			      
			       
	     		javascriptactionClick(pom.getEntityOwnershipPage().getAdd_line_question2());
	     		sendkeys(pom.getEntityOwnershipPage().getFirst_Name(), First_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(),Middle_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getSSN1(), FEIN2);
	    		sendkeys(pom.getEntityOwnershipPage().getNPI(), NPI);
	    		sendkeys(pom.getEntityOwnershipPage().getDate_of_birth(), Date_of_birth);
	    
	    	
	    		scrollToViewelement(pom.getEntityOwnershipPage().getOwnership_Type());
	       		
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Type());
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Typ_Directe());
	    		sendkeys(pom.getEntityOwnershipPage().getOwnership_percent(), Ownership_Per);
	    		actionClick(pom.getEntityOwnershipPage().getRelationship_to_Provider());
	    		actionClick(pom.getEntityOwnershipPage().getRelationship_parent());
	    		sendkeys(pom.getEntityOwnershipPage().getEffective_date(), Effective_date);
	    		sendkeys(pom.getEntityOwnershipPage().getEnd_date(), end_date);
	    		

	    		scrollToViewelement(pom.getEntityOwnershipPage().getAddress());
	    		
	    		sendkeys(pom.getEntityOwnershipPage().getAddress(), Address);
	    		
	    		waitForElementToClickableExplicitly(driver, 5, pom.getEntityOwnershipPage().getAddress_click());
	     	
	     		actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	    	
	     		 Thread.sleep(2000);
	    		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	    	
	    		
	         	
	    		actionClick(pom.getEntityOwnershipPage().getSave());
	    			
			}
			
			
		}
		
		


	


//question 3------------------------------------------------------------------------------------
	     	
	     	
	          
	             scrollToViewelement(pom.getEntityOwnershipPage().getYes_question3());
	           
		 pom.getEntityOwnershipPage().SelectQuestion3(OptionsOwnership);
	    
             if(OptionsOwnership.equalsIgnoreCase("yes")) {
            	 scrollToViewelement(pom.getEntityOwnershipPage().getOrganizational_Legal_Business_Name()); 
            	
			sendkeys(pom.getEntityOwnershipPage().getOrganizational_Legal_Business_Name(), Provider_name3);
			sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As(), Provider_name3);
			sendkeys(pom.getEntityOwnershipPage().getFEIN(), FEIN3);
			sendkeys(pom.getEntityOwnershipPage().getEffective_date3(), Effective_date1);
			sendkeys(pom.getEntityOwnershipPage().getEnd_date3(), end_date1);
			sendkeys(pom.getEntityOwnershipPage().getPrimary_business_address_line_3(), Address1);
		
			 scrollBy(driver, 200);
       		Thread.sleep(2000);
			actionClick(pom.getEntityOwnershipPage().getAddress_click());
			
			
          scrollToViewelement(pom.getEntityOwnershipPage().getOwnership_Type_question3());
           
			sendkeys(pom.getEntityOwnershipPage().getOwnership_Type_question3(), Ownership_typ1);
			
			actionClick(pom.getEntityOwnershipPage().getDirect3());
			sendkeys(pom.getEntityOwnershipPage().getOwnership_Code(), Ownership_code1);
			  
			actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
			
			sendkeys(pom.getEntityOwnershipPage().getOwnership_percent(), Ownership_Per1);
			scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question31());
		
			actionClick(pom.getEntityOwnershipPage().getAdd_line_question31());
			sendkeys(pom.getEntityOwnershipPage().getLocation_name(), First_Name1);
			sendkeys(pom.getEntityOwnershipPage().getOther_business_address_line(), Address1);
			
			scrollToViewelement(pom.getEntityOwnershipPage().getSave());
       		Thread.sleep(2000);
       		actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
			
	            Thread.sleep(2000);
	            actionClick(pom.getEntityOwnershipPage().getSave());
	     	
	      }
	  			
		
	   		
//QUESTION 4------------------------------------------
	  			
	  			      pom.getEntityOwnershipPage().SelectQuestion4(OptionsOwnership);
	  		
	  			      if(OptionsOwnership.equalsIgnoreCase("yes")) {
	  			    	 Thread.sleep(2000);
	  			    	actionClick(pom.getEntityOwnershipPage().getFEIN_check_box());
	  			    	 Thread.sleep(2000);
	  			    	actionClick(pom.getEntityOwnershipPage().getSSN_check_box());
	  				
	  				  
	  			for(int i=0;i<data;i++)
				{
				Map<String, String> rowData =testdata.get(i);
				
				String First_Name = rowData.get("First Name");
					String Last_Name= rowData.get("Last Name");
					String Middle_Name = rowData.get("Middle Name");
					String Ownership_Per = rowData.get("Ownership % *");
					String Effective_date = rowData.get("Effective date");
					String end_date = rowData.get("end date");
					String Address = rowData.get("Address");	
				 String Provider_name = rowData.get("provider Name");
			     	String FEIN =  rowData.get("FEIN");
			     	
			     	 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question41Fein());
					

	    actionClick(pom.getEntityOwnershipPage().getAdd_line_question41Fein());
	    sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	   
	   scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
	   Thread.sleep(1000);
	    actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	   
	    actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	    
	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	   
	    scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	    
	      
		   Thread.sleep(2000);
		   actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
		   Thread.sleep(1000);
		   scrollBy(driver, 200);
		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
//		scrollBy(driver, 200);
		 Thread.sleep(2000);
		actionClick(pom.getEntityOwnershipPage().getSave());
     try {
    	 if (pom.getEntityOwnershipPage().getSave().isDisplayed()==true)
       	  javascriptactionClick(pom.getEntityOwnershipPage().getSave());
	} catch (Exception e) {
		// TODO: handle exception
	} 
		
     		
     		
     		 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question4ssn1());
			
			Thread.sleep(1000);
	    
	    waitForElementToVisibile(driver, 10, pom.getEntityOwnershipPage().getAdd_line_question4ssn1());
	    actionClick(pom.getEntityOwnershipPage().getAdd_line_question4_ssn());
	    sendkeys(pom.getEntityOwnershipPage().getSSN(), FEIN);
	    sendkeys(pom.getEntityOwnershipPage().getFirst_Name(),First_Name);
	    sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(), Middle_Name);
	    sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	  
	  scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
	  Thread.sleep(1000); 
	  actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	  Thread.sleep(1000);
	  actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	
	scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		Thread.sleep(2000);
		actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	
	    Thread.sleep(2000);
	    scrollBy(driver, 200);
		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
//		scrollBy(driver, 200);
		
		 Thread.sleep(1000);
		actionClick(pom.getEntityOwnershipPage().getSave());
		  Thread.sleep(1000);
	      }
	  			for(int i=0;i<data;i++)
				{
				Map<String, String> rowData =testdata.get(i);
				 String First_Name= DB.getFirst_name().get(i);
				 String Last_Name= DB.getLast_name().get(i);
				
		     	String FEIN= DB.getSsn().get(i);
			    String Provider_name =DB.getBusiness_name().get(i);
				
				String Middle_Name = rowData.get("Middle Name");
			
				String Ownership_Per= rowData.get("Ownership % *");
				String Effective_date = rowData.get("Effective date");
				String end_date = rowData.get("end date");
				String Address = rowData.get("Address");
	  			
			     	 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question41Fein());
				

	    actionClick(pom.getEntityOwnershipPage().getAdd_line_question41Fein());
	    sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	
	scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
		 
	    actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	    Thread.sleep(1000);
	    actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	 
	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	    Thread.sleep(2000);
	    scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	    
	      // scrollBy(driver, 200);
		   Thread.sleep(2000);
		   actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	    Thread.sleep(2000);
	    scrollBy(driver, 200);
		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
      	
			
		actionClick(pom.getEntityOwnershipPage().getSave());
		
     		 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question4ssn1());
			 
			
	    waitForElementToVisibile(driver, 10, pom.getEntityOwnershipPage().getAdd_line_question4ssn1());
	    actionClick(pom.getEntityOwnershipPage().getAdd_line_question4_ssn());
	    sendkeys(pom.getEntityOwnershipPage().getSSN(), FEIN);
	    sendkeys(pom.getEntityOwnershipPage().getFirst_Name(),First_Name);
	    sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(), Middle_Name);
	    sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	
	 scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
		   
	 actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	 Thread.sleep(1000);
	 actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	    Thread.sleep(2000);
	    scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	   
	    actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	    Thread.sleep(1000);
	    scrollBy(driver, 200);
	scrollToViewelement(pom.getEntityOwnershipPage().getSave());
	
	Thread.sleep(2000);
			
			actionClick(pom.getEntityOwnershipPage().getSave());
			
	      }
	  			}
	  				
	  				  
	   
//question 5------------
	        Thread.sleep(3000);
//	      pom.getEntityOwnershipPage().SelectQuestion5(OptionsOwnership);
	      
//	      if(option.equalsIgnoreCase("yes")) {
//	    	  
//	      }
		
	    actionClick(pom.getEntityOwnershipPage().getNo_question5());
	    
//question6--------------
	      Thread.sleep(3000);
//	      pom.getEntityOwnershipPage().SelectQuestion6(OptionsOwnership);
	      actionClick(pom.getEntityOwnershipPage().getNo_question6());
		    
//	      if(option.equalsIgnoreCase("yes")) {
//	    	  
//	      }
	   // click(pom.getEntityOwnershipPage().getYes_question6());
	  
//question 7----------------------------
	 
	       Thread.sleep(1000);
	      pom.getEntityOwnershipPage().SelectQuestion7(OptionsOwnership);
	    
	      if(OptionsOwnership.equalsIgnoreCase("yes")) {
	    	 
	    	  scrollToViewelement(pom.getEntityOwnershipPage().getFEIN_check_box7());
	    	  Thread.sleep(1000);
	    	  actionClick(pom.getEntityOwnershipPage().getFEIN_check_box7());
	    	  Thread.sleep(1000);
	    	  actionClick(pom.getEntityOwnershipPage().getSSN_check_box7());
	    	
	    	 
	    	  //fein------------------------------------
	    	  for(int i=0;i<data;i++)
				{
				Map<String, String> rowData =testdata.get(i);
				
				String First_Name = rowData.get("First Name");
					String Last_Name= rowData.get("Last Name");
					String Middle_Name = rowData.get("Middle Name");
					String Ownership_Per = rowData.get("Ownership % *");
					String Effective_date = rowData.get("Effective date");
					String end_date = rowData.get("end date");
					String Address = rowData.get("Address");	
				 String Provider_name = rowData.get("provider Name");
			     	String FEIN =  rowData.get("FEIN");
			     	
			     	 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question71fein());
					
	    	  actionClick(pom.getEntityOwnershipPage().getAdd_line_question71fein());
	    	  sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	  	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	  	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	  	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	  	  
		    scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
			   Thread.sleep(1000);
	  	    actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	  	
	  	    actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	  	
	  	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	  	 
		     scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		    
		      
		       Thread.sleep(2000);
			   actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	  	  Thread.sleep(1000);
		scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		
				
			actionClick(pom.getEntityOwnershipPage().getSave());
			
	     		Thread.sleep(1000);
	     
	     		
	  //ssn -------------------------------------------   		
	     		 Thread.sleep(1000);
	     		 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question71ssn());
				 
	     		  
	  	    actionClick(pom.getEntityOwnershipPage().getAdd_line_question71ssn());
	  	  sendkeys(pom.getEntityOwnershipPage().getSSN7(), FEIN);
		    sendkeys(pom.getEntityOwnershipPage().getFirst_Name(),First_Name);
		    sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(), Middle_Name);
		    sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
		    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
		  
		 scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
			   Thread.sleep(1000);
			   actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
			   actionClick(pom.getEntityOwnershipPage().getDropdown_click());
		    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
		    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
		    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address1);
		    Thread.sleep(1000);
		    scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		    Thread.sleep(2000);
			actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
		
		    Thread.sleep(1000);
			scrollToViewelement(pom.getEntityOwnershipPage().getSave());
			
				
				actionClick(pom.getEntityOwnershipPage().getSave());
			
		 
		    
				}
	   // question 7 db data 
	    	  for(int i=0;i<data;i++)
				{
				
				
				Map<String, String> rowData =testdata.get(i);
				 String First_Name= DB.getFirst_name().get(i);
				 String Last_Name= DB.getLast_name().get(i);
				 String NPI= DB.getNpi().get(i);
				 String Date_of_birth= DB.getDob().get(i);
		     	String FEIN= DB.getSsn().get(i);
			    String Provider_name =DB.getBusiness_name().get(i);
				
				String Middle_Name = rowData.get("Middle Name");
				String SSN =rowData.get("FEIN2");
				// NPI = rowData.get("NPI");
				//String Date_of_birth = rowData.get("Date_of_birth");
				String Ownership_Per= rowData.get("Ownership % *");
				String Effective_date = rowData.get("Effective date");
				String end_date = rowData.get("end date");
				String Address = rowData.get("Address");
	  			
			     
			     	 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question71fein());
					
	    	  actionClick(pom.getEntityOwnershipPage().getAdd_line_question71fein());
	    	  sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	  	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	  	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	  	    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
	  
		  scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
			   Thread.sleep(1000);
			   actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
	  	
	  	actionClick(pom.getEntityOwnershipPage().getDropdown_click());
	  	
	  	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	  	
	  //	scrollBy(driver, 200);
		    scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		    
		    Thread.sleep(2000);
			   actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	  	  Thread.sleep(1000);
			scrollToViewelement(pom.getEntityOwnershipPage().getSave());
			
				
			actionClick(pom.getEntityOwnershipPage().getSave());
		try {
			actionClick(pom.getEntityOwnershipPage().getSave());
			actionClick(pom.getEntityOwnershipPage().getSave());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	     
	     		
	  //ssn -------------------------------------------   		
			 Thread.sleep(2000);
			 
			 
			 scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question71ssn());
				
			 Thread.sleep(2000);
	  	  
	  	  sendkeys(pom.getEntityOwnershipPage().getSSN7(), FEIN);
		    sendkeys(pom.getEntityOwnershipPage().getFirst_Name(),First_Name);
		    sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(), Middle_Name);
		    sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
		    sendkeys(pom.getEntityOwnershipPage().getPercent_of_Interest(), Ownership_Per);
		   
		    scrollToViewelement(pom.getEntityOwnershipPage().getType_of_Interest());
			   Thread.sleep(1000);
			   actionClick(pom.getEntityOwnershipPage().getType_of_Interest());
			   actionClick(pom.getEntityOwnershipPage().getDropdown_click());
		    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
		    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
		    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address1);
		 
		   scrollToViewelement(pom.getEntityOwnershipPage().getSave());
		   Thread.sleep(2000);
			actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
		
		    Thread.sleep(2000);
			scrollToViewelement(pom.getEntityOwnershipPage().getSave());
			
				
			actionClick(pom.getEntityOwnershipPage().getSave());
			
		 
		    
				}
	    	 
	    	  
	      }
	   // click(pom.getEntityOwnershipPage().getYes_question7());
//question 8----------------------------
	      
	      
	
	      /**
	 
	      Thread.sleep(3000);
	      pom.getEntityOwnershipPage().SelectQuestion8(OptionsOwnership);
	      Thread.sleep(2000);
	      if(OptionsOwnership.equalsIgnoreCase("yes")) {
	    	
	    	  for(int i=1;i<=3;i++)
				{
				Map<String, String> rowData =testdata.get(i);
				
				String First_Name = rowData.get("First Name");
					String Last_Name= rowData.get("Last Name");
					String Middle_Name = rowData.get("Middle Name");
					String SSN =rowData.get("SSN");
					String Date_of_birth = rowData.get("Date_of_birth");
					String Ownership_Per = rowData.get("Ownership % *");
					String Effective_date = rowData.get("Effective date");
					String end_date = rowData.get("end date");
		
					 Thread.sleep(4000);
			    	  scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question81());
			    	  Thread.sleep(4000);
					
			    	  actionClick(pom.getEntityOwnershipPage().getAdd_line_question81());
	    	  sendkeys(pom.getEntityOwnershipPage().getFirst_Name(), First_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getLast_Name(), Last_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getMiddle_Name(), Middle_Name);
	    		actionClick(pom.getEntityOwnershipPage().getRelationship8());
	    		actionClick(pom.getEntityOwnershipPage().getRelationship_dropdown());
	    		
	    		sendkeys(pom.getEntityOwnershipPage().getSSN8(), SSN);
	    		sendkeys(pom.getEntityOwnershipPage().getDate_of_birth_quest8(), Date_of_birth);
	    		Thread.sleep(2000);
	 		    scrollBy(driver, 250);
	 			   Thread.sleep(5000);
	    		 
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Type8());
	    		actionClick(pom.getEntityOwnershipPage().getOwnership_Typ_Directe());
	    		sendkeys(pom.getEntityOwnershipPage().getOwnership_per_quest8(), Ownership_Per);
	            sendkeys(pom.getEntityOwnershipPage().getSubcontractor_Name(), First_Name);
	    		sendkeys(pom.getEntityOwnershipPage().getEffective_quest8(), Effective_date);
	    		sendkeys(pom.getEntityOwnershipPage().getEnd_quest8(), end_date);
	    		sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address1);
	    		waitForElementToClickableExplicitly(driver, 5, pom.getEntityOwnershipPage().getAddress_click());
	    		 Thread.sleep(2000);
	 		    scrollBy(driver, 100);
	 			Thread.sleep(2000);
	 		    actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
	 		   Thread.sleep(3000);
				scrollBy(driver, 200);
				Thread.sleep(2000);
					
				actionClick(pom.getEntityOwnershipPage().getSave());
					scrollTOTop(driver);
	    	  
				}
	      }
	     **/
//question9-------------------------------------------------------
	      Thread.sleep(3000);
	      scrollToViewelement(pom.getEntityOwnershipPage().getNo_question8());
    	  Thread.sleep(2000);
	       actionClick( pom.getEntityOwnershipPage().getNo_question8());
//	     
	      Thread.sleep(3000);
	      pom.getEntityOwnershipPage().SelectQuestion9(OptionsOwnership);
	      Thread.sleep(2000);
	      if(OptionsOwnership.equalsIgnoreCase("yes")) {
	    	  
	    	  for(int i=0;i<data;i++)
				{
				Map<String, String> rowData =testdata.get(i);
				
				String Select_Program = rowData.get("Select_Program");
					String Effective_date = rowData.get("Effective date");
					String end_date = rowData.get("end date");
					String Address = rowData.get("Address");	
				 String Provider_name = rowData.get("provider Name");
			     	String FEIN =  rowData.get("FEIN");
			     	String NPI = rowData.get("NPI");
			     	
			     	 Thread.sleep(4000);
			    	  scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question91());
			    	  Thread.sleep(4000);
			     	
	    	  actionClick(pom.getEntityOwnershipPage().getAdd_line_question91());
	  	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	  	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	  	     sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	  	    
	  	    sendkeys(pom.getEntityOwnershipPage().getSelect_Program(), Select_Program);
	  	    sendkeys(pom.getEntityOwnershipPage().getNPI9(), NPI);
	  	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	  	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	  	  Thread.sleep(2000);
		scrollBy(driver, 200);
			Thread.sleep(2000);
		    actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
		   Thread.sleep(3000);
			scrollToViewelement(pom.getEntityOwnershipPage().getSave());
			Thread.sleep(2000);
				
			actionClick(pom.getEntityOwnershipPage().getSave());
				
	    	  
	    	  
	    	  
				 
	    	  
	      }
	    	  for(int i=0;i<data;i++)
				{
				
				
				Map<String, String> rowData =testdata.get(i);
				String Select_Program = rowData.get("Select_Program");
				 String NPI= DB.getNpiP().get(i);
				
		     	String FEIN= DB.getSsnP().get(i);
			    String Provider_name =DB.getBusiness_name().get(i);
				String Effective_date = rowData.get("Effective date");
				String end_date = rowData.get("end date");
				String Address = rowData.get("Address");  
	    	  Thread.sleep(4000);
	    	  scrollToViewelement(pom.getEntityOwnershipPage().getAdd_line_question91());
	    	  Thread.sleep(4000);
	     	
	     actionClick(pom.getEntityOwnershipPage().getAdd_line_question91());
	    sendkeys(pom.getEntityOwnershipPage().getOrganization_Legal_Business_Name_question4(), Provider_name);
	    sendkeys(pom.getEntityOwnershipPage().getDoing_Business_As_question4(), Provider_name);
	     sendkeys(pom.getEntityOwnershipPage().getFEIN_question4(), FEIN);
	    
	    sendkeys(pom.getEntityOwnershipPage().getSelect_Program(), Select_Program);
	    sendkeys(pom.getEntityOwnershipPage().getNPI9(), NPI);
	    sendkeys(pom.getEntityOwnershipPage().getEffective_date_4(), Effective_date);
	    sendkeys(pom.getEntityOwnershipPage().getEnd_date_4(), end_date);
	    sendkeys(pom.getEntityOwnershipPage().getAddress_question4(), Address);
	    Thread.sleep(2000);
         scrollBy(driver, 100);
	         Thread.sleep(2000);
        actionClick(pom.getEntityOwnershipPage().getDropdown_click_first());
      Thread.sleep(3000);
	   scrollBy(driver, 200);
	  Thread.sleep(2000);
		
	      actionClick(pom.getEntityOwnershipPage().getSave());
//		scrollTOTop(driver);
 
  } 
	      }
	  	Thread.sleep(2000);
	  	scrollToViewelement(pom.getEntityInformationPage().getNext());
	 	Thread.sleep(2000);
	      actionClick(pom.getEntityInformationPage().getNext());
		try {
			Thread.sleep(2000);
			actionClick(pom.getEntityOwnershipPage().getClose_ownership_section());
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	


	  }

	  }	
	
	

