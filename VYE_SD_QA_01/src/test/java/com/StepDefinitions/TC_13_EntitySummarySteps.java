package com.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.PageObjectManager;

import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;

public class TC_13_EntitySummarySteps extends BaseUtilClass
{    
	public PageObjectManager pom;
	public meddataform_DB DB;
	public Excelreader excell;
	public TC_13_EntitySummarySteps() {
		 pom = new PageObjectManager();
		 DB=new meddataform_DB();
		 excell=new Excelreader();
	}

	@Then("^User Fills the Summary Details and Submit from Sheet (.+) and row (.+)$")
	public void user_Fills_the_Summary_Details_and_Submit_from_Sheet_Invaild_data_for_individual_and(String sheetName, int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	   
	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
	      
	
		Thread.sleep(5000);
		scrollToViewelement(pom.getEntitySummaryPage().getSummary_tab());
		Thread.sleep(5000);
		actionClick(pom.getEntitySummaryPage().getSummary_tab());
		Thread.sleep(2000);
	  



	                 String First_name = testdata.get(rowNum).get("First Name");
	                 String Last_name = testdata.get(rowNum).get("Last Name");
//	                 String First_NameDB= DB.getFirst_name().get(0);
//	    			 String Last_NameDB= DB.getLast_name().get(0);
	                 
		Thread.sleep(2000);
		sendkeys(pom.getEntitySummaryPage().getFirst_Name(), First_name);
		sendkeys(pom.getEntitySummaryPage().getLast_Name(), Last_name);
		Thread.sleep(2000);
		actionClick(pom.getEntitySummaryPage().getCheckbox());
	
//		Thread.sleep(2000);
//		sendkeys(pom.getEntitySummaryPage().getFirst_Name(), First_NameDB);
//		sendkeys(pom.getEntitySummaryPage().getLast_Name(), Last_NameDB);
//		Thread.sleep(2000);
//		actionClick(pom.getEntitySummaryPage().getCheckbox());
	
		Thread.sleep(2000);
		scrollToViewelement(pom.getEntitySummaryPage().getSubmit());
		Thread.sleep(2000);
		actionClick(pom.getEntitySummaryPage().getSubmit());
		Thread.sleep(6000);
		actionClick(pom.getEntitySummaryPage().getNavigate_to_dashboard_button());
		
	
}}
