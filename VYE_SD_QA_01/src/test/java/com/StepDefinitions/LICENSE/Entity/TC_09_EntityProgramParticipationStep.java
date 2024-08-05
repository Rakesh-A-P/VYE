package com.StepDefinitions.LICENSE.Entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.PageObjectManager.Entity.*;

import ExcelData.Ind_LICENSE_Data_Fetch;
import ExcelData.meddataform_DB;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.Then;


public class TC_09_EntityProgramParticipationStep extends BaseUtilClass {
	
	public meddataform_DB DB;
	public PageObjectManager pom;
	public Excelreader excell;
	public TC_09_EntityProgramParticipationStep() {
	 DB=new meddataform_DB();
	 pom = new PageObjectManager();
	 excell=new Excelreader();
	  
	}

	  @Then("^User Goes to Program Participation Section from Sheet (.+) and row (.+)$")
	  public void user_Goes_to_Program_Participation_Section_from_Sheet_Invaild_data_for_individual_and_row(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		
		  Thread.sleep(8000);
//			WebElement data1 = driver.findElement(By.xpath("(//span[.='Program Participation / Taxonomy / License / Certificate Information'])[2]"));
//			Thread.sleep(5000);
			scrollToViewelement(pom.getEntityProgramParticipationPage().getProgram_Participation_tab());
			Thread.sleep(5000);
			actionClick(pom.getEntityProgramParticipationPage().getProgram_Participation_tab());
			//actionClick(driver.findElement(By.xpath("(//span[.='Program Participation / Taxonomy / License / Certificate Information'])[2]")));

		
			List<Map<String,String>>  testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		   String Speciality= testdata.get(rowNum).get("Speciality");
		   System.out.println("Taxonomy from Excel="+Speciality);
		   
		   Ind_LICENSE_Data_Fetch ob= new Ind_LICENSE_Data_Fetch(Speciality);
		   ob.LicenseFromDB();
		   
		   scrollBottom(driver);
		   Thread.sleep(3000);
		   actionClick(pom.getEntityInformationPage().getNext());
   		   Thread.sleep(3000);
		  
		  
		  
		  
	  }

	
	
}
