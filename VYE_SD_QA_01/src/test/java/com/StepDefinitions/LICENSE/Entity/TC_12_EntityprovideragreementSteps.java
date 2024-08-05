package com.StepDefinitions.LICENSE.Entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.PageObjectManager.Entity.*;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;

public class TC_12_EntityprovideragreementSteps extends BaseUtilClass {
	
	public PageObjectManager pom;
	public TC_12_EntityprovideragreementSteps() {
		pom=new PageObjectManager();
	}
	@Then("User Signs the Provider Agreement and Click Next")
	public void user_signs_the_provider_agreement_and_click_next() throws InterruptedException {
	
		
			
			
			
			try {
				Thread.sleep(5000);
				 scrollToViewelement(pom.getEntityprovideragreementPage().getProvider_Agreement_tab());
			   	 Thread.sleep(2000);
			   	 actionClick(pom.getEntityprovideragreementPage().getProvider_Agreement_tab());
			   		 Thread.sleep(2000);    
				  
			  try { Thread.sleep(2000);
				scrollToViewelement(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
				 Thread.sleep(2000);
				  actionClick(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
				 
			} catch (org.openqa.selenium.NoSuchElementException e) {
				 actionClick(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
				  Thread.sleep(25000);
				// TODO: handle exception
			}
			  Thread.sleep(10000);
			   WebElement iframelement = driver.findElement(By.xpath("//iframe[@id='hsEmbeddedFrame']"));
			   driver.switchTo().frame(iframelement);
			   
			   Thread.sleep(10000);
			   actionClick(pom.getEntityprovideragreementPage().getClickOk());
			   Thread.sleep(5000);
			   actionClick(pom.getEntityprovideragreementPage().getClick_getStarted());
			   Thread.sleep(5000);
			   actionClick(pom.getEntityprovideragreementPage().getClick_NextReq());
			   Thread.sleep(5000);
			   actionClick(pom.getEntityprovideragreementPage().getClick_To_Sign());
			  
			   
			   Thread.sleep(5000);
			   CanvasSignature(pom.getEntityprovideragreementPage().getCanvas_Signature());
			   Thread.sleep(5000);
			   
			   try {
					actionClick(pom.getEntityprovideragreementPage().getInsert_button_Canvas_Signature());
					   Thread.sleep(5000);
					   
				} catch (Exception e) {
					// TODO: handle exception
				}   
					   Thread.sleep(2000);
					   sendkeys(pom.getEntityprovideragreementPage().getTitle_text(), "rakes");
					   Thread.sleep(5000); 
				  
				   click(pom.getEntityprovideragreementPage().getContinue_button_Canvas_Signature());
				   Thread.sleep(5000);
				   click(pom.getEntityprovideragreementPage().getI_Agree_button_Canvas_Signature());
			} catch (Exception e) {
				System.out.println("provier agreement is not present");
			}
		
			
	}
	
	
	

		
	

	public static void CanvasSignature(WebElement elementToClick) {
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToClick, 50, 50).clickAndHold().perform();
		actions.click(elementToClick).perform();
		actions.moveByOffset(10, 20);
		actions.moveByOffset(20, -10).perform();
        actions.moveByOffset(-30, 15).perform();
        actions.moveByOffset(40, 0).perform();
		actions.release().perform();
		
	}
	


	}




/**

Thread.sleep(5000);
 scrollToViewelement(pom.getEntityprovideragreementPage().getProvider_Agreement_tab());
	 Thread.sleep(2000);
	 actionClick(pom.getEntityprovideragreementPage().getProvider_Agreement_tab());
		 Thread.sleep(2000);    
  
try { Thread.sleep(2000);
scrollToViewelement(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
 Thread.sleep(2000);
  actionClick(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
 
} catch (org.openqa.selenium.NoSuchElementException e) {
 actionClick(pom.getEntityprovideragreementPage().getAGREE_AND_SIGN_button());
  Thread.sleep(25000);
 TODO: handle exception
}
       
catch (TimeoutException e) {
  actionClick(pom.getEntityprovideragreementPage().getAgreeandSignButton());
  Thread.sleep(25000);
 TODO: handle exception
}

Thread.sleep(10000);
WebElement iframelement = driver.findElement(By.xpath("//iframe[@id='hsEmbeddedFrame']"));
driver.switchTo().frame(iframelement);

Thread.sleep(10000);
actionClick(pom.getEntityprovideragreementPage().getClickOk());
Thread.sleep(5000);
actionClick(pom.getEntityprovideragreementPage().getClick_getStarted());
Thread.sleep(5000);
actionClick(pom.getEntityprovideragreementPage().getClick_NextReq());
Thread.sleep(5000);
actionClick(pom.getEntityprovideragreementPage().getClick_To_Sign());


Thread.sleep(5000);
CanvasSignature(pom.getEntityprovideragreementPage().getCanvas_Signature());
Thread.sleep(5000);
try {
actionClick(pom.getEntityprovideragreementPage().getInsert_button_Canvas_Signature());
   Thread.sleep(5000);
   
} catch (Exception e) {
 TODO: handle exception
}   
   Thread.sleep(2000);
   sendkeys(pom.getEntityprovideragreementPage().getTitle_text(), "rakes");
   Thread.sleep(5000); 

click(pom.getEntityprovideragreementPage().getContinue_button_Canvas_Signature());
Thread.sleep(5000);
click(pom.getEntityprovideragreementPage().getI_Agree_button_Canvas_Signature());
**/