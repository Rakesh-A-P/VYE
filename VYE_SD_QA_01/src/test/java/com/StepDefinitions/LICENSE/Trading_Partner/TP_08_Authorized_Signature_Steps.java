package com.StepDefinitions.LICENSE.Trading_Partner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_08_Authorized_Signature_Steps {
	public PageObjectManager pom;
	public TP_08_Authorized_Signature_Steps() {
		pom=new PageObjectManager();
	}
	@Then("^Enter all the data into Authorized Signature section by using from Sheet (.+) and row (.+)$")
	public void enter_all_the_data_into_Authorized_Signature_section_by_using_from_Sheet_Trading_Partner_and_row(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
	    
		pom.getTP_08_Authorized_Signature_Page().Authorized_Signature_tab_click();
		
		pom.getTP_08_Authorized_Signature_Page().fill_the_data_Authorized_Signature(sheetName, rowNum);
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
	}

	
	
	
	
}
