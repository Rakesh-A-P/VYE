package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityServiceLocationPage extends BaseUtilClass {

	public EntityServiceLocationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@type='button' and @aria-label='clear']")
	private WebElement Clear;
	public WebElement getClear() {
		return Clear;
	}

	@FindBy(xpath="(//span[.='Cancel'])[3]")
	private WebElement cancel;
	public WebElement getCancel() {
		return cancel;
	}


	@FindBy(xpath="(//span[.='Service Location'])[2]")
	private WebElement Service_Location_tab;
	@FindBy(xpath="//span[.='Add Location']")
	private WebElement Add_Location;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement Eeffective_date;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement End_date;
	@FindBy(xpath="//input[@id='lName']")
	private WebElement Location_name;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Address_line;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement Address_click_first;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement drop_click_first;
	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement drop_click_second;
	@FindBy(xpath="//input[@id='attLine']")////input[@id='attLine']
	private WebElement attention_line;
	@FindBy(xpath="//input[@id='line2']")
	private WebElement email;
	@FindBy(xpath="//input[@id='phone' and @placeholder='(___)___-____']")
	private WebElement phonenumber;
	@FindBy(xpath="//input[@id='line4']")
	private WebElement Ext;
	@FindBy(xpath="//input[@id='line5' and @placeholder='(___)___-____']")
	private WebElement Fax_number;
	@FindBy(xpath="//label[.='Position']/..//div[@role='button']")
	private WebElement drop_postion;
	@FindBy(xpath="//li[@role='option']")
	private WebElement drop_postion_list;
	
	
	@FindBy(xpath="//a[.='Add Program Participation']")
	private WebElement Add_Program_Participation_button;
	@FindBy(xpath="//label[.='Select Program Participation *']/..//div[@role='button']")
	private WebElement drop_Select_Program_Participation;
	@FindBy(xpath="(//li[@role='option'])/*")
	private List<WebElement> drop_Select_Program_Participation_list;
	@FindBy(xpath="//div[contains(@class,'programParticipation_pp-item-checkbox')]//input[@type='checkbox']")
	private List<WebElement> checkbox_programparticipation;
	
	public WebElement CheckBoxIndexofeffectivedate(int index) {
   	  return driver.findElement(By.xpath("(//div[contains(@class,'programParticipation_pp-item-checkbox')])["+index+"]/../..//div[@class='sc-gFaPwZ jnrysx']"));              
   	  //return driver.findElement(By.xpath("//div[contains(@class,'programParticipation_pp-item-checkbox')]["+index+"]"));
     }
	public WebElement CheckBoxIndexofenddate(int index) {
	   	  return driver.findElement(By.xpath("(//div[contains(@class,'programParticipation_pp-item-checkbox')])["+index+"]/../..//div[@class='sc-gFaPwZ kxVyrb']"));              
	   	  //return driver.findElement(By.xpath("//div[contains(@class,'programParticipation_pp-item-checkbox')]["+index+"]"));
	     }
	 
	
	@FindBy(xpath="//label[text()='Location Taxonomy Effective Start Date *']/..//input[@placeholder='MM/DD/YYYY']")
	private List<WebElement> Location_Taxonomy_Effective_Start_Date_list;
	@FindBy(xpath="//label[text()='Location Taxonomy Effective End Date']/..//input[@placeholder='MM/DD/YYYY']")
	private List<WebElement> Location_Taxonomy_Effective_End_Date_list;
	@FindBy(xpath="//h2[.='Add Program Participation']/../..//span[.='Cancel']")
	private WebElement add_program_participation_cancel;
	@FindBy(xpath="//h2[.='Add Program Participation']/../..//span[.='Save']")
	private WebElement add_program_participation_Save;
	
	
	@FindBy(xpath="//input[@name='onlyHomeLocation' and @value='Yes']")
	private WebElement yes_no_office_location;
	@FindBy(xpath="//input[@name='onlyHomeLocation' and @value='No']")
	private WebElement No_no_office_location;
	@FindBy(xpath="//div[contains(text(),'services for medical, dental, or both')]/../..//div[@role='button']")
	private WebElement drop_servicesfor_medical_dental_or_both;
	
	public WebElement getYes_no_office_location() {
		return yes_no_office_location;
	}
	public WebElement getNo_no_office_location() {
		return No_no_office_location;
	}
	public WebElement getDrop_servicesfor_medical_dental_or_both() {
		return drop_servicesfor_medical_dental_or_both;
	}
	public List<WebElement> getCheckbox_programparticipation() {
		return checkbox_programparticipation;
	}
	public List<WebElement> getLocation_Taxonomy_Effective_Start_Date_list() {
		return Location_Taxonomy_Effective_Start_Date_list;
	}
	public List<WebElement> getLocation_Taxonomy_Effective_End_Date_list() {
		return Location_Taxonomy_Effective_End_Date_list;
	}
	public WebElement getAdd_program_participation_cancel() {
		return add_program_participation_cancel;
	}
	public WebElement getAdd_program_participation_Save() {
		return add_program_participation_Save;
	}
	public void setAdd_program_participation_Save(WebElement add_program_participation_Save) {
		this.add_program_participation_Save = add_program_participation_Save;
	}

	@FindBy(xpath="//input[@type='file']")
	private WebElement upload_button;
	@FindBy(xpath="//span[contains(text(), 'claim include prior')]/..//input[@value='Yes']")
	private WebElement yes_claim_include_prior_authorization ;
	@FindBy(xpath="//span[contains(text(), 'claim include prior')]/..//input[@value='No']")
	private WebElement No_claim_include_prior_authorization ;
	
	@FindBy(xpath="//div[contains(@id,'Language Supported')]")
	private WebElement drop_Language_Supported ;
	@FindBy(xpath="(//li[@role='option'])")
	private WebElement drop_Language_Supported_list ;
	@FindBy(xpath="//label[text()='Gender Served']/..//div[@role='button']")
	private WebElement drop_Gender_Served ;
	
	
	@FindBy(xpath="(//li[@role='option'])")
	private WebElement drop_Gender_Served_list ;
	
	@FindBy(xpath="//input[contains(@name, 'allage') and @type='checkbox']")
	private WebElement All_ages_served_checkbox ;
	@FindBy(xpath="//p[contains(text(),'Accepting ')]/..//input[@value='Yes']")
	private WebElement yes_Accepting;
	@FindBy(xpath="//p[contains(text(),'Accepting ')]/..//input[@value='No']")
	private WebElement No_Accepting;
	@FindBy(xpath="//p[contains(text(),' TTD/TTY')]/..//input[@value='Yes']")
	private WebElement yes_TTD_TTY;
	@FindBy(xpath="//p[contains(text(),' TTD/TTY')]/..//input[@value='No']")
	private WebElement No_TTD_TTY;
	@FindBy(xpath="//input[@id='ttdphone' and  @placeholder='(___)___-____']")
	private WebElement TTD_TTY_Number;
	

	@FindBy(xpath="//p[contains(text(),' location Open')]/..//input[@value='Yes']")
	private WebElement Yes_location_open;
	@FindBy(xpath="//p[contains(text(),' location Open')]/..//input[@value='No']")
	private WebElement No_location_open;
	@FindBy(xpath="//p[contains(text(),' location Open')]/..//input[@value='Not Applicable']")
	private WebElement Not_Applicable;
	@FindBy(xpath="//p[contains(text(),' provide emergency services')]/..//input[@value='Yes']")
	private WebElement Yes_provide_emergency_services;
	@FindBy(xpath="//p[contains(text(),' provide emergency services')]/..//input[@value='No']")
	private WebElement No_provide_emergency_services;
	@FindBy(xpath="//input[contains(@id,'emergencycontact') and @placeholder='(___)___-____']")
	private WebElement after_hours_contact_person;
	@FindBy(xpath="//p[contains(text(),'patient records')]/..//input[@value='Yes']")
	private WebElement Yes_patient_records;
	@FindBy(xpath="//p[contains(text(),'patient records')]/..//input[@value='No']")
	private WebElement No_patient_records;
	
	
	@FindBy(xpath="//p[contains(text(),'Personnel records')]/..//input[@value='Yes']")
	private WebElement Yes_Personnel_records;
	@FindBy(xpath="//p[contains(text(),'Personnel records')]/..//input[@value='No']")
	private WebElement No_Personnel_records;
	@FindBy(xpath="//input[contains(@id,'patientphone') and @placeholder='(___)___-____']")
	private WebElement phone_number_of_patient;
	@FindBy(xpath="//label[text()='Manner of services']/..//div[@role='button']")
	private WebElement drop_manner_of_services;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement primary_location_radio;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement secondary_location_radio;
	@FindBy(xpath="//span[.='Save']")
	private WebElement save;
	
	@FindBy(xpath="//div[contains(text(),'Are you recognized as a DRG')]/../..//input[@value='Yes']")
	private WebElement yes_recognized_as_a_DRG;
	@FindBy(xpath="//div[contains(text(),'Are you recognized as a DRG')]/../..//input[@value='No']")
	private WebElement No_recognized_as_a_DRG;
	@FindBy(xpath="//input[@name='Name']")
	private WebElement Name;
	@FindBy(xpath="//input[@name='Contact Phone'   and @placeholder='(___)___-____']")
	private WebElement Contact_Phone;
	@FindBy(xpath="//div[contains(text(),' hospital, healthcare system')]/../..//div[@role='button']")
	private WebElement drop_healthcare_system;
	@FindBy(xpath="//span[.='+ Add Line']")
	private WebElement add_line_bed_type;
	@FindBy(xpath="//input[@aria-label='No of Beds']")
	private WebElement No_of_Beds;
	@FindBy(xpath="//div/label[contains(@for,'Bed Type')]/..//div[@role='button']")
	private WebElement bed_type_drop;
	@FindBy(xpath="//h4[.='Add/Edit row']/..//span[.='Save']")
	private WebElement save_bed_type;
	
	
	
	
	public WebElement getSave_bed_type() {
		return save_bed_type;
	}
	public WebElement getYes_recognized_as_a_DRG() {
		return yes_recognized_as_a_DRG;
	}
	public WebElement getNo_recognized_as_a_DRG() {
		return No_recognized_as_a_DRG;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getContact_Phone() {
		return Contact_Phone;
	}
	public WebElement getDrop_healthcare_system() {
		return drop_healthcare_system;
	}
	public WebElement getAdd_line_bed_type() {
		return add_line_bed_type;
	}
	public WebElement getNo_of_Beds() {
		return No_of_Beds;
	}
	public WebElement getBed_type_drop() {
		return bed_type_drop;
	}
	public WebElement getPrimary_location_radio() {
		return primary_location_radio;
	}
	public WebElement getSecondary_location_radio() {
		return secondary_location_radio;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getAttention_line() {
		return attention_line;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getExt() {
		return Ext;
	}
	public WebElement getFax_number() {
		return Fax_number;
	}
	public WebElement getDrop_postion() {
		return drop_postion;
	}
	public WebElement getDrop_postion_list() {
		return drop_postion_list;
	}
	public WebElement getDrop_Select_Program_Participation() {
		return drop_Select_Program_Participation;
	}
	public List<WebElement> getDrop_Select_Program_Participation_list() {
		return  drop_Select_Program_Participation_list;
	}
	public WebElement getNo_Accepting() {
		return No_Accepting;
	}
	public WebElement getYes_TTD_TTY() {
		return yes_TTD_TTY;
	}
	public WebElement getNo_TTD_TTY() {
		return No_TTD_TTY;
	}
	public WebElement getTTD_TTY_Number() {
		return TTD_TTY_Number;
	}
	public WebElement getYes_location_open() {
		return Yes_location_open;
	}
	public WebElement getNo_location_open() {
		return No_location_open;
	}
	public WebElement getNot_Applicable() {
		return Not_Applicable;
	}
	public WebElement getYes_provide_emergency_services() {
		return Yes_provide_emergency_services;
	}
	public WebElement getNo_provide_emergency_services() {
		return No_provide_emergency_services;
	}
	public WebElement getAfter_hours_contact_person() {
		return after_hours_contact_person;
	}
	public WebElement getYes_patient_records() {
		return Yes_patient_records;
	}
	public WebElement getNo_patient_records() {
		return No_patient_records;
	}
	public WebElement getYes_Personnel_records() {
		return Yes_Personnel_records;
	}
	public WebElement getNo_Personnel_records() {
		return No_Personnel_records;
	}
	public WebElement getPhone_number_of_patient() {
		return phone_number_of_patient;
	}
	public WebElement getDrop_manner_of_services() {
		return drop_manner_of_services;
	}

	public WebElement getService_Location_tab() {
		return Service_Location_tab;
	}
	public WebElement getAdd_Location() {
		return Add_Location;
	}
	public WebElement getEeffective_date() {
		return Eeffective_date;
	}
	public WebElement getEnd_date() {
		return End_date;
	}
	public WebElement getLocation_name() {
		return Location_name;
	}
	public WebElement getAddress_line() {
		return Address_line;
	}
	public WebElement getAddress_click_first() {
		return Address_click_first;
	}
	public WebElement getDrop_click_first() {
		return drop_click_first;
	}
	public WebElement getDrop_click_second() {
		return drop_click_second;
	}
	public WebElement getAdd_Program_Participation_button() {
		return Add_Program_Participation_button;
	}
	public WebElement getUpload_button() {
		return upload_button;
	}
	public WebElement getYes_claim_include_prior_authorization() {
		return yes_claim_include_prior_authorization;
	}
	public WebElement getNo_claim_include_prior_authorization() {
		return No_claim_include_prior_authorization;
	}
	public WebElement getDrop_Language_Supported() {
		return drop_Language_Supported;
	}
	public WebElement getDrop_Language_Supported_list() {
		return drop_Language_Supported_list;
	}
	public WebElement getDrop_Gender_Served() {
		return drop_Gender_Served;
	}
	public WebElement getDrop_Gender_Served_list() {
		return drop_Gender_Served_list;
	}
	public WebElement getAll_ages_served_checkbox() {
		return All_ages_served_checkbox;
	}
	public WebElement getYes_Accepting() {
		return yes_Accepting;
	}
	public void getSelectQuestionclaim(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_claim_include_prior_authorization(), getNo_claim_include_prior_authorization(), "claim include_prior_authorization");
    }
	public void getSelectQuestionaccepting(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_Accepting(), getNo_Accepting(), "Accepting new patients?");
    }
	public void getSelectQuestionTTD_TTY(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_TTD_TTY(), getNo_TTD_TTY(), "Is this location TTD/TTY equipped");
    }
	public void getSelectQuestionlocationopen(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_location_open(), getNo_location_open(), "Is this location Open 24 Hours?");
    }
	
	public void getSelectQuestionprovideremergencyservice(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_provide_emergency_services(), getNo_provide_emergency_services(), "Does this location provide emergency services after standard business hours?");
    }
	public void getSelectQuestionpatientrecord(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_patient_records(), getNo_patient_records(), "Do you store patient records at this location? ");
    }
	public void getSelectQuestionpersonalrecord(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_Personnel_records(), getNo_Personnel_records(), "Do you store Personnel records at this location?");
    }
	public void getSelectQuestion_no_office_loaction(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_no_office_location(), getNo_no_office_location(), "Do you store Personnel records at this location?");
    }
	public void getSelectQuestion_recognized_as_a_DRG(String Options)  throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_recognized_as_a_DRG(), getNo_recognized_as_a_DRG(), "Do you store Personnel records at this location?");
    }
	
}
