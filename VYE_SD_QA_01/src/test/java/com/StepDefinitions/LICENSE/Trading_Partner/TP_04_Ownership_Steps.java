package com.StepDefinitions.LICENSE.Trading_Partner;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import io.cucumber.java.en.And;

public class TP_04_Ownership_Steps {
	public PageObjectManager pom;
	public TP_04_Ownership_Steps() {
		pom=new PageObjectManager();
	}
	
	
	@And("^Fill the all the data for Ownership scetion by using from Sheet (.+) and row (.+) and option (.+)$")
	public void fill_the_all_the_data_for_Ownership_scetion_by_using_from_Sheet_Trading_Partner_and_row_and_option_Option(String sheetName , int rowNum, String OwnershipOption) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
	 
		pom.getTP_04_Ownership_Page().Ownership_tab_click();
		
		pom.getTP_04_Ownership_Page().Select_Question_no_01_click_radion_button(OwnershipOption);
		
		pom.getTP_04_Ownership_Page().fill_the_ownership_question1(sheetName, rowNum);
		
		pom.getTP_04_Ownership_Page().Select_Question_no_02_click_radion_button(OwnershipOption);
		
		pom.getTP_04_Ownership_Page().fill_the_ownership_question2(sheetName, rowNum);
		
		Thread.sleep(2000);
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
	
	}


}
