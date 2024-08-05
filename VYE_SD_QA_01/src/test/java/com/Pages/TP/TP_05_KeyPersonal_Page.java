package com.Pages.TP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectManager.Trading_Partner.PageObjectManager;

import Utilities.BaseUtilClass;
import Utilities.Excelreader;

public class TP_05_KeyPersonal_Page extends BaseUtilClass {
	public PageObjectManager pom;
	public Excelreader excell;
	public TP_05_KeyPersonal_Page() {
		
	PageFactory.initElements(driver, this);
    pom=new PageObjectManager();
	excell=new Excelreader();
	}
	@FindBy(xpath="(//span[.='Key Personnel'])[2]")
	private WebElement Key_personal_tab;
	@FindBy(xpath="//span[.='+ Add Line']")
	private WebElement Add_line_keypersonal;
	@FindBy(xpath="//label[contains(@for,'Managing Employee Type')]/..//div[@role='button']")
	private WebElement Managing_Employee_Type;
	@FindBy(xpath="//label[contains(@for,'Employee Status')]/..//div[@role='button']")
	private WebElement Employee_Status;
	@FindBy(xpath="//div/label[contains(@for,'State of Birth')]/..//div[@role='button']")
	private WebElement State_of_Birth;
	@FindBy(xpath="//div/label[contains(@for,'Country of Birth')]/..//div[@role='button']")
	private WebElement Country_of_Birth;
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement First_Name;
	@FindBy(xpath="//input[@aria-label='Middle Name']")
	private WebElement Middle_Name;
	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement Last_Name;
	@FindBy(xpath="//INPUT[@placeholder='___-__-____']")
	private WebElement SSN;
	@FindBy(xpath="//div[@data-for='Date of Birth']//INPUT[@placeholder='MM/DD/YYYY']")
	private WebElement Date_of_Birth;
	@FindBy(xpath="//div[@data-for='Effective Start Date']//INPUT[@placeholder='MM/DD/YYYY']")
	private WebElement Effective_Start_Date;
	@FindBy(xpath="//div[@data-for='End Date']//INPUT[@placeholder='MM/DD/YYYY']")
	private WebElement End_date;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Address_line;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement drop_down_first;
	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement drop_down_second;
	@FindBy(xpath="//span[.='Save']")
	private WebElement Save;
	public Excelreader getExcell() {
		return excell;
	}
	public WebElement getKey_personal_tab() {
		return Key_personal_tab;
	}
	public WebElement getAdd_line_keypersonal() {
		return Add_line_keypersonal;
	}
	public WebElement getManaging_Employee_Type() {
		return Managing_Employee_Type;
	}
	public WebElement getEmployee_Status() {
		return Employee_Status;
	}
	public WebElement getState_of_Birth() {
		return State_of_Birth;
	}
	public WebElement getCountry_of_Birth() {
		return Country_of_Birth;
	}
	public WebElement getFirst_Name() {
		return First_Name;
	}
	public WebElement getMiddle_Name() {
		return Middle_Name;
	}
	public WebElement getLast_Name() {
		return Last_Name;
	}
	public WebElement getSSN() {
		return SSN;
	}
	public WebElement getDate_of_Birth() {
		return Date_of_Birth;
	}
	public WebElement getEffective_Start_Date() {
		return Effective_Start_Date;
	}
	public WebElement getEnd_date() {
		return End_date;
	}
	public WebElement getAddress_line() {
		return Address_line;
	}
	public WebElement getDrop_down_first() {
		return drop_down_first;
	}
	public WebElement getDrop_down_second() {
		return drop_down_second;
	}
	public WebElement getSave() {
		return Save;
	}
	 private ArrayList datalist;
    @FindBy(xpath="//li[@role='option']")
    private List<WebElement> dropdownlist;
    public List<WebElement> getDropdownlist() {
		return dropdownlist;
	}
	 public WebElement dropdownkeyper_Managing_Employee_Type(String Managing_Employee_Type) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) getDropdownlist();
			 datalist = new ArrayList<>();
			 
			System.out.println("Size is="+dropdownlist.size());
			for(int i=1;i<dropdownlist.size();i++) {
				//System.out.println(dropdownlist.get(i).getText());
				System.out.println(dropdownlist.get(i).getText()+"===="+Managing_Employee_Type);
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Managing_Employee_Type)) {
					element= dropdownlist.get(i);
					System.out.println("Element Text inside For Loop="+element.getText());
					break;
				}
				//System.out.println("Element Text="+element.getText());
				
				
			}
			return element;	
			
			
		}
	 
	 public WebElement dropdownkeyper_Employee_Status(String Employee_Status) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
	
			List<WebElement> dropdownlist=  (List<WebElement>) getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Employee_Status)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownkeyper_State_of_Birth(String state_of_birth) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(state_of_birth)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}
	 public WebElement dropdownkeyper_Country_of_Birth(String Country_of_Birth) throws InvalidFormatException, IOException {
			
		 WebElement element=null;
			List<WebElement> dropdownlist=  (List<WebElement>) getDropdownlist();
			 datalist = new ArrayList<>();
			for(int i=0;i<dropdownlist.size();i++) {
				if(dropdownlist.get(i).getText().equalsIgnoreCase(Country_of_Birth)) {
					element= dropdownlist.get(i);
					break;
				}
			}
			return element;	
			
		}

	 public void Key_Personal_tab() throws InterruptedException {
			Thread.sleep(1000);
		 scrollToViewelement(getKey_personal_tab());
			actionClick(getKey_personal_tab());
			Thread.sleep(1000);
		 
	 }
	 
	
	
	public void Key_personal(String sheetName , int rowNum) throws InvalidFormatException, FileNotFoundException, IOException, InterruptedException {
   List<Map<String,String>> testdata= excell.getData(getPropertyFileValue("Excell"), sheetName);
		
		for(int i=0;i<5;i++)
		{
			
		Map<String, String> rowData =testdata.get(i);

	    String Managing_Employee_Type = rowData.get("Managing Employee Type");
		String Employee_Status= rowData.get("Employee Status");
		String Country_of_Birth = rowData.get("Country of Birth");
		String state_of_birth =rowData.get("state of birth *");
		String address = rowData.get("address");
		String First_Name = rowData.get("First Name *");
		String Middle_Name = rowData.get("Middle Name");
		String Last_Name = rowData.get("Last Name *");
		String SSN = rowData.get("SSN *");
		String Date_of_birth = rowData.get("Date_of_birth");
		String Effective_date = rowData.get("Effective date");
		String end_date = rowData.get("end date");
		   Thread.sleep(1000);
		  scrollToViewelement(getAdd_line_keypersonal());
		     actionClick(getAdd_line_keypersonal());
			
			scrollToViewelement(getManaging_Employee_Type());
			Thread.sleep(1000);
			actionClick(getManaging_Employee_Type());
			
			actionClick(dropdownkeyper_Managing_Employee_Type(Managing_Employee_Type));
			Thread.sleep(1000);
			actionClick(getEmployee_Status());
			
			actionClick(dropdownkeyper_Employee_Status(Employee_Status));
			
			sendkeys(getFirst_Name(), First_Name);
			sendkeys(getMiddle_Name(), Middle_Name);
			sendkeys(getLast_Name(), Last_Name);
			sendkeys(getSSN(), SSN);
			sendkeys(getDate_of_Birth(), Date_of_birth);
			actionClick(getState_of_Birth());
			 Thread.sleep(1000);
//			scrollToViewelement(dropdownkeyper_State_of_Birth(state_of_birth));
		try {
			actionClick(dropdownkeyper_State_of_Birth(state_of_birth));
		} catch (Exception e) {
			actionClick(getDrop_down_second());
		}
			

			 scrollToViewelement(getCountry_of_Birth());
			 Thread.sleep(1000);
			actionClick(getCountry_of_Birth());
			
			actionClick(dropdownkeyper_Country_of_Birth(Country_of_Birth));
			sendkeys(getEffective_Start_Date(), Effective_date);
			sendkeys(getEnd_date(), end_date);
			
			sendkeys(getAddress_line(), address);
			 
			    scrollBy(driver, 100);
				Thread.sleep(2000);
				actionClick(getDrop_down_first());
			
				Thread.sleep(1000);
				actionClick(getSave());
		
		
		
		}
		
		
		
		
		
	}
	
}
