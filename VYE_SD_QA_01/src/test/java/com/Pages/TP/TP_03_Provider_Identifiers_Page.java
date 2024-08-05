package com.Pages.TP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;
import Utilities.Excelreader;

public class TP_03_Provider_Identifiers_Page extends BaseUtilClass {
	public Excelreader excell;
	public TP_03_Provider_Identifiers_Page() {
		
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	@FindBy(xpath="//input[@type='radio' and @value='true']")
	private WebElement Yes_NPI_radio_button;
	@FindBy(xpath="//input[@type='radio' and @value='false']")
	private WebElement No_NPI_radio_button;
	@FindBy(xpath="//input[contains(@id, 'NPI Number')]")
	private WebElement NPI_Number;
	public Excelreader getExcell() {
		return excell;
	}
	public WebElement getYes_NPI_radio_button() {
		return Yes_NPI_radio_button;
	}
	public WebElement getNo_NPI_radio_button() {
		return No_NPI_radio_button;
	}
	public WebElement getNPI_Number() {
		return NPI_Number;
	}
	public void SelectNPI_question(String NPIOption) throws InterruptedException
    {
	   SelectRadioButton(NPIOption, getYes_NPI_radio_button(), getNo_NPI_radio_button(), "NPI provider");
    }
	
	
	public void NPI_details(String sheetName , int rowNum, String NPIOption) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		 List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String Npi_Number= testdata.get(rowNum).get("Npi Number");
		Thread.sleep(2000);
		SelectNPI_question(NPIOption);
		
		sendkeys(getNPI_Number(), Npi_Number);
		
	}
	

}
