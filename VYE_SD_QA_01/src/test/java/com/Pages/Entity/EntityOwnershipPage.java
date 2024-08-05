package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityOwnershipPage extends BaseUtilClass {

	public EntityOwnershipPage() {
		
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//span[.='Ownership'])[2]")
	private WebElement Ownership_tab;
	@FindBy(xpath ="//input[@name='1. Select Ownership Code']")
	private WebElement Select_Ownership_Code;
//question 2----------------
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement Yes_question2;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement No_question2;
	
	@FindBy(xpath="(//span[.='+ Add Line'])[1]")
	private WebElement add_line_question2;
	@FindBy(xpath="//div[contains(@id,'2. Does any person have a 5%')]/../../../../..//following-sibling::div[1]//span[.='+ Add Line']")
	private WebElement add_line_question21;
	@FindBy(xpath="//div[contains(@id,'3. Does any entity have a 5% or greater')]/../../../../..//following-sibling::div[9]//span[.='+ Add Line']")
	private WebElement add_line_question31;
	@FindBy(xpath="//div[contains(@id,'4. Does any person or entity have a 5% or more')]/../../../../..//following-sibling::div[2]//span[.='+ Add Line']")
	private WebElement add_line_question41Fein;
	@FindBy(xpath="//div[contains(@id,'7. Has the enrolling provider contracted')]/ancestor::div[4]/following-sibling::div[3]//span[.='+ Add Line']")
	private WebElement add_line_question71ssn;
	@FindBy(xpath="//div[contains(@id,'7. Has the enrolling provider contracted')]/../../../../..//following-sibling::div[2]//span[.='+ Add Line']")
	private WebElement add_line_question71fein;
	@FindBy(xpath="//div[contains(@id,'4. Does any person or entity have a 5% or more')]/../../../../..//following-sibling::div[3]//span[.='+ Add Line']")
	private WebElement add_line_question4ssn1;
	@FindBy(xpath="//div[contains(@id,'8. Do any immediate family')]/../../../../..//following-sibling::div[1]//span[.='+ Add Line']")
	private WebElement add_line_question81;
	@FindBy(xpath="//label[contains(@data-for,'9. Does the enrolling provider or its owners')]/../../../../..//following-sibling::div[1]//span[.='+ Add Line']")
	private WebElement add_line_question91;
	
	public WebElement getAdd_line_question81() {
		return add_line_question81;
	}

	public WebElement getAdd_line_question91() {
		return add_line_question91;
	}

	public WebElement getAdd_line_question31() {
		return add_line_question31;
	}

	public WebElement getAdd_line_question41Fein() {
		return add_line_question41Fein;
	}

	public WebElement getAdd_line_question71ssn() {
		return add_line_question71ssn;
	}

	public WebElement getAdd_line_question71fein() {
		return add_line_question71fein;
	}

	public WebElement getAdd_line_question4ssn1() {
		return add_line_question4ssn1;
	}

	public WebElement getAdd_line_question21() {
		return add_line_question21;
	}
	@FindBy(xpath="//input[@type='firs']")
	private WebElement duu;
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement First_Name;
	@FindBy(xpath="//input[@aria-label='Middle Name']")
	private WebElement Middle_Name;
	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement Last_Name;
	@FindBy(xpath="(//input[@placeholder='__-_______'])[2]")
	private WebElement SSN;
	@FindBy(xpath="//input[@placeholder='___-__-____']")
	private WebElement SSN1;
	public WebElement getSSN1() {
		return SSN1;
	}

	
	@FindBy(xpath="//input[@placeholder='___-__-____']")
	private WebElement SSN7;
	@FindBy(xpath="(//input[@placeholder='___-__-____'])[1]")
	private WebElement SSN9;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement date_of_birth;
	@FindBy(xpath="//label[.='Date of Birth *']")
	private WebElement date_of_birth1;
	
	@FindBy(xpath="//input[@aria-label='NPI']")
	private WebElement NPI;
	public WebElement getSSN7() {
		return SSN7;
	}
	@FindBy(xpath="(//div[@role='button'])[2]")
	private WebElement Ownership_Type;
	public WebElement getQuestion3() {
		return question3;
	}
	@FindBy(xpath="//div[contains(@aria-label,'3. Does any entity have')]")
	private WebElement question3;
	
	@FindBy(xpath="//li[.='Direct']")
	private WebElement Ownership_Typ_Directe;
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement Relationship_to_Provider;
	@FindBy(xpath="//li[.='Parent']")
	private WebElement Relationship_parent;
	@FindBy(xpath="//input[@aria-label='Ownership %']")
	private WebElement Ownership_percent;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
	private WebElement effective_date;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[3]")
	private WebElement end_date;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Address;
	@FindBy(xpath="//li[@role='option']")
	private WebElement address_click;
	@FindBy(xpath="//span[.='Save']")//span[.='Save']
	private WebElement Save;
//question 3-------------------------------
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement Yes_question3;
	@FindBy(xpath="(//input[@type='radio'])[4]")
	private WebElement No_question3;
	@FindBy(xpath="//input[@aria-label='Organizational Legal Business Name']")
	private WebElement Organizational_Legal_Business_Name;
	@FindBy(xpath="//input[@aria-label='Doing Business As']")
	private WebElement Doing_Business_As;
	@FindBy(xpath="//input[@placeholder='__-_______']")
	private WebElement FEIN;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement effective_date3;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
	private WebElement end_date3;
	@FindBy(xpath="//INPUT[@NAME='Ownership Type']")
	private WebElement Ownership_Type_question3;
	@FindBy(xpath="(//*[.='Direct'])[5]")
	private WebElement Direct3;
	@FindBy(xpath="//input[@aria-label='Ownership Code']")
	private WebElement Ownership_Code;
	@FindBy(xpath="(//*[.='Proprietary'])[1]")
	private WebElement Proprietary3;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement primary_business_address_line_3;
	@FindBy(xpath="(//span[.='+ Add Line'])[2]")
	private WebElement Add_line_ques3;
	
	@FindBy(xpath="//input[@aria-label='Location Name']")
	private WebElement Location_name;
	@FindBy(xpath="(//input[@id='line1'])[2]")
	private WebElement other_business_address_line;
//question 4----------------------------
	@FindBy(xpath="(//input[@type='radio'])[5]")
	private WebElement Yes_question4;
	@FindBy(xpath="(//input[@type='radio'])[6]")
	private WebElement No_question4;
	//SSN-------------------------------------------------
	@FindBy(xpath="//input[@value='SSN']")
	private WebElement SSN_check_box;
	@FindBy(xpath="(//span[.='+ Add Line'])[4]")
	private WebElement Add_line_question4_ssn;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[3]")
	private WebElement effective_date_4;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[4]")
	private WebElement end_date_4;
	@FindBy(xpath="//input[@aria-label='Percent of Interest']")
	private WebElement Percent_of_Interest;
	@FindBy(xpath="(//div[@role='button'])[2]")
	private WebElement 	Type_of_Interest;
	@FindBy(xpath="(//li[@role='option'])[2]")
	private WebElement dropdown_click;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement dropdown_click_first;
	public WebElement getDropdown_click_first() {
		return dropdown_click_first;
	}
	@FindBy(xpath="(//input[@id='line1'])[2]")
	private WebElement Address_question4;
	//FEIN--------------------------------
	@FindBy(xpath="//input[@value='FEIN']")
	private WebElement FEIN_check_box;
	@FindBy(xpath="(//span[.='+ Add Line'])[3]")
	private WebElement Add_line_question4_FEIN;
	@FindBy(xpath="(//INPUT[@placeholder='__-_______'])[2]")
	private WebElement FEIN_question4;
	@FindBy(xpath="//input[@aria-label='Organization’s Legal Business Name']")
	private WebElement Organization_Legal_Business_Name_question4;
	@FindBy(xpath="(//input[@aria-label='Doing Business As'])[2]")
	private WebElement Doing_Business_As_question4;
	
	
	//question 5----------------------
			@FindBy(xpath="(//input[@type='radio'])[7]")
			private WebElement Yes_question5;
			@FindBy(xpath="(//input[@type='radio'])[8]")
			private WebElement No_question5;
			
		//question 6--------------------------
			@FindBy(xpath="(//input[@type='radio'])[9]")
			private WebElement Yes_question6;
			@FindBy(xpath="(//input[@type='radio'])[10]")
			private WebElement No_question6;
		//question  7---------------------------------------	
			@FindBy(xpath="(//input[@type='radio'])[11]")
			private WebElement Yes_question7;
			@FindBy(xpath="(//input[@type='radio'])[12]")
			private WebElement No_question7;
			@FindBy(xpath="(//input[@value='SSN'])[2]")
			private WebElement SSN_check_box7;
			@FindBy(xpath="(//input[@value='FEIN'])[2]")
			private WebElement FEIN_check_box7;
			@FindBy(xpath="(//span[.='+ Add Line'])[5]")
			private WebElement Add_line_Fein_question7;
			@FindBy(xpath="(//span[.='+ Add Line'])[6]")
			private WebElement Add_line_ssn_question7;
			
//question 8----------------------
			@FindBy(xpath="(//input[@type='radio'])[13]")
			private WebElement Yes_question8;
			@FindBy(xpath="(//input[@type='radio'])[14]")
			private WebElement No_question8;
			@FindBy(xpath="(//span[.='+ Add Line'])[7]")
			private WebElement Add_line_question8;
			@FindBy(xpath="(//div[@role='button'])[2]")
			private WebElement Relationship8;
			@FindBy(xpath="//li[.='Spouse']")
			private WebElement relationship_dropdown;
			public WebElement getRelationship_dropdown() {
				return relationship_dropdown;
			}
			@FindBy(xpath="(//div[@role='button'])[3]")
			private WebElement Ownership_Type8;
            @FindBy(xpath="//input[@aria-label='Subcontractor Name']")
            private WebElement Subcontractor_Name;
            @FindBy(xpath="(//input[@placeholder='___-__-____'])[2]")
        	private WebElement date_of_birth_quest8;
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[3]")
        	private WebElement effective_quest8;
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[4]")
        	private WebElement end_quest8;
            @FindBy(xpath="(//input[@aria-label='Ownership %'])[2]")
        	private WebElement ownership_per_quest8;
            public WebElement getSSN8() {
				return SSN9;
			}

			public WebElement getDate_of_birth1() {
				return date_of_birth1;
			}

			public WebElement getOwnership_per_quest8() {
				return ownership_per_quest8;
			}

			public WebElement getDate_of_birth_quest8() {
				return date_of_birth_quest8;
			}

			public WebElement getEffective_quest8() {
				return effective_quest8;
			}

			public WebElement getEnd_quest8() {
				return end_quest8;
			}
			
			

//question 9----------------------
			@FindBy(xpath="(//input[@type='radio'])[15]")
			private WebElement Yes_question9;
			@FindBy(xpath="(//input[@type='radio'])[16]")
			private WebElement No_question9;
			@FindBy(xpath="(//span[.='+ Add Line'])[8]")
			private WebElement Add_line_question9;
			@FindBy(xpath="//input[@aria-label='Select Program']")
			private WebElement Select_Program;
			@FindBy(xpath="//input[@aria-label='NPI']")
			private WebElement NPI9;
			@FindBy(xpath="//span[.='Cancel']")
			private WebElement Cancel;
			@FindBy(xpath="//span[.='Close']")
			private WebElement Close_ownership_section;
			
			
	public WebElement getSSN9() {
				return SSN9;
			}

			public WebElement getClose_ownership_section() {
				return Close_ownership_section;
			}

	public WebElement getCancel() {
				return Cancel;
			}

	public WebElement getSSN_check_box7() {
				return SSN_check_box7;
			}

			public WebElement getFEIN_check_box7() {
				return FEIN_check_box7;
			}

			public WebElement getAdd_line_Fein_question7() {
				return Add_line_Fein_question7;
			}

			public WebElement getAdd_line_ssn_question7() {
				return Add_line_ssn_question7;
			}

			public WebElement getYes_question8() {
				return Yes_question8;
			}

			public WebElement getNo_question8() {
				return No_question8;
			}

			public WebElement getAdd_line_question8() {
				return Add_line_question8;
			}

			public WebElement getRelationship8() {
				return Relationship8;
			}

			public WebElement getOwnership_Type8() {
				return Ownership_Type8;
			}

			public WebElement getSubcontractor_Name() {
				return Subcontractor_Name;
			}

			public WebElement getYes_question9() {
				return Yes_question9;
			}

			public WebElement getNo_question9() {
				return No_question9;
			}

			public WebElement getAdd_line_question9() {
				return Add_line_question9;
			}

			public WebElement getSelect_Program() {
				return Select_Program;
			}

			public WebElement getNPI9() {
				return NPI9;
			}

	public WebElement getAdd_line_question4_FEIN() {
		return Add_line_question4_FEIN;
	}

	public WebElement getFEIN_question4() {
		return FEIN_question4;
	}

	public WebElement getOrganization_Legal_Business_Name_question4() {
		return Organization_Legal_Business_Name_question4;
	}

	public WebElement getDoing_Business_As_question4() {
		return Doing_Business_As_question4;
	}
		
	
public WebElement getNo_question3() {
		return No_question3;
	}

	public WebElement getNo_question4() {
		return No_question4;
	}

	public WebElement getSSN_check_box() {
		return SSN_check_box;
	}

	public WebElement getAdd_line_question4_ssn() {
		return Add_line_question4_ssn;
	}

	public WebElement getEffective_date_4() {
		return effective_date_4;
	}

	public WebElement getEnd_date_4() {
		return end_date_4;
	}

	public WebElement getPercent_of_Interest() {
		return Percent_of_Interest;
	}

	public WebElement getType_of_Interest() {
		return Type_of_Interest;
	}

	public WebElement getAddress_question4() {
		return Address_question4;
	}

	public WebElement getFEIN_check_box() {
		return FEIN_check_box;
	}

	public WebElement getYes_question5() {
		return Yes_question5;
	}

	public WebElement getNo_question5() {
		return No_question5;
	}

	public WebElement getYes_question6() {
		return Yes_question6;
	}

	public WebElement getNo_question6() {
		return No_question6;
	}

	public WebElement getYes_question7() {
		return Yes_question7;
	}

	public WebElement getNo_question7() {
		return No_question7;
	}
	
	
	public WebElement getYes_question4() {
		return Yes_question4;
	}

	public WebElement getNo_question2() {
		return No_question2;
	}
	
	public WebElement getYes_question3() {
		return Yes_question3;
	}
	public WebElement getOrganizational_Legal_Business_Name() {
		return Organizational_Legal_Business_Name;
	}
	public WebElement getDoing_Business_As() {
		return Doing_Business_As;
	}
	public WebElement getFEIN() {
		return FEIN;
	}
	public WebElement getEffective_date3() {
		return effective_date3;
	}
	public WebElement getEnd_date3() {
		return end_date3;
	}
	public WebElement getOwnership_Type_question3() {
		return Ownership_Type_question3;
	}
	public WebElement getDirect3() {
		return Direct3;
	}
	public WebElement getOwnership_Code() {
		return Ownership_Code;
	}
	public WebElement getProprietary3() {
		return Proprietary3;
	}
	public WebElement getPrimary_business_address_line_3() {
		return primary_business_address_line_3;
	}
	public WebElement getAdd_line_ques3() {
		return Add_line_ques3;
	}
	public WebElement getLocation_name() {
		return Location_name;
	}
	public WebElement getOther_business_address_line() {
		return other_business_address_line;
	}
	public WebElement getOwnership_tab() {
		return Ownership_tab;
	}
	public WebElement getSelect_Ownership_Code() {
		return Select_Ownership_Code;
	}
	public WebElement getYes_question2() {
		return Yes_question2;
	}
	public WebElement getAdd_line_question2() {
		return add_line_question2;
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
	public WebElement getDate_of_birth() {
		return date_of_birth;
	}
	public WebElement getNPI() {
		return NPI;
	}
	public WebElement getOwnership_Type() {
		return Ownership_Type;
	}
	public WebElement getOwnership_Typ_Directe() {
		return Ownership_Typ_Directe;
	}
	public WebElement getRelationship_to_Provider() {
		return Relationship_to_Provider;
	}
	public WebElement getRelationship_parent() {
		return Relationship_parent;
	}
	public WebElement getOwnership_percent() {
		return Ownership_percent;
	}
	public WebElement getEffective_date() {
		return effective_date;
	}
	public WebElement getEnd_date() {
		return end_date;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getDropdown_click() {
		return dropdown_click;
	}
	
	public WebElement getAddress_click() {
		return address_click;
	}
	
	public void SelectQuestion2(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question2(), getNo_question2(), "Q2 of OwnerShip Section");
    }
	public void SelectQuestion3(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question3(), getNo_question3(), "Q3 of OwnerShip Section");
    }
	public void SelectQuestion4(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question4(), getNo_question4(), "Q4 of OwnerShip Section");
    }
	public void SelectQuestion5(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question5(), getNo_question5(), "Q5 of OwnerShip Section");
    }
	public void SelectQuestion6(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question6(), getNo_question6(), "Q6 of OwnerShip Section");
    }
	
	public void SelectQuestion7(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question7(), getNo_question7(), "Q7 of OwnerShip Section");
    }
	public void SelectQuestion8(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question8(), getNo_question8(), "Q8 of OwnerShip Section");
    }
	public void SelectQuestion9(String OptionsOwnership) throws InterruptedException
    {
	   SelectRadioButton(OptionsOwnership, getYes_question9(), getNo_question9(), "Q9 of OwnerShip Section");
    }
	
	
}
