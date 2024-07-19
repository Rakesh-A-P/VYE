package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityProviderIdentificationPage extends BaseUtilClass{
	private ArrayList datalist;
	
	public EntityProviderIdentificationPage() {
            	PageFactory.initElements(driver, this);
            }
 //Provider Identifiers
            @FindBy(xpath="(//span[.='Provider Identifiers'])[2]")
            private WebElement Provider_Identifiers_tab;
            public WebElement getProvider_Identifiers_tab() {
				return Provider_Identifiers_tab;
			}
			@FindBy(xpath="(//input[@type='radio'])[1]")
			
            private WebElement yes_NPI;
@FindBy(xpath="(//input[@type='radio'])[2]")
			
            private WebElement No_NPI;
            @FindBy(xpath="//input[contains(@id , 'NPI Number')]")
            private WebElement NPI;
            @FindBy(xpath="(//input[@type='radio'])[4]")
            private WebElement yes_Medicare;
            @FindBy(xpath="(//input[@type='radio'])[5]")
            private WebElement No_Medicare;
            
            @FindBy(xpath="(//span[.='+ Add Line'])[1]")
            private WebElement Addline_Medicare;
            @FindBy(xpath="//input[@aria-label='Medicare Id']") 
            private WebElement Medicare_Id;
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
            private WebElement Effective_Date;
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
            private WebElement End_Date;
            @FindBy(xpath="//span[.='Save']")
            private WebElement Save;
          
            @FindBy(xpath="(//input[@type='radio'])[6]")
            private WebElement yes_Medical_Director;
            @FindBy(xpath="(//input[@type='radio'])[7]")
            private WebElement No_Medical_Director;
           
 //Other Medicaid State
            @FindBy(xpath="(//input[@type='radio'])[8]")
            private WebElement yes_Other_Medicaid_State ;
            @FindBy(xpath="(//input[@type='radio'])[9]")
            private WebElement No_Other_Medicaid_State ;
            @FindBy(xpath="(//span[.='+ Add Line'])[2]")
            private WebElement Addline_other_Medicare;
            @FindBy(xpath="(//div[@role='button'])[2]")
            private WebElement other_state_medicaid1;
            public List<WebElement> getOther_state_medicaid_option() {
				return other_state_medicaid_option;
			}
			@FindBy(xpath="(//li[@role='option'])")
	        private List<WebElement> other_state_medicaid_option;
	          
          
			@FindBy(xpath="(//div[@role='button'])[3]")
            private WebElement state_program;
		    @FindBy(xpath="(//li[@role='option'])")
	        private List<WebElement> other_state_option;
	          
				public List<WebElement> getOther_state_option() {
					return other_state_option;
				}
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
            private WebElement Enrollment_Begin_Date;
            @FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
            private WebElement Enrollment_End_Date;

 //Additional Information           
            @FindBy(xpath="(//input[@type='radio'])[10]")
            private WebElement yes_Teaching_Facility;
            @FindBy(xpath="(//input[@type='radio'])[11]")
            private WebElement No_Teaching_Facility;
            
          public WebElement CheckBoxIndex(int index) {
        	  return driver.findElement(By.xpath("(//div[contains(@class,'programParticipation_pp-item-checkbox')])["+index+"]/../..//div[@class='sc-gFaPwZ jnrysx']"));              
        	  //return driver.findElement(By.xpath("//div[contains(@class,'programParticipation_pp-item-checkbox')]["+index+"]"));
          }
            
            
            
            
            @FindBy(xpath="//input[@name='What claim submission(s) do you use?']")
            private WebElement claim_submission;
            @FindBy(xpath="(//span[.='Electronic'])[1]")
            private WebElement Electronic;
            
            public WebElement getElectronic() {
				return Electronic;
			}
			@FindBy(xpath="(//input[@type='radio'])[12]")
            private WebElement yes_Indian_Health;
			@FindBy(xpath="(//input[@type='radio'])[13]")
            private WebElement no_Indian_Health;
            public ArrayList getDatalist() {
				return datalist;
			}
			public WebElement getNo_NPI() {
				return No_NPI;
			}
			public WebElement getNo_Medicare() {
				return No_Medicare;
			}
			public WebElement getNo_Medical_Director() {
				return No_Medical_Director;
			}
			public WebElement getNo_Other_Medicaid_State() {
				return No_Other_Medicaid_State;
			}
			public WebElement getNo_Teaching_Facility() {
				return No_Teaching_Facility;
			}
			public WebElement getNo_Indian_Health() {
				return no_Indian_Health;
			}
			@FindBy(xpath="//input[@name='Services Type']")
            private WebElement Services_Type;
			public WebElement getYes_NPI() {
				return yes_NPI;
			}
			public WebElement getNPI() {
				return NPI;
			}
			public WebElement getYes_Medicare() {
				return yes_Medicare;
			}
			public WebElement getAddline_Medicare() {
				return Addline_Medicare;
			}
			public WebElement getMedicare_Id() {
				return Medicare_Id;
			}
			public WebElement getEffective_Date() {
				return Effective_Date;
			}
			public WebElement getEnd_Date() {
				return End_Date;
			}
			public WebElement getSave() {
				return Save;
			}
			public WebElement getYes_Medical_Director() {
				return yes_Medical_Director;
			}
			public WebElement getYes_Other_Medicaid_State() {
				return yes_Other_Medicaid_State;
			}
			 public WebElement getAddline_other_Medicare() {
					return Addline_other_Medicare;
				}
				public WebElement getOther_state_medicaid1() {
					return other_state_medicaid1;
				}
				public WebElement getState_program() {
					return state_program;
				}
				public WebElement getEnrollment_Begin_Date() {
					return Enrollment_Begin_Date;
				}
				public WebElement getEnrollment_End_Date() {
					return Enrollment_End_Date;
				}
			public WebElement getYes_Teaching_Facility() {
				return yes_Teaching_Facility;
			}
			public WebElement getClaim_submission() {
				return claim_submission;
			}
			public WebElement getYes_Indian_Health() {
				return yes_Indian_Health;
			}
			public WebElement getServices_Type() {
				return Services_Type;
			}

			
			
			public WebElement other_state_option() {
				
				WebElement element=null;
				List<WebElement> other_state_optionlist=  (List<WebElement>) getOther_state_option();
				 datalist = new ArrayList<>();
				//System.out.println("Size is="+other_state_optionlist.size());
				for(int i=0;i<other_state_optionlist.size();i++) {
					//System.out.println(other_state_optionlist.get(i).getText()+"===="+"Medicaid/CHIP");
					if(other_state_optionlist.get(i).getText().equalsIgnoreCase("Medicaid/CHIP")) {
						element= other_state_optionlist.get(i);
						//System.out.println("Element Text inside For Loop="+element.getText());
						break;
					}
				}
				
				//System.out.println("Element Text="+element.getText());
				
				return element;	
				
			}
            public WebElement other_state_medicaid_option() {
				
				WebElement element=null;
				List<WebElement> other_state_medicaid_optionlist=  (List<WebElement>) getOther_state_option();
				 datalist = new ArrayList<>();
				for(int i=0;i<other_state_medicaid_optionlist.size();i++) {
					if(other_state_medicaid_optionlist.get(i).getText().equalsIgnoreCase("Alaska")) {
						element= other_state_medicaid_optionlist.get(i);
						break;
					}
				}
				return element;	
				
			}
            
            public void SelectQuestion1npi(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_NPI(), getNo_NPI(), "Q1 npi question");
            }
            public void SelectQuestion1medicare(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_Medicare(), getNo_Medicare(), "Q2 medicare question");
            }
            public void SelectQuestion1medicaredirector(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_Medical_Director(), getNo_Medical_Director(), "Q3 medicare director");
            }
            public void SelectQuestionothermedicarestate(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_Other_Medicaid_State(), getNo_Other_Medicaid_State(), "Q3 other medicare state");
            }
            public void SelectQuestionteachingfacility(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_Teaching_Facility(), getNo_Teaching_Facility(), "Q3 teaching facility");
            }
            public void SelectQuestionindianhealth(String Options) throws InterruptedException
            {
        	   SelectRadioButton(Options, getYes_Indian_Health(), getNo_Indian_Health(), "Q3 indian helath");
            }
	
}
