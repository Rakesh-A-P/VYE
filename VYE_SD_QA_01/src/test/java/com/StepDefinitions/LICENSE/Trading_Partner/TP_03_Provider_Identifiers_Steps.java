package com.StepDefinitions.LICENSE.Trading_Partner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_03_Provider_Identifiers_Steps {

	public PageObjectManager pom;
	public TP_03_Provider_Identifiers_Steps() {
		pom=new PageObjectManager();
	}
	
	
	@Then("^Enter the Npi credential for provider Identifiers section by using from Sheet (.+) and row (.+) and Npi option (.+)$")
	public void enter_the_Npi_credential_for_provider_Identifiers_section_by_using_from_Sheet_Trading_Partner_and_row_and_Npi_option_yes(String sheetName , int rowNum, String NPIOption) throws InvalidFormatException, FileNotFoundException, InterruptedException, IOException {
	  
		pom.getTP_03_Provider_Identifiers_Page().NPI_details(sheetName, rowNum, NPIOption);
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
	}

	
	
}
