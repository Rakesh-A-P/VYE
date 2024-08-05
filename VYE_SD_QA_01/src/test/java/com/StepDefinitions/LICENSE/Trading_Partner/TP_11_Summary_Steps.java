package com.StepDefinitions.LICENSE.Trading_Partner;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.Then;

public class TP_11_Summary_Steps {
	
	public PageObjectManager pom;
	public TP_11_Summary_Steps() {
		pom=new PageObjectManager();
	}
	@Then("^User Fills the Trading partner Summary Details and Submit from Sheet (.+) and row (.+)$")
	public void user_Fills_the_Trading_partner_Summary_Details_and_Submit_from_Sheet_Trading_Partner_and_row(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		
		
		pom.getTP_11_Summary_Page().Summary_tab_click();
		
		pom.getTP_11_Summary_Page().Fill_the_Summary(sheetName, rowNum);
		
		
		
	}

	
	
}
