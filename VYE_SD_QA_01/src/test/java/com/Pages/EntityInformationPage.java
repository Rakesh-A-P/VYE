package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectManager.PageObjectManager;

import Utilities.BaseUtilClass;

public class EntityInformationPage extends BaseUtilClass{
	
	public EntityInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
// Entity provider
	@FindBy(xpath = "//h2[.='Individual Enrollment']")
	private WebElement individual_enrollment;
		@FindBy(xpath = "//h2[.='Entity Enrollment']")
		private WebElement Entity_enrollment;
//Requested Enrollment Date
        @FindBy(xpath ="//input[@placeholder='MM/DD/YYYY']")
        private WebElement Requested_Enrollment_Date;
        public WebElement getIndividual_enrollment() {
			return individual_enrollment;
		}



		@FindBy(xpath ="//input[@name='Reason Code']")
        private WebElement Reason_Code;
        @FindBy(xpath ="//strong[.='Future Eligibility']")
        private WebElement Future_Eligibility;
 //General Information      
        @FindBy(xpath="//input[@aria-label='Provider Legal Business Name']")
        private WebElement Provider_Name;
        @FindBy(xpath ="//input[@placeholder='__-_______']")
        private WebElement FEIN_Number;
        @FindBy(xpath="//input[@aria-label='Application Contact Email']")
        private WebElement Email;
        @FindBy (xpath= "//input[@aria-label='Doing Business As (DBA) Name']")
        private WebElement Business_name;
        @FindBy(xpath="(//input[@type='radio'])[1]")
        private WebElement Yes_DBA_Name;
        @FindBy(xpath="//input[@aria-label='Former DBA Name/Legal Business Name']")
        private WebElement Former_DBA_Name;
        @FindBy(xpath="(//input[@type='radio'])[3]")
        private WebElement Yes_FEIN;
        @FindBy(xpath ="//input[@aria-label='Prior Provider Name']")
        private WebElement Prior_Provider_name;
        @FindBy(xpath="//input[@aria-label='Prior NPI']")
        private WebElement Prior_npi;
        @FindBy(xpath="(//input[@placeholder='__-_______'])[2]")
        private WebElement Prior_FEIN;
        @FindBy(xpath="//input[@aria-label='Website Address']")
        private WebElement Website_Address;
 //Tax Information
        @FindBy(xpath="//input[@name='Profit Status']")
        private WebElement Profit_Status;
        @FindBy(xpath="//strong[.='Government']")
        private WebElement 	Government;
        @FindBy(xpath="(//input[@type='radio'])[5]")
        private WebElement Yes_tax;
        @FindBy(xpath="//input[@name='Month']")
        private WebElement Month;
        @FindBy(xpath="//input[@name='Date']")
        private WebElement Date;
        @FindBy(xpath="//span[.='Next']")
        private WebElement Next;
        
        
		public WebElement getEntity_enrollment() {
			return Entity_enrollment;
		}
		public WebElement getRequested_Enrollment_Date() {
			return Requested_Enrollment_Date;
		}
		public WebElement getReason_Code() {
			return Reason_Code;
		}
		public WebElement getFuture_Eligibility() {
			return Future_Eligibility;
		}
		public WebElement getProvider_Name() {
			return Provider_Name;
		}
		public WebElement getFEIN_Number() {
			return FEIN_Number;
		}
		public WebElement getEmail() {
			return Email;
		}
		public WebElement getBusiness_name() {
			return Business_name;
		}
		public WebElement getYes_DBA_Name() {
			return Yes_DBA_Name;
		}
		public WebElement getFormer_DBA_Name() {
			return Former_DBA_Name;
		}
		public WebElement getYes_FEIN() {
			return Yes_FEIN;
		}
		public WebElement getPrior_Provider_name() {
			return Prior_Provider_name;
		}
		public WebElement getPrior_npi() {
			return Prior_npi;
		}
		public WebElement getPrior_FEIN() {
			return Prior_FEIN;
		}
		public WebElement getWebsite_Address() {
			return Website_Address;
		}
		public WebElement getProfit_Status() {
			return Profit_Status;
		}
		public WebElement getGovernment() {
			return Government;
		}
		public WebElement getYes_tax() {
			return Yes_tax;
		}
		public WebElement getMonth() {
			return Month;
		}
		public WebElement getDate() {
			return Date;
		}
		public WebElement getNext() {
			return Next;
		}
        
		public void SelectQuestionDBA_Name(String Options) throws InterruptedException
	    {
		   SelectRadioButton(Options, getYes_DBA_Name(), getYes_DBA_Name(), "Q2 DBA name");
	    }
		public void SelectQuestionFEIN(String Options) throws InterruptedException
	    {
		   SelectRadioButton(Options, getYes_FEIN(), getYes_FEIN(), "Q3 FEIN ");
	    }
		public void SelectQuestioNTax(String Options) throws InterruptedException
	    {
		   SelectRadioButton(Options, getYes_tax(), getYes_tax(), "Q4 Tax");
	    }
		
}
