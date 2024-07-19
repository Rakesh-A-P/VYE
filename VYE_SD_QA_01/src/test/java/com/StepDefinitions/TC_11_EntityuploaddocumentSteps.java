package com.StepDefinitions;

import com.PageObjectManager.PageObjectManager;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;

public class TC_11_EntityuploaddocumentSteps extends BaseUtilClass{
     
	public PageObjectManager pom; 
	public TC_11_EntityuploaddocumentSteps() {
		pom=new PageObjectManager();
	}

	
	@Then("^Goes to Upload Docuements and Uploads Spesific Files")
	public void goes_to_Upload_Docuements_and_Uploads_Spesific_Files() throws InterruptedException {
	
	
		Thread.sleep(5000);
		scrollToViewelement(pom.getEntityuploadphotoPage().getUpload_Documents_tab());
		Thread.sleep(5000);
		actionClick(pom.getEntityuploadphotoPage().getUpload_Documents_tab());
		Thread.sleep(2000);
		


	
		String filepath="D:\\VYE\\upload.png";

	
		Thread.sleep(5000);
		
		pom.getEntityuploadphotoPage().getUpload_Files_button1().sendKeys(filepath);
		
		Thread.sleep(5000);
		
		
			try {
				Thread.sleep(5000);
				
				pom.getEntityuploadphotoPage().getUpload_Files_button2().sendKeys(filepath);
				
				Thread.sleep(5000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		
		
	
		Thread.sleep(2000);
		scrollToViewelement(pom.getEntityuploadphotoPage().getNext());
		Thread.sleep(2000);
		actionClick(pom.getEntityuploadphotoPage().getNext());
		
	

	
}}

