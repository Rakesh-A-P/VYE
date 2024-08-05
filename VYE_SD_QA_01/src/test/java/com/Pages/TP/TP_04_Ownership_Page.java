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

public class TP_04_Ownership_Page extends BaseUtilClass{
	public Excelreader excell;
	public TP_04_Ownership_Page() {
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	@FindBy(xpath="(//span[.='Ownership'])[2]")
	private WebElement Ownership_tab;
	@FindBy(xpath="//input[contains(@name, 'had ownership in any') and @value='true']")
	private WebElement Yes_question1;
	@FindBy(xpath="//input[contains(@name, 'had ownership in any') and @value='false']")
	private WebElement No_question1;
	@FindBy(xpath="//input[contains(@name, 'managed, directed') and @value='true']")
	private WebElement Yes_question2;
	@FindBy(xpath="//input[contains(@name, 'managed, directed') and @value='false']")
	private WebElement No_question2;
	@FindBy(xpath="(//span[.='+ Add Line'])[1]")
	private WebElement Add_line_question1;
	@FindBy(xpath="(//span[.='+ Add Line'])[2]")
	private WebElement Add_line_question2;
	@FindBy(xpath="//input[@aria-label='Organization Legal Business Name']")
	private WebElement Organization_Legal_Business_Name;
	@FindBy(xpath="//input[@aria-label='Doing Business as (DBA)']")
	private WebElement Doing_Business;
	@FindBy(xpath="//div[@data-for='Effective Date']//input[@placeholder='MM/DD/YYYY']")
	private WebElement Effective_Date;
	@FindBy(xpath="//div[@data-for='End Date']//input[@placeholder='MM/DD/YYYY']")
	private WebElement End_Date;
	@FindBy(xpath="//div[@label='FEIN']//input[@placeholder='__-_______']")
	private WebElement FEIN;
	@FindBy(xpath="//div/label[contains(@for,'Select Program')]/..//div[@role='button']")
	private WebElement Select_Program;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement drop_down_first;
	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement drop_down_second;
	@FindBy(xpath="//input[@placeholder='__________']")
	private WebElement Npi_Number;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Address_Line;
	@FindBy(xpath="//span[.='Save']")
	private WebElement Save;
	public WebElement getYes_question1() {
		return Yes_question1;
	}
	public WebElement getNo_question1() {
		return No_question1;
	}
	public WebElement getOwnership_tab() {
		return Ownership_tab;
	}
	public WebElement getYes_question2() {
		return Yes_question2;
	}
	public WebElement getNo_question2() {
		return No_question2;
	}
	public WebElement getAdd_line_question1() {
		return Add_line_question1;
	}
	public WebElement getAdd_line_question2() {
		return Add_line_question2;
	}
	public WebElement getOrganization_Legal_Business_Name() {
		return Organization_Legal_Business_Name;
	}
	public WebElement getDoing_Business() {
		return Doing_Business;
	}
	public WebElement getEffective_Date() {
		return Effective_Date;
	}
	public WebElement getEnd_Date() {
		return End_Date;
	}
	public WebElement getFEIN() {
		return FEIN;
	}
	public WebElement getSelect_Program() {
		return Select_Program;
	}
	public WebElement getDrop_down_first() {
		return drop_down_first;
	}
	public WebElement getDrop_down_second() {
		return drop_down_second;
	}
	public WebElement getNpi_Number() {
		return Npi_Number;
	}
	public WebElement getAddress_Line() {
		return Address_Line;
	}
	public WebElement getSave() {
		return Save;
	}
	public void Ownership_tab_click() throws InterruptedException {
		scrollToViewelement(getOwnership_tab());
		Thread.sleep(1000);
		actionClick(getOwnership_tab());
		 Thread.sleep(1000);
	}
	public void Select_Question_no_01_click_radion_button(String OwnershipOption) throws InterruptedException
    {
	   SelectRadioButton(OwnershipOption, getYes_question1(), getNo_question1(), "Question no 1 for ownership");
	   Thread.sleep(1000);
		 
    }
	
	public void Select_Question_no_02_click_radion_button(String OwnershipOption) throws InterruptedException
    {
	   SelectRadioButton(OwnershipOption, getYes_question2(), getNo_question2(), "Question no 2 ownership");
	   Thread.sleep(1000);
		
    }
	
	
	public void fill_the_ownership_question1(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
	
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		
		for(int i=0;i<5;i++)
		{
			
		Map<String, String> rowData =testdata.get(i);

	    String Legal_Business_Name = rowData.get("Organization Legal Business Name");
		String Effective_Date= rowData.get("Effective Date");
		String End_Date = rowData.get("End Date");
		String FEIN_number =rowData.get("FEIN *");
		String Npi_Number = rowData.get("NPI *");
		String Address = rowData.get("Address line1 *");
		  Thread.sleep(1000);
		  waitForElementToVisibile(driver, 20, getAdd_line_question1());
		  scrollToViewelement(getAdd_line_question1());
		  
		  Thread.sleep(2000);
		  actionClick(getAdd_line_question1());
		  Thread.sleep(1000);
		  sendkeys(getOrganization_Legal_Business_Name(), Legal_Business_Name);
		  sendkeys(getDoing_Business(), Legal_Business_Name);
		  sendkeys(getEffective_Date(), Effective_Date);
		  sendkeys(getEnd_Date(), End_Date);
		  sendkeys(getNpi_Number(), Npi_Number);
		  sendkeys(getFEIN(), FEIN_number);
		  actionClick(getSelect_Program());
		  Thread.sleep(1000);
		  actionClick(getDrop_down_second());
		  sendkeys(getAddress_Line(), Address);
		  //scrollToViewelement(getAddress_Line());
		  Thread.sleep(1000);
		  scrollBy(driver, 150);
		  Thread.sleep(1000);
		  actionClick(getDrop_down_first());
		  Thread.sleep(2000);
		  scrollToViewelement(getSave());
		  actionClick(getSave());
		  
	}
	
	
	}
	public void fill_the_ownership_question2(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
		
		List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		
		for(int i=0;i<5;i++)
		{
			
		Map<String, String> rowData =testdata.get(i);

	    String Legal_Business_Name = rowData.get("Organization Legal Business Name");
		String Effective_Date= rowData.get("Effective Date");
		String End_Date = rowData.get("End Date");
		String FEIN_number =rowData.get("FEIN *");
		String Npi_Number = rowData.get("NPI *");
		String Address = rowData.get("Address line1 *");
		  Thread.sleep(1000);
		  waitForElementToVisibile(driver, 20, getAdd_line_question2());
		  scrollToViewelement(getAdd_line_question2());
		  Thread.sleep(1000);
		  actionClick(getAdd_line_question2());
		  Thread.sleep(1000);
		  sendkeys(getOrganization_Legal_Business_Name(), Legal_Business_Name);
		  sendkeys(getDoing_Business(), Legal_Business_Name);
		  sendkeys(getEffective_Date(), Effective_Date);
		  sendkeys(getEnd_Date(), End_Date);
		  sendkeys(getNpi_Number(), Npi_Number);
		  sendkeys(getFEIN(), FEIN_number);
		  actionClick(getSelect_Program());
		  Thread.sleep(1000);
		  actionClick(getDrop_down_second());
		  sendkeys(getAddress_Line(), Address);
//		  scrollToViewelement(getAddress_Line());
		  Thread.sleep(1000);
		  scrollBy(driver, 150);
		  Thread.sleep(1000);
		  actionClick(getDrop_down_first());
		  Thread.sleep(2000);
		  scrollToViewelement(getSave());
		  actionClick(getSave());
		  
	}
	
	
	}
	
	
	


}
