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

public class TC_07_EntityEFTInformationSteps extends BaseUtilClass {

	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_07_EntityEFTInformationSteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}
	
	
	@Then("^User Fills the EFT Information from Sheet (.+) and row (.+)$")
	public void user_Fills_the_EFT_Information_from_Sheet_Invaild_data_for_individual_and(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	   
		
	 Thread.sleep(2000);
	 scrollToViewelement(pom.getEntityEFTInformationPage().getEFT_Information_tab());
	 Thread.sleep(2000);
	 actionClick(pom.getEntityEFTInformationPage().getEFT_Information_tab());
		 Thread.sleep(2000);
	

	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
        String Name_of_the_Financial_Institution = testdata.get(rowNum).get("Name of the Financial Institution");
        String Routing_Number_of_EFT = testdata.get(rowNum).get("Routing Number of EFT");
        String Account_Number = testdata.get(rowNum).get("Account Number");
        String Start_Date = testdata.get(rowNum).get("Start Date");
       
        
        
        sendkeys(pom.getEntityEFTInformationPage().getName_of_the_Financial_Institution(), Name_of_the_Financial_Institution);
        sendkeys(pom.getEntityEFTInformationPage().getAccount_Number(), Account_Number);
		sendkeys(pom.getEntityEFTInformationPage().getRouting_Number_of_EF(), Routing_Number_of_EFT);
		
		click(pom.getEntityEFTInformationPage().getAccount_type());
		Thread.sleep(2000);
		click(pom.getEntityEFTInformationPage().getSavings());
		sendkeys(pom.getEntityEFTInformationPage().getStart_date(), Start_Date);

	
		Thread.sleep(2000);
		
		actionClick(pom.getEntityInformationPage().getNext());
	   
	  
	   
	   
	}
	
	
	
	
}
