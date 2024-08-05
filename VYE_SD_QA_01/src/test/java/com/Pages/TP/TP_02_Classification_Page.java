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

public class TP_02_Classification_Page extends BaseUtilClass {
	public Excelreader excell; 
	public TP_02_Classification_Page() {
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	
	@FindBy(xpath = "//input[@type='radio' and @value='Clearinghouse']")
	private WebElement Clearinghouse_radio_button;
	@FindBy(xpath = "//input[@aria-label='Software Vendor Name']")
	private WebElement Software_Vendor_Name;
	@FindBy(xpath = "//input[@aria-label='Software Name']")
	private WebElement Software_Name;
	@FindBy(xpath = "//input[@aria-label='Version ID' and @type='text']")
	private WebElement Version_ID;
	@FindBy(xpath = "//input[@name='Entity Code']")
	private WebElement Entity_Code;
	@FindBy(xpath = "(//li[@role='option'])[1]")
	private WebElement drop_down_first;
	@FindBy(xpath="//span[.='Next']")
	private WebElement Next;
	

	public WebElement getClearinghouse_radio_button() {
		return Clearinghouse_radio_button;
	}

	public WebElement getSoftware_Vendor_Name() {
		return Software_Vendor_Name;
	}

	public WebElement getSoftware_Name() {
		return Software_Name;
	}

	public WebElement getVersion_ID() {
		return Version_ID;
	}

	public WebElement getEntity_Code() {
		return Entity_Code;
	}

	public WebElement getDrop_down_first() {
		return drop_down_first;
	}

	public WebElement getNext() {
		return Next;
	}
	
	
	public void please_select_one_classification_radio_buttuon() throws InterruptedException {
		Thread.sleep(2000);
		actionClick(getClearinghouse_radio_button());
	}
	
	public void Software_Vendor_Details(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
		 List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String Software_Vendor_Name= testdata.get(rowNum).get("Software Vendor Name");
		  String Software_Name= testdata.get(rowNum).get("Software Name");
		  String Version_ID= testdata.get(rowNum).get("Version ID");
		  String Entity_Code= testdata.get(rowNum).get("Entity Code");
		  
		
		  sendkeys(getSoftware_Vendor_Name(), Software_Vendor_Name);
		  sendkeys(getSoftware_Name(), Software_Name);
			
		  sendkeys(getVersion_ID(), Version_ID);
		  Thread.sleep(1000);
			scrollToViewelement(getEntity_Code());
		  sendkeys(getEntity_Code(), Entity_Code);
		  Thread.sleep(2000);
		  
		  actionClick(getDrop_down_first());
		
		
		
	}

	
	
	
	
	
	

}
