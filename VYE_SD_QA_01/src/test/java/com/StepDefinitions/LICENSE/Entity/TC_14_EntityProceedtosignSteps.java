package com.StepDefinitions.LICENSE.Entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.PageObjectManager.Entity.*;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;

public class TC_14_EntityProceedtosignSteps extends BaseUtilClass {
	public PageObjectManager pom;
	public TC_14_EntityProceedtosignSteps() {
		pom=new PageObjectManager();
	}
	@Then("User proceed to sign in")
	public void user_proceed_to_sign_in() throws InterruptedException {
		try {
			
		
		Thread.sleep(5000);
		actionClick(pom.getEntityprovideragreementPage().getProceed_to_sign_tab());
	    Thread.sleep(10000);
	   
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
		    sendkeys(pom.getEntityprovideragreementPage().getFull_name_text(), "rakes");
		    Thread.sleep(5000);
		    click(pom.getEntityprovideragreementPage().getContinue_button_Canvas_Signature());
			   Thread.sleep(5000);
			   click(pom.getEntityprovideragreementPage().getI_Agree_button_Canvas_Signature());
		} catch (Exception e) {
			System.out.println("proceed to sign in is not present");
		}
		
	}	    

	
	
    
	
}
