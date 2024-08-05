package com.StepDefinitions.LICENSE.Trading_Partner;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.And;

public class TP_05_Key_Personal_Steps {
	
		public PageObjectManager pom;
		public TP_05_Key_Personal_Steps() {
			pom=new PageObjectManager();
		}
		
	
	
	
	
	
	@And("^Fill the all the data for Keypersonal scetion by using from Sheet (.+) and row (.+)$")
	public void fill_the_all_the_data_for_Keypersonal_scetion_by_using_from_Sheet_Trading_Partner_and_row(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	   
		pom.getTP_05_KeyPersonal_Page().Key_Personal_tab();
		
		pom.getTP_05_KeyPersonal_Page().Key_personal(sheetName, rowNum);
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
		
	}

}
