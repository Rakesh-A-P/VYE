package com.StepDefinitions.LICENSE.Trading_Partner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.FindBy;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.And;

public class TP_02_Classification_Steps {
	
	public PageObjectManager pom;
	public TP_02_Classification_Steps() {
		pom=new PageObjectManager();
	}
	@And("^Enter all the vaild credential for Classification section by using from Sheet (.+) and row (.+)$")
	public void enter_all_the_vaild_credential_for_Classification_section_by_using_from_Sheet_Trading_Partner_and_row(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
	   
		
		pom.getTP_02_Classification_Page().please_select_one_classification_radio_buttuon();
		
		pom.getTP_02_Classification_Page().Software_Vendor_Details(sheetName, rowNum);
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
	}


}
