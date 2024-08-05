package com.StepDefinitions.LICENSE.Trading_Partner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Trading_Partner.*;

public class TP_01_Identifying_Information_Steps {
	
	
	public PageObjectManager pom;
	public TP_01_Identifying_Information_Steps() {
		pom=new PageObjectManager();
	}
	
	
	
	@Given("user in the Home page and also navigate to Trading partner page")
	public void user_in_the_Home_page_and_also_navigate_to_Trading_partner_page() {
	   
		pom.getTP_01_Identifying_Information_Page().clicking_Trading_partner_tab();
		
		
		
	}

	@When("^Enter all the vaild credential for a Identifying Information section by using from Sheet (.+) and row (.+)$")
	public void enter_all_the_vaild_credential_for_a_Identifying_Information_section_by_using_from_Sheet_Trading_partner_and_row(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		
		pom.getTP_01_Identifying_Information_Page().Demographic_Information(sheetName, rowNum);
		
		pom.getTP_01_Identifying_Information_Page().Address_Information(sheetName, rowNum);
		
		pom.getTP_01_Identifying_Information_Page().click_addline_and_fill_the_data_and_save(sheetName, rowNum);
	
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
	}


}
