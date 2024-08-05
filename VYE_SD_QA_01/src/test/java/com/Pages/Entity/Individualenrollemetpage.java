package com.Pages.Entity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjectManager.Entity.*;

import Utilities.BaseUtilClass;

public class Individualenrollemetpage extends BaseUtilClass {
	
	public Individualenrollemetpage() {
		PageFactory.initElements(driver, this);
	}
	
	PageObjectManager pom=new PageObjectManager();
	
// Individual provider
		@FindBy(xpath = "//a[contains(@class ,'dashboard_delete-link')]")
		private WebElement delete;
		@FindBy(xpath = "//span[.='Delete']")
		private WebElement delete1;
		@FindBy(xpath = "//h2[.='Individual Enrollment']")
		private WebElement Individual;

//Identifying Information
//Medicaid Payment
		@FindBy(xpath="(//input[@type='radio'])[position()=2]")
		private WebElement radio;
//General Information
		@FindBy(xpath = "//*[contains(@id,'First Name')]")
		private WebElement FN;
		@FindBy(xpath = "//*[contains(@id, 'Last Name')]")
		private WebElement LN;
		@FindBy(xpath="//*[contains(@id,'Middle Name')]")
		private WebElement MN;
		@FindBy(xpath = "//input[@name='Gender']") ////*[contains(@name,'Gender')]  and //div[@data-for='Gender']
		private WebElement Gender;
		@FindBy(xpath = "//strong[.='Male']")
	     private WebElement Male;
		@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")////input[@name='datepicker']
		private WebElement date;
		@FindBy(xpath = "//input[@name='Country of birth']") ////*[contains(@name, 'Country of birth')]"   
		private WebElement country_birth;                    ////label[.='County of Birth']
		@FindBy(xpath ="//strong[.='Algeria']")
		private WebElement algeria;
		@FindBy(xpath = "//label[@id='State of Birth']")
	    private WebElement state_of_brith;
		@FindBy(xpath = "//input[@placeholder='___-__-____']") ////*[contains(@data-for,'SSN')  and @label='SSN']  //div[@label='SSN']
		private WebElement Ssn;
		@FindBy(xpath = "//input[contains(@id,'Application Contact Email')]")
		private WebElement contact_mail;
		@FindBy(xpath = "//div[@data-for='Profit Status']")
		private WebElement profit_status;
		@FindBy(xpath ="//strong[.='Non-Profit']")
		private WebElement Non_profit;
		@FindBy(xpath = "//span[.='Next']")
		private WebElement Next;
		
		
//Program Participation
		@FindBy(xpath = "//span[.='Next']")
		private WebElement Next1;
		


		
		
//Taxonomy / License / Affiliation Information
//Taxonomy Category
		@FindBy(xpath = "//input[contains(@value,'Dietician')]")  ////input[@value='Dietician']
		private WebElement Dietician;

//Taxonomies
		@FindBy(xpath ="//input[contains(@name,'Primary Taxonomy')]")
		private WebElement Primary_Taxonomy;
		@FindBy(xpath ="//strong[.='133V00000X -  Dietician, Registered']")
		private WebElement Primary_Taxonomy_1;
		@FindBy(xpath = "//button/span[.='OK']")
		private WebElement OK;


