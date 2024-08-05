package com.StepDefinitions.LICENSE.Entity;

import com.PageObjectManager.Entity.*;

import Utilities.BaseUtilClass;
import io.cucumber.java.en.Then;


public class TC_15_EntityHealthhomeserviceSteps extends BaseUtilClass {
	
	
	public PageObjectManager pom;
	public TC_15_EntityHealthhomeserviceSteps(){
		pom=new PageObjectManager();
		
	}
	
	
	@Then("if the heath home serivce is visible then fill the data")
	public void if_the_heath_home_serivce_is_visible_then_fill_the_data() throws InterruptedException {
	   
	
	
			try {
				
				Thread.sleep(1000);
		        scrollToViewelement(pom.getEntityHealthHomeserivcePage().getHealth_Home_Services_tab());
		        Thread.sleep(1000);
				actionClick(pom.getEntityHealthHomeserivcePage().getHealth_Home_Services_tab());
		        Thread.sleep(1000);
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question1(), "test data 1");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question2(), "test data 2");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question3(), "test data 3");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question4(), "test data 4");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question5(), "test data 5");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question6(), "test data 6");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question7(), "test data 7");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question8(), "test data 8");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question9(), "test data 9");
				sendkeys(pom.getEntityHealthHomeserivcePage().getHealth_question10(), "test data 10");
				Thread.sleep(1000);
				scrollToViewelement(pom.getEntityHealthHomeserivcePage().getHealth_question11());
				Thread.sleep(1000);
				actionClick(pom.getEntityHealthHomeserivcePage().getHealth_question11());
				Thread.sleep(1000);
				actionClick(pom.getEntityHealthHomeserivcePage().getHealth_question_drop_first());
				Thread.sleep(1000);
				actionClick(pom.getEntityHealthHomeserivcePage().getHealth_question8());
				Thread.sleep(3000);
				
				actionClick(pom.getEntityInformationPage().getNext());
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println("health home service is nopt present");
				
			}
			   
		    
		
			
			
		
		
		
	
		
		
		
		
	}


}
