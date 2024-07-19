package com.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.PageObjectManager.PageObjectManager;

import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;



public class TC_10_EntityServicelocationSteps extends BaseUtilClass {

	
	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_10_EntityServicelocationSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}
	

	@Then("User Goes to Service Location Section and Adds a Service Location from Sheet (.+) and row (.+) and Options as (.+)$")
	public void user_Goes_to_Service_Location_Section_and_Adds_a_Service_Location_from_Sheet_Invaild_data_for_individual_and(String sheetName , int rowNum ,String Options) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	    
		Thread.sleep(5000);
		scrollToViewelement(pom.getEntityServiceLocationPage().getService_Location_tab());
		Thread.sleep(5000);
		actionClick(pom.getEntityServiceLocationPage().getService_Location_tab());
		Thread.sleep(2000);
	

	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		 String Effective_start = testdata.get(rowNum).get("Effective start");
		 String End_date = testdata.get(rowNum).get("End date");
		 String loaction_name = testdata.get(rowNum).get("loaction name");
		 String address = testdata.get(rowNum).get("address");
		 String TTD_Number = testdata.get(rowNum).get("TTD Number");
		 String attention_line = testdata.get(rowNum).get("attention line");
		 String email = testdata.get(rowNum).get("email");
		 String phone_number = testdata.get(rowNum).get("phone number");
		 String EXT = testdata.get(rowNum).get("EXT");
		 String Fax_number = testdata.get(rowNum).get("Fax number");
		 String afterhoursnumber = testdata.get(rowNum).get("afterhoursnumber");
		 String phone_number_paitent = testdata.get(rowNum).get("phone number paitent");

		 
		 
		 //Thread.sleep(2000);
		 waitForElementToVisibile(driver, 10, pom.getEntityServiceLocationPage().getAdd_Location());
		 actionClick(pom.getEntityServiceLocationPage().getAdd_Location());
		 Thread.sleep(2000);
		 sendkeys(pom.getEntityServiceLocationPage().getEeffective_date(), Effective_start);
		 sendkeys(pom.getEntityServiceLocationPage().getEnd_date(), End_date);
		 sendkeys(pom.getEntityServiceLocationPage().getLocation_name(), loaction_name);
		 sendkeys(pom.getEntityServiceLocationPage().getAddress_line(), address);
		 Thread.sleep(3000);
		 actionClick(pom.getEntityServiceLocationPage().getDrop_click_first());
		 Thread.sleep(1000);
		 if(pom.getEntityServiceLocationPage().getPrimary_location_radio().isSelected()==true) {
			 Thread.sleep(1000);
			 scrollToViewelement(pom.getEntityServiceLocationPage().getAttention_line());
	         Thread.sleep(1000);
	         try {
	        	 actionClick(pom.getEntityServiceLocationPage().getAttention_line());
	        
	         Thread.sleep(1000);
	        	 sendkeys(pom.getEntityServiceLocationPage().getAttention_line(), attention_line);
	        	 Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		 sendkeys(pom.getEntityServiceLocationPage().getEmail(), email);
		 sendkeys(pom.getEntityServiceLocationPage().getPhonenumber(), phone_number);
         sendkeys(pom.getEntityServiceLocationPage().getFax_number(), Fax_number);	
         sendkeys(pom.getEntityServiceLocationPage().getExt(), EXT);
         Thread.sleep(1000);
         scrollToViewelement(pom.getEntityServiceLocationPage().getDrop_postion());
         Thread.sleep(1000);
         actionClick(pom.getEntityServiceLocationPage().getDrop_postion());
         Thread.sleep(3000);
         actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
         Thread.sleep(1000);
		 }
		 
        
 	
		
			 Addprogramparticitaion1();
				
			 
			 pom.getEntityuploadphotoPage().getUpload_Files_button1().sendKeys(getPropertyFileValue("filepath"));
		 		Thread.sleep(1000);
		 		pom.getEntityServiceLocationPage().getSelectQuestionclaim(Options);
		 		Thread.sleep(1000);
		 		
		
 
 	
 			scrollToViewelement(pom.getEntityServiceLocationPage().getDrop_Language_Supported());
 	 		Thread.sleep(1000);
 	 		actionClick(pom.getEntityServiceLocationPage().getDrop_Language_Supported());
 	 		Thread.sleep(2000);
 	 		actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
 	 		Thread.sleep(1000);
 	 		actionClick(pom.getEntityServiceLocationPage().getNo_TTD_TTY());
 	 		Thread.sleep(1000);
		
 		actionClick(pom.getEntityServiceLocationPage().getDrop_Gender_Served());
 		Thread.sleep(2000);
 		actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
		 scrollToViewelement(pom.getEntityServiceLocationPage().getAll_ages_served_checkbox());
		 Thread.sleep(1000);
		 if (pom.getEntityServiceLocationPage().getAll_ages_served_checkbox().isSelected()==false) {
			 actionClick(pom.getEntityServiceLocationPage().getAll_ages_served_checkbox());
			 Thread.sleep(1000);
		}
		
		 pom.getEntityServiceLocationPage().getSelectQuestionaccepting(Options);
		 Thread.sleep(1000);
		 pom.getEntityServiceLocationPage().getSelectQuestionTTD_TTY(Options);
		 Thread.sleep(1000);
		 sendkeys(pom.getEntityServiceLocationPage().getTTD_TTY_Number(), TTD_Number);
		 Thread.sleep(1000);
		 pom.getEntityServiceLocationPage().getSelectQuestionlocationopen(Options);
		 Thread.sleep(1000);
		 pom.getEntityServiceLocationPage().getSelectQuestionprovideremergencyservice(Options);
		 if(pom.getEntityServiceLocationPage().getAfter_hours_contact_person().isDisplayed()==true){
			 sendkeys(pom.getEntityServiceLocationPage().getAfter_hours_contact_person(), afterhoursnumber);
		 }
		 Thread.sleep(1000);
		 pom.getEntityServiceLocationPage().getSelectQuestionpatientrecord(Options);
		 Thread.sleep(1000);
		 pom.getEntityServiceLocationPage().getSelectQuestionpersonalrecord(Options);
		 Thread.sleep(1000);
		 sendkeys(pom.getEntityServiceLocationPage().getPhone_number_of_patient(), phone_number_paitent);
		
	 		Thread.sleep(1000);
	 		scrollBottom(driver);
	 		Thread.sleep(1000);
		 actionClick(pom.getEntityServiceLocationPage().getDrop_manner_of_services());
		 Thread.sleep(2000);
		 actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
		 Thread.sleep(1000);
		 
		 actionClick(pom.getEntityServiceLocationPage().getSave());

	

	
		Thread.sleep(1000);
		scrollToViewelement(pom.getEntityuploadphotoPage().getNext());
		Thread.sleep(1000);
		actionClick(pom.getEntityuploadphotoPage().getNext());
	
		
	}

	
	public void Addprogramparticitaion1() throws InterruptedException {	
 		
		 Thread.sleep(2000);
		   scrollToViewelement(pom.getEntityServiceLocationPage().getAdd_Program_Participation_button());
			Thread.sleep(1000);
		 actionClick(pom.getEntityServiceLocationPage().getAdd_Program_Participation_button());
	 		Thread.sleep(1000);
	 		actionClick(pom.getEntityServiceLocationPage().getDrop_Select_Program_Participation());
	 	     Thread.sleep(2000);
		
		
	      List<WebElement> list=  (List<WebElement>) pom.getEntityServiceLocationPage().getDrop_Select_Program_Participation_list(); 
	      System.out.println("length="+list.size());
	      int size=list.size();
	       for(int i=1;i<size;i++) {
	    	      
	    	   try {
	    		   if(i==1) {
	    			   Thread.sleep(2000);
	    			   Actions actions = new Actions(driver);
	    				actions.moveByOffset(20, -10).perform();
	    				actions.release().perform();
	    				   Thread.sleep(2000);
	    			   actionClick(pom.getEntityServiceLocationPage().getClear());
	    			   Thread.sleep(1000);
	    		   }
	    		   Thread.sleep(2000);
	    		   scrollToViewelement(pom.getEntityServiceLocationPage().getAdd_Program_Participation_button());
	    		  	  Thread.sleep(2000); 
	    		   actionClick(pom.getEntityServiceLocationPage().getAdd_Program_Participation_button());
	   	 		Thread.sleep(1000);
	   	 		actionClick(pom.getEntityServiceLocationPage().getDrop_Select_Program_Participation());
	   	 	     Thread.sleep(2000);
	    		   Thread.sleep(5000);
	    		   actionClick(list.get(i));
	   	    	Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
				Thread.sleep(5000);
				   actionClick(list.get(i));
		   	    	Thread.sleep(3000);
			}
	    	
	    	 List<WebElement> list_of_checkbox =(List<WebElement>) pom.getEntityServiceLocationPage().getCheckbox_programparticipation();
	    	// System.out.println(list_of_checkbox.get(k));
	    	for(int j=0;j<list_of_checkbox.size();j++) {
	    	 
	    	 actionClick(list_of_checkbox.get(j));
	    	Thread.sleep(2000);
	    	 List<WebElement> list_of_effective_date =(List<WebElement>) pom.getEntityServiceLocationPage().getLocation_Taxonomy_Effective_Start_Date_list();
	    	  String effectivedate = pom.getEntityServiceLocationPage().CheckBoxIndexofeffectivedate(j+1).getText();
	    	   
	    	  Thread.sleep(1000);
	    	 sendkeys(list_of_effective_date.get(j), effectivedate);
	    	Thread.sleep(2000);
	    	String enddate= pom.getEntityServiceLocationPage().CheckBoxIndexofenddate(j+1).getText();
	    	Thread.sleep(1000);
	    	 List<WebElement> list_of_end_date =(List<WebElement>) pom.getEntityServiceLocationPage().getLocation_Taxonomy_Effective_End_Date_list();
	    	 sendkeys(list_of_end_date.get(j), enddate);
	    	Thread.sleep(2000);
	    	}
	   
	         Thread.sleep(4000);
	        actionClick(pom.getEntityServiceLocationPage().getAdd_program_participation_Save());
	  	    Thread.sleep(5000);
	    	
	  	  health_home();
	   	
	  	  Medicare();
	  
	       }
	}

	  public void health_home() {
		  	 try { 
		  		 if(pom.getEntityServiceLocationPage().getYes_no_office_location().isSelected()==false) {
		  		  Thread.sleep(1000);
		     scrollToViewelement(pom.getEntityServiceLocationPage().getDrop_servicesfor_medical_dental_or_both());
		  	  Thread.sleep(2000);
		  	    actionClick(pom.getEntityServiceLocationPage().getDrop_servicesfor_medical_dental_or_both());
			  	  Thread.sleep(1000);
		  	    actionClick(pom.getEntityServiceLocationPage().getDrop_click_first());
			  	  Thread.sleep(2000);
			  	 actionClick(pom.getEntityServiceLocationPage().getNo_no_office_location());
		  	  Thread.sleep(2000);
		  	   actionClick(pom.getEntityServiceLocationPage().getYes_no_office_location());
		  	  Thread.sleep(2000);  }
		  
		  	
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		  	  }
	  
	  
	  
	  public void Medicare() {
		  try {  Thread.sleep(2000); 
	  		 if(pom.getEntityServiceLocationPage().getYes_recognized_as_a_DRG().isSelected()==false) {
	  			  Thread.sleep(2000); 
	  			 actionClick(pom.getEntityServiceLocationPage().getYes_recognized_as_a_DRG());
	  			sendkeys(pom.getEntityServiceLocationPage().getName(), "hith");
	  			sendkeys(pom.getEntityServiceLocationPage().getContact_Phone(), "(987)654-6789"); 
	  		  Thread.sleep(2000); 
	  			scrollToViewelement(pom.getEntityServiceLocationPage().getAdd_line_bed_type());
		  		  Thread.sleep(2000); 
	  			
	  			actionClick(pom.getEntityServiceLocationPage().getAdd_line_bed_type());
	  		  Thread.sleep(2000); 
	  			actionClick(pom.getEntityServiceLocationPage().getBed_type_drop());
	  		  Thread.sleep(2000); 
	  			actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
	  			sendkeys(pom.getEntityServiceLocationPage().getNo_of_Beds(), "879876786");
	  			scrollToViewelement(pom.getEntityServiceLocationPage().getSave_bed_type());
	  			Thread.sleep(2000); 
	  			 actionClick(pom.getEntityServiceLocationPage().getSave_bed_type());
	  			scrollToViewelement(pom.getEntityServiceLocationPage().getDrop_healthcare_system());
		  		  Thread.sleep(2000); 
		  			actionClick(pom.getEntityServiceLocationPage().getDrop_healthcare_system());
		  			Thread.sleep(2000); 
		  			actionClick(pom.getEntityServiceLocationPage().getDrop_click_second());
	  		 }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	  }
	

}
