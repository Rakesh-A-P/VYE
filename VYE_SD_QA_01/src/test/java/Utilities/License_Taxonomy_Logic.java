package Utilities;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;


import com.PageObjectManager.PageObjectManager;

public class License_Taxonomy_Logic extends BaseUtilClass{
	
	 PageObjectManager poj;
	public License_Taxonomy_Logic(String dyp_taxonomy,String ProgramParticipation,String issue_date,String expiry_date,String license_number) throws InterruptedException{
		
		poj= new PageObjectManager();
		//ConfigFileReader();
		
		
	
	}
	
	
	
	public void License_Taxonomy_DataPass(String dyp_taxonomy,String ProgramParticipation,String issue_date,String expiry_date,String license_number) throws InterruptedException, FileNotFoundException, IOException{
		
//		List<WebElement> splist= new ArrayList<WebElement>();
	
		
	for(int k=1;k<=5;k++) {
		
		Thread.sleep(3000);
		scrollTOTop(driver);
		Thread.sleep(3000);
		actionClick(poj.getEntityProgramParticipationPage().getAddProgramParticipation());
		Thread.sleep(3000);
		actionClick(poj.getEntityProgramParticipationPage().getProgramParticipationbutton());
	
		
		List<WebElement> ls=   poj.getEntityProgramParticipationPage().getPPList();
		scrollBy(driver, 50);
		System.out.println("PP List size ="+ls.size());
	
		
		System.out.println("PP..list below");
		System.out.println(ls);
		
		Thread.sleep(3000);
	
			
		if(k==1)
			LicenseTaxonomyLogicFunction(dyp_taxonomy,ProgramParticipation,issue_date,expiry_date,license_number,ls);
		if(k==2)
			LicenseTaxonomyLogicFunction(dyp_taxonomy,ProgramParticipation,"01012000",expiry_date,license_number,ls);
		if(k==3)
			LicenseTaxonomyLogicFunction(dyp_taxonomy,ProgramParticipation,"01012000","01012019",license_number,ls);
		if(k==4)
			LicenseTaxonomyLogicFunction(dyp_taxonomy,ProgramParticipation,"01012000","01012019","123",ls);
		
		if(k==5)
			LicenseTaxonomyLogicFunction(dyp_taxonomy,ProgramParticipation,issue_date,expiry_date,"123",ls);
	}
		
		
	}
	
	
	public void LicenseTaxonomyLogicFunction(String dyp_taxonomy,String ProgramParticipation,
			String issue_date,String expiry_date,String license_number,List <WebElement> PP) throws InterruptedException, FileNotFoundException, IOException {
		
		int flag=0;
		
		Thread.sleep(5000);
	
		
		for(WebElement element: PP) {
			
			if(element.getText().equalsIgnoreCase(ProgramParticipation)) {
				Thread.sleep(3000);
				actionClick(element);
				
				break;
			}
			
			
		}
		Thread.sleep(5000);
		actionClick(poj.getEntityProgramParticipationPage().getSpecialityButton());
		Thread.sleep(5000);
		List<WebElement> splist= poj.getEntityProgramParticipationPage().getSpecialityList();
		
		for(WebElement element: splist) {
			if(element.getText().equalsIgnoreCase(dyp_taxonomy)) {
				Thread.sleep(3000);
				actionClick(element);
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			
			Thread.sleep(3000);
		actionClick(poj.getEntityProgramParticipationPage().getAddTaxonomy());
		Thread.sleep(3000);
		
		
			
			System.out.println("Issue Date="+issue_date);
			System.out.println("Expiry Date="+expiry_date);
			System.out.println("Add Certificate is visible?="+poj.getEntityProgramParticipationPage().getAddTaxonomy().isDisplayed());
			if(poj.getEntityProgramParticipationPage().getAddTaxonomy().isDisplayed()) {
				actionClick(poj.getEntityProgramParticipationPage().getSelectTaxonomyDescription());
				Thread.sleep(3000);
				actionClick(poj.getEntityProgramParticipationPage().getSelectTaxonomy());
				sendkeys(poj.getEntityProgramParticipationPage().getEffectiveDate(), issue_date);
				sendkeys(poj.getEntityProgramParticipationPage().getEndDate(), expiry_date);
				actionClick(poj.getEntityProgramParticipationPage().getAddLicenseCertificate());
				Thread.sleep(3000);
				actionClick(poj.getEntityProgramParticipationPage().getLicenseCertificateDropDown());
				Thread.sleep(2000);
				List<WebElement> certType= poj.getEntityProgramParticipationPage().getLicense_CertType();

				if(certType.size()>=3) {
					Thread.sleep(2000);
					actionClick(certType.get(2));
					
				}
				else {
				Thread.sleep(2000);
				actionClick(certType.get(1));
				
				}
				
				 Thread.sleep(3000);
				 scrollToViewelement(poj.getEntityProgramParticipationPage().getLicenseTypeEndDate());
			
				 Thread.sleep(3000);
					actionClick(poj.getEntityProgramParticipationPage().getLicenseIssuer());
					actionClick(poj.getEntityProgramParticipationPage().getLicenseIssuerSelectSD());
					sendkeys(poj.getEntityProgramParticipationPage().getLicenseNum(),license_number);
					sendkeys(poj.getEntityProgramParticipationPage().getLicenseTypeEffectiveDate(), issue_date);
					sendkeys(poj.getEntityProgramParticipationPage().getLicenseTypeEndDate(), expiry_date);
					 String FilePath= getPropertyFileValue("filepath");
					 poj.getEntityProgramParticipationPage().getUpload_CurrentLicense().sendKeys(FilePath);
					 Thread.sleep(2000);
					 actionClick(poj.getEntityProgramParticipationPage().getAddButton());
					 Thread.sleep(2000);
				     actionClick(poj.getEntityProgramParticipationPage().getConfirmButton());
				     Thread.sleep(3000);
				     scrollToViewelement(poj.getEntityProgramParticipationPage().getSaveButton());
				     Thread.sleep(3000);
				    actionClick(poj.getEntityProgramParticipationPage().getSaveButton());
				    Thread.sleep(3000);
				}
			
		}
			
		
		
		
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
		outerloop:
			for(int i=1;i<size;i++) {
				int sp_size=0;
				//System.out.println("Element is="+element.getText());
				Thread.sleep(5000);
				try {
				actionClick(ls.get(i));
				Thread.sleep(5000);
				actionClick(poj.getProgramParticipation().getSpecialityButton());
				Thread.sleep(5000);
				splist= poj.getProgramParticipation().getSpecialityList();
				sp_size=splist.size();
				
				}
				catch(org.openqa.selenium.StaleElementReferenceException e) {
					i--;
				}
				
	            for (int j = 1; j <sp_size; j++) {
	            	System.out.println("i= "+i+"j= "+j);
	            	Thread.sleep(3000);    	
	            	 actionClick(poj.getProgramParticipation().getSpecialityButton());
	            	 
	            	 try {
	            		 Thread.sleep(3000);
	            		 
	            		 if(dyp_taxonomy.equalsIgnoreCase("Clinics") && ls.get(i).getText().equalsIgnoreCase("Health Home")){
	            		
	            			 actionClick(splist.get(j));
		      					Thread.sleep(3000);
		      					flag=1;
		      					break outerloop;
	            		 }
	            		 
	            		 else if(dyp_taxonomy.equalsIgnoreCase("Clinics")){
			      					continue outerloop;
		            		 }
	            		 
	            		 else {
	            			 if(splist.get(j).getText().equalsIgnoreCase(dyp_taxonomy) )
	     	      				{
	     	                		
	     	                		
	     	      					actionClick(splist.get(j));
	     	      					Thread.sleep(3000);
	     	      					flag=1;
	     	      					break outerloop;
	     	      				}
	            		 }
	            			 
	            		 }
	                	 
	            			
	            	 
	            	 
	            	 
	            	 catch(Exception e) {
	            		 System.out.println("Exception e");
	            		 
	            		 j--;
	            		ActionMoveByOffSet(driver, 50, 50); 
	            	 }
	            	 ActionMoveByOffSet(driver, 50, 50); 
	        }
	            
				Thread.sleep(5000);
				actionClick( poj.getProgramParticipation().getProgramParticipationbutton());
			}
			
			
			if(flag==1) {
				
				actionClick(poj.getProgramParticipation().getAddTaxonomy());
				Thread.sleep(3000);
				
				
					
					System.out.println("Issue Date="+issue_date);
					System.out.println("Expiry Date="+expiry_date);
					System.out.println("Add Certificate is visible?="+poj.getProgramParticipation().getAddTaxonomy().isDisplayed());
					if(poj.getProgramParticipation().getAddTaxonomy().isDisplayed()) {
						actionClick(poj.getProgramParticipation().getSelectTaxonomyDescription());
						Thread.sleep(3000);
						actionClick(poj.getProgramParticipation().getSelectTaxonomy());
						sendKeys(poj.getProgramParticipation().getEffectiveDate(), issue_date);
						sendKeys(poj.getProgramParticipation().getEndDate(), expiry_date);
						actionClick(poj.getProgramParticipation().getAddLicenseCertificate());
						Thread.sleep(3000);
						actionClick(poj.getProgramParticipation().getLicenseCertificateDropDown());
						Thread.sleep(2000);
						List<WebElement> certType= poj.getProgramParticipation().getLicense_CertType();
		
						if(certType.size()>=3) {
							Thread.sleep(2000);
							actionClick(certType.get(2));
							
						}
						else {
						Thread.sleep(2000);
						actionClick(certType.get(1));
						
						}
						
						 Thread.sleep(3000);
						 ScrollToElement(poj.getProgramParticipation().getLicenseTypeEndDate());
						 Thread.sleep(3000);
							actionClick(poj.getProgramParticipation().getLicenseIssuer());
							actionClick(poj.getProgramParticipation().getLicenseIssuerSelectSD());
							sendKeys(poj.getProgramParticipation().getLicenseNum(),license_number);
							sendKeys(poj.getProgramParticipation().getLicenseTypeEffectiveDate(), issue_date);
							sendKeys(poj.getProgramParticipation().getLicenseTypeEndDate(), expiry_date);
							 String FilePath= properties.getProperty("UploadFile");
							 poj.getProgramParticipation().getUpload_CurrentLicense().sendKeys(FilePath);
							 Thread.sleep(2000);
							 actionClick(poj.getProgramParticipation().getAddButton());
							 Thread.sleep(2000);
						     actionClick(poj.getProgramParticipation().getConfirmButton());
						     Thread.sleep(3000);
						     ScrollToElement(poj.getProgramParticipation().getSaveButton());
						    actionClick(poj.getProgramParticipation().getSaveButton());
							 
						}
					
				
			}
			
			**/
	}
		
	
	}



