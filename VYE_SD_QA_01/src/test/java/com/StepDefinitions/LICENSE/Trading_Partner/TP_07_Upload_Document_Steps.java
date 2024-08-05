package com.StepDefinitions.LICENSE.Trading_Partner;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.And;

public class TP_07_Upload_Document_Steps  extends BaseUtilClass{

	public PageObjectManager pom;
	public TP_07_Upload_Document_Steps() {
		pom=new PageObjectManager();
	}
	
	
	
	
	@And("Goes to Upload Docuements for Trading Partner and Uploads Spesific Files")
	public void goes_to_Upload_Docuements_for_Trading_Partner_and_Uploads_Spesific_Files() throws FileNotFoundException, IOException, InterruptedException {
		
		pom.getTP_07_Upload_Document_page().Upload_Documents_tab_click();
		
		pom.getTP_07_Upload_Document_page().upload_file_into_upload_button();
		
		pom.getTP_01_Identifying_Information_Page().Next_Button_Click();
		
	}


}
