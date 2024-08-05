package com.Pages.Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;

import com.PageObjectManager.Entity.*;

import Utilities.Excelreader;

public class EntityAllTheDropdownPage {
      private ArrayList datalist;
      PageObjectManager pom = new PageObjectManager();
      Excelreader excell=new Excelreader();
	public WebElement other_state_option(String other_state_option1) throws InvalidFormatException, IOException {
		//List<Map<String,String>> testdata= excell.getData("C:\\Users\\RakeshA\\eclipse-workspace\\VYE_SD_QA_01\\src\\test\\java\\ExcelData\\Book3.xlsx", sheetName);
		// String other_state_option1 = testdata.get(rowNum).get("Other state option");
	
		WebElement element=null;
		List<WebElement> other_state_optionlist= (List<WebElement>) pom.getEntityProviderIdentificationPage().getOther_state_option(); 
				//pom.getEntityProgramParticipationPage().getSelect_Program_Participation_dropdown();
				
		 datalist = new ArrayList<>();
		System.out.println("Size is="+other_state_optionlist.size());
		for(int i=0;i<other_state_optionlist.size();i++) {
			System.out.println(other_state_optionlist.get(i).getText()+"===="+other_state_option1);
			if(other_state_optionlist.get(i).getText().equalsIgnoreCase(other_state_option1)) {
				element= other_state_optionlist.get(i);
				System.out.println("Element Text inside For Loop="+element.getText());
				break;
			}
		}
		
		System.out.println("Element Text="+element.getText());
		
		return element;	
		
	}
	
	 public WebElement other_state_medicaid_option(String other_state_medicaid) throws InvalidFormatException, IOException {
//		 List<Map<String,String>> testdata= excell.getData("C:\\Users\\RakeshA\\eclipse-workspace\\VYE_SD_QA_01\\src\\test\\java\\ExcelData\\Book3.xlsx", sheetName);
//		 String other_state_medicaid = testdata.get(rowNum).get("Other state medicaid");
			
		 WebElement element=null;
			List<WebElement> other_state_medicaid_optionlist=  (List<WebElement>) pom.getEntityProviderIdentificationPage().getOther_state_medicaid_option();
			 datalist = new ArrayList<>();
			for(int i=0;i<other_state_medicaid_optionlist.size();i++) {
				if(other_state_medicaid_optionlist.get(i).getText().equalsIgnoreCase(other_state_medicaid)) {
					element= other_state_medicaid_optionlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownkeyper_Managing_Employee_Type(String Managing_Employee_Type) throws InvalidFormatException, IOException {
	
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) pom.getEntityKeypersonalPage().getDropdownlist();
			 datalist = new ArrayList<>();
			 
			System.out.println("Size is="+dropdownlist.size());
			for(int i=1;i<dropdownlist.size();i++) {
				//System.out.println(dropdownlist.get(i).getText());
				System.out.println(dropdownlist.get(i).getText()+"===="+Managing_Employee_Type);
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Managing_Employee_Type)) {
					element= dropdownlist.get(i);
					System.out.println("Element Text inside For Loop="+element.getText());
					break;
				}
				//System.out.println("Element Text="+element.getText());
				
				
			}
			return element;	
			
			
		}
	 public WebElement dropdownkeyper_Employee_Status(String Employee_Status) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
	
			List<WebElement> dropdownlist=  (List<WebElement>) pom.getEntityKeypersonalPage().getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Employee_Status)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownkeyper_Country_of_Birth(String Country_of_Birth) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) pom.getEntityKeypersonalPage().getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Country_of_Birth)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownkeyper_State_of_Birth(String state_of_birth) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) pom.getEntityKeypersonalPage().getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(state_of_birth)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownselectprogramparticipation(String specaltiy) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) pom.getEntityServiceLocationPage().getDrop_Select_Program_Participation_list();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(specaltiy)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 
	 
//	 public WebElement Dropdown_licenes(String Select_Speciality  ) {
//		
//		 
//		 WebElement element=null;
//	        List<WebElement> select_program_participationlist=   (List<WebElement>) pom.getEntityProgramParticipationPage().getSelect_Program_Participation_dropdown();
//	        List<WebElement> Select_Specialitylist=  (List<WebElement>) pom.getEntityProgramParticipationPage().getSelect_Speciality_dropdown();
//	  
//	        for(int i=0;i<select_program_participationlist.size();i++) {
//				
//	        	
//	        	
//	        	
////	        	click(pom.getEntityProgramParticipationPage().getSelect_Program_Participation());
////	        	click(select_program_participationlist.get(i));
////	            Thread.sleep(2000);
////	            click(pom.getEntityProgramParticipationPage().getSelect_Speciality());
//	            
//	            if(Select_Specialitylist.get(i).getText().equalsIgnoreCase(Select_Speciality)) {
//				 element = Select_Specialitylist.get(i);
//					
//				
////					System.out.println("Element Text inside For Loop="+element.getText());
//					break;
//				}
	          
	    		
	    	}
	

