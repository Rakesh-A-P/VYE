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

public class TP_08_Authorized_Signature_Page extends BaseUtilClass {

	public Excelreader excell;
	public TP_08_Authorized_Signature_Page() {
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	
	@FindBy(xpath="//div[contains(@data-for,'Name of Authorized Individual')]//input[@type='text']")
	private WebElement Name_of_Authorized_Individual;
	@FindBy(xpath="//div[contains(@data-for,'Title of Person Submitting')]//input[@type='text']")
	private WebElement Title_of_Person_Submitting;
	@FindBy(xpath="(//span[.='Authorized Signature'])[2]")
	private WebElement Authorized_Signature_tab;
	public WebElement getName_of_Authorized_Individual() {
		return Name_of_Authorized_Individual;
	}
	public WebElement getTitle_of_Person_Submitting() {
		return Title_of_Person_Submitting;
	}
	public WebElement getAuthorized_Signature_tab() {
		return Authorized_Signature_tab;
	}
	
	public void Authorized_Signature_tab_click() throws InterruptedException {
		scrollToViewelement(getAuthorized_Signature_tab());
		Thread.sleep(1000);
		actionClick(getAuthorized_Signature_tab());
		Thread.sleep(2000);
	}
	
	public void fill_the_data_Authorized_Signature(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		 List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String Name_of_Authorized= testdata.get(rowNum).get("Name of Authorized Individual");
		  String Title_of_Person= testdata.get(rowNum).get("Title of Person");
	
		  sendkeys(getName_of_Authorized_Individual(), Name_of_Authorized);
		  
		  sendkeys(getTitle_of_Person_Submitting(), Title_of_Person);
		
	}
	
}
