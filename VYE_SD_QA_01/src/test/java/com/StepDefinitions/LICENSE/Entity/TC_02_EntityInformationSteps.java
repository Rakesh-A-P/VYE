package com.StepDefinitions.LICENSE.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageObjectManager.Entity.*;
import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_02_EntityInformationSteps extends BaseUtilClass {
	 JavascriptExecutor js = (JavascriptExecutor) driver; 
	 public PageObjectManager pom;
		public meddataform_DB DB;
		public Excelreader excell;
		public TC_02_EntityInformationSteps() {
			 pom = new PageObjectManager();
			 DB=new meddataform_DB();
			 excell=new Excelreader();
		}
	
	@Given("User is in Identifying Information Section")
	public void user_is_in_Identifying_Information_Section() {
	try {
		scrollToViewelement(pom.getEntityInformationPage().getEntity_enrollment());
		
		actionClick(pom.getEntityInformationPage().getEntity_enrollment());
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
	
	@When("^User Goes to Provider Identifier information Section from Sheet (.+) and row (.+) and Option (.+)$")
	public void user_Goes_to_Provider_Identifier_Section_from_Sheet_Invaild_data_for_individual_and_row_and_Option_yes(String sheetName , int rowNum,  String Options) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {

		  List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		
		
		  String Email = testdata.get(rowNum).get("Application Contact Email");
          String Reson_data = testdata.get(rowNum).get("Reson data");
          String Website = testdata.get(rowNum).get("Website");
          String Month = testdata.get(rowNum).get("Month");
          String Date = testdata.get(rowNum).get("Date");
          String Provider_name= DB.getBusiness_name().get(0);
	      String SSN= DB.getSsnP().get(0);
          String NPI= DB.getNpiP().get(0);
          String Enrollment_Date = testdata.get(rowNum).get("Enrollment Date");
        
        
	waitForElementToVisibile(driver, 20, pom.getEntityInformationPage().getRequested_Enrollment_Date());

	sendkeys(pom.getEntityInformationPage().getRequested_Enrollment_Date(), Enrollment_Date);
	Thread.sleep(1000);
    sendkeys(pom.getEntityInformationPage().getReason_Code(), Reson_data);
    javascriptactionClick(waitForElementToClickableExplicitly(driver, 10, pom.getEntityOwnershipPage().getDropdown_click_first()));
	sendkeys(pom.getEntityInformationPage().getProvider_Name(), Provider_name);
	sendkeys(pom.getEntityInformationPage().getFEIN_Number(), SSN);
	sendkeys(pom.getEntityInformationPage().getBusiness_name(), Provider_name);
	sendkeys(pom.getEntityInformationPage().getEmail(), Email);
    
		
	     scrollToViewelement(pom.getEntityInformationPage().getYes_DBA_Name());

		pom.getEntityInformationPage().SelectQuestionDBA_Name(Options);
		sendkeys(pom.getEntityInformationPage().getFormer_DBA_Name(), Provider_name);

		scrollToViewelement(pom.getEntityInformationPage().getYes_FEIN());

       pom.getEntityInformationPage().SelectQuestionFEIN(Options);

       scrollToViewelement(pom.getEntityInformationPage().getPrior_Provider_name());

        sendkeys(pom.getEntityInformationPage().getPrior_Provider_name(), Provider_name);

        sendkeys(pom.getEntityInformationPage().getPrior_FEIN(), SSN);
        sendkeys(pom.getEntityInformationPage().getPrior_npi(), NPI);
        sendkeys(pom.getEntityInformationPage().getWebsite_Address(), Website);

        scrollToViewelement(pom.getEntityInformationPage().getProfit_Status());
        Thread.sleep(2000);
        actionClick(pom.getEntityInformationPage().getProfit_Status());
        Thread.sleep(2000);
        actionClick(pom.getEntityInformationPage().getGovernment());

        pom.getEntityInformationPage().SelectQuestioNTax(Options);
        sendkeys(pom.getEntityInformationPage().getMonth(), Month);
        
        sendkeys(pom.getEntityInformationPage().getDate(), Date);

	

        scrollToViewelement(pom.getEntityInformationPage().getNext());

		click(pom.getEntityInformationPage().getNext());
		
	
	}
	

}
