package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityProgramParticipationPage extends BaseUtilClass {

	
	public EntityProgramParticipationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[.='Program Participation / Taxonomy / License / Certificate Information'])[2]")
	private WebElement Program_Participation_tab;
	@FindBy(xpath="//span[.='ADD PROGRAM PARTICIPATION']")
	private WebElement ADD_PROGRAM_PARTICIPATION_button;
	@FindBy(xpath="(//div[@role='button'])[2])")
    private WebElement Select_Program_Participation;
	@FindBy(xpath="//li[@role='option']")
    private WebElement Select_Program_Participation_dropdown;
	@FindBy(xpath="(//div[@role='button'])[3])")
    private WebElement Select_Speciality;
	@FindBy(xpath="//li[@role='option']")
    private WebElement Select_Speciality_dropdown;
	@FindBy(xpath="//span[.='Add Taxonomy']")
    private WebElement Add_Taxonomy_button;
	public WebElement getProgram_Participation_tab() {
		return Program_Participation_tab;
	}
	public WebElement getADD_PROGRAM_PARTICIPATION_button() {
		return ADD_PROGRAM_PARTICIPATION_button;
	}
	public WebElement getSelect_Program_Participation() {
		return Select_Program_Participation;
	}
	public WebElement getSelect_Program_Participation_dropdown() {
		return Select_Program_Participation_dropdown;
	}
	public WebElement getSelect_Speciality() {
		return Select_Speciality;
	}
	public WebElement getSelect_Speciality_dropdown() {
		return Select_Speciality_dropdown;
	}
    
	

		
		//div[@aria-haspopup='listbox']
		//ul[@role='listbox']/*
		
		//(//div[@role='button' and @aria-haspopup='listbox'])[1]
				
		@FindBy(xpath="(//div[@role='button' and @aria-haspopup='listbox'])[1]")
		WebElement ProgramParticipationbutton;
						
		@FindBy(xpath="//span[@class='MuiButton-label' and .='ADD PROGRAM PARTICIPATION']")
		WebElement AddProgramParticipation;
		
		public WebElement getAddProgramParticipation() {
			return AddProgramParticipation;
		}


		@FindBy(xpath="(//div[@role='button' and @aria-haspopup='listbox'])[2]")
		WebElement SpecialityButton;
		
		//@FindBy(xpath="(//li[@role='option'])")
		@FindBy(xpath="(//li[@role='option'])")
		List<WebElement> Select_PP;
		
		

		@FindBy(xpath="(//li[@role='option'])")
		List<WebElement> SpecialityList;
		
		public List<WebElement> getSelect_PP() {
			return Select_PP;
		}

		public List<WebElement> getSpecialityList() {
			return SpecialityList;
		}

		public List<WebElement> getPPList(){
			return Select_PP;
				
		}	
		
		@FindBy(xpath="//span[.='Add Taxonomy']")
		WebElement AddTaxonomy;
		
		@FindBy(xpath="(//div[@role='button'])[4]")
		WebElement ClickTaxonomyButton;
		
		
		
		@FindBy(xpath="//input[@placeholder='MM/DD/YYYY'][1]")
		WebElement EffectiveDate;
		
		@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
		WebElement EndDate;
		
		@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[3]")
		WebElement LicenseTypeEffectiveDate;
		
		@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[4]")
		WebElement LicenseTypeEndDate;
		public WebElement getLicenseTypeEffectiveDate() {
			return LicenseTypeEffectiveDate;
		}

		public WebElement getLicenseTypeEndDate() {
			return LicenseTypeEndDate;
		}

		public WebElement getLicenseIssuer() {
			return LicenseIssuer;
		}

		public WebElement getLicenseIssuerSelectSD() {
			return LicenseIssuerSelectSD;
		}


		@FindBy(xpath="//div[@id='demo-simple-select-standard']")
		WebElement SelectTaxonomyDescription;

		@FindBy(xpath="//li[@role='option'][2]")
		WebElement SelectTaxonomy;

		
		public WebElement getSelectTaxonomyDescription() {
			return SelectTaxonomyDescription;
		}

		public WebElement getSelectTaxonomy() {
			return SelectTaxonomy;
		}

		public WebElement getEffectiveDate() {
			return EffectiveDate;
		}

		public WebElement getEndDate() {
			return EndDate;
		}


		@FindBy(xpath="(//div[@aria-haspopup='listbox'])[4]")
		WebElement LicenseCertificateDropDown;
		
		@FindBy(xpath="(//div[@aria-haspopup='listbox'])[5]")
		private WebElement LicenseIssuer;
		
		@FindBy(xpath="//button/span[.='Add']")
		private WebElement AddButton;
		
		@FindBy(xpath="//span[.='Confirm']")
		private WebElement ConfirmButton;
		
		@FindBy(xpath="(//span[.='Save'])[2]")
		private WebElement SaveButton;
		
		public WebElement getSaveButton() {
			return SaveButton;
		}

		public WebElement getConfirmButton() {
			return ConfirmButton;
		}

		public WebElement getAddButton() {
			return AddButton;
		}

		public WebElement getUpload_CurrentLicense() {
			return Upload_CurrentLicense;
		}


		@FindBy(xpath="//li[@data-value='South Dakota']")
		private WebElement LicenseIssuerSelectSD;
		
		@FindBy(xpath="//input[@id='lNum']")
		private WebElement LicenseNum;
		
		@FindBy(xpath="(//input[@type='file'])[1]")
		private WebElement Upload_CurrentLicense;
		
		public WebElement getLicenseNum() {
			return LicenseNum;
		}


		@FindBy(xpath="(//li[@role='option'])")
		List<WebElement> License_CertType;
		
		public WebElement getLicenseCertificateDropDown() {
			return LicenseCertificateDropDown;
		}

		public List<WebElement> getLicense_CertType() {
			return License_CertType;
		}


		@FindBy(xpath="//span[.='Add License/Certificate']")
		WebElement AddLicenseCertificate;
		
		public WebElement getAddTaxonomy() {
			return AddTaxonomy;
		}

		public WebElement getClickTaxonomyButton() {
			return ClickTaxonomyButton;
		}

		public WebElement getAddLicenseCertificate() {
			return AddLicenseCertificate;
		}


		@FindBy(xpath="(//li[@role='option'])[1]")
		WebElement SelectAProgramParticipatioFromList;
		
		@FindBy(xpath="(//li[@role='option'])[1]")
		WebElement SelectASpecialityFromList;
		
		public WebElement SelectTaxonomyFromList(int index) {
			
			//li[@role='option'][2]
			return driver.findElement(By.xpath("(//li[@role='option'])["+index+"]"));
		}
		
		public WebElement getSelectASpecialityFromList() {
			return SelectASpecialityFromList;
		}

		public WebElement getSelectAProgramParticipatioFromList() {
			return SelectAProgramParticipatioFromList;
		}

		public WebElement getProgramParticipationbutton(){
			return ProgramParticipationbutton;	
			
		}
		
		public WebElement getSpecialityButton(){
			return SpecialityButton;	
			
		}
		
	
	
}
