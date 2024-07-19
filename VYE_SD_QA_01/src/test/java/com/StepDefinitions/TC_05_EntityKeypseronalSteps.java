package com.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;

import com.PageObjectManager.PageObjectManager;
import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;


public class TC_05_EntityKeypseronalSteps extends BaseUtilClass {

	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_05_EntityKeypseronalSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	
	  @Then("^User goes to Key Personel and Add Multiple Key Personel from Sheet (.+) and row (.+)$")
	  public void user_goes_to_Key_Personel_and_Add_Multiple_Key_Personel_from_Sheet_Invaild_data_for_individual_and_row(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	 
		scrollToViewelement(pom.getEntityKeypersonalPage().getKey_personal_tab());
	
		
		actionClick(pom.getEntityKeypersonalPage().getKey_personal_tab());
		Thread.sleep(1000);
		try {
			
			actionClick(pom.getEntityOwnershipPage().getClose_ownership_section());
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	

		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		 
		  for(int i=0;i<1;i++)
			  
		{
		Map<String, String> rowData =testdata.get(i);
		 String First_Name= DB.getFirst_name().get(i);
		 String Last_Name= DB.getLast_name().get(i);
		 String Date_of_birth= DB.getDob().get(i);
     	String SSN= DB.getSsn().get(i);
		String Middle_Name = rowData.get("Middle Name");
		String Effective_date = rowData.get("Effective date");
		String end_date = rowData.get("end date");
		String Address = rowData.get("Address");
		String Managing_Employee_Type  = rowData.get("Managing Employee Type");
		String Employee_Status = rowData.get("Employee Status");
		String Country_of_Birth = rowData.get("Country of Birth");
		String state_of_birth = rowData.get("state of birth");
		
	
		 scrollToViewelement(pom.getEntityKeypersonalPage().getAdd_line_keypersonal());
		 
		actionClick(pom.getEntityKeypersonalPage().getAdd_line_keypersonal());
	
		scrollToViewelement(pom.getEntityKeypersonalPage().getManaging_Employee_Type());
		Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getManaging_Employee_Type());
		
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Managing_Employee_Type(Managing_Employee_Type));
		Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getEmployee_Status());
		
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Employee_Status(Employee_Status));
		
		sendkeys(pom.getEntityKeypersonalPage().getFirst_Name(), First_Name);
		sendkeys(pom.getEntityKeypersonalPage().getMiddle_Name(), Middle_Name);
		sendkeys(pom.getEntityKeypersonalPage().getLast_Name(), Last_Name);
		sendkeys(pom.getEntityKeypersonalPage().getSSN(), SSN);
		sendkeys(pom.getEntityKeypersonalPage().getDate_of_birth(), Date_of_birth);
		actionClick(pom.getEntityKeypersonalPage().getState_of_Birth());
	
		scrollToViewelement(pom.getEntityAllTheDropdownPage().dropdownkeyper_State_of_Birth(state_of_birth));
	
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_State_of_Birth(state_of_birth));

		 scrollToViewelement(pom.getEntityKeypersonalPage().getCountry_of_Birth());
		 Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getCountry_of_Birth());
		
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Country_of_Birth(Country_of_Birth));
	
		sendkeys(pom.getEntityKeypersonalPage().getEffective_date(), Effective_date);
		sendkeys(pom.getEntityKeypersonalPage().getEnd_date(), end_date);
		sendkeys(pom.getEntityKeypersonalPage().getEffective_date(), Effective_date);
		sendkeys(pom.getEntityKeypersonalPage().getAddress(), Address);
		 
		    scrollBy(driver, 100);
			Thread.sleep(2000);
			actionClick(pom.getEntityKeypersonalPage().getAddress_click());
		
		   
			scrollBy(driver, 200);
			Thread.sleep(1000);
			actionClick(pom.getEntityKeypersonalPage().getSave());
		}

        for(int i=0;i<1;i++)
		{
		Map<String, String> rowData =testdata.get(i);

	    String First_Name = rowData.get("First Name");
		String Last_Name= rowData.get("Last Name");
		String Middle_Name = rowData.get("Middle Name");
		String SSN =rowData.get("SSN");
		String Date_of_birth = rowData.get("Date_of_birth");
		String Effective_date = rowData.get("Effective date");
		String end_date = rowData.get("end date");
		String Address = rowData.get("Address");
		String Managing_Employee_Type  = rowData.get("Managing Employee Type");
		String Employee_Status = rowData.get("Employee Status");
		String Country_of_Birth = rowData.get("Country of Birth");
		String state_of_birth = rowData.get("state of birth");
	
		
    	 scrollToViewelement(pom.getEntityKeypersonalPage().getAdd_line_keypersonal());
		 
		actionClick(pom.getEntityKeypersonalPage().getAdd_line_keypersonal());
		
		scrollToViewelement(pom.getEntityKeypersonalPage().getManaging_Employee_Type());
		Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getManaging_Employee_Type());
	
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Managing_Employee_Type(Managing_Employee_Type));
		System.out.println("status ="+Employee_Status);
		Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getEmployee_Status());
		
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Employee_Status(Employee_Status));
		
		sendkeys(pom.getEntityKeypersonalPage().getFirst_Name(), First_Name);
		sendkeys(pom.getEntityKeypersonalPage().getMiddle_Name(), Middle_Name);
		sendkeys(pom.getEntityKeypersonalPage().getLast_Name(), Last_Name);
		sendkeys(pom.getEntityKeypersonalPage().getSSN(), SSN);
		sendkeys(pom.getEntityKeypersonalPage().getDate_of_birth(), Date_of_birth);
		actionClick(pom.getEntityKeypersonalPage().getState_of_Birth());
		
		scrollToViewelement(pom.getEntityAllTheDropdownPage().dropdownkeyper_State_of_Birth(state_of_birth));
	
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_State_of_Birth(state_of_birth));
		
		 scrollToViewelement(pom.getEntityKeypersonalPage().getCountry_of_Birth());
		 Thread.sleep(1000);
		actionClick(pom.getEntityKeypersonalPage().getCountry_of_Birth());
		
		actionClick(pom.getEntityAllTheDropdownPage().dropdownkeyper_Country_of_Birth(Country_of_Birth));
	
		sendkeys(pom.getEntityKeypersonalPage().getEffective_date(), Effective_date);
		sendkeys(pom.getEntityKeypersonalPage().getEnd_date(), end_date);
		sendkeys(pom.getEntityKeypersonalPage().getEffective_date(), Effective_date);
		sendkeys(pom.getEntityKeypersonalPage().getAddress(), Address);
		Thread.sleep(1000);
		    scrollBy(driver, 300);
			Thread.sleep(2000);
			actionClick(pom.getEntityKeypersonalPage().getAddress_click());
		
		    
			scrollBy(driver, 200);
			Thread.sleep(2000);
			
			
			
	
			actionClick(pom.getEntityKeypersonalPage().getSave());
			
			
		} 
          
	
	    actionClick(pom.getEntityInformationPage().getNext());
	}
}
