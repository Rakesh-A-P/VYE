package com.Pages.TP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Excelreader;
import Utilities.BaseUtilClass;

public class TP_01_Identifying_Information_Page extends BaseUtilClass {
	public Excelreader excell;
	public TP_01_Identifying_Information_Page() {
		PageFactory.initElements(driver, this);
		excell=new Excelreader();
	}
	
	@FindBy(xpath = "//h2[.='Trading Partner (TP) Enrollment']")
	private WebElement Trading_Partner_tab;
	
	public WebElement getTrading_Partner_tab() {
		return Trading_Partner_tab;
	}

	@FindBy(xpath = "//input[@aria-label='Legal Business Name']")////input[@aria-label='Legal Business Name']
	private WebElement Legal_Business_Name;
	@FindBy(xpath="//input[@aria-label='DBA (Doing Business As)']")
    private WebElement Doing_Business_As;
	@FindBy(xpath="//input[@placeholder='__-_______']")
	private WebElement FEIN_NUMBER;
	@FindBy(xpath="//input[@aria-label='Website Address']")
	private WebElement Website_Address;
	@FindBy(xpath="//input[@aria-label='Application Contact Email']")
	private WebElement Application_Contact_Email;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement address_line;
	@FindBy(xpath="//span[.='+ Add Line']")
	private WebElement Add_Line_button;
	@FindBy(xpath="//input[contains(@id,' Phone Type')]/..//div[@role='button']")
	private WebElement Phone_Type;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement drop_down_first;
	public WebElement getDrop_down_first() {
		return drop_down_first;
	}

	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement drop_down_second;
	@FindBy(xpath="//input[contains(@id,'Value')]")
	private WebElement Value;
	@FindBy(xpath="//span[.='Save']")
	private WebElement Save;
	@FindBy(xpath="//span[.='Next']")
	private WebElement Next;
	public WebElement getLegal_Business_Name() {
		return Legal_Business_Name;
	}
	public WebElement getDoing_Business_As() {
		return Doing_Business_As;
	}
	public WebElement getFEIN_NUMBER() {
		return FEIN_NUMBER;
	}
	public WebElement getWebsite_Address() {
		return Website_Address;
	}
	public WebElement getApplication_Contact_Email() {
		return Application_Contact_Email;
	}
	public WebElement getAddress_line() {
		return address_line;
	}
	public WebElement getAdd_Line_button() {
		return Add_Line_button;
	}
	public WebElement getPhone_Type() {
		return Phone_Type;
	}
	public WebElement getDrop_down_second() {
		return drop_down_second;
	}
	public WebElement getValue() {
		return Value;
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getNext() {
		return Next;
	}
	
	public void clicking_Trading_partner_tab() {
		
		actionClick(getTrading_Partner_tab());

	}
	
	
    public void Demographic_Information(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
		
		 List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String Business_name = testdata.get(rowNum).get("Business name");
        String FEIN_Number = testdata.get(rowNum).get("FEIN Number");
        String Website_Address = testdata.get(rowNum).get("Website Address");
        String Contact_Email = testdata.get(rowNum).get("Application Contact Email");
        

        Thread.sleep(8000);
        waitForElementToVisibile(driver, 30, getLegal_Business_Name());
	    sendkeys(getLegal_Business_Name(), Business_name);
	sendkeys(getDoing_Business_As(), Business_name);
	    sendkeys(getFEIN_NUMBER(), FEIN_Number);
		sendkeys(getWebsite_Address(), Website_Address);
		sendkeys(getApplication_Contact_Email(), Contact_Email);
	 }
    
      public void Address_Information(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
    	  List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String address= testdata.get(rowNum).get("address");
		
		  
		  sendkeys(getAddress_line(), address);
		Thread.sleep(2000);
		actionClick(getDrop_down_first());
	 }
    
      public void click_addline_and_fill_the_data_and_save(String sheetName , int rowNum) throws InterruptedException, InvalidFormatException, FileNotFoundException, IOException {
    	  List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		  String Value= testdata.get(rowNum).get("Value");
		  
		  
		  
  		actionClick(getAdd_Line_button());
  		actionClick(getPhone_Type());
  		actionClick(getDrop_down_second());
  		sendkeys(getValue(), Value);
  		
  		actionClick(getSave());
  		Thread.sleep(1000);
  		
  		
  		
  		
  	 }
      public void Next_Button_Click() {
    	  actionClick(getNext());
      }
      
	
	
	
}