		//DEA Number
		@FindBy(xpath = "//input[@placeholder='_________']")
		private WebElement DEA_Number;
		
		
//License Information
		@FindBy(xpath ="//input[contains(@id, 'License Number')]")
		private WebElement License_Number;
		@FindBy(xpath ="//label[contains(@id, 'License Type')]")
		private WebElement License_Type;
		@FindBy(xpath = "//label[@id='License Issued State']")
		private WebElement License_Issued_State;
		@FindBy(xpath = "//label[.='License Effective Date *']")
		private WebElement License_Effective_Date;
		@FindBy(xpath = "//label[.='License Expiration Date *']")
		private WebElement License_Expiration_Date;
		@FindBy(xpath = "//span[.='Save']")
		private WebElement Save;
		
//Primary Service Location Information
//SAME DATA IS REPETE
		
//Key Personnel
		@FindBy(xpath = "//label[@id ='Managing Employee Type']")
		private WebElement Managing_Employee_Type;
		@FindBy(xpath="//li[@data-value ='Supervisor']")
		private WebElement Supervisor;
		@FindBy(xpath = "//label[@id='Country of Birth']")
		private WebElement Country_of_Birth1;
		@FindBy(xpath= "//label[.='County of Birth']")
		private WebElement County_of_Birth2;


	
	public PageObjectManager getPom() {
		return pom;
	}
	public WebElement getDelete1() {
		return delete1;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getMale() {
		return Male;
	}
	public WebElement getAlgeria() {
		return algeria;
	}
	
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getIndividual() {
		return Individual;
	}
	public WebElement getradio() {
		return radio;
	}
	public WebElement getFN() {
		return FN;
	}
	public WebElement getMN() {
		return MN;
	}
	public WebElement getLN() {
		return LN;
	}
	public WebElement getGender() {
		return Gender;
	}
	public WebElement getmale() {
		return  Male;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getCountry_birth() {
		return country_birth;
	}
	public WebElement getalgeria() {
		return algeria;
	}
	public WebElement getstate_of_brith() {
		return state_of_brith;
		
	}
	public WebElement getSsn() {
		return Ssn;
	}
	public WebElement getContact_mail() {
		return contact_mail;
	}
	public WebElement getProfit_status() {
		return profit_status;
	}
	public WebElement getNon_profit() {
		return Non_profit;
		
	}
	public WebElement getNext() {
		return Next;
		
	}
	public WebElement getNext1() {
		return Next1;
	}
	
	

	public WebElement getState_of_brith() {
		return state_of_brith;
	}
	
	public WebElement getDietician() {
		return Dietician;
	}
	public WebElement getPrimary_Taxonomy() {
		return Primary_Taxonomy;
	}
	public WebElement getPrimary_Taxonomy_1() {
		return Primary_Taxonomy_1;
	}
	public WebElement getOk() {
		return OK;
	}
	public WebElement getDEA_Number() {
		return DEA_Number;
	}
	public WebElement getLicense_Number() {
		return License_Number;
	}
	public WebElement getLicense_Type() {
		return License_Type;
	}
	public WebElement getLicense_Issued_State() {
		return License_Issued_State;
	}
	public WebElement getLicense_Effective_Date() {
		return License_Effective_Date;
	}
	public WebElement getLicense_Expiration_Date() {
		return License_Expiration_Date;
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getManaging_Employee_Type() {
		return Managing_Employee_Type;
	}
	public WebElement getSupervisor() {
		return Supervisor;
	}
	public WebElement getCountry_of_Birth1() {
		return Country_of_Birth1;
	}
	public WebElement getCounty_of_Birth2() {
		return County_of_Birth2;
	}
	
	
	
// create individual provider
//	public void filedataforprovider() throws IOException, InterruptedException {
//  System.out.println("helooooo");
//// Individual provider
//		try {
//			waitForElementToVisibile(driver, 30, delete);
//		    delete.click();
//			waitForElementToVisibile(driver, 30, delete1);
//			delete1.click();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//         
//		
//		
//		waitForElementToVisibile(driver, 30, Individual);
//		Individual.click();
////Identifying Information
////Medicaid Payment
//		// wait.until(ExpectedConditions.visibilityOf(radio));
//		// radio.click();
//
//        // JavascriptExecutor js = (JavascriptExecutor) driver;
//        // js.executeScript("window.scrollTo(0,150)");
//
//		// scrollIntoView(driver, Gender);
////General Information
//		waitForElementToVisibile(driver, 30, FN);
//		// wait.until(ExpectedConditions.visibilityOf(FN));
//		String je = getFN().getText();
//		getFN().sendKeys(readdata("Login", 3, 0));
//		waitForElementToVisibile(driver, 20, LN);
//		getLN().sendKeys(readdata("Login", 3, 1));
//		getMN().sendKeys("RAKI");
//		getGender().click();
//		getmale().click();
//
//		// selectByIndex(Male, 0);
//		// selectByIndex(Gender, 1);
//		// selectByValue(Male, "Male");
//		// getGender().sendKeys("Male");
//
//		// selectByIndex(Gender, 0);
//		getDate().sendKeys("09/08/2001");
//		getCountry_birth().sendKeys("Algeria");
//		// getalgeria().click();
//		// wait.until(ExpectedConditions.visibilityOf(state_of_brith));
//		// getstate_of_brith().sendKeys("Iowa");
//		waitForElementToVisibile(driver, 30, Ssn);
//		getSsn().sendKeys("545-67-8908");
//	
//		getContact_mail().sendKeys("test@gmail.com");
//		getProfit_status().click();
//		getNon_profit().click();
//		getNext().click();
//		waitForElementToClickableExplicitly(driver, 30, Next1);
//
//// Program Participation
//		getNext1().click();
//		waitForElementToVisibile(driver, 30, Npi);
//		getNpi().sendKeys("1073241790");
//	    Thread.sleep(10000);
//	    try {
//	    	 waitForElementToVisibile(driver, 30, Verified);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("NPI Not Verified or Filled Properly");
//		} 
//		getNo().click();
//		getNext().click();
//		waitForElementToVisibile(driver, 30, Address_line_1);
	//100 1/2 E Duncan St Columbus, OH 43202
	//getAddress_line_1().sendKeys("100 1/2 E Duncan St Columbus, OH 43202");
//		Thread.sleep(10000);
//		
//		getMenuitem().click();
//		
//		
////Mailing Address Contact Person Details
//		getFN().sendKeys("raki");
//		getLN().sendKeys("tg");
//		getPhone().sendKeys("(567)890-9876");
//		getEmail().sendKeys("test@gmail.com");
//		getNext().click();
//		
////Taxonomies
//		waitForElementToVisibile(driver, 0, Dietician);
//		getDietician().click();
//		
////		getPrimary_Taxonomy().click();
////	
////		getPrimary_Taxonomy_1().click();
////		try {
////			waitForElementToVisibile(driver, 0, OK);
////		    getOk().click();
////		} catch (Exception e) {
////			// TODO: handle exception
////		}
//		
//		
////DEA Number
////	    getDEA_Number().sendKeys("gf8765789");
////		getNext().click();
////		
//		
////
//		getAddress_line_1().sendKeys("100 1/2 E Duncan St Columbus, OH 43202");
//		Thread.sleep(6000);
//		
//		getMenuitem().click();
//		getFN().sendKeys("raki");
//		getLN().sendKeys("tejase");
//		getPhone().sendKeys("(567)890-9876");
//		getEmail().sendKeys("test@gmail.com");
//		getNext().click();
//		waitForElementToVisibile(driver, 10, Next);
//		getNext().click();
//		waitForElementToVisibile(driver, 10, Next);
//		getNext().click();
//		waitForElementToVisibile(driver, 10, Next);
//		getNext().click();
//		
//		
//		
//	}
//	
//	
	
}
