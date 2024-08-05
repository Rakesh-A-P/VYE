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

public class TP_11_Summary_Page  extends BaseUtilClass{
	public Excelreader excell;
	public TP_11_Summary_Page() {
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	@FindBy(xpath="(//span[.='Summary'])[2]")
	private WebElement Summary_tab;
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement First_Name;
	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement Last_Name;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath="//span[.='Back']")
	private WebElement Back;
	@FindBy(xpath="//span[.='SUBMIT']")
	private WebElement Submit;
	@FindBy(xpath="//span[.='Navigate to dashboard']")
	private WebElement Navigate_to_dashboard_button;
	
	
	public WebElement getNavigate_to_dashboard_button() {
		return Navigate_to_dashboard_button;
	}
	public WebElement getSummary_tab() {
		return Summary_tab;
	}
	public WebElement getFirst_Name() {
		return First_Name;
	}
	public WebElement getLast_Name() {
		return Last_Name;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getBack() {
		return Back;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
	public void Summary_tab_click() throws InterruptedException {
		Thread.sleep(10000);
		scrollToViewelement(getSummary_tab());
		Thread.sleep(1000);
		actionClick(getSummary_tab());
		Thread.sleep(2000);

	}
	
	public void Fill_the_Summary(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
       List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
	      

	              String First_name = testdata.get(rowNum).get("First Name *");
	              String Last_name = testdata.get(rowNum).get("Last Name *");
               
		Thread.sleep(2000);
		sendkeys(getFirst_Name(), First_name);
		sendkeys(getLast_Name(), Last_name);
		Thread.sleep(2000);
		actionClick(getCheckbox());
		

		
		Thread.sleep(2000);
		scrollToViewelement(getSubmit());
		Thread.sleep(2000);
		actionClick(getSubmit());
		Thread.sleep(8000);
		
		actionClick(getNavigate_to_dashboard_button());
		
	}

}
