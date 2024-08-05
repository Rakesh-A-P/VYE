package com.StepDefinitions.LICENSE.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Entity.*;

import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;

public class TC_08_EntityAddressSteps extends BaseUtilClass {
	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_08_EntityAddressSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}
	
	
	@Then("^User goes to Address Details and fills all the details from Sheet (.+) and row (.+) and Options as (.+)$")
	public void user_goes_to_Address_Details_and_fills_all_the_details_from_Sheet_Invaild_data_for_individual_and(String sheetName , int rowNum, String Options) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	   
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
        String malling_address = testdata.get(rowNum).get("Address");
        String phone=testdata.get(rowNum).get("Phone");
        String Fax=testdata.get(rowNum).get("Fax");
        String Extension=testdata.get(rowNum).get("Extension");
        String Email=testdata.get(rowNum).get("Email");
        String Position=testdata.get(rowNum).get("Position");
        
        
    	
   	 Thread.sleep(2000);
   	 scrollToViewelement(pom.getEntityAddressdetailsPage().getAddress_Details_tab());
   	 Thread.sleep(2000);
   	 actionClick(pom.getEntityAddressdetailsPage().getAddress_Details_tab());
   		 Thread.sleep(2000);
        
        
        
        Thread.sleep(2000);
		sendkeys(pom.getEntityAddressdetailsPage().getMailing_Address_Line(), malling_address);
		Thread.sleep(3000);
		   actionClick(pom.getEntityAddressdetailsPage().getMailing_address_click());
		   Thread.sleep(2000);
		  
		   sendkeys(pom.getEntityAddressdetailsPage().getAttention_line(), malling_address);
		   sendkeys(pom.getEntityAddressdetailsPage().getPhone(), phone);
		   sendkeys(pom.getEntityAddressdetailsPage().getExtension(), Extension);
		   sendkeys(pom.getEntityAddressdetailsPage().getFax(), Fax);
		   sendkeys(pom.getEntityAddressdetailsPage().getEmail(), Email);
		   Thread.sleep(1000);
		   scrollToViewelement(pom.getEntityAddressdetailsPage().getPostion());
		   Thread.sleep(2000);
		   sendkeys(pom.getEntityAddressdetailsPage().getPostion(), Position);
		   Thread.sleep(2000);
		   
		   actionClick(pom.getEntityAddressdetailsPage().getPostion_dropdown_first());
		   
		   scrollToViewelement(pom.getEntityAddressdetailsPage().getYes_Billing_Contact_Person_Details());
		   Thread.sleep(3000);
		  
	        pom.getEntityAddressdetailsPage().SelectQuestion(Options);
	    	Thread.sleep(5000);


	
		 scrollToViewelement(pom.getEntityInformationPage().getNext());
		   Thread.sleep(2000);
		  
			
			actionClick(pom.getEntityInformationPage().getNext());
		   
		  
	}


}
